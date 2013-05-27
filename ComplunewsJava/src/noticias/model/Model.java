package noticias.model;

import java.util.ArrayList;
import java.util.List;

import Connection.ConnectionDaoSingleton;
import is.Administrador;
import is.Datos;
import is.Usuario;
import is.UsuarioNoReg;
import is.Noticia;

import noticias.controller.IObserver;
import noticias.controller.UpdateInfo;

public class Model implements IObservable{
	List<IObserver> observers;
	private Usuario currentUser;
	@SuppressWarnings("unused")
	private ConnectionDaoSingleton conexion;
	
	public Model(ArrayList<Noticia> portada)
	{
		this.conexion=ConnectionDaoSingleton.getInstance();
		this.observers = new ArrayList<IObserver>();
		this.currentUser=new UsuarioNoReg();
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
	 */
	public void iniciarSesion(String idUsuario, String pass){
		
	
	notifyObserver(UpdateInfo.LogIn);
		
		
	}
	
	public void cerrarSesion(){
		this.currentUser=new UsuarioNoReg();
		
		notifyObserver(UpdateInfo.LogOut);
	}

	public void eliminarUsuario(Usuario usuario){
		
	}
	public void añadirNoticia(Noticia newNoticia) {
		Administrador admin = (Administrador)this.currentUser;
		admin.añadirNoticia(newNoticia);
		this.notifyObserver(UpdateInfo.NewsAdded);
		
	}
	
	public void editarNoticia(Noticia noticiaAEditar) {
		
		
		notifyObserver(UpdateInfo.NewsModified);
	}
	
	public void gestionarComentarios(Noticia noticia) {
		

		notifyObserver(UpdateInfo.CommentModified);
	}
	
	public void registrarAdministrador(Administrador newAdmin) {
		


		notifyObserver(UpdateInfo.RegisterAdmin);
		
	}
	
	public void registrarse(String idUsuario, String pass, Datos nuevosDatos) {
		notifyObserver(UpdateInfo.Register);
		
	}
	
	public void buscarNoticiaPorTitulo(String titulo) {
		
		notifyObserver(UpdateInfo.SearchingNewsTitle);
	}
	
	public void buscarNoticiaPorEtiqueta(String titulo) {

		notifyObserver(UpdateInfo.SearchingNewsTag);
	}
	
	public void buscarNoticiaPorCategoria(String titulo) {
		
		notifyObserver(UpdateInfo.SearchingNewsCategory);
	}
	
	public void enlazarNoticias() {
		
		notifyObserver(UpdateInfo.LinkNews);
	}
	
	public void verPuntuacionComentario(Noticia noticia) {
		
		
		notifyObserver(UpdateInfo.CommentScore);
		
	}
	
	public void verComentarios(Noticia noticia) {
		
		notifyObserver(UpdateInfo.ShowComments);
		
	}
	
	public void puntuarComentario(int puntuacion) {
		
		notifyObserver(UpdateInfo.ValueComment);
	}
	
	public void cambiarContraseña(String newPass) {
		
		notifyObserver(UpdateInfo.ChangePassword);
	}
	
	public void añadirComentario(String newComentario) {
		
		notifyObserver(UpdateInfo.AddComment);
	}
	
	public void valorarNoticia(int puntuacion) {
		
		notifyObserver(UpdateInfo.NewValue);
	}
	
	public void añadirNoticiaAFavoritos(Noticia noticia) {
		
		notifyObserver(UpdateInfo.AddNewToFavorite);
	}
	
	public void cambiarDatos(Datos newDatos) {
		
		notifyObserver(UpdateInfo.ChangeData);
	}
	
	public void buscarUsuario(String nombre) {
		
		notifyObserver(UpdateInfo.SearchUser);
	}
	
	public void insertarUsuario(Usuario usuario) {
		
		notifyObserver(UpdateInfo.InsertUser);
	}
	
	public void modificarUsuario(Usuario usuario) {
		
		notifyObserver(UpdateInfo.ModifyUser);
	}
	public void borrarNoticia(Noticia noticia) {
		
		notifyObserver(UpdateInfo.BorrarNoticia);
	}
	
	

		


}
