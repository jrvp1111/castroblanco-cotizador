
package Modelos;

import DAO.CostosDAO;
import DAO.CotizacionDAO;
import DAO.ViajeDAO;
import Entidades.Camion;
import Entidades.CostoFijo;
import Entidades.CostoFinanciero;
import Entidades.CostoMacro;
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
    private CostosDAO costosDAO ;

    private AdminCamion adminCamion ;

    public AdminCotizacion (){
        this.cotizacionDAO = new CotizacionDAO () ;
        this.viajeDAO = new ViajeDAO () ;
        this.costosDAO = new CostosDAO () ;
        this.adminCamion = new AdminCamion () ;
    }

    public void guardarCotizacion (Cotizacion c){
        this.cotizacionDAO.guardar(c);
        int nroCotizacion = this.cotizacionDAO.obtenerUltimoNroCotizacion() ;
        Vector<Viaje> viajesCotizados = c.getViajes() ;
        for (int i1 = 0 ; i1 < viajesCotizados.size() ; i1 ++){
            Viaje aux = viajesCotizados.get(i1) ;
            this.viajeDAO.guardar(aux, nroCotizacion);
            int nroViaje = this.viajeDAO.obtenerUltimoNroViaje() ;
            Vector<CostoViaje> costosViaje = aux.getCostosViajes() ;
            for (int i2 = 0 ; i2 < costosViaje.size() ; i2 ++){
                CostoViaje auxCostoViaje = costosViaje.get(i2) ;
                this.costosDAO.guardarCostoViaje(auxCostoViaje, nroViaje);
            }
        }
    }

    public int obtenerNroCotizacion (){
        return this.cotizacionDAO.obtenerUltimoNroCotizacion();
    }

    public int obtenerNroViaje (){
        return this.viajeDAO.obtenerUltimoNroViaje() ;
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

    public float calcularCostosMacro (Cotizacion coti){
        float costoTotal = 0 ;
        Vector<Viaje> auxViajes = coti.getViajes() ;
        Vector<CostoMacro> costosMacro = Sistema.getInstancia().obtenerCostosMacroGeneral() ;
        CostoMacro auxCostoMacro = costosMacro.get(0) ; // ACA ESTA LA TRAMPA ! , POR AHORA HAY SOLO UNO (GASOIL) , SI HAY MAS , TENEMOS PROBLEMAS !
        for (int i1 = 0 ; i1 < auxViajes.size() ; i1 ++){
            Viaje auxViaje = auxViajes.get(i1);
            float consumoCamion = auxViaje.getCamion().getCantCombustible() ;
            float auxCantLitros = (auxViaje.getDistancia() * consumoCamion) ; // saco la cantidad de litros para recorrer toda esa distancia
            costoTotal = costoTotal + (auxCantLitros * auxCostoMacro.getValor()) ; // multiplico la cantidad de litros que necesita, por el precio de un litro de combustible
        }
        return costoTotal ;
    }

    public Vector<Cotizacion> obtenerCotizaciones(){
        Vector<Cotizacion> cargadas = this.cotizacionDAO.cargarTodas();
        Vector<Viaje>vs = null;
        for (int i=0; i<cargadas.size(); i++){
            Cotizacion c = cargadas.elementAt(i);
            vs = viajeDAO.obtener(c.getNroCotizacion());
            System.out.println("en obtener cotizaciones el tamanio es "+Integer.toString(vs.size()));
            cargadas.elementAt(i).setViajes(vs);
            //cargadas.elementAt(i).setViajes(viajeDAO.obtener(cargadas.elementAt(i).getNroCotizacion()));
        }
        return cargadas;
    }
}
