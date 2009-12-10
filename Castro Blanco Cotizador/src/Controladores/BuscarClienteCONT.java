
package Controladores;

import Entidades.Cliente;
import Modelos.AdminCliente;
import Modelos.AdminViaje;
import Vistas.BuscarCliente;
import Vistas.CargarViajes;
import Vistas.PrincipalUsuario;


public class BuscarClienteCONT
{
    private BuscarCliente vista;
    private AdminCliente modelo;

    public BuscarClienteCONT(BuscarCliente v, AdminCliente m) {
        this.vista = v;
        this.modelo = m;
        vista.setControlador(this);
        vista.setModelo(m);
    }

    public void procesarBuscarCliente (String tipoId , int numeroId){
        Cliente c = this.modelo.obtenerPorNombreUsuario(tipoId, numeroId);
        
        if (c == null){
            vista.mostrarMensaje("NO se ha encontrado ningun cliente !");
            return ;
        }
        else{
            vista.cargarDatosCliente(c);
        }
    }

    public void procesarBotonSiguiente (){
       CargarViajes auxVista = new CargarViajes () ;
       AdminViaje auxModelo = new AdminViaje () ;
       CargarViajesCONT cargarviajesCONT = new CargarViajesCONT(auxVista, auxModelo);
       this.vista.cerrar();
       // el controlador se encarga de inicializar la ventana ?
       cargarviajesCONT.InicializarVentana() ;
       PrincipalUsuario.getInstancia().agregarVentanCargarViajes(auxVista);
    }
}
