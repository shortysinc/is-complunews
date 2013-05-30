package is.testValidador;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import is.*;

/**
 * @version 1.0
 * @author  Ana
 * @author  JR
 *
 */
public class UsuarioTest {

	Usuario usuarioTest;
	private String idUsuario;
	private String contrasena;


	@Before
	public void setUp() throws Exception {
		idUsuario = "id usuario";
		contrasena = "contrasena";
		usuarioTest = new Usuario(idUsuario);
	}

	@Test
	public void testGetPass() {
		usuarioTest.setPass(contrasena);
		assertTrue("ERROR: La contraseña devuelta no coincide",usuarioTest.getPass().equals(contrasena));
		String nuevaPass = "nuevacontrasena";
		usuarioTest.setPass(nuevaPass);
		assertFalse("La contraseñas no coinciden, por lo tanto ha cambiado bien", usuarioTest.getPass().equals(contrasena));
	}

	@Test
	public void testGetIdUsuario() 	{
		assertTrue("El nombre de usuario coincide con el usuario creado", usuarioTest.getIdUsuario().contains(idUsuario));
	}

	@Test
	public void testSetIdUsuario() 	{
		String nuevaID = "nuevaID";
		usuarioTest.setIdUsuario(nuevaID);
		assertTrue("La ID recibida se corresponde con la ID nueva", usuarioTest.getIdUsuario().contains(nuevaID));
		usuarioTest.setIdUsuario(idUsuario);
		assertFalse("La ID recibida no se corresponde con la ID nueva", usuarioTest.getIdUsuario().contains(nuevaID));
	}

}