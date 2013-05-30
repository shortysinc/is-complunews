package is.testValidador;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import is.*;

/**
 * @version 1.0
 * @author  JR
 *
 */
public class UsuarioNoRegTest {
	
	private String ususarioNoReg;
	private UsuarioNoReg usuarioNoRegTest;


	@Before
	public void setUp() throws Exception {
		
		ususarioNoReg="usuario";
	}

	@Test
	public void testUsuarioNoReg() 
	{
		usuarioNoRegTest = new UsuarioNoReg(ususarioNoReg);
		assertTrue("Usuario creado correctamente", usuarioNoRegTest.getIdUsuario().equalsIgnoreCase(ususarioNoReg));
	}

}
