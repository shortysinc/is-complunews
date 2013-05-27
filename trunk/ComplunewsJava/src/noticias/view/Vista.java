package noticias.view;

import is.Administrador;
import is.Datos;
import is.Noticia;
import is.Usuario;
import noticias.controller.Controller;


public class Vista {
	
	/**
	 * 
	 */
	private Controller controller;
	
	public Vista(Controller controller) 
	{
		this.controller=controller;
	}

	public void addComment() {
		String nuevoComentario="";
		// TODO Apéndice de método generado automáticamente
		this.controller.añadirComentario(nuevoComentario);
	}

	public void linkNews() {
		// TODO Apéndice de método generado automáticamente
		this.controller.enlazarNoticias();
	}

	public void addNewToFavorite() {
		// TODO Apéndice de método generado automáticamente
		Noticia noticia=null;
		this.controller.añadirNoticiaAFavoritos(noticia);
	}

	public void changeData() {
		// TODO Apéndice de método generado automáticamente
		Datos newDatos=null;
		this.controller.cambiarDatos(newDatos);
	}

	public void changePassword() {
		String newPass=null;
		// TODO Apéndice de método generado automáticamente
		this.controller.cambiarContraseña(newPass);
	}

	public void commentModified() {
		Noticia noticia=null;
		// TODO Apéndice de método generado automáticamente
		this.controller.gestionarComentarios(noticia);
	}

	public void commentScore() {
		int puntuacion=0;
		// TODO Apéndice de método generado automáticamente
		this.controller.puntuarComentario(puntuacion);
	}

	public void deleteUser() {
		Usuario usuario=null;
		// TODO Apéndice de método generado automáticamente
		this.controller.eliminarUsuario(usuario);
	}

	public void insertUser() {
		Usuario usuario=null;
		// TODO Apéndice de método generado automáticamente
		this.controller.insertarUsuario(usuario);
	}

	public void logIn() {
		String idUsuario="";
		String pass="";
		// TODO Apéndice de método generado automáticamente
		this.controller.iniciarSesion(idUsuario, pass);
	}

	public void logOut() {
		// TODO Apéndice de método generado automáticamente
		this.controller.cerrarSesion();
	}

	public void modifiedUser() {
		Usuario usuario=null;
		// TODO Apéndice de método generado automáticamente
		this.controller.modificarUsuario(usuario);
	}

	

	public void newsAdded() {
		Noticia newNoticia=null;
		// TODO Apéndice de método generado automáticamente
		this.controller.añadirNoticia(newNoticia);
	}

	public void newsDelete() {
		// TODO Apéndice de método generado automáticamente
		Noticia noticia=null;
		this.controller.borrarNoticia(noticia);
	}

	public void newsModified() {
		Noticia noticiaAEditar=null;
		// TODO Apéndice de método generado automáticamente
		this.controller.editarNoticia(noticiaAEditar);
	}

	public void register() {
		String idUsuario=null;
		String pass=null;
		Datos nuevosDatos=null;
		// TODO Apéndice de método generado automáticamente
		this.controller.registrarse(idUsuario, pass, nuevosDatos);
	}

	public void registerAdmin() {
		Administrador newAdmin=null;
		// TODO Apéndice de método generado automáticamente
		this.controller.registrarAdministrador(newAdmin);
	}

	public void scoreChanged() {
		// TODO Apéndice de método generado automáticamente
		int puntuacion=0;
		this.controller.valorarNoticia(puntuacion);
	}

	public void searchUser() {
		String nombre=null;
		// TODO Apéndice de método generado automáticamente
		this.controller.buscarUsuario(nombre);
	}



	public void searchingNewsCategory() {
		String titulo=null;
		// TODO Apéndice de método generado automáticamente
		this.controller.buscarNoticiaPorCategoria(titulo);
	}

	public void searchingNewsTag() {
		String titulo=null;
		// TODO Apéndice de método generado automáticamente
		this.controller.buscarNoticiaPorEtiqueta(titulo);
	}

	public void searchingNewsTitle() {
		String titulo=null;
		// TODO Apéndice de método generado automáticamente
		this.controller.buscarNoticiaPorTitulo(titulo);
		
	}

	public void showComments() {
		Noticia noticia=null;
		// TODO Apéndice de método generado automáticamente
		this.controller.verComentarios(noticia);
	}

	

	public void valueComment() {
		int puntuacion=0;
		// TODO Apéndice de método generado automáticamente
		this.controller.puntuarComentario(puntuacion);
	}

	

	

}
