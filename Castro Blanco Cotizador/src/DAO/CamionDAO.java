
package DAO;

import Entidades.Camion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CamionDAO
{
    public Camion obtenerPorPatente(int patente) {
    Camion c = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
        try {
            String query = "SELECT * FROM Choferes WHERE patente = ?";
            Connection conn = DAOConnectionManager.getDAOConectionManager().getConnection();
            stmt = conn.prepareStatement(query);
            stmt.setInt(1, patente);
            rs = stmt.executeQuery();
            if(rs.next()) {
                    c.setPatente(rs.getString("patente"));
                    c.setMarca(rs.getString("marca"));
                    c.setModelo(rs.getString("modelo"));
                    c.setCantPallets(rs.getInt("cantPallets"));
                    c.setCantCombustible(rs.getFloat("consumoCombustible"));
            }
        }catch(SQLException e) {
            System.out.println(e.getMessage());
        }finally {
            DAOConnectionManager.getDAOConectionManager().closeConnection(rs,stmt);
        }
        return c;
    }


    public void guardar(Camion c) {
    PreparedStatement stmt = null;
        try {
                String queryContacto = "INSERT INTO Camiones VALUES (?,?,?,?,?)";
                Connection conn = DAOConnectionManager.getDAOConectionManager().getConnection();
                stmt = conn.prepareStatement(queryContacto);
                stmt.setString(1, c.getPatente());
                stmt.setString(2, c.getMarca());
                stmt.setString(3, c.getModelo());
                stmt.setInt(4, c.getCantPallets());
                stmt.setFloat(5, c.getCantCombustible());
                stmt.executeUpdate();
        }catch(SQLException e) {
                System.out.println(e.getMessage());
        }finally {
                DAOConnectionManager.getDAOConectionManager().closeConnection(stmt);
        }
    }
}
