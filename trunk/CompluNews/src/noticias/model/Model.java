package noticias.model;

import java.util.ArrayList;
import java.util.List;

import is.Datos;
import is.UsuarioReg;

import is.Categorias;
import is.Noticia;

import noticias.controller.IObserver;
import noticias.controller.UpdateInfo;

public class Model implements IObservable{
	List<IObserver> observers;

	
	public Model()
	{
		this.observers = new ArrayList<IObserver>();
	}
	public void addObserver(IObserver observer) {
		this.observers.add(observer);
		
	}

	@Override
	public void notifyObserver(UpdateInfo updateType) {
		for(IObserver observer: this.observers )
			observer.update(updateType);
		
	}
	
	
	  public void editarNoticia(Noticia noticia)
	  {
		  /*AQUI IMPLEMENTAMOS EL CODIGO*/
		  
		  
		//y notificamos a los observers que se ha editado una noticia
		  notifyObserver(UpdateInfo.NewsModified);
	    	
	  }
		public void valorarNoticia(int puntuacion)
		{
			/*AQUI IMPLEMENTAMOS EL CODIGO*/
			
			
			
			//Y AHORA NOTIFICAMOS A LOS OBSERVERS LO QUE HEMOS HECHO.
			notifyObserver(UpdateInfo.NewSetScore);
		}
		public void mostrarNoticia(int IdNoticia){
			
			/*AQUI IMPLEMENTAMOS EL CODIGO*/
			//Y AHORA NOTIFICAMOS A LOS OBSERVERS LO QUE HEMOS HECHO.
			notifyObserver(UpdateInfo.ShowNews);
		}
		public void mostrarComentarios(int idNoticia)
		{
			/*AQUI IMPLEMENTAMOS EL CODIGO*/
			//Y AHORA NOTIFICAMOS A LOS OBSERVERS LO QUE HEMOS HECHO.
			notifyObserver(UpdateInfo.ShowComments);
			
		}
		public Noticia buscarNoticiaPorTitulo(String titulo){
			
			/*AQUI IMPLEMENTAMOS EL CODIGO*/
			//Y AHORA NOTIFICAMOS A LOS OBSERVERS LO QUE HEMOS HECHO.
			notifyObserver(UpdateInfo.SearchingNewsTitle);
			return null;
		}
		public Noticia buscarNoticiaPorEtiqueta(String etiqueta){
			/*AQUI IMPLEMENTAMOS EL CODIGO*/
			//Y AHORA NOTIFICAMOS A LOS OBSERVERS LO QUE HEMOS HECHO.
			notifyObserver(UpdateInfo.SearchingNewsTag);
			return null;
		}
		
		public Noticia buscarNoticiaPorCategoria(Categorias categoria){
			/*AQUI IMPLEMENTAMOS EL CODIGO*/
			//Y AHORA NOTIFICAMOS A LOS OBSERVERS LO QUE HEMOS HECHO.
			notifyObserver(UpdateInfo.SearchingNewsCategory);
			return null;
		}
		
		
		// la parte del usuario.
	    public void insertarUsuario(String id, String pass, Datos datos){
	    	/*AQUI IMPLEMENTAMOS EL CODIGO*/
			//Y AHORA NOTIFICAMOS A LOS OBSERVERS LO QUE HEMOS HECHO.
			notifyObserver(UpdateInfo.InsertUser);
	    }
		public boolean borrarUsuario(String idUsuario){
	
			/*AQUI IMPLEMENTAMOS EL CODIGO*/
			//Y AHORA NOTIFICAMOS A LOS OBSERVERS LO QUE HEMOS HECHO.
			notifyObserver(UpdateInfo.DeleteUser);
			return false;
		}
		public boolean modificarUsuario(Datos datos){
			/*AQUI IMPLEMENTAMOS EL CODIGO*/
			//Y AHORA NOTIFICAMOS A LOS OBSERVERS LO QUE HEMOS HECHO.
			notifyObserver(UpdateInfo.ModifiedUser);
			return false;
		}



}
