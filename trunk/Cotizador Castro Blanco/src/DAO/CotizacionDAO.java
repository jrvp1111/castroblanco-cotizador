
package DAO;

import Entidades.Cotizacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CotizacionDAO
{
    public void guardar(Cotizacion c) {
    PreparedStatement stmt = null;
        try {
                String queryContacto = "INSERT INTO Cotizaciones VALUES (?,?,?,?,?,?)";
                Connection conn = DAOConnectionManager.getDAOConectionManager().getConnection();
                stmt = conn.prepareStatement(queryContacto);
                // el numero de cotizacion no lo seteo --> es identity
                stmt.setFloat(1, c.getCostoOperativo()) ;
                stmt.setBoolean(2, c.getEstado()) ;
                stmt.setDate(3, c.getFechaEmision()) ;
                stmt.setFloat(4, c.getPrecioVenta()) ;
                stmt.setString(5, c.getTipoIdCli()) ;
                stmt.setInt(6, c.getNumeroIdCli()) ;
                stmt.executeUpdate();
        }catch(SQLException e) {
                System.out.println(e.getMessage());
        }finally {
                DAOConnectionManager.getDAOConectionManager().closeConnection(stmt);
        }
    }
}
