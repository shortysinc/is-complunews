package is;

import java.util.ArrayList;

import FactoryDao.UsuarioDao;

/*
 * 
 * Esta clase solo contendra metodos sobre el usuario.
 */
public class Usuario implements UsuarioDao
{
/*private ConnectionDaoSingleton cn;

    public Usuario() 
    {
        cn = ConnectionDaoSingleton.getInstance();
        
    }
*/
	@Override
	public ArrayList<Noticia> buscarNoticiaPorTitulo(String titulo) {
		// TODO Apéndice de método generado automáticamente
		return null;
	}

	@Override
	public ArrayList<Noticia> buscarNoticiaPorEtiqueta(String titulo) {
		// TODO Apéndice de método generado automáticamente
		return null;
	}

	@Override
	public ArrayList<Noticia> buscarNoticiaPorCategoria(String titulo) {
		// TODO Apéndice de método generado automáticamente
		return null;
	}

	@Override
	public void enlazarNoticias() {
		// TODO Apéndice de método generado automáticamente
		
	}

	@Override
	public void verPuntuacionComentario(Noticia noticia) {
		// TODO Apéndice de método generado automáticamente
		
	}

	@Override
	public void verComentarios(Noticia noticia) {
		// TODO Apéndice de método generado automáticamente
		
	} 
    

}
