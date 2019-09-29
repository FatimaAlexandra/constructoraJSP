/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructora.entidades;

/**
 * Nombre de la clase: Usuario
 * Fecha: 01-09-2019
 * Version: 1.0
 * CopyRight: Itca-Fepade
 * @author Alexis Aguilar
 */
public class Usuario {
    
    private int idUsuario;
    private String usuario;
    private String correo;
    private String contraseña;
    private String rol;

    public Usuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Usuario() {
    }

    
    public Usuario(int idUsuario, String usuario, String correo, String contraseña, String rol) {
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.correo = correo;
        this.contraseña = contraseña;
        this.rol = rol;
    }

    public Usuario(String usuario, String correo, String contraseña, String rol) {
        this.usuario = usuario;
        this.correo = correo;
        this.contraseña = contraseña;
        this.rol = rol;
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

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    
    
    
}
