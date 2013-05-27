package is;

import java.util.ArrayList;

public class Noticia {
	private ArrayList<Comentario> comentarios;
	private String titulo;
	private String contenido;
	private int valoracion;
	private ArrayList<Etiquetas> etiquetas;
	private Categorias categorias;
	
	public Noticia(String titulo, String contenido,Categorias categoria){
		this.titulo=titulo;
		this.contenido=contenido;
		this.comentarios=new ArrayList<Comentario>();
		this.setCategorias(categoria);
		this.valoracion=0;
	}
	
	public void aniadirComentario(Comentario comentario){
		this.comentarios.add(comentario);
	}
	public void eliminarComentario(Comentario comentario){
		this.comentarios.remove(comentario);
	}
	public void valorarNoticia(int puntuacion){
		this.valoracion+=puntuacion;
	}
	
	public String getTitulo(){
		return this.titulo;
	}
	public String getContenido(){
		return this.contenido;
	}
	public int getValoracion(){
		return this.valoracion;
	}

	public ArrayList<Etiquetas> getEtiquetas() {
		return etiquetas;
	}
	
	public boolean aniadirEtiqueta(String nombreEtiqueta){
		if(this.etiquetas.contains(nombreEtiqueta) ) return false;
		else{
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
}
