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
public class Modelo_TO {

    private int idModelo;

    private int idMarca;

    private String nombreModelo;

    //Constructores
    public Modelo_TO() {
    }

    public Modelo_TO(int idModelo, int idMarca, String nombreModelo) {
        this.idModelo = idModelo;
        this.idMarca = idMarca;
        this.nombreModelo = nombreModelo;
    }

    //Getters and Setters
    public int getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(int idModelo) {
        this.idModelo = idModelo;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public String getNombreModelo() {
        return nombreModelo;
    }

    public void setNombreModelo(String nombreModelo) {
        this.nombreModelo = nombreModelo;
    }

    @Override
    public String toString() {
        return "Modelo_TO{" + "idModelo=" + idModelo + ", idMarca=" + idMarca + ", nombreModelo=" + nombreModelo + '}';
    }

}
