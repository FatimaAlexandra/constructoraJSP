/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructora.modelo;
import java.util.*;
import java.sql.*;
/**
 *
 * @author Administrador
 */
public interface crud {
    public ArrayList<Object> mostrar()throws ClassNotFoundException,SQLException;
    public int insertar(Object ob)throws ClassNotFoundException,SQLException;
    public int modificar(Object ob)throws ClassNotFoundException,SQLException;
    public int eliminar(Object ob)throws ClassNotFoundException,SQLException;
    
}
