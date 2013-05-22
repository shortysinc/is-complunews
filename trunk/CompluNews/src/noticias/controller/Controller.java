package noticias.controller;

import is.Categorias;
import is.Datos;
import is.Noticia;
import noticias.model.Model;
import noticias.view.Vista;

public class Controller implements IObserver {
	Model model;
	Vista vista;
	public Controller()
	{
		this.model = new Model();
		this.model.addObserver(this);
		this.vista = new Vista(this);
		this.vista.setVisibility(true);
		
		
		
	}
	@Override
	public void update(UpdateInfo updateType) 
	{
		/* pues dependiendo de lo que se haya hecho
		 * se ejecuta lo mismo en la vista.
		 */
		
	
		switch (updateType)
		{
		
			case NewsAdded:/*aqui el codigo que ejecutaria la vista*/
									String a = "";
									break;
			default:
			break; 
		
		}
	}
	
	  public void editarNoticia(Noticia noticia)
	  {
		  this.model.editarNoticia(noticia);
	    	
	  }
	  public void valorarNoticia(int puntuacion)
	  {
			this.model.valorarNoticia(puntuacion);
		
		}
		public void mostrarNoticia(int IdNoticia)
		{
			this.model.mostrarNoticia(IdNoticia);
			
		
		}
		public void mostrarComentarios(int idNoticia)
		{
			this.model.mostrarComentarios(idNoticia);
			
		}
		public Noticia buscarNoticiaPorTitulo(String titulo){
			
			return this.model.buscarNoticiaPorTitulo(titulo);
		}
		public Noticia buscarNoticiaPorEtiqueta(String etiqueta){
			return this.model.buscarNoticiaPorEtiqueta(etiqueta);
		}
		
		public Noticia buscarNoticiaPorCategoria(Categorias categoria){
			return this.model.buscarNoticiaPorCategoria(categoria);
		}
		
		
		
		// la parte del usuario.
	    public void insertarUsuario(String id, String pass, Datos datos){
	    	/*AQUI IMPLEMENTAMOS EL CODIGO*/
			//Y AHORA NOTIFICAMOS A LOS OBSERVERS LO QUE HEMOS HECHO.
			this.model.insertarUsuario(id, pass, datos);
	    }
		public boolean borrarUsuario(String idUsuario){
	
			/*AQUI IMPLEMENTAMOS EL CODIGO*/
			//Y AHORA NOTIFICAMOS A LOS OBSERVERS LO QUE HEMOS HECHO.
			
			return this.model.borrarUsuario(idUsuario);
		}
		public boolean modificarUsuario(Datos datos){
			
			return this.model.modificarUsuario(datos);
		}


}
