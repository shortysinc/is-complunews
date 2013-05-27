package FactoryDao;

import java.util.ArrayList;

import is.Noticia;

public interface UsuarioDao 
{
	// aqui los metodos que usara el usuario

	/* Usuario buscarUsuario(String nombre);
	 void insertarUsuario(Usuario usuario);
	 void modificarUsuario(Usuario usuario);*/
	 
	 
	  ArrayList<Noticia> buscarNoticiaPorTitulo(String titulo);
	  ArrayList<Noticia> buscarNoticiaPorEtiqueta(String titulo);
	  ArrayList<Noticia> buscarNoticiaPorCategoria(String titulo);
	  void enlazarNoticias();
	  void verPuntuacionComentario(Noticia noticia);
	  void verComentarios(Noticia noticia);
	  
	 
	  
}
