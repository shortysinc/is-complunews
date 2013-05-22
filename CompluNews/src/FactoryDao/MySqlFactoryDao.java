package FactoryDao;

public class MySqlFactoryDao extends FactoryDao {

	@Override
	public UsuarioDao getUsuarioDao() {
		return new UsuarioMySqlFactoryDao();
	}

}
