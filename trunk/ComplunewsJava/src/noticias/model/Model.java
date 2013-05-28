package noticias.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Connection.ConnectionDaoSingleton;
import FactoryDao.AdministradorDao;
import FactoryDao.GestorDao;
import FactoryDao.UsuarioDao;
import FactoryDao.UsuarioNoRegDao;
import FactoryDao.UsuarioRegDao;

import is.Administrador;
import is.Comentario;
import is.Datos;
import is.Usuario;
import is.UsuarioNoReg;
import is.UsuarioReg;

import is.Categorias;
import is.Noticia;

import noticias.controller.IObserver;
import noticias.controller.UpdateInfo;

public class Model implements IObservable{
	List<IObserver> observers;
	private Usuario currentUser;
	private ArrayList<Noticia> portada;
	private Noticia currentNoticia;
	private ConnectionDaoSingleton conexion;
	
	public Model(ArrayList<Noticia> portada)
	{
		this.portada=portada;
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
		
	try {
		this.conexion.query(info);
	} catch (SQLException e) {
		// TODO Bloque catch generado automáticamente
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
	{	String id= usuario.getIdUsuario();
		try {
			ResultSet a = this.conexion.query("Delete * from TablaUsuario where IdUsuario=id;");
		} catch (SQLException e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		}
		
		
		/*
		if (cadena.equalsIgnoreCase(""))
			this.notifyObserver(UpdateInfo.DeleteUser);
		else
			this.notifyObserver(UpdateInfo.DeleteUserFail);*/
		
	}
	public void añadirNoticia(Noticia newNoticia) 
	{
		Administrador admin = (Administrador)this.currentUser;
		if(admin.añadirNoticia(newNoticia))
		this.notifyObserver(UpdateInfo.NewsAdded);
		else System.err.println("Error al añadir noticia");
		
	}
	
	public void editarNoticia(Noticia noticiaAEditar) 
	{
		
		
		
		notifyObserver(UpdateInfo.NewsModified);
	}
	
	public void gestionarComentarios(Noticia noticia) {
		// TODO Apéndice de método generado automáticamente
		
		notifyObserver(UpdateInfo.CommentModified);
	}
	
	public void registrarAdministrador(Administrador newAdmin) {
		// TODO Apéndice de método generado automáticamente


		notifyObserver(UpdateInfo.RegisterAdmin);
		
	}
	
	public void registrarse(String idUsuario, String pass, Datos nuevosDatos) {
		notifyObserver(UpdateInfo.Register);
		
	}
	
	public void buscarNoticiaPorTitulo(String titulo) {
		// TODO Apéndice de método generado automáticamente
		notifyObserver(UpdateInfo.SearchingNewsTitle);
	}
	
	public void buscarNoticiaPorEtiqueta(String titulo) {
		// TODO Apéndice de método generado automáticamente
		notifyObserver(UpdateInfo.SearchingNewsTag);
	}
	
	public void buscarNoticiaPorCategoria(String titulo) {
		// TODO Apéndice de método generado automáticamente
		notifyObserver(UpdateInfo.SearchingNewsCategory);
	}
	
	public void enlazarNoticias(Noticia noticia) {
		this.currentNoticia=noticia;
		// TODO Apéndice de método generado automáticamente
		notifyObserver(UpdateInfo.LinkNews);
	}
	
	public void verPuntuacionComentario(Comentario comen) {
		// TODO Apéndice de método generado automáticamente
		this.currentNoticia.verPuntuacionComentario(comen);
		notifyObserver(UpdateInfo.CommentScore);
		
	}
	
	public void verComentarios() {
		
		Iterator<Comentario> it = this.currentNoticia.getComentarios().iterator();
		
		while(it.hasNext())
		{
			String contenido = it.next().getContenido();
			int puntuacion = it.next().getPuntuacion();
			// no tiene sentido implmentarlo aqui.
			
		}
		notifyObserver(UpdateInfo.ShowComments);
		
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
	
	public void cambiarContraseña(String newPass) {
		
		notifyObserver(UpdateInfo.ChangePassword);
	}
	
	public void añadirComentario(String newComentario) {
		if(newComentario==null || newComentario=="") System.err.println("Comentario nulo");
		else{
		UsuarioReg user = (UsuarioReg) this.currentUser;
		Comentario comment=new Comentario(user.getIdUsuario(),newComentario);
		this.currentNoticia.añadirComentario(comment);
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
	
	public void añadirNoticiaAFavoritos(Noticia noticia) {
		
		
		UsuarioReg user = (UsuarioReg) this.currentUser;
		if(user.añadirNoticiaAFavoritos(noticia))
		notifyObserver(UpdateInfo.AddNewToFavorite);
		else System.err.println("Fallo al añadir noticia a favoritos");
	}
	
	public void cambiarDatos(Datos newDatos) {
		notifyObserver(UpdateInfo.ChangeData);
	}
	
	public void buscarUsuario(String nombre) {
		// TODO Apéndice de método generado automáticamente
		notifyObserver(UpdateInfo.SearchUser);
	}
	
	public void insertarUsuario(Usuario usuario) {
		// TODO Apéndice de método generado automáticamente
		notifyObserver(UpdateInfo.InsertUser);
	}
	
	public void modificarUsuario(Usuario usuario) {
		// TODO Apéndice de método generado automáticamente
		notifyObserver(UpdateInfo.ModifyUser);
	}
	public void borrarNoticia(Noticia noticia) {
		// TODO Apéndice de método generado automáticamente
		notifyObserver(UpdateInfo.BorrarNoticia);
	}
	
	

		


}
