/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.controller;

import com.app.conexion.ConexionSQL;
import com.app.models.Ciudad_TO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class CiudadController {

    Statement st;

    public CiudadController() throws SQLException {
        this.st = ConexionSQL.conexion();
    }

    public List<Ciudad_TO> consultarCiudad(int idDepartamento) throws Exception {

        List<Ciudad_TO> ciudades = new ArrayList<>();

        try {

            String sql = "select  intIdCiudad, varNomCiudad, intIdDepartamento "
                    + "from ciudad "
                    + " where intIdDepartamento = "+idDepartamento+" ;";

            ResultSet rs = null;

            rs = st.executeQuery(sql);

            while (rs.next()) {
                ciudades.add(new Ciudad_TO(rs.getInt(1), rs.getString(2), rs.getInt(3)));

            }

        } catch (SQLException e) {

            throw e;

        } finally {
            ConexionSQL.CerrarConexion();
        }

        return ciudades;

    }

    public Ciudad_TO consultarCiudadNombre(String nombre) throws Exception {

        Ciudad_TO ciudad = new Ciudad_TO();

        try {

              String sql = "select  intIdCiudad, varNomCiudad, intIdDepartamento "
                    + "from ciudad "
                    + " where varNomCiudad = "+nombre+" ;";

            ResultSet rs = null;

            rs = st.executeQuery(sql);

            while (rs.next()) {
                ciudad = new Ciudad_TO(rs.getInt(1), rs.getString(2), rs.getInt(3));

            }

        } catch (SQLException e) {

            throw e;

        } finally {
            ConexionSQL.CerrarConexion();
        }

        return ciudad;

    }
}
