package FactoryDao;

import is.Datos;
import is.Noticia;

public interface UsuarioRegDao 
{
	boolean puntuarComentario(int puntuacion);
	boolean cambiarContrasenia(String newPass);
	boolean aniadirComentario(String newComentario);
	boolean valorarNoticia(int puntuacion);
	boolean aniadirNoticiaAFavoritos(Noticia noticia);
	boolean cambiarDatos(Datos newDatos);
	

}
