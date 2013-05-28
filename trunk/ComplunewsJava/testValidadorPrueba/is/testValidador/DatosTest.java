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
	//auxiliar
	private String name,lastName,birthDate,description,sex; 
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
		/*
		 * Por el contrario si no fuese null, habria un error
		 * podemos ponerlo para probar que falla el test	
		 */
		//assertNotNull("Se ha creado un nombre con null", name);
		datosTest.setNombre("Lars");
		name=datosTest.getNombre();
		assertFalse("El nombre ha cambiado correctamente",name.equalsIgnoreCase(aux));
		
	}

	@Test
	public void testGetSetApellidos() 
	{
		String aux=lastName= datosTest.getApellidos();
		assertNotNull("El apellido se ha creado correctamente", lastName);
		
		datosTest.setApellidos(null);
		lastName=datosTest.getApellidos();
		assertNull("Se ha creado un objeto null", lastName);
		
		datosTest.setApellidos("Ulrich");
		lastName= datosTest.getApellidos();
		assertFalse("El apellido ha cambiado correctamente", lastName.equalsIgnoreCase(aux));
		
	}

	@Test
	public void testGetSetFechaNac() 
	{
		String aux=birthDate= datosTest.getFechaNac();
		assertNotNull("El Fecha de nacimiento se ha creado correctamente", birthDate);
		
		datosTest.setFechaNac(null);
		birthDate=datosTest.getFechaNac();
		assertNull("Se ha creado un objeto null", lastName);
		
		datosTest.setFechaNac("23/07/1982");
		birthDate= datosTest.getFechaNac();
		assertFalse("El Fecha de Nacimiento ha cambiado correctamente", birthDate.equalsIgnoreCase(aux));
	}
	
	@Test
	public void testGetSetDescripcion() {
	
		String aux=description= datosTest.getDescripcion();
		assertNotNull("La descripcion se ha creado correctamente", description);
		
		datosTest.setDescripcion(null);
		birthDate=datosTest.getDescripcion();
		assertNull("Se ha creado un objeto null", lastName);
		
		datosTest.setDescripcion("Hola, buenas tardes");
		description= datosTest.getDescripcion();
		assertFalse("El descripcion ha cambiado correctamente", description.equalsIgnoreCase(aux));
	}
	
	@Test
	public void testGetSetSexo() 
	{
		String aux=sex= datosTest.getSexo();
		assertNotNull("La sexo se ha creado correctamente", sex);
		
		datosTest.setSexo(null);
		sex=datosTest.getSexo();
		assertNull("Se ha creado un objeto null", lastName);
		
		datosTest.setSexo("Mujer");
		sex= datosTest.getSexo();
		assertFalse("El Sexo ha cambiado correctamente", sex.equalsIgnoreCase(aux));
	}
}
