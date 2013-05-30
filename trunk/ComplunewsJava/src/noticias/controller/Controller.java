package noticias.controller;

import java.util.ArrayList;

import is.Administrador;
import is.Comentario;
import is.Datos;
import is.Noticia;
import is.Usuario;
import is.UsuarioReg;
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


		switch(updateType)
		{
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
	
			case LogInFail: this.vista.error("Fallo de login");
			break;
			case DeleteUserFail: this.vista.error("Fallo al eliminar el usuario");
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

	public void anadirNoticia(Noticia newNoticia) {
		this.model.anadirNoticia(newNoticia);


	}
	public void eliminarUsuario(Usuario usuario){
		this.model.eliminarUsuario((UsuarioReg)usuario);
	}

	public void editarNoticia(Noticia noticiaAEditar) {
		this.model.editarNoticia(noticiaAEditar);


	}

	public void gestionarComentarios(Noticia noticia) {

		this.model.gestionarComentarios(noticia);

	}

	public void registrarAdministrador(Administrador newAdmin) {


		this.model.registrarAdministrador(newAdmin);


	}

	public void registrarse(String idUsuario, String pass, Datos nuevosDatos) {

		this.model.registrarse(idUsuario, pass, nuevosDatos);
	}

	public void buscarNoticiaPorTitulo(String titulo) {

		this.model.buscarNoticiaPorTitulo(titulo);
	}

	public void buscarNoticiaPorEtiqueta(String titulo) {

		this.model.buscarNoticiaPorEtiqueta(titulo);
	}

	public void buscarNoticiaPorCategoria(String titulo) {

		this.model.buscarNoticiaPorCategoria(titulo);
	}

	public void enlazarNoticias(Noticia noticia) {

		this.model.enlazarNoticias(noticia);
	}

	public void verPuntuacionComentario(Comentario comen) {

		this.model.verPuntuacionComentario(comen);
	}


	public void puntuarComentario(Comentario comentario, int puntuacion) {

		this.model.puntuarComentario(comentario, puntuacion);
	}

	public void cambiarContrasena(String newPass) {

		this.model.cambiarContrasena(newPass);
	}

	public void anadirComentario(String newComentario) {

		this.model.anadirComentario(newComentario);
	}

	public void valorarNoticia(int puntuacion) {

		this.model.valorarNoticia(puntuacion);
	}

	public void anadirNoticiaAFavoritos(Noticia noticia) {

		this.model.anadirNoticiaAFavoritos(noticia);
	}

	public void cambiarDatos(Datos newDatos) {

		this.model.cambiarDatos(newDatos);
	}

	public void buscarUsuario(String nombre) {

		this.model.buscarUsuario(nombre);
	}

	public void insertarUsuario(Usuario usuario) {

		this.model.insertarUsuario(usuario);
	}

	public void modificarUsuario(Usuario usuario) {

		this.model.modificarUsuario(usuario);
	}
	public void borrarNoticia(Noticia noticia) {

		this.model.borrarNoticia(noticia);
	}

	public void showComments(){

		this.model.showComments();
	}
	
	public void cambiarPreferencias(){
		this.model.cambiarPreferencias();
	}


}
