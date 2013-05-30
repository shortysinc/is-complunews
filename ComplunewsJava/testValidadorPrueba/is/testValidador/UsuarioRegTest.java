package is.testValidador;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import is.*;

/**
 * @version 1.0
 * @author  Ana
 *
 */
public class UsuarioRegTest {

	private UsuarioReg regUser;
	private ArrayList<Noticia> favoritos;
	private String idUsuario;

	@Before
	public void setUp() throws Exception {
		idUsuario = "idUsuario";
		regUser = new UsuarioReg(idUsuario);
		
	}

	@Test
	public void testGetIdUsuario() 	{
		assertTrue("ERROR: El nombre de usuario no coincide", regUser.getIdUsuario().contains(idUsuario));
		regUser.setIdUsuario("otroID");
		assertFalse("ERROR: El nombre de usuario no coincide", regUser.getIdUsuario().contains(idUsuario));
	}
	
	@Test
	public void testAnadirNoticiaAFavoritos() {
		Noticia noticia = new Noticia("titulo", "contenido", Categorias.Moda);
		assertTrue("ERROR: El array no contiene la noticia pero no se agrega", regUser.anadirNoticiaAFavoritos(noticia));
		assertFalse("ERROR: El array contiene la noticia y la vuelve a agregar", regUser.anadirNoticiaAFavoritos(noticia));
	
	}

	@Test
	public void testGetSetFavoritos() 	{
		favoritos = new ArrayList<Noticia>();
		regUser.setFavoritos(favoritos);
		assertTrue("ERROR: La lista de favoritos no coincide", regUser.getFavoritos().equals(favoritos));
	}
	
}
