
package DAO;

import Entidades.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClienteDAO
{
    public Cliente obtenerPorTipoNumeroDni(String tipoId , int nroDni) {
    Cliente c = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
        try {
            String query = "SELECT * FROM Clientes WHERE tipoId = ? AND numeroId = ?";
            Connection conn = DAOConnectionManager.getDAOConectionManager().getConnection();
            stmt = conn.prepareStatement(query);
            stmt.setString(1, tipoId);
            stmt.setInt(2, nroDni);
            rs = stmt.executeQuery();
            if(rs.next()) {
                    c = new Cliente () ;
                    c.setTipoId(rs.getString("tipoId"));
                    c.setNumeroId(rs.getInt("numeroId"));
                    c.setNombre(rs.getString("nombre"));
                    c.setApellido(rs.getString("apellido"));
                    c.setEmail(rs.getString("email"));
                    c.setRazonSocial(rs.getString("razonSocial"));
            }
        }catch(SQLException e) {
            System.out.println(e.getMessage());
        }finally {
            DAOConnectionManager.getDAOConectionManager().closeConnection(rs,stmt);
        }
        return c;
    }


    public void guardar(Cliente c) {
    PreparedStatement stmt = null;
        try {
                String queryContacto = "INSERT INTO Clientes VALUES (?,?,?,?,?,?)";
                Connection conn = DAOConnectionManager.getDAOConectionManager().getConnection();
                stmt = conn.prepareStatement(queryContacto);
                stmt.setString(1, c.getTipoId());
                stmt.setInt(2, c.getNumeroId());
                stmt.setString(3, c.getNombre());
                stmt.setString(4, c.getApellido());
                stmt.setString(5, c.getEmail());
                stmt.setString(6, c.getRazonSocial());
                stmt.executeUpdate();
        }catch(SQLException e) {
                System.out.println(e.getMessage());
        }finally {
                DAOConnectionManager.getDAOConectionManager().closeConnection(stmt);
        }
    }
}
