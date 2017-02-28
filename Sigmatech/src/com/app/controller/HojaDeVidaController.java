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
        int hoja = 0;

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
                    + " VALUES ('"+hojaDeVida.getDireccion()+"', '"+hojaDeVida.getTelefono()+"', '"+hojaDeVida.getEmail()+"', '"+hojaDeVida.getCodigoEquipo()+"', "
                    + " '"+hojaDeVida.getRs()+"', '"+hojaDeVida.getCodigoPrestado()+"', '"+hojaDeVida.getSede()+"',"
                    + "  '"+hojaDeVida.getDistintivo()+"', '"+hojaDeVida.getSerie()+"', '"+hojaDeVida.getInvActivo()+"',"
                    + "  '"+hojaDeVida.getEquipo()+"', '"+hojaDeVida.getMarca()+"', '"+hojaDeVida.getModelo()+"', "
                    + " '"+hojaDeVida.getTipo()+"', '"+hojaDeVida.getServicio()+"', '"+hojaDeVida.getUbicacion()+"', "
                    + " '"+hojaDeVida.getTipoEquipo()+"', '"+hojaDeVida.getFormaAdquisicion()+"', '"+hojaDeVida.getDocumentoAdquisicion()+"', "
                    + " '"+hojaDeVida.getFechaCompra()+"', '"+hojaDeVida.getActaRecibido()+"', '"+hojaDeVida.getInstalacion()+"',"
                    + "  '"+hojaDeVida.getInicioOperacion()+"', '"+hojaDeVida.getVencGarantia()+"', '"+hojaDeVida.getFabricacion()+"', "
                    + " '"+hojaDeVida.getCosto()+"', '"+hojaDeVida.getVidaUtil()+"', '"+hojaDeVida.getProveedor()+"', "
                    + " '"+hojaDeVida.getTelProveedor()+"', '"+hojaDeVida.getCorreoProveedor()+"', '"+hojaDeVida.getRepresentante()+"', "
                    + " '"+hojaDeVida.getTelRepresentante()+"', '"+hojaDeVida.getCorreoRepresentante()+"', '"+hojaDeVida.getFabricante()+"', "
                    + " '"+hojaDeVida.getTelFabricante()+"', '"+hojaDeVida.getPasFabricante()+"', "
                    + " '"+hojaDeVida.getFuenteAlimentacion()+"', '"+hojaDeVida.getTecPredominante()+"', '"+hojaDeVida.getVoltajeMax()+"', "
                    + " '"+hojaDeVida.getVoltajeMin()+"', '"+hojaDeVida.getCorrienteMax()+"', '"+hojaDeVida.getCorrienteMin()+"', "
                    + " '"+hojaDeVida.getPotencia()+"', '"+hojaDeVida.getFrencuencia()+"', '"+hojaDeVida.getPresion()+"', "
                    + " '"+hojaDeVida.getVelocidad()+"', '"+hojaDeVida.getPeso()+"', '"+hojaDeVida.getTemperatura()+"', "
                    + " '"+hojaDeVida.getOtros()+"', '"+hojaDeVida.getRangoVoltaje()+"', '"+hojaDeVida.getRangoCorriente()+"',"
                    + "  '"+hojaDeVida.getRangoPotencia()+"', '"+hojaDeVida.getFrecuencia2()+"', '"+hojaDeVida.getRangoPresion()+"',"
                    + "  '"+hojaDeVida.getRangoVelocidad()+"', '"+hojaDeVida.getRangoTemperatura()+"', '"+hojaDeVida.getPeso2()+"', "
                    + " '"+hojaDeVida.getRangoHumedad()+"', '"+hojaDeVida.getOtrasRecomendaciones()+"', '"+hojaDeVida.getManuales()+"', "
                    + " '"+hojaDeVida.getPlanos()+"', '"+hojaDeVida.getClasificacionBiomedica()+"', '"+hojaDeVida.getClasificacionRiesgo()+"',"
                    + "  '"+hojaDeVida.getPeriodicidadMantenimiento()+"', '"+hojaDeVida.getRequiereCalibracion()+"', '"+hojaDeVida.getPeriodicidadCalibracion()+"', "
                    + " '"+hojaDeVida.getRegistroSanitario()+"', '"+hojaDeVida.getPermisoComercializacion()+"', '"+hojaDeVida.getRegistroImportacion()+"', "
                    + " '"+hojaDeVida.getFactura()+"', '"+hojaDeVida.getIngresoAlmacen()+"', '"+hojaDeVida.getActaReciboSatisfacionPrestador()+"',"
                    + " '"+hojaDeVida.getProtocoloMantenimientoPreventivo()+"', '"+hojaDeVida.getCronogramaMantenimientoGarantia()+"', '"+hojaDeVida.getGuiaRapidaOperacion()+"',"
                    + " '"+hojaDeVida.getActaReciboSatisfacionOperador()+"', "
                    + "  '"+hojaDeVida.getRecomendacionesFrabricanteUsoAccesoriosConsumibles()+"', '"+hojaDeVida.getRecomendacionesFabricanteCalibracion()+"', '"+hojaDeVida.getEstimativoCostoAccesoriosConsumibles()+"');";

            System.out.println("sql: " + sql);

            st.execute(sql);

            hoja++;

        } catch (Exception e) {

            throw e;

        } finally {
            ConexionSQL.CerrarConexion();
        }

        return hoja;

    }
    
}
