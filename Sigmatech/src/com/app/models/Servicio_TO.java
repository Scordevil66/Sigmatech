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
public class Servicio_TO {

    private int idServicio;

    private String servicio;

    //Constructores
    public Servicio_TO() {
    }

    public Servicio_TO(int idServicio, String servicio) {
        this.idServicio = idServicio;
        this.servicio = servicio;
    }

    //Getters and Setters
    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    @Override
    public String toString() {
        return "Servicio_TO{" + "idServicio=" + idServicio + ", servicio=" + servicio + '}';
    }

}
