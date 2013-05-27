package noticias.controller;

import java.util.ArrayList;

import is.Administrador;
import is.Datos;
import is.Noticia;
import is.Usuario;
import noticias.model.Model;
import noticias.view.Vista;

public class Controller implements IObserver {
	Model model;
	Vista vista;
	public Controller()
	{
		this.model = new Model(new ArrayList<Noticia>());
		this.model.addObserver(this);
		this.vista = new Vista(this);
		
		
		
	}
	@Override
	public void update(UpdateInfo updateType) 
	{
		/* pues dependiendo de lo que se haya hecho
		 * se ejecuta lo mismo en la vista.
		 */
		
	
		switch(updateType){
		case AddComment: this.vista.addComment();
			break;
		case AddNewToFavorite: this.vista.addNewToFavorite();
			break;
		case ChangeData: this.vista.changeData();
			break;
		case ChangePassword: this.vista.changePassword();
			break;
		case CommentModified: this.vista.commentModified();
			break;
		case CommentScore: this.vista.commentScore();
			break;
		case DeleteUser: this.vista.deleteUser();
			break;
		case InsertUser:this.vista.insertUser();
			break;
		case LinkNews:this.vista.linkNews();
			break;
		case LogIn:this.vista.logIn();
			break;
		case LogOut:this.vista.logOut();
			break;
		case ModifiedUser:this.vista.modifiedUser();
			break;
		
		
		case NewsAdded:this.vista.newsAdded();
			break;
		case NewsDelete: this.vista.newsDelete();
			break;
		case NewsModified:this.vista.newsModified();
			break;
		case Register:this.vista.register();
			break;
		case RegisterAdmin:this.vista.registerAdmin();
			break;
		case ScoreChanged:this.vista.scoreChanged();
			break;
		case SearchUser:this.vista.searchUser();
			break;
		
		case SearchingNewsCategory:this.vista.searchingNewsCategory();
			break;
		case SearchingNewsTag:this.vista.searchingNewsTag();
			break;
		case SearchingNewsTitle:this.vista.searchingNewsTitle();
			break;
		case ShowComments:this.vista.showComments();
			break;
		
		case ValueComment:this.vista.valueComment();
			break;
		default:
			break;
		
		}
	}
	
	
	public void iniciarSesion(String idUsuario, String pass){
		
		this.model.iniciarSesion(idUsuario, pass);
		
		
	}
	
	public void cerrarSesion(){
		
		this.model.cerrarSesion();
	}

	public void a�adirNoticia(Noticia newNoticia) {
		this.model.a�adirNoticia(newNoticia);
		
		
	}
	public void eliminarUsuario(Usuario usuario){
		this.model.eliminarUsuario(usuario);
	}
	
	public void editarNoticia(Noticia noticiaAEditar) {
		this.model.editarNoticia(noticiaAEditar);
		
	
	}
	
	public void gestionarComentarios(Noticia noticia) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		this.model.gestionarComentarios(noticia);

	}
	
	public void registrarAdministrador(Administrador newAdmin) {
		// TODO Ap�ndice de m�todo generado autom�ticamente

		this.model.registrarAdministrador(newAdmin);

		
	}
	
	public void registrarse(String idUsuario, String pass, Datos nuevosDatos) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		this.model.registrarse(idUsuario, pass, nuevosDatos);
	}
	
	public void buscarNoticiaPorTitulo(String titulo) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		this.model.buscarNoticiaPorTitulo(titulo);
	}
	
	public void buscarNoticiaPorEtiqueta(String titulo) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		this.model.buscarNoticiaPorEtiqueta(titulo);
	}
	
	public void buscarNoticiaPorCategoria(String titulo) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		this.model.buscarNoticiaPorCategoria(titulo);
	}
	
	public void enlazarNoticias() {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		this.model.enlazarNoticias();
	}
	
	public void verPuntuacionComentario(Noticia noticia) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		this.model.verPuntuacionComentario(noticia);
	}
	
	public void verComentarios(Noticia noticia) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		this.model.verComentarios(noticia);
	}
	
	public void puntuarComentario(int puntuacion) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		this.model.puntuarComentario(puntuacion);
	}
	
	public void cambiarContrase�a(String newPass) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		this.model.cambiarContrase�a(newPass);
	}
	
	public void a�adirComentario(String newComentario) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		this.model.a�adirComentario(newComentario);
	}
	
	public void valorarNoticia(int puntuacion) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		this.model.valorarNoticia(puntuacion);
	}
	
	public void a�adirNoticiaAFavoritos(Noticia noticia) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		this.model.a�adirNoticiaAFavoritos(noticia);
	}
	
	public void cambiarDatos(Datos newDatos) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		this.model.cambiarDatos(newDatos);
	}
	
	public void buscarUsuario(String nombre) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		this.model.buscarUsuario(nombre);
	}
	
	public void insertarUsuario(Usuario usuario) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		this.model.insertarUsuario(usuario);
	}
	
	public void modificarUsuario(Usuario usuario) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		this.model.modificarUsuario(usuario);
	}
	public void borrarNoticia(Noticia noticia) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		this.model.borrarNoticia(noticia);
	}
	
	


}
