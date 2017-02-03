/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.utils;

import com.app.controller.EstadoController;
import com.app.controller.InventarioController;
import com.app.controller.MarcaController;
import com.app.controller.ModeloController;
import com.app.controller.SerieController;
import com.app.controller.ServicioController;
import com.app.controller.UbicacionController;
import com.app.models.Area_TO;
import com.app.models.EstadoInventario_TO;
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
        String a = "C:\\Users\\user\\Desktop/inventario.xls";
//
//        RegistrarInventario(a);
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

}
