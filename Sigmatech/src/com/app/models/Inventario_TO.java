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
public class Inventario_TO {

    private int idInventario;

    private int itms;

    private String equipo;

    private String marca;

    private String modelo;

    private String serie;

    private String nInventario;

    private String servicio;

    private Ubicacion_TO ubicacion;

    private String Observaciones;

    //Constructores
    public Inventario_TO() {
    }

    public Inventario_TO(int idInventario, int itms, String equipo, String marca, String modelo, String serie, String nInventario, String servicio, Ubicacion_TO ubicacion, String Observaciones) {
        this.idInventario = idInventario;
        this.itms = itms;
        this.equipo = equipo;
        this.marca = marca;
        this.modelo = modelo;
        this.serie = serie;
        this.nInventario = nInventario;
        this.servicio = servicio;
        this.ubicacion = ubicacion;
        this.Observaciones = Observaciones;
    }

    //Getters and Setters
    public int getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }

    public int getItms() {
        return itms;
    }

    public void setItms(int itms) {
        this.itms = itms;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getnInventario() {
        return nInventario;
    }

    public void setnInventario(String nInventario) {
        this.nInventario = nInventario;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public Ubicacion_TO getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion_TO ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }

    @Override
    public String toString() {
        return "Inventario_TO{" + "idInventario=" + idInventario + ", itms=" + itms + ", equipo=" + equipo + ", marca=" + marca + ", modelo=" + modelo + ", serie=" + serie + ", nInventario=" + nInventario + ", servicio=" + servicio + ", ubicacion=" + ubicacion + ", Observaciones=" + Observaciones + '}';
    }

}
