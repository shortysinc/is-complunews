package is;

import FactoryDao.AdministradorDao;

public class Administrador extends UsuarioReg implements AdministradorDao
{

	public Administrador(String idUsuario) {
		super(idUsuario);
		// TODO Apéndice de constructor generado automáticamente
	}

	@Override
	public boolean añadirNoticia(Noticia newNoticia) {
		// TODO Apéndice de método generado automáticamente
		return false;
	}

	@Override
	public boolean editarNoticia(Noticia noticiaAEditar) {
		// TODO Apéndice de método generado automáticamente
		return false;
	}

	@Override
	public boolean gestionarComentarios(Noticia noticia) {
		// TODO Apéndice de método generado automáticamente
		return false;
	}

	@Override
	public boolean registrarAdministrador(Administrador newAdmin) {
		// TODO Apéndice de método generado automáticamente
		return false;
	}

}
