package is.testValidador;
// Terminado
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import is.*;

public class EtiquetasTest {

	private String nombreEtiqueta, mark;
	private Etiquetas etiquetasTest;
	

	@Before
	public void setUp() throws Exception 
	{
		nombreEtiqueta="deportes";
		etiquetasTest = new Etiquetas(nombreEtiqueta);
	}

	@Test
	public void testGetSetNombreEtiqueta() 
	{
		String aux=mark= etiquetasTest.getNombreEtiqueta();
		assertNotNull("El Fecha de nacimiento se ha creado correctamente", mark);
		
		etiquetasTest.setNombreEtiqueta(null);
		mark=etiquetasTest.getNombreEtiqueta();
		assertNull("Se ha creado un objeto null", mark);
		
		etiquetasTest.setNombreEtiqueta("23/07/1982");
		mark= etiquetasTest.getNombreEtiqueta();
		assertFalse("El Fecha de Nacimiento ha cambiado correctamente", mark.equalsIgnoreCase(aux));
	}

}
