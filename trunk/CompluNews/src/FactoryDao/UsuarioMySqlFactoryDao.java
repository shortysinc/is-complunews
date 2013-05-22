package FactoryDao;

import Connection.ConnectionDaoSingleton;
import is.Usuario;


/*
 * Las operaciones que esta clase hace son dirigidas hacia
 *  una sola fuente de datos (Una Base de Datos en MySQL)
 * */
public class UsuarioMySqlFactoryDao implements UsuarioDao {

	// aqui hago ya los querys
	 private ConnectionDaoSingleton cn;

    public UsuarioMySqlFactoryDao() 
    {
        setCn(ConnectionDaoSingleton.getInstance());
    } 
    
    
	public Usuario buscarUsuario(String nombre) {
		
		return null;
	}

	public void insertarUsuario(Usuario usuario) {
	

	}


	public void modificarUsuario(Usuario usuario) 
	{
		
		
	}


	public ConnectionDaoSingleton getCn() {
		return cn;
	}


	public void setCn(ConnectionDaoSingleton cn) {
		this.cn = cn;
	}

}
