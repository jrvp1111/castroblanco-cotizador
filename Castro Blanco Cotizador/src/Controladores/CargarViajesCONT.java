
package Controladores;

import Modelos.AdminViaje;
import Vistas.CargarViajes;

public class CargarViajesCONT
{
    private CargarViajes vista;
    private AdminViaje modelo;

    public CargarViajesCONT (CargarViajes v, AdminViaje m) {
        this.vista = v;
        this.modelo = m;
        vista.setControlador(this);
        vista.setModelo(m);
    }

    public void InicializarVentana (){
        vista.inicializarDatosVentana();
    }
}
