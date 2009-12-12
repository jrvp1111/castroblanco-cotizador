
package Entidades;

import java.sql.Date;

public class CostoFijo extends Costo
{
    private float valor ;
    private Date actualizacion ; // Date tipo sql , NO java

    public CostoFijo (String nom , float val , Date fecha){
        this.nombre = nom ;
        this.valor = val ;
        this.actualizacion = fecha ;
    }

    public CostoFijo (){
        this.nombre = null ;
        this.valor = 0 ;
        this.actualizacion = null ;
    }

    public void setValor (float val){
        this.valor = val ;
    }

    public float getValor (){
        return this.valor ;
    }

    public void setActualizacion (Date fecha){
        this.actualizacion = fecha ;
    }

    public Date getActualizacion (){
        return this.actualizacion ;
    }
}
