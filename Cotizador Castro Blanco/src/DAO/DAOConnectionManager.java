
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAOConnectionManager
{
	protected String jdbc = "jdbc:microsoft:sqlserver://";
	protected String servidor = "127.0.0.1:1433";
	protected String usuario = "seminario";
        protected String password = "colo";
        
	private static DAOConnectionManager DAOCM;

	public static DAOConnectionManager getDAOConectionManager()
	{
            if(DAOCM==null) {
                    DAOCM = new DAOConnectionManager();
            }
            return DAOCM;
	}
	
	private Connection connect()
	{
            try {
                Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver").newInstance();
                String dbConnectString = jdbc + servidor;
                Connection connection = DriverManager.getConnection(dbConnectString, usuario, password);
                return connection;
            }
            catch(SQLException e) {
                    System.out.println("Error SQL: " + e.getMessage());
                    return null;
            }
            catch(Exception ex) {
                    System.out.println("Mensaje de error: " + ex.getMessage());
                    return null;
            }
	}
	
	public Connection getConnection()
	{
            return connect();
	}
	
	public void closeConnection(ResultSet rs, PreparedStatement stmt)
	{
            try {
                    rs.close();
                    stmt.close();
                    DAOCM.getConnection().close();
            }
            catch(Exception ex) {
                    System.out.println("Mensaje de error: " + ex.getMessage());
            }
	}
	
	public void closeConnection(ResultSet rs, Statement stmt)
	{
            try {
                    rs.close();
                    stmt.close();
                    DAOCM.getConnection().close();
            }
            catch(Exception ex) {
                    System.out.println("Mensaje de error: " + ex.getMessage());
            }
	}
	
	public void closeConnection(Statement stmt)
	{
            try {
                    stmt.close();
                    DAOCM.getConnection().close();
            }
            catch(Exception ex) {
                    System.out.println("Mensaje de error: " + ex.getMessage());
            }
	}
}
