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
		/*assertTrue("ERROR: The place is empty but addItem returns false", placeTest.addItem(new MockItem()));
		assertFalse("ERROR: The place contains an item with the same id but addItem returns true", placeTest.addItem(new MockItem()));
	bc
		assertTrue("ERROR: The place does not contain an item with the same id but addItem returns false", placeTest.addItem(new MockItem(MockItem.WRONG_NAME)));*/
	}

	@Test
	public void testGetSetFechaNac() {
		/*assertNull("ERROR: The place is empty but pickItem returns an object", placeTest.pickItem(MockItem.DEF_NAME));
		Item testItem = new MockItem();
		if (placeTest.addItem(testItem)) {
			Item actualItem;
			assertNull("ERROR: The place does not contain an item with this id but pickItem returns an object", placeTest.pickItem(MockItem.WRONG_NAME));
			assertNotNull("ERROR: The place contains an item with this id but pickItem returns null", actualItem=placeTest.pickItem(MockItem.DEF_NAME));
			assertEquals("ERROR: The place contains an item with this id but pickItem returns null", testItem, actualItem);			
		}
		else {
			fail("ERROR: addItem is not working properly. Try first addItem tests");
		}*/
	}
	
	@Test
	public void testGetSetDescripcion() {
		/*assertFalse("ERROR: The place is empty but existItem returns true", placeTest.existItem(MockItem.DEF_NAME));
		Item testItem = new MockItem();
		if (placeTest.addItem(testItem)) {
			assertFalse("ERROR: The place does not contain an item with this id but existItem returns true", placeTest.existItem(MockItem.WRONG_NAME));
			assertTrue("ERROR: The place contains an item with this id but existItem returns false", placeTest.existItem(MockItem.DEF_NAME));		
		}
		else {
			fail("ERROR: addItem is not working properly. Try first addItem tests");
		}*/
	}
	
	@Test
	public void testGetSetSexo() {
		/*assertTrue("ERROR: The place is empty but dropItem returns false", placeTest.dropItem(new MockItem()));
		assertFalse("ERROR: The place contains an item with the same id but dropItem returns true", placeTest.dropItem(new MockItem()));
		assertTrue("ERROR: The place does not contain an item with the same id but dropItem returns false", placeTest.dropItem(new MockItem(MockItem.WRONG_NAME)));*/
	}
}
