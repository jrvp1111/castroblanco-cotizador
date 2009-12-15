
package Controladores;

import Entidades.Camion;
import Entidades.Costo;
import Entidades.CostoFijo;
import Entidades.CostoFinanciero;
import Entidades.CostoVariable;
import Modelos.AdminCostos;
import Vistas.ActualizarCostos;
import java.util.Vector;

public class ActualizarCostosCONT
{
    private ActualizarCostos vista;
    private AdminCostos modelo;

    private Camion cam ;

    public ActualizarCostosCONT(ActualizarCostos v, AdminCostos m) {
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

    public void inicializarVentana (){
        this.vista.inicializarVentana();
    }

    public Vector<Costo> obtenerCostosPorNombreParaCamion (String nombre , String patente){
        return this.modelo.obtenerCostosPorNombre(nombre , patente);
    }

    public void procesarBotonSeleccionarCosto (Costo costo){
        if (costo.getClass().getName().equals("Entidades.CostoFijo")){
            System.out.println("FIJO");
            this.vista.seteoCostosFijos(Boolean.TRUE);
            this.vista.completarDatosFijo((CostoFijo) costo);
            this.vista.setCostoSeleccionado(costo);
            this.vista.seteoCostosVariables(Boolean.FALSE);
            this.vista.seteoCostosFinancieros(Boolean.FALSE);
            this.vista.limpioVentanaVariable();
            this.vista.limpiarVentanaFinanciero();
        }
        if (costo.getClass().getName().equals("Entidades.CostoVariable")){
            System.out.println("VARIBALE");
            this.vista.seteoCostosFijos(Boolean.FALSE);
            this.vista.seteoCostosFinancieros(Boolean.FALSE);
            this.vista.limpioVentanaFijo();
            this.vista.limpiarVentanaFinanciero();
            this.vista.seteoCostosVariables(Boolean.TRUE);
            this.vista.completarDatosVariable((CostoVariable) costo);
            this.vista.setCostoSeleccionado(costo);
        }
        if (costo.getClass().getName().equals("Entidades.CostoFinanciero")){
            System.out.println("FINANCIERO");
            this.vista.seteoCostosFijos(Boolean.FALSE);
            this.vista.limpioVentanaFijo();
            this.vista.seteoCostosVariables(Boolean.FALSE);
            this.vista.limpiarVentanaFinanciero();
            this.vista.seteoCostosFinancieros(Boolean.TRUE);
            this.vista.completarDatosFinanciero((CostoFinanciero) costo);
            this.vista.setCostoSeleccionado(costo);
        }
    }
}
