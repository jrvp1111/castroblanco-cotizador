
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

    public Viaje (Ubicacion ori , Ubicacion des , Date feSalida , Date feLlegada , int dist , String descMercaderia){
        this.origen = ori ;
        this.destino = des ;
        this.fechaSalida = feSalida ;
        this.fechaLlegada = feLlegada ;
        this.distancia = dist ;
        this.descMercaderia = descMercaderia ;
        this.costosViaje = new Vector <CostoViaje> () ;
    }

    @Override
    public String toString (){
        String X = "" ;
        X = X + "ORIGEN: " + this.origen.toString() + " (" + this.fechaSalida + ")" + "\n"
              + "DESTINO: " + this.destino.toString() + " (" + this.fechaLlegada + ")" + "\n"
              + "DISTANCIA: " + this.distancia + " Km." + "\n"
              + "CAMION: " + this.camion.toString() + "\n"
              + "MERCADERIA: " + this.descMercaderia + "\n"
              + "COSTOS ADICIONALES: " + "\n" ;
        for (int i = 0 ; i < this.costosViaje.size() ; i ++){
            CostoViaje aux = this.costosViaje.get(i) ;
            X = X + aux.toString() + "\n" ;
        }
        return X ;
    }

    public void agregarCostoViaje (CostoViaje c){
        this.costosViaje.add(c);
    }

    public Vector<CostoViaje> getCostosViajes (){
        return this.costosViaje ;
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

    public void setNroViaje (int nV){
        this.nroViaje = nV ;
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
