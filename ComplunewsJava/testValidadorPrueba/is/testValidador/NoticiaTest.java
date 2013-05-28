package is.testValidador;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;


import is.*;

public class NoticiaTest {

	private ArrayList<Comentario> comentarios;
	private String titulo;
	private String contenido;
	private int valoracion;
	private ArrayList<Etiquetas> etiquetas;
	private Categorias categorias;
	private Noticia noticiaTest;
	private Comentario comentario;
	private String idUsuario;

	@Before
	public void setUp() throws Exception {
		
		titulo= "Los recortes en la educacion";
		contenido= "blablablabla";
		categorias= Categorias.Economia;
		comentarios= new ArrayList<Comentario>();
		valoracion=3;
		idUsuario="pepe";
		etiquetas= new ArrayList<Etiquetas>();
		comentario= new Comentario(idUsuario, contenido);
		noticiaTest = new Noticia(titulo, contenido, categorias);
		
		
	}

	@Test
	public void testAnadirComentario() 
	{
		//Comentario Auxiliar
		//-------------------------------------------------------------------
		String auxIdUsuario ="oepmdz";
		String auxContenido ="blibliblibli";
		Comentario auxComentario= new Comentario(auxIdUsuario, auxContenido);
		//-------------------------------------------------------------------
		assertTrue("Se ha añadido correctamente el comentario", comentarios.add(comentario));
		contenido="blibliblibli";
		idUsuario="oepmdz";
		Comentario comentario2= new Comentario(idUsuario, contenido);
		assertTrue("Se ha añadido correctamente el comentario", comentarios.add(comentario2));
		
		//---------------------------------------------------------------------------------------
		Iterator<Comentario> it= comentarios.iterator();
		while (it.hasNext())
		{ 
			Comentario aux= it.next();
			boolean bool= aux.getIdUsuario().equalsIgnoreCase(auxComentario.getIdUsuario())&&aux.getContenido().equalsIgnoreCase(auxComentario.getContenido());
			if (bool)
				assertTrue("El comentario ya existe y no se añadira",bool);
			else
				assertFalse("El comentario ha sido añadido",bool);
		}
		//---------------------------------------------------------------------------------------
		
	}

	@Test
	public void testEliminarComentario() {
		//Comentario Auxiliar
		//-------------------------------------------------------------------
		String auxIdUsuario ="oepmdz";
		String auxContenido ="blibliblibli";
		Comentario auxComentario= new Comentario(auxIdUsuario, auxContenido);
		//-------------------------------------------------------------------
		
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
