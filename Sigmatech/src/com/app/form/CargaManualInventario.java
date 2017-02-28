/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.form;

import com.app.controller.AreaController;
import com.app.controller.CiudadController;
import com.app.controller.DepartamentoController;
import com.app.controller.EstadoController;
import com.app.controller.InventarioController;
import com.app.controller.MarcaController;
import com.app.controller.ModeloController;
import com.app.controller.SerieController;
import com.app.controller.ServicioController;
import com.app.controller.UbicacionController;
import com.app.models.Area_TO;
import com.app.models.Ciudad_TO;
import com.app.models.Departamento_TO;
import com.app.models.EstadoInventario_TO;
import com.app.models.Inventario_TO;
import com.app.models.Marca_TO;
import com.app.models.Modelo_TO;
import com.app.models.Serie_TO;
import com.app.models.Servicio_TO;
import com.app.models.Ubicacion_TO;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class CargaManualInventario extends javax.swing.JInternalFrame {

    /**
     * Creates new form CargaManualInventario
     */
    public CargaManualInventario() throws SQLException {
        initComponents();

        init();
    }

    public void init() throws SQLException {

        try {
            List<Marca_TO> marcas = new ArrayList<>();
            List<Servicio_TO> servicios = new ArrayList<>();
            List<Ubicacion_TO> ubicacion = new ArrayList<>();
            List<Area_TO> areas = new ArrayList<>();
            List<EstadoInventario_TO> estadoInventarios = new ArrayList<>();

//           
            MarcaController marcaController = new MarcaController();
            ServicioController servicioController = new ServicioController();
            UbicacionController ubicacionController = new UbicacionController();
            AreaController areaController = new AreaController();
            EstadoController estadoController = new EstadoController();
//           
            marcas = marcaController.consultarMarca();
            servicios = servicioController.consultarServicio();
            ubicacion = ubicacionController.consultarUbicacion();
            areas = areaController.consultarArea();
            estadoInventarios = estadoController.consultarEstadoInventario();

            jComboBox1.addItem("Seleccione");
            jComboBox2.addItem("Seleccione");
            jComboBox3.addItem("Seleccione");
            jComboBox6.addItem("Seleccione");
            jComboBox7.addItem("Seleccione");

            for (int i = 0; i < marcas.size(); i++) {
                jComboBox1.addItem(marcas.get(i).getIdMarca() + " - " + marcas.get(i).getMarca());
            }

            for (int i = 0; i < servicios.size(); i++) {
                jComboBox2.addItem(servicios.get(i).getIdServicio() + " - " + servicios.get(i).getServicio());
            }
            for (int i = 0; i < ubicacion.size(); i++) {
                jComboBox3.addItem(ubicacion.get(i).getIdUbicacion() + " - " + ubicacion.get(i).getUbicacion());
            }
//
            for (int i = 0; i < areas.size(); i++) {
                jComboBox6.addItem(areas.get(i).getIdArea() + " - " + areas.get(i).getArea());
            }
//
            for (int i = 0; i < estadoInventarios.size(); i++) {
                jComboBox7.addItem(estadoInventarios.get(i).getIdEstado() + " - " + estadoInventarios.get(i).getEstadoInventario());
            }

        } catch (Exception ex) {
        }

    }

    ;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("Carga Manual de Inventarios");

        jLabel3.setText("Equipo:");

        jLabel4.setText("Marca:");

        jLabel5.setText("Modelo:");

        jLabel6.setText("Serie:");

        jLabel7.setText("N° Inventario:");

        jLabel8.setText("Servicio:");

        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel9.setText("Ubicación:");

        jLabel10.setText("Area:");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Aceptar.png"))); // NOI18N
        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Cancelar.png"))); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jLabel2.setText("Estado:");

        jLabel11.setText("Observación:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel2))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField6)
                            .addComponent(jTextField2)
                            .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox7, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.TRAILING, 0, 210, Short.MAX_VALUE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        try {
            jComboBox4.removeAllItems();
            jComboBox4.addItem("Seleccione");
            jComboBox4.addItem("0 - No Aplica");
            List<Modelo_TO> modelos = new ArrayList<>();
            ModeloController modeloController = new ModeloController();

            String idMarcaS = (String) jComboBox1.getSelectedItem();
            String[] idMarcaA = idMarcaS.split(" - ");
            int idMarca = Integer.parseInt(idMarcaA[0]);

            modelos = modeloController.consultarModelo(idMarca);

            for (int i = 0; i < modelos.size(); i++) {
                jComboBox4.addItem(modelos.get(i).getIdModelo() + " - " + modelos.get(i).getNombreModelo());
            }
        } catch (SQLException ex) {
            Logger.getLogger(CargaManualInventario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(CargaManualInventario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged

    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        try {
            jComboBox5.removeAllItems();
            jComboBox5.addItem("Seleccione");
            jComboBox5.addItem("0 - No Disponible");

            List<Serie_TO> series = new ArrayList<>();
            SerieController serieController = new SerieController();

            String idModeloS = (String) jComboBox4.getSelectedItem();
            String[] idModeloA = idModeloS.split(" - ");
            int idModelo = Integer.parseInt(idModeloA[0]);

            series = serieController.consultarSerie(idModelo);

            for (int i = 0; i < series.size(); i++) {
                jComboBox5.addItem(series.get(i).getIdSerie() + " - " + series.get(i).getNumeroSerie());
            }
        } catch (SQLException ex) {
            Logger.getLogger(CargaManualInventario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(CargaManualInventario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Inventario_TO inventario = new Inventario_TO();

        InventarioController inventarioController = null;
        inventarioController = new InventarioController();

        if (!(jTextField6.getText().equals(""))) {

            inventario.setEquipo((jTextField2.getText()));
            inventario.setnInventario(jTextField6.getText());
            inventario.setObservaciones(jTextField1.getText());

            String idMarcaS = (String) jComboBox1.getSelectedItem();

            if (idMarcaS.equals("Seleccione")) {
                Marca_TO marca = new Marca_TO(0);
                inventario.setMarca(marca);
            } else {
                String[] idMarcaA = idMarcaS.split(" - ");
                int idMarca = Integer.parseInt(idMarcaA[0]);
                Marca_TO marca = new Marca_TO(idMarca);
                inventario.setMarca(marca);
            }

            String idModeloS = (String) jComboBox4.getSelectedItem();

            if (idModeloS.equals("Seleccione")) {
                Modelo_TO modelo = new Modelo_TO(0);
                inventario.setModelo(modelo);
            } else {
                String[] idModeloA = idModeloS.split(" - ");
                int idModelo = Integer.parseInt(idModeloA[0]);
                Modelo_TO modelo = new Modelo_TO(idModelo);
                inventario.setModelo(modelo);
            }

            String idSerieS = (String) jComboBox5.getSelectedItem();

            if (idSerieS.equals("Seleccione")) {
                Serie_TO serie = new Serie_TO(0);
                inventario.setSerie(serie);
            } else {
                String[] idSerieA = idSerieS.split(" - ");
                int idSerie = Integer.parseInt(idSerieA[0]);
                Serie_TO serie = new Serie_TO(idSerie);
                inventario.setSerie(serie);
            }

            String idServicioS = (String) jComboBox2.getSelectedItem();

            if (idServicioS.equals("Seleccione")) {
                Servicio_TO servicio = new Servicio_TO(0);
                inventario.setServicio(servicio);
            } else {
                String[] idServicioA = idServicioS.split(" - ");
                int idServicio = Integer.parseInt(idServicioA[0]);
                Servicio_TO servicio = new Servicio_TO(idServicio);
                inventario.setServicio(servicio);
            }

            String idUbicacionS = (String) jComboBox3.getSelectedItem();

            if (idUbicacionS.equals("Seleccione")) {
                Ubicacion_TO ubicacion = new Ubicacion_TO(0);
                inventario.setUbicacion(ubicacion);
            } else {
                String[] idUbicacionA = idUbicacionS.split(" - ");
                int idUbicacion = Integer.parseInt(idUbicacionA[0]);
                Ubicacion_TO ubicacion = new Ubicacion_TO(idUbicacion);
                inventario.setUbicacion(ubicacion);
            }

            String idAreaS = (String) jComboBox6.getSelectedItem();

            if (idAreaS.equals("Seleccione")) {
                Area_TO area = new Area_TO(0);
                inventario.setArea(area);
            } else {
                String[] idAreaA = idAreaS.split(" - ");
                int idArea = Integer.parseInt(idAreaA[0]);
                Area_TO area = new Area_TO(idArea);
                inventario.setArea(area);
            }

            String idEstadoS = (String) jComboBox7.getSelectedItem();

            if (idEstadoS.equals("Seleccione")) {
                EstadoInventario_TO estado = new EstadoInventario_TO(0);
                inventario.setEstadoInventario(estado);
            } else {
                String[] idEstadoA = idEstadoS.split(" - ");
                int idEstado = Integer.parseInt(idEstadoA[0]);
                EstadoInventario_TO estado = new EstadoInventario_TO(idEstado);
                inventario.setEstadoInventario(estado);
            }

            try {
                int valor = inventarioController.registrarInventario(inventario);
                if (valor > 0) {
                    JOptionPane.showMessageDialog(null, "Registro realizado satisfactoriamente");

                    jTextField2.setText("");
                    jTextField6.setText("");
                    jTextField1.setText("");
                    jComboBox1.setSelectedIndex(0);
                    jComboBox2.setSelectedIndex(0);
                    jComboBox3.setSelectedIndex(0);
                    jComboBox6.setSelectedIndex(0);
                    jComboBox7.setSelectedIndex(0);
                    jComboBox4.removeAllItems();
                    jComboBox4.addItem("Seleccione");
                    jComboBox5.removeAllItems();
                    jComboBox5.addItem("Seleccione");

                }
            } catch (Exception ex) {

            }

        } else {
            JOptionPane.showMessageDialog(null, "El número de Inventario no puede estar vacio");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTextField2.setText("");
        jTextField6.setText("");
        jTextField1.setText("");
        jComboBox1.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);
        jComboBox3.setSelectedIndex(0);
        jComboBox6.setSelectedIndex(0);
        jComboBox7.setSelectedIndex(0);
        jComboBox4.removeAllItems();
        jComboBox4.addItem("Seleccione");
        jComboBox5.removeAllItems();
        jComboBox5.addItem("Seleccione");
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
