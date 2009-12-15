
package Modelos;

import DAO.CamionDAO;
import DAO.ViajeDAO;
import Entidades.Camion;
import Entidades.Ubicacion;
import Entidades.Viaje;
import java.sql.Date;
import java.util.List;

public class AdminViaje
{
    private CamionDAO camionDAO ;
    private ViajeDAO viajeDAO ;

    public AdminViaje (){
        this.camionDAO = new CamionDAO () ;
        this.viajeDAO = new ViajeDAO () ;
    }

    public List<Camion> obtenerCamiones (){
        return camionDAO.obtenerTodos() ;
    }

    public boolean verificarCamionDisponibleParaFechas (String patente , Date fechaSalida){
        return this.viajeDAO.verificarCamionDisponibleParaFechas(patente, fechaSalida) ;
    }

    public Viaje crearViaje(Ubicacion ori , Ubicacion des , Date feSalida , Date feLlegada , int dist , String descMercaderia){
        Viaje v =new Viaje( ori ,  des ,  feSalida ,  feLlegada ,  dist ,  descMercaderia);
        return v;
}

}
