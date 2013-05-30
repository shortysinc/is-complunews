package is.testValidador;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import is.*;

/**
 * @version 1.0
 * @author  Ana
 *
 */
public class UsuarioTest 
{

	Usuario usuarioTest;
	private String idUsuario;
	private String contrasena;


	@Before
	public void setUp() throws Exception 
	{
		idUsuario = "id usuario";
		contrasena = "contrasena";
		usuarioTest = new Usuario(idUsuario);
	}

	@Test
	public void testGetPass() 
	{
		usuarioTest.setPass(contrasena);
		assertTrue("ERROR: La contraseña devuelta no coincide",usuarioTest.getPass().equals(contrasena));
	}

	@Test
	public void testGetIdUsuario() 
	{
		assertTrue("ERROR: El nombre de usuario no coincide", usuarioTest.getIdUsuario().contains(idUsuario));
	}

	@Test
	public void testSetIdUsuario() 
	{
		String nuevaID = "nuevaID";
		usuarioTest.setIdUsuario(nuevaID);
		assertTrue("ERROR: La ID recibida no se corresponde con la ID nueva", usuarioTest.getIdUsuario().contains(nuevaID));
	}

}