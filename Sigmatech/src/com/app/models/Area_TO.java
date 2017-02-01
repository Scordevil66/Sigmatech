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
public class Area_TO {

    private int idArea;

    private String area;

    //Constructores
    public Area_TO() {
    }

    public Area_TO(int idArea, String area) {
        this.idArea = idArea;
        this.area = area;
    }

    //Getters and Setters
    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Area_TO{" + "idArea=" + idArea + ", area=" + area + '}';
    }

}
