
package Controladores;

import Entidades.Camion;
import Modelos.AdminCamion;
import Modelos.AdminCostos;
import Vistas.ActualizarCostos;
import Vistas.BuscarCamion;
import Vistas.PrincipalUsuario;

public class BuscarCamionCONT
{
    private BuscarCamion vista;
    private AdminCamion modelo;

    private Camion cam ;

    public BuscarCamionCONT(BuscarCamion v, AdminCamion m) {
        this.vista = v;
        this.modelo = m;
        vista.setControlador(this);
        vista.setModelo(m);
    }

    public void setCamion (Camion cam){
        this.cam = cam ;
    }

    public Camion getCamion (){
        return this.cam ;
    }

    public void procesarBotonSiguiente (){
       ActualizarCostos auxVista = new ActualizarCostos () ;
       AdminCostos auxModelo = new AdminCostos () ;
       ActualizarCostosCONT actualizarcostosCONT = new ActualizarCostosCONT(auxVista, auxModelo);
       this.vista.cerrar();
       // le seteo a la cotizacion, el cliente buscado en esta ventana
       actualizarcostosCONT.setCamion(this.cam) ;
       // inicializo la ventana
       actualizarcostosCONT.inicializarVentana();
       // cargo la ventana de "cargar viajes" al desktop principal
       PrincipalUsuario.getInstancia().agregarVentanaActualizarCostos(auxVista);
    }
}
