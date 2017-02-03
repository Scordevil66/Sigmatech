/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.controller;

import com.app.conexion.ConexionSQL;
import com.app.models.Area_TO;
import com.app.models.EstadoInventario_TO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class EstadoController {

    Statement st;

    public void EstadoController() throws SQLException {
        this.st = ConexionSQL.conexion();
    }

    public List<EstadoInventario_TO> consultarEstadoInventario() throws Exception {

        EstadoController();

        List<EstadoInventario_TO> estados = new ArrayList<>();

        try {

            String sql = "select  intId, varEstadoInventario "
                    + "from estadoinventario;";

            ResultSet rs = null;

            rs = st.executeQuery(sql);

            while (rs.next()) {
                estados.add(new EstadoInventario_TO(rs.getInt(1), rs.getString(2)));

            }

        } catch (SQLException e) {

            throw e;

        } finally {
            ConexionSQL.CerrarConexion();
        }

        return estados;

    }

    public EstadoInventario_TO consultarEstadoNombre(String nombre) throws Exception {

         EstadoController();
        
        EstadoInventario_TO estadoInventario = new EstadoInventario_TO();

        try {

            String sql = "select  intId, varEstadoInventario "
                    + "from estadoinventario where varEstadoInventario = '"+nombre+"';";

            ResultSet rs = null;

            rs = st.executeQuery(sql);

            while (rs.next()) {
                estadoInventario = new EstadoInventario_TO(rs.getInt(1), rs.getString(2));

            }

        } catch (SQLException e) {

            throw e;

        } finally {
            ConexionSQL.CerrarConexion();
        }

        return estadoInventario;

    }

}
