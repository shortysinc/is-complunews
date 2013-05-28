package is;

import FactoryDao.AdministradorDao;

public class Administrador extends UsuarioReg implements AdministradorDao
{

	public Administrador(String idUsuario) {
		super(idUsuario);
		// TODO Apnndice de constructor generado automnticamente
	}

	@Override
	public boolean anadirNoticia(Noticia newNoticia) {
		// TODO Apnndice de mntodo generado automnticamente
		return false;
	}

	@Override
	public boolean editarNoticia(Noticia noticiaAEditar) {
		// TODO Apnndice de mntodo generado automnticamente
		return false;
	}

	@Override
	public boolean gestionarComentarios(Noticia noticia) {
		// TODO Apnndice de mntodo generado automnticamente
		return false;
	}

	@Override
	public boolean registrarAdministrador(Administrador newAdmin) {
		// TODO Apnndice de mntodo generado automnticamente
		return false;
	}

}
