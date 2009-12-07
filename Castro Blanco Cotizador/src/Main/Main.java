package Main;

import Controladores.LoginUsuarioCONT;
import Modelos.AdminUsuario;
import Vistas.LoginUsuario;

public class Main
{
    public static void main(String[] args)
    {
        LoginUsuario vista = new LoginUsuario () ;
        AdminUsuario modelo = new AdminUsuario () ;
        LoginUsuarioCONT loginCON = new LoginUsuarioCONT(vista, modelo);
    }
}
