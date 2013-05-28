package is.testValidador;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import is.*;

public class DatosTest {
	
	private int edad;
	private String nombre;
	private String apellidos;
	private String fechaNac;
	private String descripcion;
	private String sexo;
	private Datos datosTest;
	private String name; 
	@Before
	public void setUp() throws Exception 
	{
		edad=18;
		nombre="James";
		apellidos="Hetfield";
		fechaNac="03/05/1990";
		descripcion="Soy yo";
		sexo="Hombre";
		datosTest= new Datos(edad, nombre, apellidos, fechaNac, descripcion, sexo);
	}

	@Test
	public void testGetSetEdad() 
	{
		int age = datosTest.getEdad();
		assertNotNull("La edad ha sido creada correctamente", age);
		datosTest.setEdad(0);
		assertFalse("La edad no puede ser menor o igual a cero", datosTest.getEdad()<=0 && datosTest.getEdad()>100);
		datosTest.setEdad(200);
		assertFalse("La edad no puede ser menor o igual a cero", (datosTest.getEdad()<=0 && datosTest.getEdad()>100));
		datosTest.setEdad(18);
		boolean aux = (datosTest.getEdad()<=0 && datosTest.getEdad()>100);
		assertTrue("La edad es correcta", !aux);
	}

	@Test
	public void testGetSetNombre() 
	{
		String aux= name= datosTest.getNombre();
		assertNotNull("Se ha creado correctamente el id de usuario"+ name, name);
		datosTest.setNombre(null);
		name=datosTest.getNombre();
		assertNull("Se ha creado un nombre con null", name);
		//Por el contrario si no fuese null, habria un error
		//assertNotNull("Se ha creado un nombre con null", name);
		datosTest.setNombre("Lars");
		name=datosTest.getNombre();
		assertFalse("El nombre ha cambiado correctamente",name.equalsIgnoreCase(aux));
		
	}

	@Test
	public void testGetSetApellidos() 
	{
		
	}

	@Test
	public void testGetSetFechaNac() 
	{
		
	}
	
	@Test
	public void testGetSetDescripcion() {
	
	}
	
	@Test
	public void testGetSetSexo() {
	
	}
}
