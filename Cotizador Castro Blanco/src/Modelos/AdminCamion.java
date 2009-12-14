
package Modelos;

import DAO.CamionDAO;
import DAO.CostosDAO;
import DAO.ViajeDAO;
import Entidades.Camion;
import Entidades.CostoFijo;
import Entidades.CostoFinanciero;
import Entidades.CostoVariable;
import java.util.List;

public class AdminCamion
{
    private CamionDAO camionDAO ;
    private CostosDAO costosDAO ;

    public AdminCamion (){
        this.camionDAO = new CamionDAO () ;
        this.costosDAO = new CostosDAO () ;
    }
    
    public List<Camion> obtenerTodos (){
        return this.camionDAO.obtenerTodos() ;
    }

    public List<CostoFijo> obtenerCostosFijosCamion (String patente){
        return this.costosDAO.obtenerCostosFijosCamion(patente) ;
    }

    public List<CostoVariable> obtenerCostosVariablesCamion (String patente){
        return this.costosDAO.obtenerCostosVariablesCamion(patente) ;
    }

    public List<CostoFinanciero> obtenerCostosFinancierosCamion (String patente){
        return this.costosDAO.obtenerCostosFinancierosCamion(patente);
    }
}
