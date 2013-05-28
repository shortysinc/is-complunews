package is.testValidador;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import is.*;

public class ComentarioTest {


	
	private String usuario1;
	private String usuario2;
	private String usuario3;
	private String contenido1;
	private String contenido2;
	private String contenido3;
	private Comentario comment;
	
	
	
	
	
	
	
	@Before
	public void setUp() throws Exception {
		/*placeName = "place name";
		placeDescription = "place description";
		placeTest = new Place(placeName, false, placeDescription);   */
		usuario1 = "pepe";
		usuario2 = "oscar";
		usuario3 = "ana";
		contenido1 = "miau";
		contenido2= "guau";
		contenido3= "rolf";
	}

	@Test
	public void testGetIdUsuario() 
	{
		//Usuario 1
		comment = new Comentario("pepe", "miau");
		assertTrue ("usuario y contenido correcto", comment.getIdUsuario()==usuario1 && comment.getContenido()==contenido1);
		
		//Usuario 2 con fallo en contenido
		comment = new Comentario("oscar", "hola");
		assertTrue("Usuario con fallo en contenido", comment.getIdUsuario()==usuario2 && comment.getContenido()==contenido2);
		
		//Usuario 3 con fallo en usuario
		comment = new Comentario("Ane", "rolf");
		assertFalse("Usuario con fallo en usuario", comment.getIdUsuario()==usuario3 && comment.getContenido()==contenido3);
		
		
	}

	@Test
	public void testToString() {
		/*assertTrue("ERROR: the place name does not appear in the string", placeTest.toString().contains(placeName));
		assertTrue("ERROR: the place description does not appear in the string", placeTest.toString().contains(placeDescription));*/
	}

	@Test
	public void testAddItem() {
		/*assertTrue("ERROR: The place is empty but addItem returns false", placeTest.addItem(new MockItem()));
		assertFalse("ERROR: The place contains an item with the same id but addItem returns true", placeTest.addItem(new MockItem()));
		assertTrue("ERROR: The place does not contain an item with the same id but addItem returns false", placeTest.addItem(new MockItem(MockItem.WRONG_NAME)));*/
	}

	@Test
	public void testPickItem() {
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
	public void testExistItem() {
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
	public void testDropItem() {
		/*assertTrue("ERROR: The place is empty but dropItem returns false", placeTest.dropItem(new MockItem()));
		assertFalse("ERROR: The place contains an item with the same id but dropItem returns true", placeTest.dropItem(new MockItem()));
		assertTrue("ERROR: The place does not contain an item with the same id but dropItem returns false", placeTest.dropItem(new MockItem(MockItem.WRONG_NAME)));*/
	}
}
