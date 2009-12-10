
package Modelos;

import DAO.CamionDAO;
import Entidades.Camion;
import java.util.List;

public class AdminCamion
{
    private CamionDAO camionDAO ;

    public AdminCamion (){
        this.camionDAO = new CamionDAO () ;
    }
    
    public List<Camion> obtenerTodos (){
        return this.camionDAO.obtenerTodos() ;
    }
}
