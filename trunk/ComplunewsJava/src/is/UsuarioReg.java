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
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return false;
	}
	@Override
	public boolean cambiarContrase�a(String newPass) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return false;
	}
	@Override
	public boolean a�adirComentario(String newComentario) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return false;
	}
	@Override
	public boolean valorarNoticia(int puntuacion) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return false;
	}
	@Override
	public boolean a�adirNoticiaAFavoritos(Noticia noticia) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		if(this.favoritos.contains(noticia)){
		this.favoritos.add(noticia);
		return true;
		}
		else
		return false;
	}
	@Override
	public boolean cambiarDatos(Datos newDatos) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
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
