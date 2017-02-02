/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.controller;

import com.app.conexion.ConexionSQL;
import com.app.models.Area_TO;
import com.app.models.Ubicacion_TO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class AreaController {

    Statement st;

    public void AreaController() throws SQLException {
        this.st = ConexionSQL.conexion();
    }

    public List<Area_TO> consultarArea() throws Exception {

        AreaController();

        List<Area_TO> areas = new ArrayList<>();

        try {

            String sql = "select  intIdArea, varNomArea "
                    + "from area;";

            ResultSet rs = null;

            rs = st.executeQuery(sql);

            while (rs.next()) {
                areas.add(new Area_TO(rs.getInt(1), rs.getString(2)));

            }

        } catch (SQLException e) {

            throw e;

        } finally {
            ConexionSQL.CerrarConexion();
        }

        return areas;

    }

    public Area_TO consultarAreaNombre(String nombre) throws Exception {

        Area_TO area = new Area_TO();

        try {

            String sql = "select  intIdArea, varNomArea "
                    + "from area where varNomArea = '"+nombre+"';";

            ResultSet rs = null;

            rs = st.executeQuery(sql);

            while (rs.next()) {
                area = new Area_TO(rs.getInt(1), rs.getString(2));

            }

        } catch (SQLException e) {

            throw e;

        } finally {
            ConexionSQL.CerrarConexion();
        }

        return area;

    }

}
