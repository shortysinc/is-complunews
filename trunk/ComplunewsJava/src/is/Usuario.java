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
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return null;
	}

	@Override
	public ArrayList<Noticia> buscarNoticiaPorEtiqueta(String titulo) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return null;
	}

	@Override
	public ArrayList<Noticia> buscarNoticiaPorCategoria(String titulo) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return null;
	}

	@Override
	public void enlazarNoticias() {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		
	}

	@Override
	public void verPuntuacionComentario(Noticia noticia) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		
	}

	@Override
	public void verComentarios(Noticia noticia) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		
	} 
    

}
