/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.controller;

import com.app.conexion.ConexionSQL;
import com.app.models.Ciudad_TO;
import com.app.models.Marca_TO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class MarcaController {
    
        Statement st;

    public MarcaController() throws SQLException {
        this.st = ConexionSQL.conexion();
    }
    
     public List<Marca_TO> consultarMarca() throws Exception {

        List<Marca_TO> marcas = new ArrayList<>();

        try {

            String sql = "select  intIdMarca, varNombreMarca "
                    + "from marca;";

            ResultSet rs = null;

            rs = st.executeQuery(sql);

            while (rs.next()) {
                marcas.add(new Marca_TO(rs.getInt(1), rs.getString(2)));

            }

        } catch (SQLException e) {

            throw e;

        } finally {
            ConexionSQL.CerrarConexion();
        }

        return marcas;

    }

    public Marca_TO consultarMarcaNombre(String nombre) throws Exception {

        Marca_TO marca = new Marca_TO();

        try {

              String sql = "select  intIdMarca, varNombreMarca "
                    + "from marca where varNombreMarca = '"+nombre+"';";

            ResultSet rs = null;

            rs = st.executeQuery(sql);

            while (rs.next()) {
                marca = new Marca_TO(rs.getInt(1), rs.getString(2));

            }

        } catch (SQLException e) {

            throw e;

        } finally {
            ConexionSQL.CerrarConexion();
        }

        return marca;

    }
}
