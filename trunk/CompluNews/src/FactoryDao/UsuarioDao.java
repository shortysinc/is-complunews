package FactoryDao;

import is.Usuario;

public interface UsuarioDao 
{
	// aqui los metodos que usara el usuario

	 Usuario buscarUsuario(String nombre);
	 void insertarUsuario(Usuario usuario);
	 void modificarUsuario(Usuario usuario);
}
