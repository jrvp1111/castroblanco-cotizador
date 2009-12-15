
package Controladores;

import Entidades.Cliente;
import Entidades.Cotizacion;
import Entidades.Viaje;
import Modelos.Sistema;
import Vistas.CargarViajes;
import Vistas.PrincipalUsuario;
import Vistas.ResumenCotizacion;
import java.sql.Date;
import java.util.Calendar;

public class CargarViajesCONT
{
    private CargarViajes vista;
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
        // 1 -> espera
        // 2 -> rechazada
        // 3 -> aceptada
        this.coti = new Cotizacion (1 , fechaActual , (float)0.25 , this.cli) ;
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

    public String validarAgregarViaje(String paiso, String provo, String ciudado, String direcciono,
            String paisd, String provd, String ciudadd, String direcciond,
            String distancia, java.util.Date salida, java.util.Date llegada) {
        String r = "";
        if (salida.after(llegada))
            r+= "La fecha de salida no puede ser posterior a la fecha de llegada \n";
        if (paiso.isEmpty())
            r+= "Debe ingresar el pais de origen \n";
        if (provo.isEmpty())
            r+= "Debe ingresar la provincia de origen\n";
        if (ciudado.isEmpty())
            r+= "Debe ingresar la ciudad de origen\n";
        if (direcciono.isEmpty())
            r+= "Debe ingresar la direccion de origen\n";
        if (paisd.isEmpty())
            r+= "Debe ingresar el pais de destino\n";
        if (provd.isEmpty())
            r+= "Debe ingresar la provincia de destino\n";
        if (ciudadd.isEmpty())
            r+= "Debe ingresar la ciudad de destino\n";
        if (direcciond.isEmpty())
            r+= "Debe ingresar la direccion de destino\n";
        if (distancia.isEmpty())
            r+= "Debe ingresar un valor para la distancia\n";
        if (!isInteger(distancia))
            r+= "La distancia debe ser un numero entero (medida en km)\n";

        if (r.equals(""))
            return null;
        else
            return r;

    }

    	public boolean isInteger(String i){
		boolean es;
		try {
			Integer.parseInt(i);
			es = true;
		} catch(NumberFormatException e) {
			es = false;
		}
		return es;
	}


}
