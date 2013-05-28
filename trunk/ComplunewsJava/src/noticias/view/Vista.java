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
		// TODO Apéndice de método generado automáticamente
		this.controller.añadirComentario(nuevoComentario);
	}

	public void linkNews() {
		// Seleccionar noticia y asignarla a esta variable
		Noticia noticia=null;
		this.controller.enlazarNoticias(noticia);
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
		String idUsuario="Pepito";
		String pass="teresuki7";
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
		//Seleccionar un comentario de la interfaz
		Comentario comentario=null;
		
		this.controller.puntuarComentario(comentario, puntuacion);
	}

	public void error(String mensaje) {
		//sacar ventana con error registrado
		
		//JOptionPane.showMessageDialog(parentComponent, mensaje);
		
	}

	

	

}
