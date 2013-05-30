package is.testValidador;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import is.*;

/**
 * @version 1.0
 * @author  Ana
 * @author  JR
 *
 */
public class UsuarioRegTest {

	private UsuarioReg regUserTest;
	private ArrayList<Noticia> favoritos;
	private String idUsuario;

	@Before
	public void setUp() throws Exception {
		idUsuario = "idUsuario";
		regUserTest = new UsuarioReg(idUsuario);
		
	}

	@Test
	public void testGetIdUsuario() 	{
		assertNotNull("Usuario Creado correctamente", regUserTest.getIdUsuario());
		regUserTest.setIdUsuario(null);
		assertNull("ERROR: Usuario creado con <Null> creado", regUserTest.getIdUsuario());
		
		regUserTest.setIdUsuario(idUsuario);
		assertTrue("El nombre de usuario coincide", regUserTest.getIdUsuario().contains(idUsuario));
		regUserTest.setIdUsuario("otroID");
		assertFalse("ERROR: El nombre de usuario no coincide", regUserTest.getIdUsuario().contains(idUsuario));
	}
	
	@Test
	public void testAnadirNoticiaAFavoritos() {
		Noticia noticia = new Noticia("titulo", "contenido", Categorias.Moda);
		assertTrue("Se agrega la noticia correctamente", regUserTest.anadirNoticiaAFavoritos(noticia));
		assertFalse("ERROR: No se agrega la noticia, porque ya existe la misma noticia", regUserTest.anadirNoticiaAFavoritos(noticia));
	
	}

	@Test
	public void testGetSetFavoritos() 	{
		favoritos = new ArrayList<Noticia>();
		regUserTest.setFavoritos(favoritos);
		assertTrue("ERROR: La lista de favoritos no coincide", regUserTest.getFavoritos().equals(favoritos));
	}
	
}
