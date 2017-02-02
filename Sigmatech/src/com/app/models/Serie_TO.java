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

    private int idModelo;

    private String numeroSerie;

    //Constructores
    public Serie_TO() {
    }

    public Serie_TO(int idSerie, int idModelo, String numeroSerie) {
        this.idSerie = idSerie;
        this.idModelo = idModelo;
        this.numeroSerie = numeroSerie;
    }

    public Serie_TO(int idSerie) {
        this.idSerie = idSerie;
    }

    //Getters and Setters
    public int getIdSerie() {
        return idSerie;
    }

    public void setIdSerie(int idSerie) {
        this.idSerie = idSerie;
    }

    public int getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(int idModelo) {
        this.idModelo = idModelo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    @Override
    public String toString() {
        return "Serie_TO{" + "idSerie=" + idSerie + ", idModelo=" + idModelo + ", numeroSerie=" + numeroSerie + '}';
    }

}
