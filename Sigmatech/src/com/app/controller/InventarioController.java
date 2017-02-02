/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.controller;

import com.app.conexion.ConexionSQL;
import com.app.models.Inventario_TO;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author user
 */
public class InventarioController {

    Statement st;

    public void InventarioController() throws SQLException {
        this.st = ConexionSQL.conexion();
    }

    public int registrarInventario(Inventario_TO inventario) throws Exception {

        InventarioController();
        int inv = 0;

        try {

            String sql = "INSERT INTO `biomedic`.`inventario` "
                    + " (`varEquipo`, `intIdMarca`, `intIdModelo`, `intIdSerie`, "
                    + "  `varNumInvent`, `intIdEstadoInv`, `intIdServicio`, "
                    + "   `intIdUbicacion`, `longfoto`, `intEmpresa`, `intArea`,  "
                    + "	`varObservaciones`)  "
                    + "	VALUES "
                    + "	 ('"+inventario.getEquipo()+"', '"+inventario.getMarca().getIdMarca()+"', "
                    + "'"+inventario.getModelo().getIdModelo()+"', '"+inventario.getSerie().getIdSerie()+"',"
                    + " '"+inventario.getnInventario()+"', '"+inventario.getEstadoInventario().getIdEstado()+"', "
                    + "'"+inventario.getServicio().getIdServicio()+"',  "
                    + "	 '"+inventario.getUbicacion().getIdUbicacion()+"', '', "
                    + "'0', '"+inventario.getArea().getIdArea()+"', '"+inventario.getObservaciones()+"');";

            System.out.println("sql: " + sql);

            st.execute(sql);

            inv++;

        } catch (Exception e) {

            throw e;

        } finally {
            ConexionSQL.CerrarConexion();
        }

        return inv;

    }

}
