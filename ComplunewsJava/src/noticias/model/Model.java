package noticias.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Connection.ConnectionDaoSingleton;


import is.Administrador;
import is.Comentario;
import is.Datos;
import is.Usuario;
import is.UsuarioNoReg;
import is.UsuarioReg;


import is.Noticia;

import noticias.controller.IObserver;
import noticias.controller.UpdateInfo;

public class Model implements IObservable
{
	List<IObserver> observers;
	private Usuario currentUser;
	//private ArrayList<Noticia> portada;  // contendra las noticias que se le ofrecen al usuario.
	private Noticia currentNoticia;
	private ConnectionDaoSingleton conexion;

	public Model(ArrayList<Noticia> portada)
	{
		//this.portada=portada;
		this.conexion=ConnectionDaoSingleton.getInstance();
		this.observers = new ArrayList<IObserver>();
		this.currentUser=new UsuarioNoReg("");
	}
	public void addObserver(IObserver observer) {
		this.observers.add(observer);

	}

	@Override
	public void notifyObserver(UpdateInfo updateType) {
		for(IObserver observer: this.observers )
			observer.update(updateType);

	}
	/**
	 * Aqui habria que implementar todos los metodos aparte de notificar al observador
	 * 
	 * 
	 */
	public void iniciarSesion(String idUsuario, String pass) {

		String info = "Select * from TablaUsuarios where IDUsuario = idUsuario and clave = pass;";

		try 
		{
			this.conexion.query(info);
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
			notifyObserver(UpdateInfo.LogInFail);
		}


		notifyObserver(UpdateInfo.LogIn);


	}

	public void cerrarSesion(){
		this.currentUser=new UsuarioNoReg("");

		notifyObserver(UpdateInfo.LogOut);
	}

	public void eliminarUsuario(UsuarioReg usuario)
	{	
		try {
			this.conexion.actualizarTabla("Delete * from TablaUsuario where IdUsuario=id;");
		} catch (SQLException e) {

			e.printStackTrace();
		}

		this.notifyObserver(UpdateInfo.DeleteUser);


	}
	public void anadirNoticia(Noticia newNoticia) 
	{
		Administrador admin = (Administrador)this.currentUser;
		
		if(admin.anadirNoticia(newNoticia))
			this.notifyObserver(UpdateInfo.NewsAdded);
		else 
			System.err.println("Error al anadir noticia");

	}

	public void editarNoticia(Noticia noticianaEditar) 
	{
		notifyObserver(UpdateInfo.NewsModified);
	}

	public void gestionarComentarios(Noticia noticia) 
	{
		notifyObserver(UpdateInfo.CommentModified);
	}

	public void registrarAdministrador(Administrador newAdmin) 
	{
		String aux = newAdmin.getIdUsuario();
		aux = aux + ","+ newAdmin.getPass()+ ")";
		String insertQuery = "INSERT INTO Usuarios values (" +aux + ", UsuarioAdministrador";
		try 
		{
			this.conexion.actualizarTabla(insertQuery);
			notifyObserver(UpdateInfo.RegisterAdmin);
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}

	public void registrarse(String idUsuario, String pass, Datos nuevosDatos) 
	{
		String insertQuery = "INSERT INTO Usuarios values (" +idUsuario +","+ pass+","+ nuevosDatos+","+ "UsuarioNormal"+ ", UsuarioNormal"+")";
		
		try 
		{
			this.conexion.actualizarTabla(insertQuery);
			notifyObserver(UpdateInfo.RegisterAdmin);
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		notifyObserver(UpdateInfo.Register);

	}

	public ResultSet buscarNoticiaPorTitulo(String titulo) 
	{
		try
		{
			//Obtengo las filas que cumple la condicion puesta en el query.
			ResultSet aux = this.conexion.query("select * from Noticia where titulo = titulo;");
			notifyObserver(UpdateInfo.SearchingNewsTitle);
			return aux;

		}
		catch(SQLException e)
		{
			//error.
		}
		return null;

	}

	public ResultSet buscarNoticiaPorEtiqueta(String etiqueta) 
	{
		try
		{
			//Obtengo las filas que cumple la condicion puesta en el query.
			ResultSet aux = this.conexion.query("select * from Noticia where etiqueta = etiqueta;");
			notifyObserver(UpdateInfo.SearchingNewsTag);
			return aux;

		}
		catch(SQLException e)
		{
			//error.
		}
		return null;


	}

	public ResultSet buscarNoticiaPorCategoria(String cat) 
	{

		try
		{
			//Obtengo las filas que cumple la condicion puesta en el query.
			ResultSet aux = this.conexion.query("select * from Noticia where categoria = cat;");
			notifyObserver(UpdateInfo.SearchingNewsCategory);
			return aux;

		}
		catch(SQLException e)
		{
			//error.
		}
		return null;

	}

	public void enlazarNoticias(Noticia noticia) {

		this.currentNoticia=noticia;
		notifyObserver(UpdateInfo.LinkNews);
	}

	public void verPuntuacionComentario(Comentario comen) {

		this.currentNoticia.verPuntuacionComentario(comen);
		notifyObserver(UpdateInfo.CommentScore);

	}




	public void puntuarComentario(Comentario comentario, int puntuacion) {
		if(puntuacion==1 || puntuacion==-1){
			Iterator<Comentario> it = this.currentNoticia.getComentarios().iterator();

			while(it.hasNext())
			{
				if (it.next().equals(comentario))
					it.next().setPuntuacion(puntuacion);
			}

			notifyObserver(UpdateInfo.ValueComment);} 
		else System.err.println("Error de puntuacion");

	}

	public void cambiarContrasena(String newPass) {

		notifyObserver(UpdateInfo.ChangePassword);
	}

	public void anadirComentario(String newComentario) {
		if(newComentario==null || newComentario=="") System.err.println("Comentario nulo");
		else{
			UsuarioReg user = (UsuarioReg) this.currentUser;
			Comentario comment=new Comentario(user.getIdUsuario(),newComentario);
			this.currentNoticia.anadirComentario(comment);
			notifyObserver(UpdateInfo.AddComment);
		}
	}

	public void valorarNoticia(int puntuacion) {

		if((puntuacion>=1) && (puntuacion <=5)){
			this.currentNoticia.valorarNoticia(puntuacion);
			notifyObserver(UpdateInfo.NewValue);
		}
		else System.err.println("Puntuacion invalida");
	}

	public void anadirNoticiaAFavoritos(Noticia noticia) {


		UsuarioReg user = (UsuarioReg) this.currentUser;
		if(user.anadirNoticiaAFavoritos(noticia))
			notifyObserver(UpdateInfo.AddNewToFavorite);
		else System.err.println("Fallo al anadir noticia a favoritos");
	}

	public void cambiarDatos(Datos newDatos) {
		notifyObserver(UpdateInfo.ChangeData);
	}

	public void buscarUsuario(String nombre) {

		notifyObserver(UpdateInfo.SearchUser);
	}

	public void insertarUsuario(Usuario usuario) 
	{
		String aux = usuario.getIdUsuario();
		aux = aux + ","+ usuario.getPass()+ ")";
		String insertQuery = "INSERT INTO Usuarios values (" +aux + ", UsuarioNormal";
		try {
			this.conexion.actualizarTabla(insertQuery);
			notifyObserver(UpdateInfo.InsertUser);
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public void modificarUsuario(Usuario usuario) {

		notifyObserver(UpdateInfo.ModifyUser);
	}
	public void borrarNoticia(Noticia noticia) {

		notifyObserver(UpdateInfo.BorrarNoticia);
	}

	public void showComments(){
		
	}

	public void cambiarPreferencias(){
		
	}




}
