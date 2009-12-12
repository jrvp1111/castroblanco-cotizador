
package DAO;

import Entidades.Chofer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ChoferDAO
{
    public Chofer obtenerPorDni(int nroDni) {
    Chofer c = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
        try {
            String query = "SELECT * FROM Choferes WHERE dni = ?";
            Connection conn = DAOConnectionManager.getDAOConectionManager().getConnection();
            stmt = conn.prepareStatement(query);
            stmt.setInt(1, nroDni);
            rs = stmt.executeQuery();
            if(rs.next()) {
                    c.setDni(rs.getInt("dni"));
                    c.setNombre(rs.getString("nombre"));
                    c.setApellido(rs.getString("apellido"));
                    c.setDireccion(rs.getString("direccion"));
                    c.setTelefono(rs.getInt("telefono"));
                    c.setNextel(rs.getString("nextel"));
            }
        }catch(SQLException e) {
            System.out.println(e.getMessage());
        }finally {			
            DAOConnectionManager.getDAOConectionManager().closeConnection(rs,stmt);
        }
        return c;
    }

    public void guardar(Chofer c) {
    PreparedStatement stmt = null;
        try {
                String queryContacto = "INSERT INTO Choferes VALUES (?,?,?,?,?,?)";
                Connection conn = DAOConnectionManager.getDAOConectionManager().getConnection();
                stmt = conn.prepareStatement(queryContacto);
                stmt.setInt(1, c.getDni());
                stmt.setString(2, c.getNombre());
                stmt.setString(3, c.getApellido());
                stmt.setString(4, c.getDireccion());
                stmt.setInt(5, c.getTelefono());
                stmt.setString(6, c.getNextel());
                stmt.executeUpdate();
        }catch(SQLException e) {
                System.out.println(e.getMessage());
        }finally {
                DAOConnectionManager.getDAOConectionManager().closeConnection(stmt);
        }
    }
}
