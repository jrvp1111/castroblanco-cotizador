
package DAO;

import Entidades.Viaje;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ViajeDAO
{
    public void guardar(Viaje v , int NroCotizacion) {
    PreparedStatement stmt = null;
        try {
                String queryContacto = "INSERT INTO Viajes (nroCotizacion,paisOrigen,provinciaOrigen,ciudadOrigen,direccionOrigen,paisDestino,provinciaDestino,ciudadDestino,direccionDestino,fechaSalida,fechaLlegada,distancia,mercaderia,camionViaje,choferViaje) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?); SELECT @@IDENTITY;";
                Connection conn = DAOConnectionManager.getDAOConectionManager().getConnection();
                stmt = conn.prepareStatement(queryContacto);
                // el numero de viaje no lo seteo --> es identity
                stmt.setInt(1, NroCotizacion) ;
                stmt.setString(2, v.getOrigen().getPais()) ;
                stmt.setString(3, v.getOrigen().getProvincia()) ;
                stmt.setString(4, v.getOrigen().getCiudad()) ;
                stmt.setString(5, v.getOrigen().getDireccion()) ;
                stmt.setString(6, v.getDestino().getPais()) ;
                stmt.setString(7, v.getDestino().getProvincia()) ;
                stmt.setString(8, v.getDestino().getCiudad()) ;
                stmt.setString(9, v.getDestino().getDireccion()) ;
                stmt.setDate(10, v.getFechaSalida()) ;
                stmt.setDate(11, v.getFechaLlegada()) ;
                stmt.setInt(12, v.getDistancia()) ;
                stmt.setString(13, v.getDescripcionMercaderia()) ;
                stmt.setString(14, v.getCamion().getPatente()) ;
                // como se elige el chofer para el viaje ?
                stmt.setInt(15, 30618628) ;
                stmt.executeUpdate();
        }catch(SQLException e) {
                System.out.println(e.getMessage());
        }finally {
                DAOConnectionManager.getDAOConectionManager().closeConnection(stmt);
        }
    }
}
