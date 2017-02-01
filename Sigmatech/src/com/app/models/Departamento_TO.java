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
public class Departamento_TO {

    private int idDepartamento;

    private String departamento;

    //Constructores
    public Departamento_TO() {
    }

    public Departamento_TO(int idDepartamento, String departamento) {
        this.idDepartamento = idDepartamento;
        this.departamento = departamento;
    }

    //Getters and Setters
    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Departamento_TO{" + "idDepartamento=" + idDepartamento + ", departamento=" + departamento + '}';
    }

}
