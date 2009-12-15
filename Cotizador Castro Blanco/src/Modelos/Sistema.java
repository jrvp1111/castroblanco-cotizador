
package Modelos;

import Entidades.Camion;
import Entidades.Cliente;
import Entidades.Costo;
import Entidades.CostoFijo;
import Entidades.CostoFinanciero;
import Entidades.CostoMacro;
import Entidades.CostoVariable;
import Entidades.CostoViaje;
import Entidades.Cotizacion;
import Entidades.Usuario;
import java.util.List;
import java.util.Vector;

public class Sistema
{
    private static Sistema S = null ;

    private static AdminCamion adminCamion ;
    private static AdminCliente adminCliente ;
    private static AdminCostos adminCostos ;
    private static AdminCotizacion adminCotizacion ;
    private static AdminUsuario adminUsuario ;
    private static AdminViaje adminViaje ;

    public static Sistema getInstancia(){
        if(S == null){
            S = new Sistema();
            adminCamion = new AdminCamion () ;
            adminCliente = new AdminCliente () ;
            adminCostos = new AdminCostos () ;
            adminCotizacion = new AdminCotizacion () ;
            adminUsuario = new AdminUsuario () ;
            adminViaje = new AdminViaje () ;
        }
        return S;
    }

    /* --- ADMIN USUARIO --- */

    public Usuario obtenerPorNombreUsuario (String nomUsuario){
        Usuario u = Sistema.adminUsuario.obtenerPorNombreUsuario(nomUsuario) ;
        return u;
    }

    /* --- ADMIN CAMION --- */
    
    public List<Camion> obtenerTodos (){
        return Sistema.adminCamion.obtenerTodos() ;
    }

    public List<CostoFijo> obtenerCostosFijosCamion (String patente){
        return Sistema.adminCamion.obtenerCostosFijosCamion(patente) ;
    }

    public List<CostoVariable> obtenerCostosVariablesCamion (String patente){
        return Sistema.adminCamion.obtenerCostosVariablesCamion(patente) ;
    }

    public List<CostoFinanciero> obtenerCostosFinancierosCamion (String patente){
        return Sistema.adminCamion.obtenerCostosFinancierosCamion(patente);
    }

    /* --- ADMIN VIAJE --- */

    public List<Camion> obtenerCamiones (){
        return Sistema.adminViaje.obtenerCamiones() ;
    }

    /* --- ADMIN COTIZACION --- */

    public void guardarCotizacion (Cotizacion c){
        Sistema.adminCotizacion.guardarCotizacion(c);
    }

    public int obtenerNroCotizacion (){
        return Sistema.adminCotizacion.obtenerNroCotizacion() ;
    }

    public float calcularCostosFijos (Cotizacion coti){
        return Sistema.adminCotizacion.calcularCostosFijos(coti) ;
    }

    public float calcularCostosVariables (Cotizacion coti){
        return Sistema.adminCotizacion.calcularCostosVariables(coti) ;
    }

    public float calcularCostosFinancieros (Cotizacion coti){
        return Sistema.adminCotizacion.calcularCostosFinancieros(coti) ;
    }

    public float calcularCostosViaje (Cotizacion coti){
        return Sistema.adminCotizacion.calcularCostosViaje(coti) ;
    }

    public Vector<Cotizacion> obtenerCotizaciones(){
        return Sistema.adminCotizacion.obtenerCotizaciones() ;
    }

    /* --- ADMIN COSTOS --- */

    public void guardarCostoViaje (CostoViaje cviaje , int nroViaje){
        Sistema.adminCostos.guardarCostoViaje(cviaje, nroViaje);
    }

    public Vector<CostoMacro> obtenerCostosMacroGeneral (){
        return Sistema.adminCostos.obtenerCostosMacroGeneral() ;
    }

    public float calcularCostosMacro (Cotizacion coti){
        return Sistema.adminCotizacion.calcularCostosMacro(coti) ;
    }

    public void actualizarCostoFijoCamion (CostoFijo fijo , String patente){
        Sistema.adminCostos.actualizarCostoFijoCamion(fijo, patente);
    }

    public void actualizarCostoVariableCamion (CostoVariable variable , String patente){
        Sistema.adminCostos.actualizarCostoVariableCamion(variable, patente);
    }

    public void actualizarCostoFinancieroCamion (CostoFinanciero financiero , String patente){
        Sistema.adminCostos.actualizarCostoFinancieroCamion(financiero, patente);
    }

    public Vector<Costo> obtenerCostosPorNombre (String nombreCosto , String patente){
        return Sistema.adminCostos.obtenerCostosPorNombre(nombreCosto, patente) ;
    }

    /* --- ADMIN CLIENTE --- */
    
    public Cliente obtenerPorNombreCliente (String tipoId , int numeroId){
        return Sistema.adminCliente.obtenerPorNombreCliente(tipoId, numeroId) ;
    }
}
