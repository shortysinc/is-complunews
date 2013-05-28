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
public class AdministradorTest {
	
	Administrador admin;
	
	@Before
	public void setUp() throws Exception 
	{
		 admin = new Administrador("Jorge");
	}

	@Test
	public void testAdministrador() 
	{
		assertNotNull("El nuevo usuario se ha creado correctamente", admin.getIdUsuario());
		
		admin= new Administrador("");
		assertTrue("El id del usuario no se ha creado correctamente", admin.getIdUsuario().equalsIgnoreCase(""));
				
		admin = new Administrador(null);
		assertNull("Ha creado un usuario null", admin.getIdUsuario());
	}

}
