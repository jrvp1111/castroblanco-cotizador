
package Modelos;

import DAO.CotizacionDAO;
import DAO.ViajeDAO;
import Entidades.CostoFijo;
import Entidades.CostoFinanciero;
import Entidades.CostoVariable;
import Entidades.CostoViaje;
import Entidades.Cotizacion;
import Entidades.Viaje;
import java.util.List;
import java.util.Vector;

public class AdminCotizacion
{
    private CotizacionDAO cotizacionDAO ;
    private ViajeDAO viajeDAO ;

    private AdminCamion adminCamion ;

    public AdminCotizacion (){
        this.cotizacionDAO = new CotizacionDAO () ;
        this.viajeDAO = new ViajeDAO () ;
        this.adminCamion = new AdminCamion () ;
    }

    public void guardarCotizacion (Cotizacion c){
        this.cotizacionDAO.guardar(c);
        int nroCotizacion = this.cotizacionDAO.obtenerUltimoNroCotizacion() ;
        Vector<Viaje> viajesCotizados = c.getViajes() ;
        for (int i = 0 ; i < viajesCotizados.size() ; i ++){
            Viaje aux = viajesCotizados.get(i) ;
            this.viajeDAO.guardar(aux, nroCotizacion);
        }
    }

    public int obtenerNroCotizacion (){
        return this.cotizacionDAO.obtenerUltimoNroCotizacion();
    }

    public float calcularCostosFijos (Cotizacion coti){
        float costoTotal = 0 ;
        Vector<Viaje> auxViajes = coti.getViajes() ;
        for (int i1 = 0 ; i1 < auxViajes.size() ; i1 ++){
            Viaje auxViaje = auxViajes.get(i1);
            long AuxcantDias = (auxViaje.getFechaLlegada().getTime() - auxViaje.getFechaSalida().getTime()) ;
            long cantDias = AuxcantDias / (24*60*60*1000 ) ;
            List<CostoFijo> auxCostosFijos = this.adminCamion.obtenerCostosFijosCamion(auxViaje.getCamion().getPatente()) ;
            for (int i2 = 0 ; i2 < auxCostosFijos.size() ; i2 ++){
                CostoFijo auxCostoFijo = auxCostosFijos.get(i2);
                costoTotal = costoTotal + ((cantDias * auxCostoFijo.getValor()) / 30) ;
            }
        }
        return costoTotal ;
    }

    public float calcularCostosVariables (Cotizacion coti){
        float costoTotal = 0 ;
        Vector<Viaje> auxViajes = coti.getViajes() ;
        for (int i1 = 0 ; i1 < auxViajes.size() ; i1 ++){
            Viaje auxViaje = auxViajes.get(i1);
            List<CostoVariable> auxCostosVariables = this.adminCamion.obtenerCostosVariablesCamion(auxViaje.getCamion().getPatente());
            for (int i2 = 0 ; i2 < auxCostosVariables.size() ; i2 ++){
                CostoVariable auxCostoVariable = auxCostosVariables.get(i2);
                float temporal = (auxCostoVariable.getPrecioUnitario() * auxCostoVariable.getCantidad()) /  auxCostoVariable.getDuracion();
                costoTotal = costoTotal + (temporal * auxViaje.getDistancia());
            }
        }
        return costoTotal ;
    }

    public float calcularCostosFinancieros (Cotizacion coti){
        float costoTotal = 0 ;
        Vector<Viaje> auxViajes = coti.getViajes() ;
        for (int i1 = 0 ; i1 < auxViajes.size() ; i1 ++){
            Viaje auxViaje = auxViajes.get(i1);
            long AuxcantDias = (auxViaje.getFechaLlegada().getTime() - auxViaje.getFechaSalida().getTime()) ;
            long cantDias = AuxcantDias / (24*60*60*1000 ) ;
            List<CostoFinanciero> auxCostosFinancieros = this.adminCamion.obtenerCostosFinancierosCamion(auxViaje.getCamion().getPatente());
            for (int i2 = 0 ; i2 < auxCostosFinancieros.size() ; i2 ++){
                CostoFinanciero auxCostoFinanciero = auxCostosFinancieros.get(i2);
                float temporal = (((auxCostoFinanciero.getValorUnidad() * auxCostoFinanciero.getDepreciacion()) / 100) / auxCostoFinanciero.getVidaUtil()) / 12 ;
                costoTotal = costoTotal + ((cantDias * temporal) / 30) ;
            }
        }
        return costoTotal ;
    }

    public float calcularCostosViaje (Cotizacion coti){
        float costoTotal = 0 ;
        Vector<Viaje> auxViajes = coti.getViajes() ;
        for (int i1 = 0 ; i1 < auxViajes.size() ; i1 ++){
            Viaje auxViaje = auxViajes.get(i1);
            List<CostoViaje> auxCostosViajes = auxViaje.getCostosViajes() ;
            for (int i2 = 0 ; i2 < auxCostosViajes.size() ; i2 ++){
                CostoViaje auxCostoViaje = auxCostosViajes.get(i2);
                costoTotal = costoTotal + auxCostoViaje.getValor() ;
            }
        }
        return costoTotal ;
    }

    public Vector<Cotizacion> obtenerCotizaciones(){
        return this.cotizacionDAO.cargarTodas();
    }
}
