
package Modelos;

import DAO.CamionDAO;
import Entidades.Camion;
import java.util.List;

public class AdminViaje
{
    private CamionDAO camionDAO ;

    public AdminViaje (){
        this.camionDAO = new CamionDAO () ;
    }

    public List<Camion> obtenerCamiones (){
        return camionDAO.obtenerTodos() ;
    }
}
