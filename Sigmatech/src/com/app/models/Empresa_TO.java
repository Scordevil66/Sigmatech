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
public class Empresa_TO {

    private int idEmpresa;

    private String nombreEmpresa;

    private String direccion;

    private String telefono;

    private int idCiudad;

    private int idDepartamento;

    private int idLocalidad;

    //Constructores
    public Empresa_TO() {
    }

    public Empresa_TO(int idEmpresa, String nombreEmpresa, String direccion, String telefono, int idCiudad, int idDepartamento, int idLocalidad) {
        this.idEmpresa = idEmpresa;
        this.nombreEmpresa = nombreEmpresa;
        this.direccion = direccion;
        this.telefono = telefono;
        this.idCiudad = idCiudad;
        this.idDepartamento = idDepartamento;
        this.idLocalidad = idLocalidad;
    }

    //Getters and Setters
    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public int getIdLocalidad() {
        return idLocalidad;
    }

    public void setIdLocalidad(int idLocalidad) {
        this.idLocalidad = idLocalidad;
    }

    @Override
    public String toString() {
        return "Empresa_TO{" + "idEmpresa=" + idEmpresa + ", nombreEmpresa=" + nombreEmpresa + ", direccion=" + direccion + ", telefono=" + telefono + ", idCiudad=" + idCiudad + ", idDepartamento=" + idDepartamento + ", idLocalidad=" + idLocalidad + '}';
    }

}
