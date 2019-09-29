/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructora.modelo;

import constructora.entidades.*;
import java.sql.*;
import java.util.*;

/**
 *
 * @author jorge Alberto
 */
public class DaoUsuario extends Conexion implements crud{
    PreparedStatement ps;
    ResultSet rs;
    int res=0; 
    Usuario u;
    
    @Override
    public ArrayList<Object> mostrar() throws ClassNotFoundException, SQLException {
        ArrayList<Object> ar= new ArrayList<Object>();
        try {
            ps=con().prepareStatement("select * from usuario");
            rs=ps.executeQuery();
            while(rs.next()){
                u=new Usuario(rs.getInt(1),rs.getString(2),rs.getString(3),
                        rs.getString(4),rs.getString(5)); 
                ar.add(u);
            }
        } catch (Exception ex) {
          //throw new UnsupportedOperationException(ex.getMessage());
        }
        return ar;
    }

    @Override
    public int insertar(Object ob) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
