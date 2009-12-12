
package Entidades;

import java.util.Vector;

public class Camion
{
    private String patente ;
    private String marca ;
    private String modelo ;
    private int cantPallets ;
    private float cantCombustible ;
    private Vector <CostoFijo> costosFijos ;
    private Vector <CostoVariable> costosVariables ;
    private Vector <CostoFinanciero> costosFinancieros ;

    public Camion (String pat , String mar , String mod , int cpall , float cantCombus){
        this.patente = pat ;
        this.marca = mar ;
        this.modelo = mod ;
        this.cantPallets = cpall ;
        this.cantCombustible = cantCombus ;
        this.costosFijos = new Vector <CostoFijo> () ;
        this.costosVariables = new Vector <CostoVariable> () ;
        this.costosFinancieros = new Vector <CostoFinanciero> () ;
    }

    public Camion (){
        this.patente = null ;
        this.marca = null ;
        this.modelo = null ;
        this.cantPallets = 0 ;
        this.cantCombustible = 0 ;
        this.costosFijos = new Vector <CostoFijo> () ;
        this.costosVariables = new Vector <CostoVariable> () ;
        this.costosFinancieros = new Vector <CostoFinanciero> () ;
    }

    @Override
    public String toString (){
        return this.marca + " - " + this.modelo ;
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

    public void setPatente (String pat){
        this.patente = pat ;
    }

    public String getMarca (){
        return this.marca ;
    }

    public void setMarca (String mar){
        this.marca = mar ;
    }

    public String getModelo (){
        return this.modelo ;
    }

    public void setModelo (String mod){
        this.modelo = mod ;
    }

    public int getCantPallets (){
        return this.cantPallets ;
    }

    public void setCantPallets (int cant){
        this.cantPallets = cant ;
    }

    public float getCantCombustible (){
        return this.cantCombustible ;
    }

    public void setCantCombustible (float cantCombus){
        this.cantCombustible = cantCombus ;
    }
}
