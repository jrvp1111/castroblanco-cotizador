
package DAO;

import Entidades.Cliente;
import Entidades.Cotizacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class CotizacionDAO
{
    public void guardar(Cotizacion c) {
    PreparedStatement stmt = null;
        try {
                String queryContacto = "INSERT INTO Cotizaciones (costoOperativo,estado,fechaEmision,precioVenta,cliTipoId,cliNumeroId) VALUES (?,?,?,?,?,?); SELECT @@IDENTITY;";
                Connection conn = DAOConnectionManager.getDAOConectionManager().getConnection();
                stmt = conn.prepareStatement(queryContacto);
                // el numero de cotizacion no lo seteo --> es identity
                stmt.setFloat(1, c.getCostoOperativo()) ;
                stmt.setInt(2, c.getEstado()) ;
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

    public int obtenerUltimoNroCotizacion () {
    int num = 0 ;
    Statement stmt = null;
    ResultSet rs = null ;
        try {
            String query = "SELECT MAX (nroCotizacion) as 'nroCotizacion' FROM Cotizaciones";
            Connection conn = DAOConnectionManager.getDAOConectionManager().getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);
            if(rs.next()) {
                num = rs.getInt("nroCotizacion") ;
            }
            System.out.println("Numero Buscado: " + num);
        }catch(SQLException e) {
            System.out.println(e.getMessage());
        }finally {
            DAOConnectionManager.getDAOConectionManager().closeConnection(rs,stmt);
        }
        return num ;
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
                    Cotizacion c = new Cotizacion(rs.getInt("estado"), rs.getDate("fechaEmision"), 1 - (float) (rs.getFloat("costoOperativo")/rs.getFloat("precioVenta")), cli);
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
