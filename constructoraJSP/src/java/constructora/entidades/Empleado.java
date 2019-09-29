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
    private int idEmpleado;
    private String nombre;
    private String direccion;
    private String telefono;
    private String dui;
    private String fechaNacimiento;
    private String tipoEmpleado;
    private double pagoDia;
    private Usuario idUsuario;
    private int estado;

    public Empleado() {
    }

    public Empleado(String nombre, String direccion, String telefono, String dui, String fechaNacimiento, String tipoEmpleado, double pagoDia, Usuario idUsuario, int estado) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.dui = dui;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoEmpleado = tipoEmpleado;
        this.pagoDia = pagoDia;
        this.idUsuario = idUsuario;
        this.estado = estado;
    }

    public Empleado(int idEmpleado, String nombre, String direccion, String telefono, String dui, String fechaNacimiento, String tipoEmpleado, double pagoDia, Usuario idUsuario, int estado) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.dui = dui;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoEmpleado = tipoEmpleado;
        this.pagoDia = pagoDia;
        this.idUsuario = idUsuario;
        this.estado = estado;
    }

    public Empleado(String nombre, String direccion, String telefono, String dui, String fechaNacimiento, String tipoEmpleado, double pagoDia, Usuario idUsuario) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.dui = dui;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoEmpleado = tipoEmpleado;
        this.pagoDia = pagoDia;
        this.idUsuario = idUsuario;
    }

    public Empleado(int idEmpleado, String nombre, String direccion, String telefono, String dui, String fechaNacimiento, String tipoEmpleado, double pagoDia, Usuario idUsuario) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.dui = dui;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoEmpleado = tipoEmpleado;
        this.pagoDia = pagoDia;
        this.idUsuario = idUsuario;
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

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

   
    
}
