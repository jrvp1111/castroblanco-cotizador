
package Entidades;

import java.sql.Date;
import java.util.Vector;

public class Viaje
{
    private int nroViaje ;
    private Ubicacion origen ;
    private Ubicacion destino ;
    private Date fechaSalida ;
    private Date fechaLlegada ;
    private int distancia ;
    private String descMercaderia ;
    private Chofer chofer ;
    private Camion camion ;
    private Vector<CostoViaje> costosViaje ;

    public Viaje (int nroViaje , Ubicacion ori , Ubicacion des , Date feSalida , Date feLlegada , int dist){
        this.nroViaje = nroViaje ;
        this.origen = ori ;
        this.destino = des ;
        this.fechaSalida = feSalida ;
        this.fechaLlegada = feLlegada ;
        this.distancia = dist ;
        this.costosViaje = new Vector <CostoViaje> () ;
    }

    public void agregarCostoViaje (CostoViaje c){
        this.costosViaje.add(c);
    }

    public void setChofer (Chofer chof){
        this.chofer = chof ;
    }

    public void setCamion (Camion cam){
        this.camion = cam ;
    }

    public int getNroViaje (){
        return this.nroViaje ;
    }

    public Ubicacion getOrigen (){
        return this.origen ;
    }

    public Ubicacion getDestino (){
        return this.destino ;
    }

    public Date getFechaSalida (){
        return this.fechaSalida ;
    }

    public Date getFechaLlegada (){
        return this.fechaLlegada ;
    }

    public int getDistancia (){
        return this.distancia ;
    }

    public String getDescripcionMercaderia (){
        return this.descMercaderia ;
    }

    public Chofer getChofer (){
        return this.chofer ;
    }

    public Camion getCamion (){
        return this.camion ;
    }

}
