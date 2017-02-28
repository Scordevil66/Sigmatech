/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.controller;

import com.app.conexion.ConexionSQL;
import com.app.models.HojaDeVida_TO;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author user
 */
public class HojaDeVidaController {
    
        Statement st;

    public void InventarioController() throws SQLException {
        this.st = ConexionSQL.conexion();
    }
    
     public int registrarHojaDeVida(HojaDeVida_TO hojaDeVida) throws Exception {

        InventarioController();
        int inv = 0;

        try {

            String sql = "INSERT INTO `biomedic`.`hojadevida` "
                    + " (`direccion`, `telefono`, `email`, `codigoEquipo`, `rs`,"
                    + " `codigoPrestado`, `sede`, `distintivo`, `serie`, `invActivo`, "
                    + " `equipo`, `marca`, `modelo`, `tipo`, `servicio`, `ubicacion`,"
                    + "  `tipoEquipo`, `formaAdquisicion`, `documentoAdquisicion`, "
                    + " `fechaCompra`, `actaRecibido`, `instalacion`, `inicioOperacion`,"
                    + "  `vencGarantia`, `fabricacion`, `costo`, `vidaUtil`, `proveedor`, "
                    + " `telProveedor`, `correoProveedor`, `representante`, `telRepresentante`,"
                    + "  `correoRepresentante`, `fabricante`, `telFabricante`, `pasFabricante`, "
                    + " `fuenteAlimentacion`, `tecPredominante`, `voltajeMax`, `voltajeMin`, "
                    + " `corrienteMax`, `corrienteMin`, `potencia`, `frencuencia`, `presion`, "
                    + " `velocidad`, `peso`, `temperatura`, `otros`, `rangoVoltaje`, `rangoCorriente`, "
                    + " `rangoPotencia`, `frecuencia2`, `rangoPresion`, `rangoVelocidad`, `rangoTemperatura`, "
                    + " `peso2`, `rangoHumedad`, `otrasRecomendaciones`, `manuales`, `planos`, "
                    + " `clasificacionBiomedica`, `clasificacionRiesgo`, `periodicidadMantenimiento`, "
                    + " `requiereCalibracion`, `periodicidadCalibracion`, `registroSanitario`, "
                    + " `permisoComercializacion`, `registroImportacion`, `factura`, `ingresoAlmacen`, "
                    + " `actaReciboSatisfacionPrestador`, `protocoloMantenimientoPreventivo`, "
                    + " `cronogramaMantenimientoGarantia`, `guiaRapidaOperacion`, `actaReciboSatisfacionOperador`, "
                    + " `recomendacionesFrabricanteUsoAccesoriosConsumibles`, `recomendacionesFabricanteCalibracion`,"
                    + "  `estimativoCostoAccesoriosConsumibles`)"
                    + " VALUES ('calle', '123', 'prueba', '12', "
                    + " 'a', 'a', 'a',"
                    + "  'a', 'a', 'a',"
                    + "  'a', 'a', 'a', "
                    + " 'a', 'a', 'a', "
                    + " 'a', 'a', 'a', "
                    + " 'a', 'a', 'a',"
                    + "  'a', 'a', 'a', "
                    + " 'a', 'a', 'a', "
                    + " 'a', 'a', 'a', "
                    + " 'a', 'a', 'a', "
                    + " 'a', 'a', 'a', "
                    + " 'a', 'a', 'a', "
                    + " 'a', 'a', 'a', "
                    + " 'a', 'a', 'a', "
                    + " 'a', 'a', 'a', "
                    + " 'a', 'a', 'a', "
                    + " 'a', 'a', 'a',"
                    + "  'a', 'a', 'a',"
                    + "  'a', 'a', 'a', "
                    + " 'a', 'a', 'a', "
                    + " 'a', 'a', 'a',"
                    + "  'a', 'a', 'a', "
                    + " 'a', 'a', 'a', "
                    + " 'a', 'a', 'a',"
                    + "  'a', 'a', 'a');";

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
