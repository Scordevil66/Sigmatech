/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.controller;

import com.app.conexion.ConexionSQL;
import com.app.models.Servicio_TO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class ServicioController {

    Statement st;

    public ServicioController() throws SQLException {
        this.st = ConexionSQL.conexion();
    }

    public List<Servicio_TO> consultarServicio() throws Exception {
        
        this.st = ConexionSQL.conexion();

        List<Servicio_TO> servicios = new ArrayList<>();

        try {

            String sql = " select intIdServicios, varNomServicio "
                    + " from servicios ";

            ResultSet rs = null;

            rs = st.executeQuery(sql);

            while (rs.next()) {
                servicios.add(new Servicio_TO(rs.getInt(1), rs.getString(2)));

            }

        } catch (SQLException e) {

            throw e;

        } finally {
            ConexionSQL.CerrarConexion();
        }

        return servicios;

    }

    public Servicio_TO consultarServicioNombre(String nombre) throws Exception {

        Servicio_TO servicio = new Servicio_TO();

        try {

            String sql = "select  intIdServicios, varNomServicio "
                    + "from servicios where varNomServicio = '"+nombre+"';";

            ResultSet rs = null;

            rs = st.executeQuery(sql);

            while (rs.next()) {
                servicio = new Servicio_TO(rs.getInt(1), rs.getString(2));

            }

        } catch (SQLException e) {

            throw e;

        } finally {
            ConexionSQL.CerrarConexion();
        }

        return servicio;

    }

}
