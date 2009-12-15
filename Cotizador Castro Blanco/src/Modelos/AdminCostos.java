
package Modelos;

import DAO.CostosDAO;
import Entidades.Costo;
import Entidades.CostoFijo;
import Entidades.CostoFinanciero;
import Entidades.CostoMacro;
import Entidades.CostoVariable;
import Entidades.CostoViaje;
import java.util.List;
import java.util.Vector;

public class AdminCostos
{
    private CostosDAO costosDAO ;

    public AdminCostos (){
        this.costosDAO = new CostosDAO () ;
    }

    public void guardarCostoViaje (CostoViaje cviaje , int nroViaje){
        this.costosDAO.guardarCostoViaje(cviaje, nroViaje);
    }

    public Vector<CostoMacro> obtenerCostosMacroGeneral (){
        return this.costosDAO.obtenerCostosMacroGeneral() ;
    }
    
    public void actualizarCostoFijoCamion (CostoFijo fijo , String patente){
        this.costosDAO.actualizarCostoFijoCamion(fijo, patente);
    }

    public void actualizarCostoVariableCamion (CostoVariable variable , String patente){
        this.costosDAO.actualizarCostoVariableCamion(variable, patente);
    }

    public void actualizarCostoFinancieroCamion (CostoFinanciero financiero , String patente){
        this.costosDAO.actualizarCostoFinancieroCamion(financiero, patente);
    }

    public Vector<Costo> obtenerCostosPorNombre (String nombreCosto , String patente){
        Vector<Costo> encontrados = new Vector<Costo> ();
        List<CostoFijo> auxCostosFijos = this.costosDAO.obtenerCostosFijosCamion(patente) ;
        List<CostoVariable> auxCostosVariables = this.costosDAO.obtenerCostosVariablesCamion(patente) ;
        List<CostoFinanciero> auxCostosFinancieros = this.costosDAO.obtenerCostosFinancierosCamion(patente) ;
        for (int i1 = 0 ; i1 < auxCostosFijos.size() ; i1 ++){
            CostoFijo auxCostoFijo = auxCostosFijos.get(i1) ;
            /*if (auxCostoFijo.getNombre().compareTo(nombreCosto) == 0){
            encontrados.add(auxCostoFijo);
            }*/
            if (auxCostoFijo.getNombre().toUpperCase().indexOf(nombreCosto.toUpperCase()) != -1){
                encontrados.add(auxCostoFijo);
            }
        }
        for (int i2 = 0 ; i2 < auxCostosVariables.size() ; i2 ++){
            CostoVariable auxCostoVariable = auxCostosVariables.get(i2) ;
            /*if (auxCostoVariable.getNombre().compareTo(nombreCosto) == 0){
            encontrados.add(auxCostoVariable);
            }*/
            if (auxCostoVariable.getNombre().toUpperCase().indexOf(nombreCosto.toUpperCase()) != -1){
                encontrados.add(auxCostoVariable);
            }
        }
        for (int i3 = 0 ; i3 < auxCostosFinancieros.size() ; i3 ++){
            CostoFinanciero auxCostoFinanciero = auxCostosFinancieros.get(i3) ;
            /*if (auxCostoFinanciero.getNombre().compareTo(nombreCosto) == 0){
            encontrados.add(auxCostoFinanciero);
            }*/
            if (auxCostoFinanciero.getNombre().toUpperCase().indexOf(nombreCosto.toUpperCase()) != -1){
                encontrados.add(auxCostoFinanciero);
            }
        }
        return encontrados ;
    }
}
