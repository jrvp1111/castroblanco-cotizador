
package Modelos;

import DAO.CostosDAO;
import Entidades.Costo;
import Entidades.CostoFijo;
import Entidades.CostoVariable;
import java.util.List;
import java.util.Vector;

public class AdminCostos
{
    private CostosDAO costosDAO ;

    public AdminCostos (){
        this.costosDAO = new CostosDAO () ;
    }

    public Vector<Costo> obtenerCostosPorNombre (String nombreCosto , String patente){
        Vector<Costo> encontrados = new Vector<Costo> ();
        
        List<CostoFijo> auxCostosFijos = this.costosDAO.obtenerCostosFijosCamion(patente) ;
        List<CostoVariable> auxCostosVariables = this.costosDAO.obtenerCostosVariablesCamion(patente) ;

        for (int i1 = 0 ; i1 < auxCostosFijos.size() ; i1 ++){
            CostoFijo auxCostoFijo = auxCostosFijos.get(i1) ;
            if (auxCostoFijo.getNombre().compareTo(nombreCosto) == 0){
                encontrados.add(auxCostoFijo);
            }
        }

        for (int i2 = 0 ; i2 < auxCostosVariables.size() ; i2 ++){
            CostoVariable auxCostoVariable = auxCostosVariables.get(i2) ;
            if (auxCostoVariable.getNombre().compareTo(nombreCosto) == 0){
                encontrados.add(auxCostoVariable);
            }
        }

        return encontrados ;
    }
}
