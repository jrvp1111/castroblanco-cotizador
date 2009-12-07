
package DAO;

import Entidades.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO
{
    public Usuario obtenerPorNombreUsuario(String nomUsuario) {
    Usuario u = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
        try {
            String query = "SELECT * FROM Usuarios WHERE nombreUsuario = ?";
            Connection conn = DAOConnectionManager.getDAOConectionManager().getConnection();
            stmt = conn.prepareStatement(query);
            stmt.setString(1, nomUsuario);
            rs = stmt.executeQuery();
            if(rs.next()) {
                    u = new Usuario () ;
                    u.setNombreUsuario(rs.getString("nombreUsuario"));
                    u.setContrasenia(rs.getString("contrasenia"));
            }
        }catch(SQLException e) {
            System.out.println(e.getMessage());
        }finally {
            DAOConnectionManager.getDAOConectionManager().closeConnection(rs,stmt);
        }
        return u;
    }
}
