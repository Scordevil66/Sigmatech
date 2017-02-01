/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.controller;

import com.app.conexion.ConexionSQL;
import com.app.models.Departamento_TO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class DepartamentoController {

    Statement st;

    public DepartamentoController() throws SQLException {
        this.st = ConexionSQL.conexion();
    }

    public List<Departamento_TO> consultarDepartamento() throws Exception {

        List<Departamento_TO> departamentos = new ArrayList<>();

        try {

            String sql = " select  intIdDepartamento, varNomDepartamento "
                    + " from departamentos; ";

            ResultSet rs = null;

            rs = st.executeQuery(sql);

            while (rs.next()) {
                departamentos.add(new Departamento_TO(rs.getInt(1), rs.getString(2)));

            }

        } catch (SQLException e) {

            throw e;

        } finally {
            ConexionSQL.CerrarConexion();
        }

        return departamentos;

    }

    public Departamento_TO consultarDepartamentoNombre(String nombre) throws Exception {

        Departamento_TO departamento = new Departamento_TO();

        try {

            String sql = " select  intIdDepartamento, varNomDepartamento "
                    + " from departamentos "
                    + " where varNomDepartamento = '"+nombre+"' ;";

            ResultSet rs = null;

            rs = st.executeQuery(sql);

            while (rs.next()) {
                departamento = new Departamento_TO(rs.getInt(1), rs.getString(2));

            }

        } catch (SQLException e) {

            throw e;

        } finally {
            ConexionSQL.CerrarConexion();
        }

        return departamento;

    }

}
