package is.testValidador;
//Terminado
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import is.*;

/**
 * @version 1.0
 * @author  JR
 */
public class ComentarioTest 
{

	
	/**
	 * Variables que usaremos para probar los test 
	 */
	private String usuario1;
	private String usuario2;
	private String usuario3;
	private String contenido1;
	private String contenido2;
	private String contenido3;
	private Comentario comment;
	
	
	@Before
	public void setUp() throws Exception {
		usuario1 = "pepe";
		usuario2 = "oscar";
		usuario3 = "ana";
		contenido1 = "miau";
		contenido2= "guau";
		contenido3= "rolf";
	}

	@Test
	public void testGetIdUsuario() 
	{
		//Usuario 1 sin fallos
		comment = new Comentario("pepe", "miau");
		assertTrue ("usuario correcto", comment.getIdUsuario().equalsIgnoreCase(usuario1));
		
		//Usuario 2 con fallo
		comment = new Comentario("ruben", "hola");
		assertFalse("Usuario con fallo en contenido", comment.getIdUsuario().equalsIgnoreCase(usuario2));
		
		//Usuario 3 con fallo en usuario
		comment = new Comentario("ana", "rolf");
		assertTrue("Usuario correcto", comment.getIdUsuario().equalsIgnoreCase(usuario3));
		
		
	}

	@Test
	public void testSetIdUsuario() 
	{
		String nombreCorrecto = "Andres";
		String nombreIncorrecto = "Javi";
		comment = new Comentario("","");
		comment.setIdUsuario(nombreCorrecto);
		assertTrue("Ha cambiado el Id usuario correctamente", comment.getIdUsuario().equalsIgnoreCase(nombreCorrecto));
		comment.setIdUsuario(nombreIncorrecto);
		assertFalse ("No ha cambiado el Id usuario correctamente", comment.getIdUsuario().equalsIgnoreCase(nombreCorrecto));
	}

	@Test
	public void testGetContenido() 
	{
		//Sin fallos
		comment = new Comentario("pepe", "miau");
		assertTrue ("contenido correcto",comment.getContenido().equalsIgnoreCase(contenido1));

		//Fallo en contenido
		comment = new Comentario("oscar", "hola");
		assertFalse("Fallo en contenido",comment.getContenido().equalsIgnoreCase(contenido2));

		//Sin fallos
		comment = new Comentario("Ane", "rolf");
		assertTrue("Contenido Correcto", comment.getContenido().equalsIgnoreCase(contenido3));
	}

	@Test
	public void testSetContenido() 
	{
		String contenidoCorrecto = "Buenas tardes";
		String contenidoIncorrecto = "Buenos dias";
		comment = new Comentario("","");
		comment.setContenido(contenidoCorrecto);
		comment.setContenido(contenidoIncorrecto);
		
		if (comment.getContenido().equalsIgnoreCase(contenidoIncorrecto))
			assertTrue("El contenido ha cambiado correctamente", !comment.getContenido().equalsIgnoreCase(contenidoCorrecto));
		else
			assertFalse("El contenido no ha cambiado", comment.getContenido().equalsIgnoreCase(contenidoCorrecto));
		
	}
	
	@Test
	public void testSetGetPuntuacion() 
	{
		int puntuacionCorrecta=4;
		int puntuacionIncorrecta=3;
		comment = new Comentario();
		comment.setPuntuacion(puntuacionCorrecta);
		
		assertTrue("La puntuacion ha cambiado correctamente",comment.getPuntuacion()==puntuacionCorrecta);
		assertFalse("La puntuacion No ha cambiado correctamente",comment.getPuntuacion()==puntuacionIncorrecta);
		
		comment.setPuntuacion(puntuacionIncorrecta);
		
		assertTrue("La puntuacion ha cambiado correctamente",comment.getPuntuacion()==puntuacionIncorrecta);
	}
	
	@Test
	public void testPuntuarComentario() 
	{
		int aumentaPuntuacion=4;
		int puntuacionMaxima=5;
		comment= new Comentario();
		assertTrue("Puntuacion inicial correcta",comment.getPuntuacion()==0);
		comment.puntuarComentario(aumentaPuntuacion);
		assertTrue("La puntuacion ha aumentado corectamente", comment.getPuntuacion()!=0);
		comment.puntuarComentario(aumentaPuntuacion);
		assertTrue("La puntuacion ha excedido el maximo permitido", comment.getPuntuacion()>puntuacionMaxima);
		comment.setPuntuacion(5);
		assertTrue("La puntuacion es correcta (esta dentro de los limites", comment.getPuntuacion()==puntuacionMaxima);
		
	}
}
