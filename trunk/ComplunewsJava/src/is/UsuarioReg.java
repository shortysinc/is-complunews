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
		// TODO Apéndice de método generado automáticamente
		return false;
	}
	@Override
	public boolean cambiarContraseña(String newPass) {
		// TODO Apéndice de método generado automáticamente
		return false;
	}
	@Override
	public boolean añadirComentario(String newComentario) {
		// TODO Apéndice de método generado automáticamente
		return false;
	}
	@Override
	public boolean valorarNoticia(int puntuacion) {
		// TODO Apéndice de método generado automáticamente
		return false;
	}
	@Override
	public boolean añadirNoticiaAFavoritos(Noticia noticia) {
		// TODO Apéndice de método generado automáticamente
		if(this.favoritos.contains(noticia)){
		this.favoritos.add(noticia);
		return true;
		}
		else
		return false;
	}
	@Override
	public boolean cambiarDatos(Datos newDatos) {
		// TODO Apéndice de método generado automáticamente
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
