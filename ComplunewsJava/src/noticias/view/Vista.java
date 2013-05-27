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
		// TODO Ap�ndice de m�todo generado autom�ticamente
		this.controller.a�adirComentario(nuevoComentario);
	}

	public void linkNews() {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		this.controller.enlazarNoticias();
	}

	public void addNewToFavorite() {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		Noticia noticia=null;
		this.controller.a�adirNoticiaAFavoritos(noticia);
	}

	public void changeData() {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		Datos newDatos=null;
		this.controller.cambiarDatos(newDatos);
	}

	public void changePassword() {
		String newPass=null;
		// TODO Ap�ndice de m�todo generado autom�ticamente
		this.controller.cambiarContrase�a(newPass);
	}

	public void commentModified() {
		Noticia noticia=null;
		// TODO Ap�ndice de m�todo generado autom�ticamente
		this.controller.gestionarComentarios(noticia);
	}

	public void commentScore() {
		int puntuacion=0;
		// TODO Ap�ndice de m�todo generado autom�ticamente
		this.controller.puntuarComentario(puntuacion);
	}

	public void deleteUser() {
		Usuario usuario=null;
		// TODO Ap�ndice de m�todo generado autom�ticamente
		this.controller.eliminarUsuario(usuario);
	}

	public void insertUser() {
		Usuario usuario=null;
		// TODO Ap�ndice de m�todo generado autom�ticamente
		this.controller.insertarUsuario(usuario);
	}

	public void logIn() {
		String idUsuario="";
		String pass="";
		// TODO Ap�ndice de m�todo generado autom�ticamente
		this.controller.iniciarSesion(idUsuario, pass);
	}

	public void logOut() {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		this.controller.cerrarSesion();
	}

	public void modifiedUser() {
		Usuario usuario=null;
		// TODO Ap�ndice de m�todo generado autom�ticamente
		this.controller.modificarUsuario(usuario);
	}

	

	public void newsAdded() {
		Noticia newNoticia=null;
		// TODO Ap�ndice de m�todo generado autom�ticamente
		this.controller.a�adirNoticia(newNoticia);
	}

	public void newsDelete() {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		Noticia noticia=null;
		this.controller.borrarNoticia(noticia);
	}

	public void newsModified() {
		Noticia noticiaAEditar=null;
		// TODO Ap�ndice de m�todo generado autom�ticamente
		this.controller.editarNoticia(noticiaAEditar);
	}

	public void register() {
		String idUsuario=null;
		String pass=null;
		Datos nuevosDatos=null;
		// TODO Ap�ndice de m�todo generado autom�ticamente
		this.controller.registrarse(idUsuario, pass, nuevosDatos);
	}

	public void registerAdmin() {
		Administrador newAdmin=null;
		// TODO Ap�ndice de m�todo generado autom�ticamente
		this.controller.registrarAdministrador(newAdmin);
	}

	public void scoreChanged() {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		int puntuacion=0;
		this.controller.valorarNoticia(puntuacion);
	}

	public void searchUser() {
		String nombre=null;
		// TODO Ap�ndice de m�todo generado autom�ticamente
		this.controller.buscarUsuario(nombre);
	}



	public void searchingNewsCategory() {
		String titulo=null;
		// TODO Ap�ndice de m�todo generado autom�ticamente
		this.controller.buscarNoticiaPorCategoria(titulo);
	}

	public void searchingNewsTag() {
		String titulo=null;
		// TODO Ap�ndice de m�todo generado autom�ticamente
		this.controller.buscarNoticiaPorEtiqueta(titulo);
	}

	public void searchingNewsTitle() {
		String titulo=null;
		// TODO Ap�ndice de m�todo generado autom�ticamente
		this.controller.buscarNoticiaPorTitulo(titulo);
		
	}

	public void showComments() {
		Noticia noticia=null;
		// TODO Ap�ndice de m�todo generado autom�ticamente
		this.controller.verComentarios(noticia);
	}

	

	public void valueComment() {
		int puntuacion=0;
		// TODO Ap�ndice de m�todo generado autom�ticamente
		this.controller.puntuarComentario(puntuacion);
	}

	

	

}
