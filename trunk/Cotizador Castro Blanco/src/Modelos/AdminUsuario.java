
package Modelos;

import DAO.UsuarioDAO;
import Entidades.Usuario;

public class AdminUsuario
{
    private UsuarioDAO usuarioDAO ;

    public AdminUsuario (){
        this.usuarioDAO = new UsuarioDAO () ;
    }

    public Usuario obtenerPorNombreUsuario (String nomUsuario){
        Usuario u = this.usuarioDAO.obtenerPorNombreUsuario(nomUsuario);
        return u ;
    }
}
