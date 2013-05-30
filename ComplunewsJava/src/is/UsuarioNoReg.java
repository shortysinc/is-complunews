package is;

import FactoryDao.UsuarioNoRegDao;

public class UsuarioNoReg  extends Usuario implements UsuarioNoRegDao{
	
	public UsuarioNoReg(String id) {
		super(id);
		// TODO Ap�ndice de constructor generado autom�ticamente
	}

	@Override
	public void registrarse(String idUsuario, String pass, Datos nuevosDatos) {
		super.setPass(pass);
		
	}



}