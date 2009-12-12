
package Modelos;

import DAO.CamionDAO;
import Entidades.Camion;
import Entidades.Cotizacion;
import java.util.List;

public class AdminViaje
{
    private CamionDAO camionDAO ;

    // se puede hacer esto ?
    private AdminCotizacion adminCotizacion ;
    private AdminCamion adminCamion ;

    public AdminViaje (){
        this.camionDAO = new CamionDAO () ;
        this.adminCotizacion = new AdminCotizacion () ;
        this.adminCamion = new AdminCamion () ;
    }

    public List<Camion> obtenerCamiones (){
        return camionDAO.obtenerTodos() ;
    }
    
    public void guardarCotizacion (Cotizacion c){
        this.adminCotizacion.guardarCotizacion(c);
    }
}
