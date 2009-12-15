
package Controladores;

import Entidades.Cliente;
import Modelos.AdminCliente;
import Modelos.AdminViaje;
import Modelos.Sistema;
import Vistas.BuscarCliente;
import Vistas.CargarViajes;
import Vistas.PrincipalUsuario;


public class BuscarClienteCONT
{
    private BuscarCliente vista;
    //private AdminCliente modelo;
    private Sistema modelo ;

    private Cliente cli ;

    public BuscarClienteCONT(BuscarCliente v, Sistema m) {
        this.vista = v;
        this.modelo = m;
        vista.setControlador(this);
        vista.setModelo(m);
    }

    public void procesarBuscarCliente (String tipoId , int numeroId){
        Cliente c = this.modelo.obtenerPorNombreCliente(tipoId, numeroId);
        
        if (c == null){
            vista.mostrarMensaje("NO se ha encontrado ningun cliente !");
            return ;
        }
        else{
            vista.cargarDatosCliente(c);
            // seteo el cliente buscado en la vista
            this.cli = c ;
        }
    }

    public void procesarBotonSiguiente (){
       CargarViajes auxVista = new CargarViajes () ;
       //AdminViaje auxModelo = new AdminViaje () ;
       Sistema auxModelo = Sistema.getInstancia() ;
       CargarViajesCONT cargarviajesCONT = new CargarViajesCONT(auxVista, auxModelo);
       this.vista.cerrar();
       // el controlador se encarga de inicializar la ventana ?
       cargarviajesCONT.InicializarVentana() ;
       // le seteo a la cotizacion, el cliente buscado en esta ventana
       cargarviajesCONT.setCliente(cli);
       // automaticamente genero una cotizacion, y la guardo para que de esta forma, me tire el numero que fue generado
       cargarviajesCONT.inicializarCotizacion() ;
       // cargo la ventana de "cargar viajes" al desktop principal 
       PrincipalUsuario.getInstancia().agregarVentanaCargarViajes(auxVista);
    }
}
