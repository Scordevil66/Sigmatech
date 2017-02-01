/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.models;

/**
 *
 * @author user
 */
public class Usuario_TO {

    private int idUsuario;

    private String nombreUsuario;

    private String correo;

    private String telefono;

    private String usuarioAcceso;

    private String contrasena;

    private TipoUsuario_TO tipoUsuario;

    //Constructores
    public Usuario_TO() {
    }

    public Usuario_TO(int idUsuario, String nombreUsuario, String correo, String telefono, String usuarioAcceso, String contrasena, TipoUsuario_TO tipoUsuario) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.correo = correo;
        this.telefono = telefono;
        this.usuarioAcceso = usuarioAcceso;
        this.contrasena = contrasena;
        this.tipoUsuario = tipoUsuario;
    }

    //Getters and Setters
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUsuarioAcceso() {
        return usuarioAcceso;
    }

    public void setUsuarioAcceso(String usuarioAcceso) {
        this.usuarioAcceso = usuarioAcceso;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public TipoUsuario_TO getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario_TO tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    @Override
    public String toString() {
        return "Usuario_TO{" + "idUsuario=" + idUsuario + ", nombreUsuario=" + nombreUsuario + ", correo=" + correo + ", telefono=" + telefono + ", usuarioAcceso=" + usuarioAcceso + ", contrasena=" + contrasena + ", tipoUsuario=" + tipoUsuario + '}';
    }

}
