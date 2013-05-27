package FactoryDao;

import is.Datos;
import is.Noticia;

public interface UsuarioRegDao 
{
	boolean puntuarComentario(int puntuacion);
	boolean cambiarContraseña(String newPass);
	boolean añadirComentario(String newComentario);
	boolean valorarNoticia(int puntuacion);
	boolean añadirNoticiaAFavoritos(Noticia noticia);
	boolean cambiarDatos(Datos newDatos);
	

}
