package is;

import java.util.ArrayList;
import java.util.Iterator;

public class Noticia {
	private ArrayList<Comentario> comentarios;
	private String titulo;
	private String contenido;
	private int valoracion;
	private ArrayList<Etiquetas> etiquetas;
	private Categorias categorias;
	
	public Noticia(String titulo, String contenido,Categorias categoria)
	{
		this.titulo=titulo;
		this.contenido=contenido;
		this.comentarios=new ArrayList<Comentario>();
		this.setCategorias(categoria);
		this.valoracion=0;
	}
	
	//done
	public void anadirComentario(Comentario comentario){
		this.comentarios.add(comentario);
	}

	//done
	public void eliminarComentario(Comentario comentario){
		this.comentarios.remove(comentario);
	}
	
	//done
	public void valorarNoticia(int puntuacion){
		this.valoracion+=puntuacion;
	}
	
	//done
	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}

	public String getTitulo(){
		return this.titulo;
	}
	
	//done
	public String getContenido(){
		return this.contenido;
	}
	
	//done
	public int getValoracion(){
		return this.valoracion;
	}

	public ArrayList<Etiquetas> getEtiquetas() {
		return etiquetas;
	}
	
	//Done
	public boolean anadirEtiqueta(String nombreEtiqueta){
		if(this.etiquetas.contains(nombreEtiqueta)) 
			return false;
		else
		{
			this.etiquetas.add(new Etiquetas(nombreEtiqueta));
			return true;
		}
		
		
	}
	

	public Categorias getCategorias() {
		return categorias;
	}

	public void setCategorias(Categorias categorias) {
		this.categorias = categorias;
	}

	public int verPuntuacionComentario(Comentario comen) 
	{
		Iterator<Comentario> it = comentarios.iterator();
		int retorno=-1;
		while (it.hasNext())
		{
			Comentario aux= it.next();
			if(comen.equals(aux)){
				retorno= aux.getPuntuacion();
			}
			
		}
		return retorno;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public void setEtiquetas(ArrayList<Etiquetas> etiquetas) {
		this.etiquetas = etiquetas;
	}

	public ArrayList<Comentario> getComentarios() {
		return comentarios;
	}

	public void setComentarios(ArrayList<Comentario> comentarios) {
		this.comentarios = comentarios;
	}
}
