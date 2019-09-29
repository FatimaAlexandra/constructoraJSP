/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructora.entidades;

/**
 *
 * @author jorge Alberto
 */
public class Empleado {
    private int idUsuario;
    private String usuario;
    private String correo;
    private String contraseña;
    private int idEmpleado;
    private String nombre;
    private String direccion;
    private String telefono;
    private String dui;
    private String fechaNacimiento;
    private String tipoEmpleado;
    private double pagoDia;
    //private String idUsuario;
    private int estado;

    public Empleado() {
    }

    public Empleado(String usuario, String correo, String contraseña, String nombre, String direccion, String telefono, String dui, String fechaNacimiento, String tipoEmpleado, double pagoDia) {
        this.usuario = usuario;
        this.correo = correo;
        this.contraseña = contraseña;
        //this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.dui = dui;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoEmpleado = tipoEmpleado;
        this.pagoDia = pagoDia;
       // this.estado = estado;
    }

    public Empleado(int idUsuario, String usuario, String correo, String contraseña, String avatar, int idEmpleado, String nombre, String telefono, String dui, String fechaNacimiento, String tipoEmpleado, double pagoDia, int estado) {
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.correo = correo;
        this.contraseña = contraseña;
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.telefono = telefono;
        this.dui = dui;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoEmpleado = tipoEmpleado;
        this.pagoDia = pagoDia;
        this.estado = estado;
    }

    public Empleado(String usuario, String correo, String contraseña, int idUsuario, String nombre, String direccion, String telefono, String dui, String fechaNacimiento, String tipoEmpleado, double pagoDia,int idEmpleado) {
        this.usuario = usuario;
        this.correo = correo;
        this.contraseña = contraseña;
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.dui = dui;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoEmpleado = tipoEmpleado;
        this.pagoDia = pagoDia;
        this.idEmpleado = idEmpleado;
    }

    public Empleado(int idUsuario, String usuario, String correo, String contraseña, int idEmpleado, String nombre, String direccion, String telefono, String dui, String fechaNacimiento, String tipoEmpleado, double pagoDia) {
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.correo = correo;
        this.contraseña = contraseña;
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.dui = dui;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoEmpleado = tipoEmpleado;
        this.pagoDia = pagoDia;
    }
    

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
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

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Empleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    public double getPagoDia() {
        return pagoDia;
    }

    public void setPagoDia(double pagoDia) {
        this.pagoDia = pagoDia;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
}
