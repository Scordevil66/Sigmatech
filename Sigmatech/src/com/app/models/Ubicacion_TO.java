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
public class Ubicacion_TO {

    private int idUbicacion;

    private String ubicacion;

    //Constructores
    public Ubicacion_TO() {
    }

    public Ubicacion_TO(int idUbicacion, String ubicacion) {
        this.idUbicacion = idUbicacion;
        this.ubicacion = ubicacion;
    }

    public Ubicacion_TO(int idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    //Getters and Setters
    public int getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(int idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "Ubicacion_TO{" + "idUbicacion=" + idUbicacion + ", ubicacion=" + ubicacion + '}';
    }

}
