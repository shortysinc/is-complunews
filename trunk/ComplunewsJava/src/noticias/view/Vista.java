package noticias.view;



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
		
		this.controller.anadirComentario(nuevoComentario);
	}

	public void linkNews() {
		
		Noticia noticia=null;
		this.controller.enlazarNoticias(noticia);
	}

	public void addNewToFavorite() {
		//obtendria la noticia  seleccionada
		Noticia noticia=null;
		
		// y la anadiria
		this.controller.anadirNoticiaAFavoritos(noticia);
	}

	public void changeData() {
		
		Datos newDatos=null;
		this.controller.cambiarDatos(newDatos);
	}

	public void changePassword() {
		String newPass=null;
		
		this.controller.cambiarContrasena(newPass);
	}

	public void commentModified() {
		Noticia noticia=null;
		
		this.controller.gestionarComentarios(noticia);
	}

	

	public void deleteUser() {
		Usuario usuario=null;
		
		this.controller.eliminarUsuario(usuario);
	}

	public void insertUser() {
		Usuario usuario=null;
		
		this.controller.insertarUsuario(usuario);
	}

	public void logIn() {
		//obtendria los datos desde un textbox
		String idUsuario="Pepito";
		String pass="pepe";
		
		this.controller.iniciarSesion(idUsuario, pass);
	}

	public void logOut() {
		
		this.controller.cerrarSesion();
	}

	public void modifiedUser() {
		Usuario usuario=null;
		
		this.controller.modificarUsuario(usuario);
	}

	

	public void newsAdded() {
		Noticia newNoticia=null;
		
		this.controller.anadirNoticia(newNoticia);
	}

	public void newsDelete() {
		
		Noticia noticia=null;
		this.controller.borrarNoticia(noticia);
	}

	public void newsModified() {
		Noticia noticiaAEditar=null;
		
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
		
		this.controller.buscarNoticiaPorCategoria(titulo);
	}

	public void searchingNewsTag() {
		String titulo=null;
		
		this.controller.buscarNoticiaPorEtiqueta(titulo);
	}

	public void searchingNewsTitle() {
		String titulo=null;
		
		this.controller.buscarNoticiaPorTitulo(titulo);
		
	}

	public void showComments() {
		
		
		
		
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
