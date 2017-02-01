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

    private String equipo;

    private Marca_TO marca;

    private Serie_TO serie;

    private Modelo_TO modelo;

    private String nInventario;

    private EstadoInventario_TO estadoInventario;

    private Servicio_TO servicio;

    private Ubicacion_TO ubicacion;

    private String imagen;

    private Empresa_TO empresa;

    private Area_TO area;

    private String Observaciones;

    //Constructores
    public Inventario_TO() {
    }

    public Inventario_TO(int idInventario, String equipo, Marca_TO marca, Serie_TO serie, Modelo_TO modelo, String nInventario, EstadoInventario_TO estadoInventario, Servicio_TO servicio, Ubicacion_TO ubicacion, String imagen, Empresa_TO empresa, Area_TO area, String Observaciones) {
        this.idInventario = idInventario;
        this.equipo = equipo;
        this.marca = marca;
        this.serie = serie;
        this.modelo = modelo;
        this.nInventario = nInventario;
        this.estadoInventario = estadoInventario;
        this.servicio = servicio;
        this.ubicacion = ubicacion;
        this.imagen = imagen;
        this.empresa = empresa;
        this.area = area;
        this.Observaciones = Observaciones;
    }

    //Getters and Setters
    public int getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public Marca_TO getMarca() {
        return marca;
    }

    public void setMarca(Marca_TO marca) {
        this.marca = marca;
    }

    public Serie_TO getSerie() {
        return serie;
    }

    public void setSerie(Serie_TO serie) {
        this.serie = serie;
    }

    public Modelo_TO getModelo() {
        return modelo;
    }

    public void setModelo(Modelo_TO modelo) {
        this.modelo = modelo;
    }

    public String getnInventario() {
        return nInventario;
    }

    public void setnInventario(String nInventario) {
        this.nInventario = nInventario;
    }

    public EstadoInventario_TO getEstadoInventario() {
        return estadoInventario;
    }

    public void setEstadoInventario(EstadoInventario_TO estadoInventario) {
        this.estadoInventario = estadoInventario;
    }

    public Servicio_TO getServicio() {
        return servicio;
    }

    public void setServicio(Servicio_TO servicio) {
        this.servicio = servicio;
    }

    public Ubicacion_TO getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion_TO ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Empresa_TO getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa_TO empresa) {
        this.empresa = empresa;
    }

    public Area_TO getArea() {
        return area;
    }

    public void setArea(Area_TO area) {
        this.area = area;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }

    @Override
    public String toString() {
        return "Inventario_TO{" + "idInventario=" + idInventario + ", equipo=" + equipo + ", marca=" + marca + ", serie=" + serie + ", modelo=" + modelo + ", nInventario=" + nInventario + ", estadoInventario=" + estadoInventario + ", servicio=" + servicio + ", ubicacion=" + ubicacion + ", imagen=" + imagen + ", empresa=" + empresa + ", area=" + area + ", Observaciones=" + Observaciones + '}';
    }

}
