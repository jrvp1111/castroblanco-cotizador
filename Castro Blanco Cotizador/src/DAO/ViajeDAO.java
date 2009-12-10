/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import Entidades.Viaje;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Nano
 */
public class ViajeDAO {

    public Viaje guardar(Viaje v, int nroCotizacion) {
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
          String query = "INSERT INTO Viajes " +
              "(nroCotizacion,paisOrigen,provinciaOrigen,ciudadOrigen,direccionOrigen,paisDestino,provinciaDestino," +
              "ciudadDestino,direccionDestino" +
              "fechaSalida,fechaLlegada,distancia,mercaderia,camionViaje,choferViaje) " +
              "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?); SELECT @@IDENTITY";
          Connection conn = DAOConnectionManager.getDAOConectionManager().getConnection();
          stmt = conn.prepareStatement(query);
          stmt.setInt(1, nroCotizacion);
          stmt.setString(2, v.getOrigen().getPais());
          stmt.setString(3, v.getOrigen().getProvincia());
          stmt.setString(4, v.getOrigen().getCiudad());
          stmt.setString(5, v.getOrigen().getDireccion());
          stmt.setString(6, v.getDestino().getPais());
          stmt.setString(7, v.getDestino().getProvincia());
          stmt.setString(8, v.getDestino().getCiudad());
          stmt.setString(9, v.getDestino().getDireccion());
          stmt.setDate(10, v.getFechaSalida());
          stmt.setDate(11, v.getFechaLlegada());
          stmt.setInt(12, v.getDistancia());
          stmt.setString(13, v.getDescripcionMercaderia());
          stmt.setString(14, v.getCamion().getPatente());
          stmt.setInt(15, v.getChofer().getDni());
          rs = stmt.executeQuery();
          if(rs.next()){
            v.setNroViaje(rs.getInt(1));
          }
        }catch(Exception e) {
          System.out.println(e.getMessage());
        }finally {
          DAOConnectionManager.getDAOConectionManager().closeConnection(rs, stmt);
        }
        return v;
    }
}
