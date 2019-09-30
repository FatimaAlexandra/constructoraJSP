/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructora.modelo;

import constructora.entidades.Empleado;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author jorge Alberto
 */
public class DaoEmpleado extends  Conexion implements crud{
    
    PreparedStatement ps;
    ResultSet rs;
    Empleado e;
    int res = 0;

    @Override
    public ArrayList<Object> mostrar() throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insertar(Object ob) throws ClassNotFoundException, SQLException {
         try {
            e = (Empleado)ob;
            ps = con().prepareStatement("insert into usuario (usuario, correo, contraseña, rol) values (?,?,?,'Empleado')");
            ps.setString(1, e.getUsuario());
            ps.setString(2, e.getCorreo());
            ps.setString(3, e.getContraseña());         
            
            res = ps.executeUpdate();                    
           
            ps = con().prepareStatement("INSERT INTO empleado (nombre, direccion,"
                    + " telefono, dui, fechaNacimiento, tipoEmpleado, pagoDia, idUsuario, estado) "
                    + "VALUES (?,?,?,?,?,?,?,(select idUsuario from usuario order by idUsuario DESC limit 1),1)");
            ps.setString(1, e.getNombre());
            ps.setString(2, e.getDireccion());
            ps.setString(3, e.getTelefono());
            ps.setString(4, e.getDui());
            ps.setString(5, e.getFechaNacimiento());
            ps.setString(6, e.getTipoEmpleado());
            ps.setDouble(7, e.getPagoDia());
            
            res = ps.executeUpdate();
            
                        
        } catch (Exception ex) {            
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
