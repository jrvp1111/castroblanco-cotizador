
package Entidades;

import java.sql.Date;
import java.util.Vector;

public class Cotizacion
{
    private int nroCotizacion ;
    private boolean estado ;
    private Date fechaEmision ;
    private float costoOperativo ;  // es calculado
    private float precioVenta ;     // es calculado
    private float margenCotizacion ;
    private Cliente cliente ;
    private Vector<Viaje> viajes ;

    public Cotizacion (boolean est , Date fechEmi , float margenCotiz , Cliente cli){
        this.estado = est ;
        this.fechaEmision = fechEmi ;
        this.margenCotizacion = margenCotiz ;
        this.cliente = cli ;
        this.viajes = new Vector<Viaje> () ;
    }

    public void agregarViaje (Viaje v){
        this.viajes.add(v);
    }

    public int getNroCotizacion (){
        return this.nroCotizacion ;
    }

    public boolean getEstado (){
        return this.estado ;
    }

    public Date getFechaEmision (){
        return this.fechaEmision ;
    }

    public float getCostoOperativo (){
        return this.costoOperativo ;
    }

    public float getPrecioVenta (){
        return this.precioVenta ;
    }

    public float getMargenCotizacion (){
        return this.margenCotizacion ;
    }

    public Cliente getCliente (){
        return this.cliente ;
    }

    public String getTipoIdCli (){
        return this.cliente.getTipoId() ;
    }

    public int getNumeroIdCli (){
        return this.cliente.getNumeroId();
    }
    
    public Vector<Viaje> getViajes (){
        return this.viajes ;
    }
}
