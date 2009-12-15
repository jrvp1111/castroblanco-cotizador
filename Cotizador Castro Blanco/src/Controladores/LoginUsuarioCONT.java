
package Controladores;

import Entidades.Usuario;
import Modelos.AdminUsuario;
import Modelos.Sistema;
import Vistas.LoginUsuario;
import Vistas.PrincipalUsuario;

public class LoginUsuarioCONT
{
    private LoginUsuario vista;
    //private AdminUsuario modelo;
    private Sistema modelo ;

    public LoginUsuarioCONT(LoginUsuario v, Sistema m) {
        this.vista = v;
        this.modelo = m;
        vista.setControlador(this);
        vista.setModelo(m);
    }

    public void procesarIngresar(String nombreUsuario, String contrasenia) {
        Usuario u = modelo.obtenerPorNombreUsuario(nombreUsuario) ;
        
        if (u == null){
            vista.mostrarMensaje("El usuario ingresado no es valido");
            return ;
        }
        if(u.getContrasenia().equals(contrasenia)) {
            //ABRE LA VENTANA PRINCIPAL DEL USUARIO
            PrincipalUsuario.getInstancia() ;
            // CIERRO LA VENTANA DEL LOGIN
            vista.cerrar () ;
        }
        else{
            vista.mostrarMensaje("La contraseña ingresada es incorrecta");
            return ;
        }
    }
}
