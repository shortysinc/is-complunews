package is;

import FactoryDao.AdministradorDao;

public class Administrador extends UsuarioReg implements AdministradorDao
{

	public Administrador(String idUsuario) {
		super(idUsuario);
		// TODO Ap�ndice de constructor generado autom�ticamente
	}

	@Override
	public boolean a�adirNoticia(Noticia newNoticia) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return false;
	}

	@Override
	public boolean editarNoticia(Noticia noticiaAEditar) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return false;
	}

	@Override
	public boolean gestionarComentarios(Noticia noticia) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return false;
	}

	@Override
	public boolean registrarAdministrador(Administrador newAdmin) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return false;
	}

}
