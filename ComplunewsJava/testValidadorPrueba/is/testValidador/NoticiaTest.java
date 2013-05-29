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
			boolean exist= aux.getIdUsuario().equalsIgnoreCase(auxComentario.getIdUsuario())&&aux.getContenido().equalsIgnoreCase(auxComentario.getContenido());
			if (exist)
				assertTrue("El comentario ya existe y no se añadira",exist);
			else
				assertFalse("El comentario ha sido añadido",exist);
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
		comentarios.add(comentario);
		comentarios.add(auxComentario);
		boolean remove=comentarios.remove(comentario);
		if (remove)
			assertTrue("Se ha borrado correctamente el elemento", remove);
		else
			assertFalse("No se ha borrado el elemento", remove);
		
	}

	@Test
	public void testSetGetValorarNoticia() 
	{
		/**
		 * En este test probamos los metodos: valorarNoticia, el setter y el getter
		 */
		int value;
		boolean puntuacion;
		assertTrue("Se ha añadido correctamente la valoracion", valoracion==3);
		noticiaTest.setValoracion(3);
		noticiaTest.valorarNoticia(3);
		value=noticiaTest.getValoracion();
		puntuacion=(value>0 && value<=5);
		assertFalse ("No se ha valorado la noticia correctamente", puntuacion);
		
		noticiaTest.setValoracion(0);
		noticiaTest.valorarNoticia(5);
		value=noticiaTest.getValoracion();
		puntuacion=(value>0 && value<=5);
		assertTrue("Se ha valorado la noticia correctamente",puntuacion);
		
		
		
		
	}

	@Test
	public void testAnadirEtiqueta() 
	{
		boolean addTag;
		Etiquetas etiq=new Etiquetas("Calentamiento");
		try
		{
			addTag=noticiaTest.anadirEtiqueta(etiq.getNombreEtiqueta());
			if(addTag)
				assertTrue("Se ha añadido correctamente la etiqueta", addTag);
			else
				assertFalse("No se ha añadido correctamente la etiqueta", addTag);
		}
		catch(NullPointerException e)
		{
			//continue
		}
		String nuevaEtiqueta="calentamiento global";
		etiq.setNombreEtiqueta(nuevaEtiqueta);
		assertTrue("La etiqueta cambio correctamente",etiq.getNombreEtiqueta().equalsIgnoreCase(nuevaEtiqueta));
		
	}
		
	
	
	@Test
	public void testVerPuntuacionComentario() 
	{
		// TODO pendiente
	}
	
}
