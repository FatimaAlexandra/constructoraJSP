/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructora.modelo;

import constructora.entidades.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Alexis
 */
public class DaoCliente extends Conexion implements crud{
    
    PreparedStatement ps;
    ResultSet rs;
    Cliente c;
    int res = 0;

    @Override
    public ArrayList<Object> mostrar() throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insertar(Object ob) throws ClassNotFoundException, SQLException {
        try {
            c = (Cliente)ob;
            ps = con().prepareStatement("insert into usuario (usuario, correo, contraseña, rol) values (?,?,?,'Cliente')");
            ps.setString(1, c.getUsuario());
            ps.setString(2, c.getCorreo());
            ps.setString(3, c.getContraseña());         
            
            res = ps.executeUpdate();                    
           
            ps = con().prepareStatement("INSERT INTO cliente(nombre, direccion,"
                    + " telefono, dui, fechaNacimiento, idUsuario, estado) "
                    + "VALUES (?,?,?,?,?,(select idUsuario from usuario order by idUsuario DESC limit 1),1)");
            ps.setString(1, c.getNombre());
            ps.setString(2, c.getDireccion());
            ps.setString(3, c.getTelefono());
            ps.setString(4, c.getDui());
            ps.setString(5, c.getFechaNacimiento());
            
            res = ps.executeUpdate();
            
                        
        } catch (Exception e) {            
        }        
        
        return res;
    }

    @Override
    public int modificar(Object ob) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int eliminar(Object ob) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
