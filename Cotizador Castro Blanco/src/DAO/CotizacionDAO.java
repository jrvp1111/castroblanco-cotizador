
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


    public Vector<Cotizacion> cargarTodas() {
        Statement stmt = null;
         Vector<Cotizacion> cot = null;
        try {

               cot = new Vector<Cotizacion>();
                String query = "select * " +
                        "from cotizaciones co " +
                        "inner join clientes cl " +
                        "on (co.cliTipoId = cl.tipoId and co.cliNumeroId = cl.numeroId);";

                Connection conn = DAOConnectionManager.getDAOConectionManager().getConnection();
                stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query);

                while(rs.next()){//TODO - VER LO DE RAZON SOCIAL O NOMBRE O AMBAS
                    Cliente cli = new Cliente(rs.getString("tipoId"), rs.getInt("numeroId"), rs.getString("nombre"), rs.getString("apellido"), "RAZON SOCIAL", rs.getString("email"));
                    Cotizacion c = new Cotizacion(rs.getBoolean("estado"), rs.getDate("fechaEmision"), 1 - (float) (rs.getFloat("costoOperativo")/rs.getFloat("precioVenta")), cli);
                    c.setCostoOperativo(rs.getFloat("costoOperativo"));
                    c.setNroCotizacion(rs.getInt("nroCotizacion"));
                    c.setPrecioVenta(rs.getFloat("precioVenta"));
                    cot.addElement(c);
                }

                return cot;
        }catch(SQLException e) {
                System.out.println(e.getMessage());
        }finally {
                DAOConnectionManager.getDAOConectionManager().closeConnection(stmt);
                return cot;
        }
    }

}
