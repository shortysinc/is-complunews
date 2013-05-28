package FactoryDao;

import is.Administrador;
import is.Noticia;

public interface AdministradorDao {
	
	boolean añadirNoticia(Noticia newNoticia);
	boolean editarNoticia(Noticia noticiaAEditar);
	boolean gestionarComentarios(Noticia noticia);
	boolean registrarAdministrador(Administrador newAdmin);
	
}
