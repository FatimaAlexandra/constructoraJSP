/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructora.modelo;


import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Alexis
 */
public class DaoLogin extends Conexion{
    
    PreparedStatement ps;
    ResultSet rs;
    String rol = "";
    
    public String entrar(String usuario, String contra){
        
        try {
            ps = con().prepareStatement("select rol from usuario where usuario = '"+usuario+"' and contraseña = '"+contra+"' ");
            rs = ps.executeQuery();
            
            while(rs.next()){
                rol = rs.getString(1);
            }
        } catch (Exception e) {
        }
    
        return rol;
    }

}
