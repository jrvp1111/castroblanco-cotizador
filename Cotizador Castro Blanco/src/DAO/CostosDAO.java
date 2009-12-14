
package DAO;

import Entidades.CostoFijo;
import Entidades.CostoFinanciero;
import Entidades.CostoVariable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class CostosDAO
{
    public List<CostoFijo> obtenerCostosFijosCamion (String patente) {
    List<CostoFijo> costosFijos = new ArrayList<CostoFijo> () ;
    PreparedStatement stmt = null;
    ResultSet rs = null;
        try {
            String query = "SELECT * FROM CostosFijos WHERE Patente = ?";
            Connection conn = DAOConnectionManager.getDAOConectionManager().getConnection();
            stmt = conn.prepareStatement(query);
            stmt.setString(1, patente);
            rs = stmt.executeQuery();
            while(rs.next()) {
                    CostoFijo cf = new CostoFijo () ;
                    cf.setNombre(rs.getString("nombre"));
                    cf.setValor(rs.getFloat("valor"));
                    cf.setActualizacion(rs.getDate("actualizacion"));
                    costosFijos.add(cf);
            }
        }catch(SQLException e) {
            System.out.println(e.getMessage());
        }finally {
            DAOConnectionManager.getDAOConectionManager().closeConnection(rs,stmt);
        }
        return costosFijos;
    }

    public List<CostoVariable> obtenerCostosVariablesCamion (String patente) {
    List<CostoVariable> costosVariables = new ArrayList<CostoVariable> () ;
    PreparedStatement stmt = null;
    ResultSet rs = null;
        try {
            String query = "SELECT * FROM CostosVariables WHERE Patente = ?";
            Connection conn = DAOConnectionManager.getDAOConectionManager().getConnection();
            stmt = conn.prepareStatement(query);
            stmt.setString(1, patente);
            rs = stmt.executeQuery();
            while(rs.next()) {
                    CostoVariable cv = new CostoVariable () ;
                    cv.setNombre(rs.getString("nombre"));
                    cv.setCantidad(rs.getInt("cantidad"));
                    cv.setDuracion(rs.getInt("duracion"));
                    cv.setPrecioUnitario(rs.getFloat("precio"));
                    cv.setActualizacion(rs.getDate("actualizacion"));
                    costosVariables.add(cv);
            }
        }catch(SQLException e) {
            System.out.println(e.getMessage());
        }finally {
            DAOConnectionManager.getDAOConectionManager().closeConnection(rs,stmt);
        }
        return costosVariables;
    }

    public List<CostoFinanciero> obtenerCostosFinancierosCamion (String patente) {
    List<CostoFinanciero> costosFinancieros = new ArrayList<CostoFinanciero> () ;
    PreparedStatement stmt = null;
    ResultSet rs = null;
        try {
            String query = "SELECT * FROM CostosFinancieros WHERE Patente = ?";
            Connection conn = DAOConnectionManager.getDAOConectionManager().getConnection();
            stmt = conn.prepareStatement(query);
            stmt.setString(1, patente);
            rs = stmt.executeQuery();
            while(rs.next()) {
                    CostoFinanciero cf = new CostoFinanciero () ;
                    cf.setNombre(rs.getString("nombre"));
                    cf.setDepreciacion(rs.getFloat("depreciacion"));
                    cf.setValorUnidad(rs.getInt("valorUnidad"));
                    cf.setVidaUtil(rs.getInt("vidaUtil"));
                    costosFinancieros.add(cf);
            }
        }catch(SQLException e) {
            System.out.println(e.getMessage());
        }finally {
            DAOConnectionManager.getDAOConectionManager().closeConnection(rs,stmt);
        }
        return costosFinancieros;
    }

    public Vector<CostoFijo> obtenerTodosCostosFijos () {
    Vector<CostoFijo> costosFijos = new Vector<CostoFijo> () ;
    PreparedStatement stmt = null;
    ResultSet rs = null;
        try {
            String query = "SELECT * FROM CostosFijos";
            Connection conn = DAOConnectionManager.getDAOConectionManager().getConnection();
            stmt = conn.prepareStatement(query);
            rs = stmt.executeQuery();
            while(rs.next()) {
                    CostoFijo cf = new CostoFijo () ;
                    cf.setNombre(rs.getString("nombre"));
                    cf.setValor(rs.getFloat("valor"));
                    cf.setActualizacion(rs.getDate("actualizacion"));
                    costosFijos.add(cf);
            }
        }catch(SQLException e) {
            System.out.println(e.getMessage());
        }finally {
            DAOConnectionManager.getDAOConectionManager().closeConnection(rs,stmt);
        }
        return costosFijos;
    }

    public Vector<CostoVariable> obtenerTodosCostosVariables () {
    Vector<CostoVariable> costosVariables = new Vector<CostoVariable> () ;
    PreparedStatement stmt = null;
    ResultSet rs = null;
        try {
            String query = "SELECT * FROM CostosVariables";
            Connection conn = DAOConnectionManager.getDAOConectionManager().getConnection();
            stmt = conn.prepareStatement(query);
            rs = stmt.executeQuery();
            while(rs.next()) {
                    CostoVariable cv = new CostoVariable () ;
                    cv.setNombre(rs.getString("nombre"));
                    cv.setCantidad(rs.getInt("cantidad"));
                    cv.setDuracion(rs.getInt("duracion"));
                    cv.setPrecioUnitario(rs.getFloat("precio"));
                    cv.setActualizacion(rs.getDate("actualizacion"));
                    costosVariables.add(cv);
            }
        }catch(SQLException e) {
            System.out.println(e.getMessage());
        }finally {
            DAOConnectionManager.getDAOConectionManager().closeConnection(rs,stmt);
        }
        return costosVariables;
    }
}
