/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructora.modelo;
import java.util.*;
import java.sql.*;
import constructora.entidades.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class DaoEmpleado extends Conexion implements crud{
    PreparedStatement ps;
    ResultSet rs;
    int res=0; 
    Empleado e;
    Usuario u;

   @Override
    public ArrayList<Object> mostrar() throws ClassNotFoundException, SQLException {
        ArrayList<Object> ar= new ArrayList<Object>();
        try {
            ps=con().prepareStatement("select * from empleado, usuario "
                    + "where empleado.idUsuario=usuario.idUsuario");
            rs=ps.executeQuery();
            //crear objetos de tipo empleado
            while(rs.next()){
               /* u=new Usuario(rs.getInt(11),rs.getString(12),rs.getString(13),
                        rs.getString(14),rs.getString(15)); */
                e=new Empleado(rs.getInt(1), rs.getString(2),rs.getString(3), 
                        rs.getString(4), rs.getString(5), rs.getString(6),rs.getString(7),
                        rs.getDouble(8),rs.getInt(9));
                //System.out.println(rs.getString(2));
                ar.add(e);
            }
        } catch (Exception ex) {
          //throw new UnsupportedOperationException(ex.getMessage());
        }
        return ar;
    }

    @Override
    public int insertar(Object ob) throws ClassNotFoundException, SQLException {
        try {
            
           /* u=(Usuario)ob;
            ps = super.con().prepareStatement("INSERT INTO usuario(usuario, correo,"
                    + " contraseña, rol) VALUES (?,?,?,?)");
            ps.setString(1, u.getUsuario());
            ps.setString(2, u.getCorreo());
            ps.setString(3, u.getContraseña());
            ps.setString(4, u.getRol());
            res = ps.executeUpdate();*/
            e=(Empleado)ob;
           /* ps=super.con().prepareStatement("insert into empleado(nombre, direccion,"
                    + " telefono, dui, fechaNacimiento, tipoEmpleado, pagoDia, "
                    + "idUsuario, estado) values(?,?,?,?,?,?,?,(select idUsuario from usuario order by idUsuario DESC limit 1),1)");
           */
            ps=super.con().prepareStatement("insert into empleado(nombre, direccion,"
                    + " telefono, dui, fechaNacimiento, tipoEmpleado, pagoDia, "
                    + "idUsuario, estado) values(?,?,?,?,?,?,?,?,1)");
           
            ps.setString(1, e.getNombre());
            ps.setString(2, e.getDireccion());
            ps.setString(3, e.getTelefono());
            ps.setString(4, e.getDui());
            ps.setString(5, e.getFechaNacimiento());
            ps.setString(6, e.getTipoEmpleado());
            ps.setDouble(7, e.getPagoDia());
            ps.setInt(8, e.getIdUsuario());
            res=ps.executeUpdate();
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return res;
    }

    @Override
    public int modificar(Object ob) throws ClassNotFoundException, SQLException {
        try {
            
           /* u=(Usuario)ob;
            ps = super.con().prepareStatement("update usuario set usuario=?, correo=?,"
                    + " contraseña=?, rol=? where idUsuario=?");
            ps.setString(1, u.getUsuario());
            ps.setString(2, u.getCorreo());
            ps.setString(3, u.getContraseña());
            ps.setString(4, u.getRol());
            ps.setInt(5, u.getIdUsuario());
            res = ps.executeUpdate();*/
            e=(Empleado)ob;
            ps=super.con().prepareStatement("update empleado set nombre=?, direccion=?,"
                    + " telefono=?, dui=?,fechaNacimiento=?, tipoEmpleado=?,pagoDia=?, idUsuario=? where idEmpleado=?");
            ps.setString(1, e.getNombre());
            ps.setString(2, e.getDireccion());
            ps.setString(3, e.getTelefono());
            ps.setString(4, e.getDui());
            ps.setString(5, e.getFechaNacimiento());
            ps.setString(6, e.getTipoEmpleado());
            ps.setDouble(7, e.getPagoDia());
            ps.setInt(8, e.getIdUsuario());
            ps.setInt(9, e.getIdEmpleado());
            res=ps.executeUpdate();
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return res;
    }

    @Override
    public int eliminar(Object ob) throws ClassNotFoundException, SQLException {
        try {
            e=(Empleado)ob;
            /*u=(Usuario)ob;
            ps = super.con().prepareStatement("delete from usuario where idUsuario=?");
            ps.setInt(1, u.getIdUsuario());
            res = ps.executeUpdate();*/
            
            ps=super.con().prepareStatement("delete from empleado where idEmpleado=?");
            ps.setInt(1, e.getIdEmpleado());
            res=ps.executeUpdate();
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return res;
    }  
}
