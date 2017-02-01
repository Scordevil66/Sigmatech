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
public class EstadoInventario_TO {

    private int idEstado;

    private String estadoInventario;

    //Constructores
    public EstadoInventario_TO() {
    }

    public EstadoInventario_TO(int idEstado, String estadoInventario) {
        this.idEstado = idEstado;
        this.estadoInventario = estadoInventario;
    }

    //Getters and Setters
    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getEstadoInventario() {
        return estadoInventario;
    }

    public void setEstadoInventario(String estadoInventario) {
        this.estadoInventario = estadoInventario;
    }

    @Override
    public String toString() {
        return "EstadoInventario_TO{" + "idEstado=" + idEstado + ", estadoInventario=" + estadoInventario + '}';
    }

}
