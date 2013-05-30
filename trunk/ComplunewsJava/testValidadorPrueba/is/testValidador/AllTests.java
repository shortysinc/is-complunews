package is.testValidador;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @version 1.0
 * @author  Jorge
 *
 */
@RunWith(Suite.class) 

@Suite.SuiteClasses( { 
						AdministradorTest.class,
						ComentarioTest.class,
						DatosTest.class,
						EtiquetasTest.class,
						NoticiaTest.class,
						UsuarioNoRegTest.class,
						UsuarioRegTest.class,
						UsuarioTest.class,
						
					} ) 


public class AllTests {
    // Add new classes to the SuiteClasses array
}
