/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.controller;

import com.app.conexion.ConexionSQL;
import com.app.models.Marca_TO;
import com.app.models.Serie_TO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class SerieController {
    
       Statement st;

    public SerieController() throws SQLException {
        this.st = ConexionSQL.conexion();
    }
    
     public List<Serie_TO> consultarSerie() throws Exception {

        List<Serie_TO> series = new ArrayList<>();

        try {

            String sql = "select  intIdSeries, intIdModelo,  varNumSerie "
                    + "from series;";

            ResultSet rs = null;

            rs = st.executeQuery(sql);

            while (rs.next()) {
                series.add(new Serie_TO(rs.getInt(1),rs.getInt(2), rs.getString(3)));

            }

        } catch (SQLException e) {

            throw e;

        } finally {
            ConexionSQL.CerrarConexion();
        }

        return series;

    }

    public Serie_TO consultarSerieNombre(String nombre) throws Exception {

        Serie_TO serie = new Serie_TO();

        try {

              String sql = "select  intIdSeries, intIdModelo,  varNumSerie "
                    + "from series where varNumSerie = '"+nombre+"' ;";

            ResultSet rs = null;

            rs = st.executeQuery(sql);

            while (rs.next()) {
                serie = new Serie_TO(rs.getInt(1),rs.getInt(2), rs.getString(3));

            }

        } catch (SQLException e) {

            throw e;

        } finally {
            ConexionSQL.CerrarConexion();
        }

        return serie;

    }
    
}
