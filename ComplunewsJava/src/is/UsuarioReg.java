package is;

import java.util.ArrayList;

import FactoryDao.UsuarioRegDao;

public class UsuarioReg extends Usuario implements UsuarioRegDao
{

	private ArrayList<Noticia> favoritos;
	
	
	public UsuarioReg(String idUsuario){
		super(idUsuario);
		this.setFavoritos(new ArrayList<Noticia>());
	}
	public String getIdUsuario()
	{
		return super.getIdUsuario();
	}
	public boolean puntuarComentario(int puntuacion) {
		// TODO Apnndice de mntodo generado automnticamente
		return false;
	}
	@Override
	public boolean cambiarContrasena(String newPass) {
		// TODO Apnndice de mntodo generado automnticamente
		return false;
	}
	@Override
	public boolean anadirComentario(String newComentario) {
		// TODO Apnndice de mntodo generado automnticamente
		return false;
	}
	@Override
	public boolean valorarNoticia(int puntuacion) {
		// TODO Apnndice de mntodo generado automnticamente
		return false;
	}
	@Override
	public boolean anadirNoticiaAFavoritos(Noticia noticia) {
		// TODO Apnndice de mntodo generado automnticamente
		if(this.favoritos.contains(noticia)){
		this.favoritos.add(noticia);
		return true;
		}
		else
		return false;
	}
	@Override
	public boolean cambiarDatos(Datos newDatos) {
		// TODO Apnndice de mntodo generado automnticamente
		return false;
	}
	public ArrayList<Noticia> getFavoritos() {
		return favoritos;
	}
	public void setFavoritos(ArrayList<Noticia> favoritos) {
		this.favoritos = favoritos;
	}
	
	/*Informacion del usuario.*/
}
