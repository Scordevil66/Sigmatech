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
public class Ciudad_TO {

    private int idCiudad;

    private String ciudad;

    //Constructores
    public Ciudad_TO() {
    }

    public Ciudad_TO(int idCiudad, String ciudad) {
        this.idCiudad = idCiudad;
        this.ciudad = ciudad;
    }

    //Getters and Setters
    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Ciudad_TO{" + "idCiudad=" + idCiudad + ", ciudad=" + ciudad + '}';
    }

}
