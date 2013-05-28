package is.testValidador;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import is.*;

public class ComentarioTest {


	
	private String usuario1;
	private String usuario2;
	private String usuario3;
	private String contenido1;
	private String contenido2;
	private String contenido3;
	private Comentario comment;
	
	
	
	
	
	
	
	@Before
	public void setUp() throws Exception {
		/*placeName = "place name";
		placeDescription = "place description";
		placeTest = new Place(placeName, false, placeDescription);   */
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
		assertTrue ("usuario y contenido correcto", comment.getIdUsuario().equalsIgnoreCase(usuario1));
		
		//Usuario 2 con fallo
		comment = new Comentario("ruben", "hola");
		assertTrue("Usuario con fallo en contenido", comment.getIdUsuario().equalsIgnoreCase(usuario2));
		
		//Usuario 3 con fallo en usuario
		comment = new Comentario("ana", "rolf");
		assertFalse("Usuario con fallo en usuario", comment.getIdUsuario().equalsIgnoreCase(usuario3));
		
		
	}

	@Test
	public void testSetIdUsuario() 
	{
		/*assertTrue("ERROR: the place name does not appear in the string", placeTest.toString().contains(placeName));
		assertTrue("ERROR: the place description does not appear in the string", placeTest.toString().contains(placeDescription));*/
		/*
		 Card card = new Card();  
        card.setNativeWord("test");  
        assertTrue(card.getNativeWord() == "test");
		 */
		String nombreCorrecto = "Andres";
		String nombreIncorrecto = "Javi";
		comment = new Comentario("","");
		comment.setIdUsuario(nombreCorrecto);
		assertTrue("Ha cambiado el Id usuario correctamente", comment.getIdUsuario().equalsIgnoreCase(nombreCorrecto));
		comment.setIdUsuario(nombreIncorrecto);
		assertTrue ("No ha cambiado el Id usuario correctamente", comment.getIdUsuario().equalsIgnoreCase(nombreCorrecto));
	}

	@Test
	public void testGetContenido() 
	{
		//Sin fallos
		comment = new Comentario("pepe", "miau");
		assertTrue ("contenido correcto",comment.getContenido().equalsIgnoreCase(contenido1));

		//Fallo en contenido
		comment = new Comentario("oscar", "hola");
		assertTrue("Fallo en contenido",comment.getContenido().equalsIgnoreCase(contenido2));

		//Sin fallos
		comment = new Comentario("Ane", "rolf");
		assertFalse("Contenido Correcto", comment.getContenido().equalsIgnoreCase(contenido3));
	}

	@Test
	public void testSetContenido() 
	{
		
		
	}
	
	@Test
	public void testGetPuntuacion() 
	{

	}
	
	@Test
	public void testDropItem() 
	{

	}
}
