package FactoryDao;

import is.Datos;
import is.Noticia;

public interface UsuarioRegDao 
{
	boolean puntuarComentario(int puntuacion);
	boolean cambiarContrase�a(String newPass);
	boolean a�adirComentario(String newComentario);
	boolean valorarNoticia(int puntuacion);
	boolean a�adirNoticiaAFavoritos(Noticia noticia);
	boolean cambiarDatos(Datos newDatos);
	

}
