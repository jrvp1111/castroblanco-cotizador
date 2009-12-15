package Main;

import Controladores.LoginUsuarioCONT;
import Modelos.AdminUsuario;
import Modelos.Sistema;
import Vistas.LoginUsuario;

public class Main
{
    public static void main(String[] args)
    {
        LoginUsuario vista = new LoginUsuario () ;
        //AdminUsuario modelo = new AdminUsuario () ;
        Sistema modelo = Sistema.getInstancia() ;
        LoginUsuarioCONT loginCON = new LoginUsuarioCONT(vista, modelo);
    }
}
