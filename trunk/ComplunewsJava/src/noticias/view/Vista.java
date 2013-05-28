package noticias.view;

import javax.swing.JOptionPane;

import is.Administrador;
import is.Comentario;
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
		// TODO Apnndice de mntodo generado automnticamente
		this.controller.anadirComentario(nuevoComentario);
	}

	public void linkNews() {
		// Seleccionar noticia y asignarla a esta variable
		Noticia noticia=null;
		this.controller.enlazarNoticias(noticia);
	}

	public void addNewToFavorite() {
		// TODO Apnndice de mntodo generado automnticamente
		Noticia noticia=null;
		this.controller.anadirNoticiaAFavoritos(noticia);
	}

	public void changeData() {
		// TODO Apnndice de mntodo generado automnticamente
		Datos newDatos=null;
		this.controller.cambiarDatos(newDatos);
	}

	public void changePassword() {
		String newPass=null;
		// TODO Apnndice de mntodo generado automnticamente
		this.controller.cambiarContrasena(newPass);
	}

	public void commentModified() {
		Noticia noticia=null;
		// TODO Apnndice de mntodo generado automnticamente
		this.controller.gestionarComentarios(noticia);
	}

	

	public void deleteUser() {
		Usuario usuario=null;
		// TODO Apnndice de mntodo generado automnticamente
		this.controller.eliminarUsuario(usuario);
	}

	public void insertUser() {
		Usuario usuario=null;
		// TODO Apnndice de mntodo generado automnticamente
		this.controller.insertarUsuario(usuario);
	}

	public void logIn() {
		String idUsuario="Pepito";
		String pass="teresuki7";
		// TODO Apnndice de mntodo generado automnticamente
		this.controller.iniciarSesion(idUsuario, pass);
	}

	public void logOut() {
		// TODO Apnndice de mntodo generado automnticamente
		this.controller.cerrarSesion();
	}

	public void modifiedUser() {
		Usuario usuario=null;
		// TODO Apnndice de mntodo generado automnticamente
		this.controller.modificarUsuario(usuario);
	}

	

	public void newsAdded() {
		Noticia newNoticia=null;
		// TODO Apnndice de mntodo generado automnticamente
		this.controller.anadirNoticia(newNoticia);
	}

	public void newsDelete() {
		// TODO Apnndice de mntodo generado automnticamente
		Noticia noticia=null;
		this.controller.borrarNoticia(noticia);
	}

	public void newsModified() {
		Noticia noticiaAEditar=null;
		// TODO Apnndice de mntodo generado automnticamente
		this.controller.editarNoticia(noticiaAEditar);
	}

	public void register() {
		String idUsuario=null;
		String pass=null;
		Datos nuevosDatos=null;
		
		this.controller.registrarse(idUsuario, pass, nuevosDatos);
	}

	public void registerAdmin() {
		Administrador newAdmin=null;
		
		this.controller.registrarAdministrador(newAdmin);
	}

	public void scoreChanged() {
		
		int puntuacion=0;
		this.controller.valorarNoticia(puntuacion);
	}

	public void searchUser() {
		String nombre=null;
		
		this.controller.buscarUsuario(nombre);
	}



	public void searchingNewsCategory() {
		String titulo=null;
		// TODO Apnndice de mntodo generado automnticamente
		this.controller.buscarNoticiaPorCategoria(titulo);
	}

	public void searchingNewsTag() {
		String titulo=null;
		// TODO Apnndice de mntodo generado automnticamente
		this.controller.buscarNoticiaPorEtiqueta(titulo);
	}

	public void searchingNewsTitle() {
		String titulo=null;
		// TODO Apnndice de mntodo generado automnticamente
		this.controller.buscarNoticiaPorTitulo(titulo);
		
	}

	public void showComments() {
		Noticia noticia=null;
		// TODO Apnndice de mntodo generado automnticamente
		this.controller.verComentarios(noticia);
	}

	

	public void valueComment() {
		int puntuacion=0;
		//Seleccionar un comentario de la interfaz
		Comentario comentario=null;
		
		this.controller.puntuarComentario(comentario, puntuacion);
	}

	public void error(String mensaje) {
		//sacar ventana con error registrado
		
		//JOptionPane.showMessageDialog(parentComponent, mensaje);
		
	}

	

	

}
