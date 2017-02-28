/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.utils;

import com.app.controller.EstadoController;
import com.app.controller.HojaDeVidaController;
import com.app.controller.InventarioController;
import com.app.controller.MarcaController;
import com.app.controller.ModeloController;
import com.app.controller.SerieController;
import com.app.controller.ServicioController;
import com.app.controller.UbicacionController;
import com.app.models.Area_TO;
import com.app.models.EstadoInventario_TO;
import com.app.models.HojaDeVida_TO;
import com.app.models.Inventario_TO;
import com.app.models.Marca_TO;
import com.app.models.Modelo_TO;
import com.app.models.Serie_TO;
import com.app.models.Servicio_TO;
import com.app.models.Ubicacion_TO;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Locale;
import javax.swing.JOptionPane;
import jxl.Sheet;
import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.biff.CountryCode;
import jxl.read.biff.BiffException;
//import jxl.Cell;
//import jxl.Sheet;
//import jxl.Workbook;
//import jxl.WorkbookSettings;
//import jxl.biff.CountryCode;
//import jxl.read.biff.BiffException;

/**
 *
 * @author Gustavo Cardenas
 */
public class LeerArchivoDeExcel {

    public static void main(String[] args) throws IOException, BiffException, FileNotFoundException, SQLException, Exception {
//
        String a = "C:\\Users\\user\\Documents\\proyectos\\Hospitales\\Documentacion/COLUMNAS HOJA DE VIDA PARTE 2 (1).xls";
//
        RegistrarHojaDeVidas(a);
    }

    //Funcional
    public static int RegistrarInventario(String path, int idArea) throws IOException, BiffException, Exception {

        int resultado = 0;
        InventarioController inventarioController = null;
        boolean equals1 = false, equals2 = false, equals3 = false, equals4 = false, equals5 = false;
        boolean equals6 = false, equals7 = false, equals8 = false, equals9 = false, equals10 = false, equals11 = false;
        File file = new File(path);
        if (file.exists() == true) {

            WorkbookSettings wbSettings = new WorkbookSettings();
            wbSettings.setEncoding("ISO-8859-1");
            wbSettings.setLocale(new Locale("es", "ES"));
            wbSettings.setExcelDisplayLanguage("ES");
            wbSettings.setExcelRegionalSettings("ES");
            wbSettings.setCharacterSet(CountryCode.SPAIN.getValue());

            Workbook workbook = Workbook.getWorkbook(new File(path), wbSettings); //Pasamos el excel que vamos a leer
            Sheet sheet = workbook.getSheet(0); //Seleccionamos la hoja que vamos a leer
            String itms = "", equipo = "", marca = "", modelo = "", serie = "";
            String estado = "", nInven = "", servicio = "", ubicacion = "", foto = "", observaciones = "";

            for (int fil = 0; fil < 1; fil++) {
                equals1 = sheet.getCell(0, fil).getContents().trim().equals("ITMS");
                equals2 = sheet.getCell(1, fil).getContents().trim().equals("EQUIPO");
                equals3 = sheet.getCell(2, fil).getContents().trim().equals("MARCA");
                equals4 = sheet.getCell(3, fil).getContents().trim().equals("MODELO");
                equals5 = sheet.getCell(4, fil).getContents().trim().equals("SERIE");
                equals6 = sheet.getCell(5, fil).getContents().trim().equals("ESTADO");
                equals7 = sheet.getCell(6, fil).getContents().equals("Nro INV");
                equals8 = sheet.getCell(7, fil).getContents().trim().equals("SERVICIO");
                equals9 = sheet.getCell(8, fil).getContents().trim().equals("UBICACIÓN");
                equals10 = sheet.getCell(9, fil).getContents().trim().equals("REGISTRO FOTOGRAFICO");
                equals11 = sheet.getCell(10, fil).getContents().trim().equals("OBSERVACIONES");

            }

            if (equals1 == true && equals2 == true && equals3 == true && equals4 == true
                    && equals5 == true && equals6 == true && equals7 == true && equals8 == true
                    && equals9 == true && equals10 == true && equals11 == true) {

                if (sheet.getRows() > 0) {

                    inventarioController = new InventarioController();

                    for (int fila = 1; fila < (sheet.getRows() - 1); fila++) { //recorremos las filas

                        itms = sheet.getCell(0, fila).getContents();
                        equipo = sheet.getCell(1, fila).getContents(); //setear la celda leida a nombre
                        marca = sheet.getCell(2, fila).getContents();
                        modelo = sheet.getCell(3, fila).getContents();
                        serie = sheet.getCell(4, fila).getContents();
                        estado = sheet.getCell(5, fila).getContents();
                        nInven = sheet.getCell(6, fila).getContents();
                        servicio = sheet.getCell(7, fila).getContents();
                        ubicacion = sheet.getCell(8, fila).getContents();
                        foto = sheet.getCell(9, fila).getContents();
                        observaciones = sheet.getCell(10, fila).getContents();

                        Inventario_TO inventario = new Inventario_TO();

                        inventario.setEquipo((equipo.trim()));
                        inventario.setnInventario(nInven.trim());
                        inventario.setObservaciones(observaciones.trim());

                        if (marca.equals("")) {
                            Marca_TO m = new Marca_TO(0);
                            inventario.setMarca(m);
                        } else {
                            MarcaController marcaController = new MarcaController();
                            Marca_TO m = new Marca_TO();
                            m = marcaController.consultarMarcaNombre(marca);
                            inventario.setMarca(m);
                        }

                        if (modelo.equals("")) {
                            Modelo_TO m = new Modelo_TO(0);
                            inventario.setModelo(m);
                        } else {
                            ModeloController modeloController = new ModeloController();
                            Modelo_TO m = new Modelo_TO();
                            m = modeloController.consultarModeloNombre(modelo);
                            inventario.setModelo(m);
                        }

                        if (serie.equals("")) {
                            Serie_TO s = new Serie_TO(0);
                            inventario.setSerie(s);
                        } else {
                            SerieController serieController = new SerieController();
                            Serie_TO s = new Serie_TO();
                            s = serieController.consultarSerieNombre(serie);
                            inventario.setSerie(s);
                        }

                        if (servicio.equals("")) {
                            Servicio_TO se = new Servicio_TO();
                            inventario.setServicio(se);
                        } else {
                            ServicioController servicioController = new ServicioController();
                            Servicio_TO se = new Servicio_TO();
                            se = servicioController.consultarServicioNombre(servicio);
                            inventario.setServicio(se);
                        }

                        if (ubicacion.equals("")) {
                            Ubicacion_TO u = new Ubicacion_TO();
                            inventario.setUbicacion(u);
                        } else {
                            UbicacionController ubicacionController = new UbicacionController();
                            Ubicacion_TO u = new Ubicacion_TO();
                            u = ubicacionController.consultarUbicacionNombre(ubicacion);
                            inventario.setUbicacion(u);
                        }

                        if (estado.equals("")) {
                            EstadoInventario_TO e = new EstadoInventario_TO();
                            inventario.setEstadoInventario(e);
                        } else {
                            EstadoController estadoController = new EstadoController();
                            EstadoInventario_TO e = new EstadoInventario_TO();
                            e = estadoController.consultarEstadoNombre(estado);
                            inventario.setEstadoInventario(e);
                        }

                        Area_TO a = new Area_TO();
                        a.setIdArea(idArea);
                        inventario.setArea(a);

                        inventarioController.registrarInventario(inventario);

                        resultado++;
                    }
//                    JOptionPane.showMessageDialog(null, "Registros realizados Satisfactoriamente");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Estructura Incorrecta");
                //Estructura incorrecta
            }
        } else {
            JOptionPane.showMessageDialog(null, "Archivo no encontrado");
            // archivo no encontrado
        }
        return resultado;
    }

    public static int RegistrarHojaDeVidas(String path) throws IOException, BiffException, Exception {

        int resultado = 0;
        HojaDeVidaController hojaDeVidaController = null;
        boolean equals1 = false, equals2 = false, equals3 = false, equals4 = false, equals5 = false;
        boolean equals6 = false, equals7 = false, equals8 = false, equals9 = false, equals10 = false;
        boolean equals11 = false, equals12 = false, equals13 = false, equals14 = false, equals15 = false;
        boolean equals16 = false, equals17 = false, equals18 = false, equals19 = false, equals20 = false;
        boolean equals21 = false, equals22 = false, equals23 = false, equals24 = false, equals25 = false;
        boolean equals26 = false, equals27 = false, equals28 = false, equals29 = false, equals30 = false;
        boolean equals31 = false, equals32 = false, equals33 = false, equals34 = false, equals35 = false;
        boolean equals36 = false, equals37 = false, equals38 = false, equals39 = false, equals40 = false;
        boolean equals41 = false, equals42 = false, equals43 = false, equals44 = false, equals45 = false;
        boolean equals46 = false, equals47 = false, equals48 = false, equals49 = false, equals50 = false;
        boolean equals51 = false, equals52 = false, equals53 = false, equals54 = false, equals55 = false;
        boolean equals56 = false, equals57 = false, equals58 = false, equals59 = false, equals60 = false;
        boolean equals61 = false, equals62 = false, equals63 = false, equals64 = false, equals65 = false;
        boolean equals66 = false, equals67 = false, equals68 = false, equals69 = false, equals70 = false;
        boolean equals71 = false, equals72 = false, equals73 = false, equals74 = false, equals75 = false;
        boolean equals76 = false, equals77 = false, equals78 = false, equals79 = false;
        File file = new File(path);
        if (file.exists() == true) {

            WorkbookSettings wbSettings = new WorkbookSettings();
            wbSettings.setEncoding("ISO-8859-1");
            wbSettings.setLocale(new Locale("es", "ES"));
            wbSettings.setExcelDisplayLanguage("ES");
            wbSettings.setExcelRegionalSettings("ES");
            wbSettings.setCharacterSet(CountryCode.SPAIN.getValue());

            Workbook workbook = Workbook.getWorkbook(new File(path), wbSettings); //Pasamos el excel que vamos a leer
            Sheet sheet = workbook.getSheet(0); //Seleccionamos la hoja que vamos a leer
            String direccion = "", telefono = "", email = "", codigoEquipo = "", rs = "";
            String codigoPrestado = "", sede = "", distintivo = "", serie = "", invActivo = "";
            String equipo = "", marca = "", modelo = "", tipo = "", servicio = "";
            String ubicacion = "", tipoEquipo = "", formaAdquisicion = "", documentoAdquisicion = "", fechaCompra = "";
            String actaRecibido = "", instalacion = "", inicioOperacion = "", vencGarantia = "", fabricacion = "";
            String costo = "", vidaUtil = "", proveedor = "", telProveedor = "", correoProveedor = "";
            String representante = "", telRepresentante = "", correoRepresentante = "", fabricante = "", telFabricante = "";
            String pasFabricante = "", fuenteAlimentacion = "", tecPredominante = "", voltajeMax = "", voltajeMin = "";
            String corrienteMax = "", corrienteMin = "", potencia = "", frencuencia = "", presion = "";
            String velocidad = "", peso = "", temperatura = "", otros = "", rangoVoltaje = "";
            String rangoCorriente = "", rangoPotencia = "", frecuencia2 = "", rangoPresion = "", rangoVelocidad = "";
            String rangoTemperatura = "", peso2 = "", rangoHumedad = "", otrasRecomendaciones = "", manuales = "";
            String planos = "", clasificacionBiomedica = "", clasificacionRiesgo = "", periodicidadMantenimiento = "", requiereCalibracion = "";
            String periodicidadCalibracion = "", registroSanitario = "", permisoComercializacion = "", registroImportacion = "", factura = "";
            String ingresoAlmacen = "", actaReciboSatisfacionPrestador = "", protocoloMantenimientoPreventivo = "", cronogramaMantenimientoGarantia = "", guiaRapidaOperacion = "";
            String actaReciboSatisfacionOperador = "", recomendacionesFrabricanteUsoAccesoriosConsumibles = "", recomendacionesFabricanteCalibracion = "", estimativoCostoAccesoriosConsumibles = "";

            for (int fil = 1; fil < 2; fil++) {
                equals1 = sheet.getCell(0, fil).getContents().equals("DIRECCION");
                equals2 = sheet.getCell(1, fil).getContents().equals("TELEFONO");
                equals3 = sheet.getCell(2, fil).getContents().equals("EMAIL");
                equals4 = sheet.getCell(3, fil).getContents().equals("CODIGO DEL EQUIPO");
                equals5 = sheet.getCell(4, fil).getContents().equals("RS");
                equals6 = sheet.getCell(5, fil).getContents().equals("CODIGO DEL PRESTADOR");
                equals7 = sheet.getCell(6, fil).getContents().equals("SEDE");
                equals8 = sheet.getCell(7, fil).getContents().equals("DISTINTIVO");
                equals9 = sheet.getCell(8, fil).getContents().equals("SERIE");
                equals10 = sheet.getCell(9, fil).getContents().equals("INV/ACTIVO");
                equals11 = sheet.getCell(10, fil).getContents().equals("EQUIPO");
                equals12 = sheet.getCell(11, fil).getContents().equals("MARCA");
                equals13 = sheet.getCell(12, fil).getContents().equals("MODELO");
                equals14 = sheet.getCell(13, fil).getContents().equals("TIPO");
                equals15 = sheet.getCell(14, fil).getContents().equals("SERVICIO");
                equals16 = sheet.getCell(15, fil).getContents().equals("UBICACIÓN");
                equals17 = sheet.getCell(16, fil).getContents().equals("EQUIPO");
                equals18 = sheet.getCell(17, fil).getContents().equals("FORMA DE ADQUISICION");
                equals19 = sheet.getCell(18, fil).getContents().equals("DOCUMENTO DE ADQUISICION");
                equals20 = sheet.getCell(19, fil).getContents().equals("COMPRA");
                equals21 = sheet.getCell(20, fil).getContents().equals("ACTA DE RECIBIDO");
                equals22 = sheet.getCell(21, fil).getContents().equals("INSTALACION");
                equals23 = sheet.getCell(22, fil).getContents().equals("INICIO DE OPERACIÓN");
                equals24 = sheet.getCell(23, fil).getContents().equals("VENC. GARANTIA");
                equals25 = sheet.getCell(24, fil).getContents().equals("FABRICACION");
                equals26 = sheet.getCell(25, fil).getContents().equals("COSTO");
                equals27 = sheet.getCell(26, fil).getContents().equals("VIDA UTIL");
                equals28 = sheet.getCell(27, fil).getContents().equals("PROVEEDOR");
                equals29 = sheet.getCell(28, fil).getContents().equals("TEL PROVEEDOR");
                equals30 = sheet.getCell(29, fil).getContents().equals("CORREO PROVEEDOR");
                equals31 = sheet.getCell(30, fil).getContents().equals("REPRESENTANTE");
                equals32 = sheet.getCell(31, fil).getContents().equals("TEL REPRESENTANTE");
                equals33 = sheet.getCell(32, fil).getContents().equals("CORREO REPRESENTANTE");
                equals34 = sheet.getCell(33, fil).getContents().equals("FABRICANTE");
                equals35 = sheet.getCell(34, fil).getContents().equals("TEL FABRICANTE");
                equals36 = sheet.getCell(35, fil).getContents().equals("PAIS FABRICANTE");
                equals37 = sheet.getCell(36, fil).getContents().equals("FUENTE DE ALIMENTACION");
                equals38 = sheet.getCell(37, fil).getContents().equals("TEC. PREDOMINANTE");
                equals39 = sheet.getCell(38, fil).getContents().equals("VOLTAJE MAX");
                equals40 = sheet.getCell(39, fil).getContents().equals("VOLTAJE MIN.");
                equals41 = sheet.getCell(40, fil).getContents().equals("CORRIENTE MAX");
                equals42 = sheet.getCell(41, fil).getContents().equals("CORRIENTE MIN.");
                equals43 = sheet.getCell(42, fil).getContents().equals("POTENCIA");
                equals44 = sheet.getCell(43, fil).getContents().equals("FRECUENCIA");
                equals45 = sheet.getCell(44, fil).getContents().equals("PRESION");
                equals46 = sheet.getCell(45, fil).getContents().equals("VELOCIDAD");
                equals47 = sheet.getCell(46, fil).getContents().equals("PESO");
                equals48 = sheet.getCell(47, fil).getContents().equals("TEMPERATURA");
                equals49 = sheet.getCell(48, fil).getContents().equals("OTROS");
                equals50 = sheet.getCell(49, fil).getContents().equals("RANGO DE VOLTAJE");
                equals51 = sheet.getCell(50, fil).getContents().equals("RANGO DE CORRIENTE");
                equals52 = sheet.getCell(51, fil).getContents().equals("RANGO DE POTENCIA");
                equals53 = sheet.getCell(52, fil).getContents().equals("FRECUENCIA");
                equals54 = sheet.getCell(53, fil).getContents().equals("RANGO DE PRESION");
                equals55 = sheet.getCell(54, fil).getContents().equals("RANGO DE VELOCIDAD");
                equals56 = sheet.getCell(55, fil).getContents().equals("RANGO DE TEMPERATURA");
                equals57 = sheet.getCell(56, fil).getContents().equals("PESO");
                equals58 = sheet.getCell(57, fil).getContents().equals("RANGO DE HUMEDAD");
                equals59 = sheet.getCell(58, fil).getContents().equals("OTRAS RECOMENDACIONES DEL FABRICANTE");
                equals60 = sheet.getCell(59, fil).getContents().equals("MANUALES");
                equals61 = sheet.getCell(60, fil).getContents().equals("PLANOS");
                equals62 = sheet.getCell(61, fil).getContents().equals("CLASIFICACIÓN BIOMEDICA");
                equals63 = sheet.getCell(62, fil).getContents().equals("CLASIFICACIÓN POR RIESGO");
                equals64 = sheet.getCell(63, fil).getContents().equals("PERIODICIDAD DEL MANTENIMIENTO");
                equals65 = sheet.getCell(64, fil).getContents().equals("REQUIERE CALIBRACION");
                equals66 = sheet.getCell(65, fil).getContents().equals("PERIODICIDAD DE LA CALIBRACION");
                equals67 = sheet.getCell(66, fil).getContents().equals("COPIA REGISTRO SANITARIO");
                equals68 = sheet.getCell(67, fil).getContents().equals("COPIA PERMISO DE COMERCIALIZACION");
                equals69 = sheet.getCell(68, fil).getContents().equals("COPIA REGISTRO DE IMPORTACION");
                equals70 = sheet.getCell(69, fil).getContents().equals("COPIA FACTURA");
                equals71 = sheet.getCell(70, fil).getContents().equals("COPIA INGRESO ALMACEN");
                equals72 = sheet.getCell(71, fil).getContents().equals("COPIA DE ACTA DE RECIBIDO A SATISFACION POR EL PRESTADOR");
                equals73 = sheet.getCell(72, fil).getContents().equals("PROTOCOLO DE MANTENIMIENTO PREVENTIVO DEL FABRICANTE");
                equals74 = sheet.getCell(73, fil).getContents().equals("CRONOGRAMA DE MANTENIMIENTO POR EL TIEMPO DE GARANTIA");
                equals75 = sheet.getCell(74, fil).getContents().equals("GUIA RAPIDA DE OPERACIÓN");
                equals76 = sheet.getCell(75, fil).getContents().equals("COPIA DE ACTA DE RECIBO A SATISFACION POR EL OPERADOR");
                equals77 = sheet.getCell(76, fil).getContents().equals("RECOMENDACIONES DEL FABRICANTE PARA USO DE ACCESORIOS Y CONSUMIBLES DIFERENTES A LOS ENTREGADOS");
                equals78 = sheet.getCell(77, fil).getContents().equals("RECOMENDACIONES DEL FABRICANTE PARA CALIBRACION");
                equals79 = sheet.getCell(78, fil).getContents().equals("ESTIMATIVO DEL COSTO DE ACCESORIOS Y CONSUMIBLES");

            }

            if (equals1 == true && equals2 == true && equals3 == true && equals4 == true
                    && equals5 == true && equals6 == true && equals7 == true && equals8 == true
                    && equals9 == true && equals10 == true && equals11 == true && equals12 == true
                    && equals13 == true && equals14 == true
                    && equals15 == true && equals16 == true && equals17 == true && equals18 == true
                    && equals19 == true && equals20 == true
                    && equals21 == true && equals22 == true
                    && equals23 == true && equals24 == true
                    && equals25 == true && equals26 == true && equals27 == true && equals28 == true
                    && equals29 == true && equals30 == true
                    && equals31 == true && equals32 == true
                    && equals33 == true && equals34 == true
                    && equals35 == true && equals36 == true && equals37 == true && equals38 == true
                    && equals39 == true && equals40 == true
                    && equals41 == true && equals42 == true
                    && equals43 == true && equals44 == true
                    && equals45 == true && equals46 == true && equals47 == true && equals48 == true
                    && equals49 == true && equals50 == true
                    && equals51 == true && equals52 == true
                    && equals53 == true && equals54 == true
                    && equals55 == true && equals56 == true && equals57 == true && equals58 == true
                    && equals59 == true && equals60 == true
                    && equals61 == true && equals62 == true
                    && equals63 == true && equals64 == true
                    && equals65 == true && equals66 == true && equals67 == true && equals68 == true
                    && equals69 == true && equals70 == true
                    && equals71 == true && equals72 == true
                    && equals73 == true && equals74 == true
                    && equals75 == true && equals76 == true && equals77 == true && equals78 == true
                    && equals79 == true) {

                if (sheet.getRows() > 0) {

                    hojaDeVidaController = new HojaDeVidaController();
//
                    for (int fila = 2; fila < (sheet.getRows() ); fila++) { //recorremos las filas

                        direccion = sheet.getCell(0, fila).getContents();
                        telefono = sheet.getCell(1, fila).getContents();
                        email = sheet.getCell(2, fila).getContents();
                        codigoEquipo = sheet.getCell(3, fila).getContents();
                        rs = sheet.getCell(4, fila).getContents();
                        codigoPrestado = sheet.getCell(5, fila).getContents();
                        sede = sheet.getCell(6, fila).getContents();
                        distintivo = sheet.getCell(7, fila).getContents();
                        serie = sheet.getCell(8, fila).getContents();
                        invActivo = sheet.getCell(9, fila).getContents();
                        equipo = sheet.getCell(10, fila).getContents();
                        marca = sheet.getCell(11, fila).getContents();
                        modelo = sheet.getCell(12, fila).getContents();
                        tipo = sheet.getCell(13, fila).getContents();
                        servicio = sheet.getCell(14, fila).getContents();
                        ubicacion = sheet.getCell(15, fila).getContents();
                        tipoEquipo = sheet.getCell(16, fila).getContents();
                        formaAdquisicion = sheet.getCell(17, fila).getContents();
                        documentoAdquisicion = sheet.getCell(18, fila).getContents();
                        fechaCompra = sheet.getCell(19, fila).getContents();
                        actaRecibido = sheet.getCell(20, fila).getContents();
                        instalacion = sheet.getCell(21, fila).getContents();
                        inicioOperacion = sheet.getCell(22, fila).getContents();
                        vencGarantia = sheet.getCell(23, fila).getContents();
                        fabricacion = sheet.getCell(24, fila).getContents();
                        costo = sheet.getCell(25, fila).getContents();
                        vidaUtil = sheet.getCell(26, fila).getContents();
                        proveedor = sheet.getCell(27, fila).getContents();
                        telProveedor = sheet.getCell(28, fila).getContents();
                        correoProveedor = sheet.getCell(29, fila).getContents();
                        representante = sheet.getCell(30, fila).getContents();
                        telRepresentante = sheet.getCell(31, fila).getContents();
                        correoRepresentante = sheet.getCell(32, fila).getContents();
                        fabricante = sheet.getCell(33, fila).getContents();
                        telFabricante = sheet.getCell(34, fila).getContents();
                        pasFabricante = sheet.getCell(35, fila).getContents();
                        fuenteAlimentacion = sheet.getCell(36, fila).getContents();
                        tecPredominante = sheet.getCell(37, fila).getContents();
                        voltajeMax = sheet.getCell(38, fila).getContents();
                        voltajeMin = sheet.getCell(39, fila).getContents();
                        corrienteMax = sheet.getCell(40, fila).getContents();
                        corrienteMin = sheet.getCell(41, fila).getContents();
                        potencia = sheet.getCell(42, fila).getContents();
                        frencuencia = sheet.getCell(43, fila).getContents();
                        presion = sheet.getCell(44, fila).getContents();
                        velocidad = sheet.getCell(45, fila).getContents();
                        peso = sheet.getCell(46, fila).getContents();
                        temperatura = sheet.getCell(47, fila).getContents();
                        otros = sheet.getCell(48, fila).getContents();
                        rangoVoltaje = sheet.getCell(49, fila).getContents();
                        rangoCorriente = sheet.getCell(50, fila).getContents();
                        rangoPotencia = sheet.getCell(51, fila).getContents();
                        frecuencia2 = sheet.getCell(52, fila).getContents();
                        rangoPresion = sheet.getCell(53, fila).getContents();
                        rangoVelocidad = sheet.getCell(54, fila).getContents();
                        rangoTemperatura = sheet.getCell(55, fila).getContents();
                        peso2 = sheet.getCell(56, fila).getContents();
                        rangoHumedad = sheet.getCell(57, fila).getContents();
                        otrasRecomendaciones = sheet.getCell(58, fila).getContents();
                        manuales = sheet.getCell(59, fila).getContents();
                        planos = sheet.getCell(60, fila).getContents();
                        clasificacionBiomedica = sheet.getCell(61, fila).getContents();
                        clasificacionRiesgo = sheet.getCell(62, fila).getContents();
                        periodicidadMantenimiento = sheet.getCell(63, fila).getContents();
                        requiereCalibracion = sheet.getCell(64, fila).getContents();
                        periodicidadCalibracion = sheet.getCell(65, fila).getContents();
                        registroSanitario = sheet.getCell(66, fila).getContents();
                        permisoComercializacion = sheet.getCell(67, fila).getContents();
                        registroImportacion = sheet.getCell(68, fila).getContents();
                        factura = sheet.getCell(69, fila).getContents();
                        ingresoAlmacen = sheet.getCell(70, fila).getContents();
                        actaReciboSatisfacionPrestador = sheet.getCell(71, fila).getContents();
                        protocoloMantenimientoPreventivo = sheet.getCell(72, fila).getContents();
                        cronogramaMantenimientoGarantia = sheet.getCell(73, fila).getContents();
                        guiaRapidaOperacion = sheet.getCell(74, fila).getContents();
                        actaReciboSatisfacionOperador = sheet.getCell(75, fila).getContents();
                        recomendacionesFrabricanteUsoAccesoriosConsumibles = sheet.getCell(76, fila).getContents();
                        recomendacionesFabricanteCalibracion = sheet.getCell(77, fila).getContents();
                        estimativoCostoAccesoriosConsumibles = sheet.getCell(78, fila).getContents();
//
//
                        HojaDeVida_TO hojaDeVida = new HojaDeVida_TO();

                        hojaDeVida.setDireccion(direccion);
                        hojaDeVida.setTelefono(telefono);
                        hojaDeVida.setEmail(email);
                        hojaDeVida.setCodigoEquipo(codigoEquipo);
                        hojaDeVida.setRs(rs);
                        hojaDeVida.setCodigoPrestado(codigoPrestado);
                        hojaDeVida.setSede(sede);
                        hojaDeVida.setDistintivo(distintivo);
                        hojaDeVida.setSerie(serie);
                        hojaDeVida.setInvActivo(invActivo);
                        hojaDeVida.setEquipo(equipo);
                        hojaDeVida.setMarca(marca);
                        hojaDeVida.setModelo(modelo);
                        hojaDeVida.setTipo(tipo);
                        hojaDeVida.setServicio(servicio);
                        hojaDeVida.setUbicacion(ubicacion);
                        hojaDeVida.setTipoEquipo(tipoEquipo);
                        hojaDeVida.setFormaAdquisicion(formaAdquisicion);
                        hojaDeVida.setDocumentoAdquisicion(documentoAdquisicion);
                        hojaDeVida.setFechaCompra(fechaCompra);
                        hojaDeVida.setActaRecibido(actaRecibido);
                        hojaDeVida.setInstalacion(instalacion);
                        hojaDeVida.setInicioOperacion(inicioOperacion);
                        hojaDeVida.setVencGarantia(vencGarantia);
                        hojaDeVida.setFabricacion(fabricacion);
                        hojaDeVida.setCosto(costo);
                        hojaDeVida.setVidaUtil(vidaUtil);
                        hojaDeVida.setProveedor(proveedor);
                        hojaDeVida.setTelProveedor(telProveedor);
                        hojaDeVida.setCorreoProveedor(correoProveedor);
                        hojaDeVida.setRepresentante(representante);
                        hojaDeVida.setTelRepresentante(telRepresentante);
                        hojaDeVida.setCorreoRepresentante(correoRepresentante);
                        hojaDeVida.setFabricante(fabricante);
                        hojaDeVida.setTelFabricante(telFabricante);
                        hojaDeVida.setPasFabricante(pasFabricante);
                        hojaDeVida.setFuenteAlimentacion(fuenteAlimentacion);
                        hojaDeVida.setTecPredominante(tecPredominante);
                        hojaDeVida.setVoltajeMax(voltajeMax);
                        hojaDeVida.setVoltajeMin(voltajeMin);
                        hojaDeVida.setCorrienteMax(corrienteMax);
                        hojaDeVida.setCorrienteMin(corrienteMin);
                        hojaDeVida.setPotencia(potencia);
                        hojaDeVida.setFrencuencia(frencuencia);
                        hojaDeVida.setPresion(presion);
                        hojaDeVida.setVelocidad(velocidad);
                        hojaDeVida.setPeso(peso);
                        hojaDeVida.setTemperatura(temperatura);
                        hojaDeVida.setOtros(otros);
                        hojaDeVida.setRangoVoltaje(rangoVoltaje);
                        hojaDeVida.setRangoCorriente(rangoCorriente);
                        hojaDeVida.setRangoPotencia(rangoPotencia);
                        hojaDeVida.setFrecuencia2(frecuencia2);
                        hojaDeVida.setRangoPresion(rangoPresion);
                        hojaDeVida.setRangoVelocidad(rangoVelocidad);
                        hojaDeVida.setRangoTemperatura(rangoTemperatura);
                        hojaDeVida.setPeso2(peso2);
                        hojaDeVida.setRangoHumedad(rangoHumedad);
                        hojaDeVida.setManuales(manuales);
                        hojaDeVida.setPlanos(planos);
                        hojaDeVida.setClasificacionBiomedica(clasificacionBiomedica);
                        hojaDeVida.setClasificacionRiesgo(clasificacionRiesgo);
                        hojaDeVida.setPeriodicidadMantenimiento(periodicidadMantenimiento);
                        hojaDeVida.setRequiereCalibracion(requiereCalibracion);
                        hojaDeVida.setPeriodicidadCalibracion(periodicidadCalibracion);
                        hojaDeVida.setRegistroSanitario(registroSanitario);
                        hojaDeVida.setPermisoComercializacion(permisoComercializacion);
                        hojaDeVida.setRegistroImportacion(registroImportacion);
                        hojaDeVida.setFactura(factura);
                        hojaDeVida.setIngresoAlmacen(ingresoAlmacen);
                        hojaDeVida.setActaReciboSatisfacionPrestador(actaReciboSatisfacionPrestador);
                        hojaDeVida.setProtocoloMantenimientoPreventivo(protocoloMantenimientoPreventivo);
                        hojaDeVida.setCronogramaMantenimientoGarantia(cronogramaMantenimientoGarantia);
                        hojaDeVida.setGuiaRapidaOperacion(guiaRapidaOperacion);
                        hojaDeVida.setActaReciboSatisfacionOperador(actaReciboSatisfacionOperador);
                        hojaDeVida.setRecomendacionesFrabricanteUsoAccesoriosConsumibles(recomendacionesFrabricanteUsoAccesoriosConsumibles);
                        hojaDeVida.setRecomendacionesFabricanteCalibracion(recomendacionesFabricanteCalibracion);
                        hojaDeVida.setEstimativoCostoAccesoriosConsumibles(estimativoCostoAccesoriosConsumibles);

                        int valor = hojaDeVidaController.registrarHojaDeVida(hojaDeVida);

                        if (valor > 0) {
                            resultado++;
                        }
                    }
//                   
                }

            } else {
                JOptionPane.showMessageDialog(null, "Estructura Incorrecta");
                //Estructura incorrecta
            }
        } else {
            JOptionPane.showMessageDialog(null, "Archivo no encontrado");
            // archivo no encontrado
        }
        return resultado;
    }

}
