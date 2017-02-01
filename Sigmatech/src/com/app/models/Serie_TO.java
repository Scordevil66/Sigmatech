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
public class Serie_TO {

    private int idSerie;

    private int idMarca;

    private String numeroSerie;

    //Constructores
    public Serie_TO() {
    }

    public Serie_TO(int idSerie, int idMarca, String numeroSerie) {
        this.idSerie = idSerie;
        this.idMarca = idMarca;
        this.numeroSerie = numeroSerie;
    }

    //Getters and Setters
    public int getIdSerie() {
        return idSerie;
    }

    public void setIdSerie(int idSerie) {
        this.idSerie = idSerie;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    @Override
    public String toString() {
        return "Serie_TO{" + "idSerie=" + idSerie + ", idMarca=" + idMarca + ", numeroSerie=" + numeroSerie + '}';
    }

}
