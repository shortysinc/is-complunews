package is;

import FactoryDao.UsuarioNoRegDao;

public class UsuarioNoReg  extends Usuario implements UsuarioNoRegDao{

	public UsuarioNoReg(String id) 
	{
		super(id);
	}

	@Override
	public void registrarse(String idUsuario, String pass, Datos nuevosDatos) 
	{
		super.setPass(pass);
	}



}