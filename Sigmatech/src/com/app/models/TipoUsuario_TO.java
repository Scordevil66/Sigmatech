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
public class TipoUsuario_TO {

    private int idTipoUsuario;

    private String nombreTipoUsuario;

    //Constructores
    public TipoUsuario_TO() {
    }

    public TipoUsuario_TO(int idTipoUsuario, String nombreTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
        this.nombreTipoUsuario = nombreTipoUsuario;
    }

    //Getters and Setters
    public int getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(int idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    public String getNombreTipoUsuario() {
        return nombreTipoUsuario;
    }

    public void setNombreTipoUsuario(String nombreTipoUsuario) {
        this.nombreTipoUsuario = nombreTipoUsuario;
    }

    @Override
    public String toString() {
        return "TipoUsuario_TO{" + "idTipoUsuario=" + idTipoUsuario + ", nombreTipoUsuario=" + nombreTipoUsuario + '}';
    }

}
