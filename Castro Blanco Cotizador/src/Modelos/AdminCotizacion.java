
package Modelos;

import DAO.CotizacionDAO;
import Entidades.CostoFijo;
import Entidades.Cotizacion;
import Entidades.Viaje;
import java.util.List;
import java.util.Vector;

public class AdminCotizacion
{
    private CotizacionDAO cotizacionDAO ;

    private AdminCamion adminCamion ;

    public AdminCotizacion (){
        this.cotizacionDAO = new CotizacionDAO () ;
        this.adminCamion = new AdminCamion () ;
    }

    public void guardarCotizacion (Cotizacion c){
        this.cotizacionDAO.guardar(c);
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
        return 0 ;
    }

    public float calcularCostoOperativo (Cotizacion coti){
        return 0 ;
    }
}
