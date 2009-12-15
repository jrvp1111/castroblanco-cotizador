
package DAO;

import Entidades.Ubicacion;
import Entidades.Viaje;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.Vector;


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

    public int obtenerUltimoNroViaje () {
    int num = 0 ;
    Statement stmt = null;
    ResultSet rs = null ;
        try {
            String query = "SELECT MAX (nroViaje) as 'nroViaje' FROM Viajes";
            Connection conn = DAOConnectionManager.getDAOConectionManager().getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);
            if(rs.next()) {
                num = rs.getInt("nroViaje") ;
            }
            System.out.println("Numero Buscado: " + num);
        }catch(SQLException e) {
            System.out.println(e.getMessage());
        }finally {
            DAOConnectionManager.getDAOConectionManager().closeConnection(rs,stmt);
        }
        return num ;
    }

    public Vector<Viaje> obtener(int nroCotizacion){
        Statement stmt = null;
        Vector<Viaje> viajes = null;
        Viaje v = null;
        try {
            viajes = new Vector<Viaje>();
            String query = "select * " +
                        "from viajes v " +
                        "where v.nroCotizacion = "+nroCotizacion;
            Connection conn = DAOConnectionManager.getDAOConectionManager().getConnection();
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                Ubicacion origen = new Ubicacion(rs.getString("paisOrigen"), rs.getString("provinciaOrigen"), rs.getString("ciudadOrigen"), rs.getString("direccionOrigen"));//pais, prov, ciudad, direccion
                Ubicacion destino = new Ubicacion(rs.getString("paisDestino"), rs.getString("provinciaDestino"), rs.getString("ciudadDestino"), rs.getString("direccionDestino"));//pais, prov, ciudad, direccion
                v = new Viaje(origen,destino,rs.getDate("fechaSalida"),rs.getDate("fechaLlegada"),rs.getInt("distancia"),rs.getString("mercaderia"));
                viajes.addElement(v);
                System.out.println("viaje numero: " +Integer.toString(v.getNroViaje()));
            }
            System.out.println("Cantidad de viajes cargados: "+ Integer.toString(viajes.size()));
        }catch(SQLException e) {
                System.out.println(e.getMessage());
        }finally {
                DAOConnectionManager.getDAOConectionManager().closeConnection(stmt);
                return viajes;
        }
    }

    public boolean verificarCamionDisponibleParaFechas (String patente , Date fechaSalida) {
    boolean disponible = true ;
    PreparedStatement stmt = null;
    ResultSet rs = null ;
        try {
            String query = "select * from viajes where camionViaje = ? and (? between fechaSalida and fechaLlegada)";
            Connection conn = DAOConnectionManager.getDAOConectionManager().getConnection();
            stmt = conn.prepareStatement(query);
            stmt.setString(1, patente);
            stmt.setDate(2, fechaSalida);
            rs = stmt.executeQuery(query);
            if(rs.next()) {
                disponible = false ;
            }
        }catch(SQLException e) {
            System.out.println(e.getMessage());
        }finally {
            DAOConnectionManager.getDAOConectionManager().closeConnection(rs,stmt);
        }
        return disponible ;
    }
}
