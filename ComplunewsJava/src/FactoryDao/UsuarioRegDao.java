package FactoryDao;

import is.Datos;
import is.Noticia;

public interface UsuarioRegDao 
{
	boolean puntuarComentario(int puntuacion);
	boolean cambiarContrasena(String newPass);
	boolean anadirComentario(String newComentario);
	boolean valorarNoticia(int puntuacion);
	boolean anadirNoticiaAFavoritos(Noticia noticia);
	boolean cambiarDatos(Datos newDatos);
	

}
