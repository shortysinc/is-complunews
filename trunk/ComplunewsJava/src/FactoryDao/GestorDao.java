package FactoryDao;

import is.Usuario;

public interface GestorDao {

	 Usuario buscarUsuario(String nombre);
	 void insertarUsuario(Usuario usuario);
	 void modificarUsuario(Usuario usuario);
	
}
