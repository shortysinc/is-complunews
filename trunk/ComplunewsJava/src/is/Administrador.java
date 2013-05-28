package is;

import FactoryDao.AdministradorDao;

public class Administrador extends UsuarioReg implements AdministradorDao
{

	public Administrador(String idUsuario) {
		super(idUsuario);
		
	}

	@Override
	public boolean anadirNoticia(Noticia newNoticia) {
		
		return false;
	}

	@Override
	public boolean editarNoticia(Noticia noticiaAEditar) {
		
		return false;
	}

	@Override
	public boolean gestionarComentarios(Noticia noticia) {
		
		return false;
	}

	@Override
	public boolean registrarAdministrador(Administrador newAdmin) {
		
		return false;
	}

}
