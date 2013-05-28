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
		
		return false;
	}
	@Override
	public boolean cambiarContrasena(String newPass) {
		
		return false;
	}
	@Override
	public boolean anadirComentario(String newComentario) {
		
		return false;
	}
	@Override
	public boolean valorarNoticia(int puntuacion) {
		
		return false;
	}
	@Override
	public boolean anadirNoticiaAFavoritos(Noticia noticia) {
		
		if(this.favoritos.contains(noticia)){
		this.favoritos.add(noticia);
		return true;
		}
		else
		return false;
	}
	@Override
	public boolean cambiarDatos(Datos newDatos) {
		
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
