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
public class Marca_TO {

    private int idMarca;

    private String marca;

    //Constructores
    public Marca_TO() {
    }

    public Marca_TO(int idMarca, String marca) {
        this.idMarca = idMarca;
        this.marca = marca;
    }

    public Marca_TO(int idMarca) {
        this.idMarca = idMarca;
    }

    //Getters and Setters
    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Marca_TO{" + "idMarca=" + idMarca + ", marca=" + marca + '}';
    }

}
