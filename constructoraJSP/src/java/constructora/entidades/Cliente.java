/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructora.entidades;

/**
 *
 * @author Alexis
 */
public class Cliente {
    
    private int idCliente;
    private String usuario;
    private String correo;
    private String nombre;
    private String telefono;
    private String dui;
    private String fechaNacimiento;
    private String direccion;
    private String contraseña;
    private String rol;
    
    //constructor vacio
    public Cliente() {
    }
    
    //constructor para agregar
    public Cliente(String usuario, String correo, String nombre, String telefono, String dui, String fechaNacimiento, String direccion, String contraseña) {
        this.usuario = usuario;
        this.correo = correo;
        this.nombre = nombre;
        this.telefono = telefono;
        this.dui = dui;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.contraseña = contraseña;
    }    

    //constructor para eliminar
    public Cliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    //constructor para recuperar de la base de datos
    public Cliente(int idCliente, String usuario, String correo, String nombre, String telefono, String dui, String fechaNacimiento, String direccion, String contraseña, String rol) {
        this.idCliente = idCliente;
        this.usuario = usuario;
        this.correo = correo;
        this.nombre = nombre;
        this.telefono = telefono;
        this.dui = dui;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.contraseña = contraseña;
        this.rol = rol;
    }
    
    //getters y setters
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    

}
