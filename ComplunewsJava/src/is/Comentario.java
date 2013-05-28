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
	
	public static void main(String [ ] args)
	{
		Comentario persona = new Comentario("Jorge", "tu puta madre");
		persona.setPuntuacion(20);
		System.out.println(persona.getIdUsuario().toString());
		System.out.println(persona.getContenido());
		System.out.println(persona.getPuntuacion());
		
		
	}
	
	
	

}
