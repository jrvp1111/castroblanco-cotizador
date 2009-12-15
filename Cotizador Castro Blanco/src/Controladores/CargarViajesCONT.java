
package Controladores;

import Entidades.Cliente;
import Entidades.Cotizacion;
import Entidades.Viaje;
import Modelos.AdminCotizacion;
import Modelos.AdminViaje;
import Modelos.Sistema;
import Vistas.CargarViajes;
import Vistas.PrincipalUsuario;
import Vistas.ResumenCotizacion;
import java.sql.Date;
import java.util.Calendar;

public class CargarViajesCONT
{
    private CargarViajes vista;
    //private AdminViaje modelo;
    private Sistema modelo ;

    private Cotizacion coti ;

    private Cliente cli ;

    public CargarViajesCONT (CargarViajes v, Sistema m) {
        this.vista = v;
        this.modelo = m;
        vista.setControlador(this);
        vista.setModelo(m);
    }

    public void inicializarCotizacion (){
        Calendar cal = Calendar.getInstance();
        Date fechaActual = new Date(cal.getTimeInMillis());
        // falta ver de donde sale el margen de ganancia de la cotizacion 
        this.coti = new Cotizacion (false , fechaActual , (float)0.25 , this.cli) ;
    }

    public void guardarCotizacion (Cotizacion c){
        this.modelo.guardarCotizacion(c);
    }

    public void setCliente (Cliente cli){
        this.cli = cli ;
    }

    public void procesarCargarViajeNuevo (Viaje nuevoViaje){
        // agrego el viaje a la cotizacion creado
        this.coti.agregarViaje(nuevoViaje);
        // cargo los "costo viaje" que tenia como temporales
        this.vista.agregarCostosViajeTemporales(nuevoViaje);
        // agrego el viaje al vector temporal de viajes
        this.vista.agregarViajeAVectorTemporal(nuevoViaje);
        // limpio el vector temporal con los costos viaje
        this.vista.limpiarVectorCostoViajeTemporal();
        // muestro en la lista los viajes cotizados
        this.vista.mostrarViajesCargados();
        // muestro el cartel de viaje cargado
        this.vista.mostrarMensaje("El viaje se ha cargado exitosamente !");
        // limpio la ventana
        this.vista.limpiarVentanaCompleta();
    }

    public void InicializarVentana (){
        vista.inicializarDatosVentana();
    }

    public void procesarBotonSiguiente (){
       ResumenCotizacion auxVista = new ResumenCotizacion () ;
       //AdminCotizacion auxModelo = new AdminCotizacion () ;
       Sistema auxModelo = Sistema.getInstancia() ;
       ResumenCotizacionCONT resumencotizacionCONT = new ResumenCotizacionCONT(auxVista, auxModelo);
       this.vista.cerrar();
       // le dejo la refencia de la cotizacion activa
       resumencotizacionCONT.setCotizacion(coti) ;
       // muestra los datos varios del resumen
       resumencotizacionCONT.cargarDatosIniciales() ;
       // cargo la ventana de "cargar viajes" al desktop principal
       PrincipalUsuario.getInstancia().agregarVentanaResumenCotizacion(auxVista);
    }
}
