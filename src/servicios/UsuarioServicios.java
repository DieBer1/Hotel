/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;
import Modelo.Usuario;
import java.sql.*;
/**
 *
 * @author estudiante
 */
public class UsuarioServicios 
{
    public void guardar (Connection conexion, Usuario usuario) throws SQLException
    {
        try
        {
            PreparedStatement consulta;
            consulta = conexion.prepareStatement("INSERT INTO usuario (id, identificacion, nombre, edad)"
                    + "VALUES(?, ?, ', ?)");
            consulta.setString(1, usuario.getId());
            consulta.setString(2, usuario.getIdentificacion());
            consulta.setString(3, usuario.getNomb());
            consulta.setInt(4, usuario.getEdad());
            consulta.executeUpdate();
        } catch(SQLException ex)
        {
            throw new SQLException(ex);
        }
    }
}
