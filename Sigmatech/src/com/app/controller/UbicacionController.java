/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.controller;

import com.app.conexion.ConexionSQL;
import com.app.models.Marca_TO;
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
public class UbicacionController {
    
    
        Statement st;

    public void UbicacionController() throws SQLException {
        this.st = ConexionSQL.conexion();
    }
    
    
     public List<Ubicacion_TO> consultarUbicacion() throws Exception {

         UbicacionController();
         
        List<Ubicacion_TO> ubicaciones = new ArrayList<>();

        try {

            String sql = "select  intIdUbicacion, varNomUbicacion "
                    + "from ubicacion;";

            ResultSet rs = null;

            rs = st.executeQuery(sql);

            while (rs.next()) {
                ubicaciones.add(new Ubicacion_TO(rs.getInt(1), rs.getString(2)));

            }

        } catch (SQLException e) {

            throw e;

        } finally {
            ConexionSQL.CerrarConexion();
        }

        return ubicaciones;

    }

    public Ubicacion_TO consultarUbicacionNombre(String nombre) throws Exception {

        UbicacionController();
        
        Ubicacion_TO ubicacion = new Ubicacion_TO();

        try {

              String sql = "select  intIdUbicacion, varNomUbicacion "
                    + "from ubicacion where varNomUbicacion = '"+nombre.trim()+"';";

            ResultSet rs = null;

            rs = st.executeQuery(sql);

            while (rs.next()) {
                ubicacion = new Ubicacion_TO(rs.getInt(1), rs.getString(2));

            }

        } catch (SQLException e) {

            throw e;

        } finally {
            ConexionSQL.CerrarConexion();
        }

        return ubicacion;

    }
    
}
