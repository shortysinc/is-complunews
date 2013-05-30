package FactoryDao;

import is.Usuario;

public class MySqlFactoryDao extends FactoryDao {

	@Override
	public UsuarioDao getUsuarioDao() 
	{
		return new Usuario("");
	}

}
