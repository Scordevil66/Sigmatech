/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.controller;

import com.app.conexion.ConexionSQL;
import com.app.models.Modelo_TO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class ModeloController {

    Statement st;

    public ModeloController() throws SQLException {
        this.st = ConexionSQL.conexion();
    }
    
     public List<Modelo_TO> consultarModelo(int idMarca) throws Exception {

        List<Modelo_TO> modelos = new ArrayList<>();

        try {

            String sql = "select  intIdModelo, intIdMarca, varNombreModelo "
                    + "from modelo where intIdMarca = '"+idMarca+"';";

            ResultSet rs = null;

            rs = st.executeQuery(sql);

            while (rs.next()) {
                modelos.add(new Modelo_TO(rs.getInt(1), rs.getInt(2), rs.getString(3)));

            }

        } catch (SQLException e) {

            throw e;

        } finally {
            ConexionSQL.CerrarConexion();
        }

        return modelos;

    }

    public Modelo_TO consultarModeloNombre(String nombre) throws Exception {

        Modelo_TO modelo = new Modelo_TO();

        try {

              String sql = "select  intIdModelo,intIdMarca,  varNombreModelo  "
                    + "from marca where varNombreModelo = '"+nombre+"';";

            ResultSet rs = null;

            rs = st.executeQuery(sql);

            while (rs.next()) {
                modelo = new Modelo_TO(rs.getInt(1), rs.getInt(2), rs.getString(3));

            }

        } catch (SQLException e) {

            throw e;

        } finally {
            ConexionSQL.CerrarConexion();
        }

        return modelo;

    }

}
