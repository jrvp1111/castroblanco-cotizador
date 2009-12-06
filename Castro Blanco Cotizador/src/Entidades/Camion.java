
package Entidades;

import java.util.Vector;

public class Camion
{
    private String patente ;
    private String marca ;
    private String modelo ;
    private int cantPallets ;
    private Vector <CostoFijo> costosFijos ;
    private Vector <CostoVariable> costosVariables ;
    private Vector <CostoFinanciero> costosFinancieros ;

    public Camion (String pat , String mar , String mod , int cpall){
        this.patente = pat ;
        this.marca = mar ;
        this.modelo = mod ;
        this.cantPallets = cpall ;
        this.costosFijos = new Vector <CostoFijo> () ;
        this.costosVariables = new Vector <CostoVariable> () ;
        this.costosFinancieros = new Vector <CostoFinanciero> () ;
    }

    public void agregarCostoFijo (CostoFijo c){
        this.costosFijos.add(c);
    }

    public void agregarCostoVaribale (CostoVariable c){
        this.costosVariables.add(c);
    }

    public void agregarCostoFinanciero (CostoFinanciero c){
        this.costosFinancieros.add(c);
    }

    public String getPatente (){
        return this.patente ;
    }

    public String getMarca (){
        return this.marca ;
    }

    public String getModelo (){
        return this.modelo ;
    }

    public int getCantPallets (){
        return this.cantPallets ;
    }
}
