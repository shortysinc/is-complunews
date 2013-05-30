package is;

import java.util.ArrayList;


import FactoryDao.UsuarioDao;

/*
 * 
 * Esta clase solo contendra metodos sobre el usuario.
 */
public class Usuario implements UsuarioDao
{	
	private String idUsuario;
	private String contrasena;

	//aqui podriamos tener una instacia de la conexion, y desde el modelo llamar a estos metodos. 


	public Usuario(String id) 
	{
		this.setIdUsuario(id);

	}

	public String getPass(){
		return this.contrasena;
	}

	/**
	 * Metodo creado para pruebas.
	 * @param pass
	 */
	public void setPass(String pass){
		this.contrasena = pass;
	}
	@Override
	public ArrayList<Noticia> buscarNoticiaPorTitulo(String titulo) {

		return null;
	}

	@Override
	public ArrayList<Noticia> buscarNoticiaPorEtiqueta(String titulo) {

		return null;
	}

	@Override
	public ArrayList<Noticia> buscarNoticiaPorCategoria(String titulo) {

		return null;
	}

	@Override
	public void enlazarNoticias() {


	}

	@Override
	public void verPuntuacionComentario(Noticia noticia) {


	}

	@Override
	public void verComentarios(Noticia noticia) {


	}


	public String getIdUsuario() {
		return idUsuario;
	}


	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	} 


}
