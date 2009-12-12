
package Entidades;

import java.sql.Date;

public class CostoVariable extends Costo
{
    private int duracion ;
    private int cantidad ;
    private float precioUnitario ;
    private float precioKilometro ; // es calculado
    private Date actualizacion ;

    public CostoVariable (String nom , int dur , int cant , int preUni , Date fecha)
    {
        this.nombre = nom ;
        this.duracion = dur ;
        this.cantidad = cant ;
        this.precioUnitario = preUni ;
        this.actualizacion = fecha ;
    }

    public CostoVariable (){
        this.nombre = null ;
        this.actualizacion = null ;
        this.cantidad = 0 ;
        this.duracion = 0 ;
        this.precioUnitario = 0 ;
        this.precioKilometro = 0 ;
    }

    public void CalcularPrecioKilometro ()
    {
        this.precioKilometro = ((this.precioUnitario * this.cantidad) / this.duracion) ;
    }
    
    public float getPrecioKilometro ()
    {
        return this.precioKilometro ;
    }

    public void setDuracion (int dur)
    {
        this.duracion = dur ;
    }

    public int getDuracion ()
    {
        return this.duracion ;
    }

    public void setCantidad (int cant)
    {
        this.cantidad = cant ;
    }

    public int getCantidad ()
    {
        return this.cantidad ;
    }

    public void setPrecioUnitario (float pre)
    {
        this.precioUnitario = pre ;
    }

    public float getPrecioUnitario ()
    {
        return this.precioUnitario ;
    }

    public void setActualizacion (Date fecha)
    {
        this.actualizacion = fecha ;
    }

    public Date getActualizacion ()
    {
        return this.actualizacion ;
    }
}
