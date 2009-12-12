
package Entidades;

public class CostoFinanciero extends Costo
{
    private float depreciacion ;
    private float valorUnidad ;
    private int vidaUtil ;
    private float amortizacion ; // es calculado

    public CostoFinanciero (String nom , float depre , float valUni , int vUtil){
        this.nombre = nom ;
        this.depreciacion = depre ;
        this.valorUnidad = valUni ;
        this.vidaUtil = vUtil ;
    }

    public CostoFinanciero (){
        this.nombre = null ;
        this.depreciacion = 0 ;
        this.valorUnidad = 0 ;
        this.vidaUtil = 0 ;
    }

    public float getAmortizacion (){
        return this.amortizacion ;
    }

    public void CalcularAmortizacion (){
        this.amortizacion = (((this.valorUnidad * this.depreciacion) / this.vidaUtil) / 12) ;
    }

    public void setDepreciacion (float depre){
        this.depreciacion = depre ;
    }

    public float getDepreciacion (){
        return this.depreciacion ;
    }

    public void setValorUnidad (float valUni){
        this.valorUnidad = valUni ;
    }

    public float getValorUnidad (){
        return this.valorUnidad ;
    }

    public void setVidaUtil (int vUtil){
        this.vidaUtil = vUtil ;
    }

    public int getVidaUtil (){
        return this.vidaUtil ;
    }
}
