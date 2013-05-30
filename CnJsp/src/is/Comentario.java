package is;

public class Comentario {
	
	private String idUsuario;
	private String contenido;
	private int puntuacion;
	
	public Comentario(String idUsuario, String contenido){
		this.idUsuario=idUsuario;
		this.contenido=contenido;
		this.puntuacion=0;
	}

	public Comentario() {
		// TODO Auto-generated constructor stub
	}

	public String getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}
	
	
	public void puntuarComentario(int puntuacion){
		this.puntuacion += puntuacion;	
	}
	
	
	

}
