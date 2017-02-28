/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.models;

/**
 *
 * @author user
 */
public class HojaDeVida_TO {

    private int idHoraDeVida;

    private String direccion;

    private String telefono;

    private String email;

    private String codigoEquipo;

    private String rs;

    private String codigoPrestado;

    private String sede;

    private String distintivo;

    private String serie;

    private String invActivo;

    private String equipo;

    private String marca;

    private String modelo;

    private String tipo;

    private String servicio;

    private String ubicacion;

    private String tipoEquipo;

    private String formaAdquisicion;

    private String documentoAdquisicion;

    private String fechaCompra;

    private String actaRecibido;

    private String instalacion;

    private String inicioOperacion;

    private String vencGarantia;

    private String fabricacion;

    private String costo;

    private String vidaUtil;

    private String proveedor;

    private String telProveedor;

    private String correoProveedor;

    private String representante;

    private String telRepresentante;

    private String correoRepresentante;

    private String fabricante;

    private String telFabricante;

    private String pasFabricante;

    private String fuenteAlimentacion;

    private String tecPredominante;

    private String voltajeMax;

    private String voltajeMin;

    private String corrienteMax;

    private String corrienteMin;

    private String potencia;

    private String frencuencia;

    private String presion;

    private String velocidad;

    private String peso;

    private String temperatura;

    private String otros;

    private String rangoVoltaje;

    private String rangoCorriente;

    private String rangoPotencia;

    private String frecuencia2;

    private String rangoPresion;

    private String rangoVelocidad;

    private String rangoTemperatura;

    private String peso2;

    private String rangoHumedad;

    private String otrasRecomendaciones;

    private String manuales;

    private String planos;

    private String clasificacionBiomedica;

    private String clasificacionRiesgo;

    private String periodicidadMantenimiento;

    private String requiereCalibracion;

    private String periodicidadCalibracion;

    private String registroSanitario;

    private String permisoComercializacion;

    private String registroImportacion;

    private String factura;

    private String ingresoAlmacen;

    private String actaReciboSatisfacionPrestador;

    private String protocoloMantenimientoPreventivo;

    private String cronogramaMantenimientoGarantia;

    private String guiaRapidaOperacion;

    private String actaReciboSatisfacionOperador;

    private String recomendacionesFrabricanteUsoAccesoriosConsumibles;

    private String recomendacionesFabricanteCalibracion;

    private String estimativoCostoAccesoriosConsumibles;

    //Constructores
    public HojaDeVida_TO() {
    }

    public HojaDeVida_TO(int idHoraDeVida) {
        this.idHoraDeVida = idHoraDeVida;
    }

    public HojaDeVida_TO(int idHoraDeVida, String direccion, String telefono, String email, String codigoEquipo, String rs, String codigoPrestado, String sede, String distintivo, String serie, String invActivo, String equipo, String marca, String modelo, String tipo, String servicio, String ubicacion, String tipoEquipo, String formaAdquisicion, String documentoAdquisicion, String fechaCompra, String actaRecibido, String instalacion, String inicioOperacion, String vencGarantia, String fabricacion, String costo, String vidaUtil, String proveedor, String telProveedor, String correoProveedor, String representante, String telRepresentante, String correoRepresentante, String fabricante, String telFabricante, String pasFabricante, String fuenteAlimentacion, String tecPredominante, String voltajeMax, String voltajeMin, String corrienteMax, String corrienteMin, String potencia, String frencuencia, String presion, String velocidad, String peso, String temperatura, String otros, String rangoVoltaje, String rangoCorriente, String rangoPotencia, String frecuencia2, String rangoPresion, String rangoVelocidad, String rangoTemperatura, String peso2, String rangoHumedad, String manuales, String planos, String clasificacionBiomedica, String clasificacionRiesgo, String periodicidadMantenimiento, String requiereCalibracion, String periodicidadCalibracion, String registroSanitario, String permisoComercializacion, String registroImportacion, String factura, String ingresoAlmacen, String actaReciboSatisfacionPrestador, String protocoloMantenimientoPreventivo, String cronogramaMantenimientoGarantia, String guiaRapidaOperacion, String actaReciboSatisfacionOperador, String recomendacionesFrabricanteUsoAccesoriosConsumibles, String recomendacionesFabricanteCalibracion, String estimativoCostoAccesoriosConsumibles) {
        this.idHoraDeVida = idHoraDeVida;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.codigoEquipo = codigoEquipo;
        this.rs = rs;
        this.codigoPrestado = codigoPrestado;
        this.sede = sede;
        this.distintivo = distintivo;
        this.serie = serie;
        this.invActivo = invActivo;
        this.equipo = equipo;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.servicio = servicio;
        this.ubicacion = ubicacion;
        this.tipoEquipo = tipoEquipo;
        this.formaAdquisicion = formaAdquisicion;
        this.documentoAdquisicion = documentoAdquisicion;
        this.fechaCompra = fechaCompra;
        this.actaRecibido = actaRecibido;
        this.instalacion = instalacion;
        this.inicioOperacion = inicioOperacion;
        this.vencGarantia = vencGarantia;
        this.fabricacion = fabricacion;
        this.costo = costo;
        this.vidaUtil = vidaUtil;
        this.proveedor = proveedor;
        this.telProveedor = telProveedor;
        this.correoProveedor = correoProveedor;
        this.representante = representante;
        this.telRepresentante = telRepresentante;
        this.correoRepresentante = correoRepresentante;
        this.fabricante = fabricante;
        this.telFabricante = telFabricante;
        this.pasFabricante = pasFabricante;
        this.fuenteAlimentacion = fuenteAlimentacion;
        this.tecPredominante = tecPredominante;
        this.voltajeMax = voltajeMax;
        this.voltajeMin = voltajeMin;
        this.corrienteMax = corrienteMax;
        this.corrienteMin = corrienteMin;
        this.potencia = potencia;
        this.frencuencia = frencuencia;
        this.presion = presion;
        this.velocidad = velocidad;
        this.peso = peso;
        this.temperatura = temperatura;
        this.otros = otros;
        this.rangoVoltaje = rangoVoltaje;
        this.rangoCorriente = rangoCorriente;
        this.rangoPotencia = rangoPotencia;
        this.frecuencia2 = frecuencia2;
        this.rangoPresion = rangoPresion;
        this.rangoVelocidad = rangoVelocidad;
        this.rangoTemperatura = rangoTemperatura;
        this.peso2 = peso2;
        this.rangoHumedad = rangoHumedad;
        this.manuales = manuales;
        this.planos = planos;
        this.clasificacionBiomedica = clasificacionBiomedica;
        this.clasificacionRiesgo = clasificacionRiesgo;
        this.periodicidadMantenimiento = periodicidadMantenimiento;
        this.requiereCalibracion = requiereCalibracion;
        this.periodicidadCalibracion = periodicidadCalibracion;
        this.registroSanitario = registroSanitario;
        this.permisoComercializacion = permisoComercializacion;
        this.registroImportacion = registroImportacion;
        this.factura = factura;
        this.ingresoAlmacen = ingresoAlmacen;
        this.actaReciboSatisfacionPrestador = actaReciboSatisfacionPrestador;
        this.protocoloMantenimientoPreventivo = protocoloMantenimientoPreventivo;
        this.cronogramaMantenimientoGarantia = cronogramaMantenimientoGarantia;
        this.guiaRapidaOperacion = guiaRapidaOperacion;
        this.actaReciboSatisfacionOperador = actaReciboSatisfacionOperador;
        this.recomendacionesFrabricanteUsoAccesoriosConsumibles = recomendacionesFrabricanteUsoAccesoriosConsumibles;
        this.recomendacionesFabricanteCalibracion = recomendacionesFabricanteCalibracion;
        this.estimativoCostoAccesoriosConsumibles = estimativoCostoAccesoriosConsumibles;
    }

    //Getters and Setters
    public int getIdHoraDeVida() {
        return idHoraDeVida;
    }

    public void setIdHoraDeVida(int idHoraDeVida) {
        this.idHoraDeVida = idHoraDeVida;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCodigoEquipo() {
        return codigoEquipo;
    }

    public void setCodigoEquipo(String codigoEquipo) {
        this.codigoEquipo = codigoEquipo;
    }

    public String getRs() {
        return rs;
    }

    public void setRs(String rs) {
        this.rs = rs;
    }

    public String getCodigoPrestado() {
        return codigoPrestado;
    }

    public void setCodigoPrestado(String codigoPrestado) {
        this.codigoPrestado = codigoPrestado;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getDistintivo() {
        return distintivo;
    }

    public void setDistintivo(String distintivo) {
        this.distintivo = distintivo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getInvActivo() {
        return invActivo;
    }

    public void setInvActivo(String invActivo) {
        this.invActivo = invActivo;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTipoEquipo() {
        return tipoEquipo;
    }

    public void setTipoEquipo(String tipoEquipo) {
        this.tipoEquipo = tipoEquipo;
    }

    public String getFormaAdquisicion() {
        return formaAdquisicion;
    }

    public void setFormaAdquisicion(String formaAdquisicion) {
        this.formaAdquisicion = formaAdquisicion;
    }

    public String getDocumentoAdquisicion() {
        return documentoAdquisicion;
    }

    public void setDocumentoAdquisicion(String documentoAdquisicion) {
        this.documentoAdquisicion = documentoAdquisicion;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public String getActaRecibido() {
        return actaRecibido;
    }

    public void setActaRecibido(String actaRecibido) {
        this.actaRecibido = actaRecibido;
    }

    public String getInstalacion() {
        return instalacion;
    }

    public void setInstalacion(String instalacion) {
        this.instalacion = instalacion;
    }

    public String getInicioOperacion() {
        return inicioOperacion;
    }

    public void setInicioOperacion(String inicioOperacion) {
        this.inicioOperacion = inicioOperacion;
    }

    public String getVencGarantia() {
        return vencGarantia;
    }

    public void setVencGarantia(String vencGarantia) {
        this.vencGarantia = vencGarantia;
    }

    public String getFabricacion() {
        return fabricacion;
    }

    public void setFabricacion(String fabricacion) {
        this.fabricacion = fabricacion;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getVidaUtil() {
        return vidaUtil;
    }

    public void setVidaUtil(String vidaUtil) {
        this.vidaUtil = vidaUtil;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getTelProveedor() {
        return telProveedor;
    }

    public void setTelProveedor(String telProveedor) {
        this.telProveedor = telProveedor;
    }

    public String getCorreoProveedor() {
        return correoProveedor;
    }

    public void setCorreoProveedor(String correoProveedor) {
        this.correoProveedor = correoProveedor;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public String getTelRepresentante() {
        return telRepresentante;
    }

    public void setTelRepresentante(String telRepresentante) {
        this.telRepresentante = telRepresentante;
    }

    public String getCorreoRepresentante() {
        return correoRepresentante;
    }

    public void setCorreoRepresentante(String correoRepresentante) {
        this.correoRepresentante = correoRepresentante;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getTelFabricante() {
        return telFabricante;
    }

    public void setTelFabricante(String telFabricante) {
        this.telFabricante = telFabricante;
    }

    public String getPasFabricante() {
        return pasFabricante;
    }

    public void setPasFabricante(String pasFabricante) {
        this.pasFabricante = pasFabricante;
    }

    public String getFuenteAlimentacion() {
        return fuenteAlimentacion;
    }

    public void setFuenteAlimentacion(String fuenteAlimentacion) {
        this.fuenteAlimentacion = fuenteAlimentacion;
    }

    public String getTecPredominante() {
        return tecPredominante;
    }

    public void setTecPredominante(String tecPredominante) {
        this.tecPredominante = tecPredominante;
    }

    public String getVoltajeMax() {
        return voltajeMax;
    }

    public void setVoltajeMax(String voltajeMax) {
        this.voltajeMax = voltajeMax;
    }

    public String getVoltajeMin() {
        return voltajeMin;
    }

    public void setVoltajeMin(String voltajeMin) {
        this.voltajeMin = voltajeMin;
    }

    public String getCorrienteMax() {
        return corrienteMax;
    }

    public void setCorrienteMax(String corrienteMax) {
        this.corrienteMax = corrienteMax;
    }

    public String getCorrienteMin() {
        return corrienteMin;
    }

    public void setCorrienteMin(String corrienteMin) {
        this.corrienteMin = corrienteMin;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public String getFrencuencia() {
        return frencuencia;
    }

    public void setFrencuencia(String frencuencia) {
        this.frencuencia = frencuencia;
    }

    public String getPresion() {
        return presion;
    }

    public void setPresion(String presion) {
        this.presion = presion;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getOtros() {
        return otros;
    }

    public void setOtros(String otros) {
        this.otros = otros;
    }

    public String getRangoVoltaje() {
        return rangoVoltaje;
    }

    public void setRangoVoltaje(String rangoVoltaje) {
        this.rangoVoltaje = rangoVoltaje;
    }

    public String getRangoCorriente() {
        return rangoCorriente;
    }

    public void setRangoCorriente(String rangoCorriente) {
        this.rangoCorriente = rangoCorriente;
    }

    public String getRangoPotencia() {
        return rangoPotencia;
    }

    public void setRangoPotencia(String rangoPotencia) {
        this.rangoPotencia = rangoPotencia;
    }

    public String getFrecuencia2() {
        return frecuencia2;
    }

    public void setFrecuencia2(String frecuencia2) {
        this.frecuencia2 = frecuencia2;
    }

    public String getRangoPresion() {
        return rangoPresion;
    }

    public void setRangoPresion(String rangoPresion) {
        this.rangoPresion = rangoPresion;
    }

    public String getRangoVelocidad() {
        return rangoVelocidad;
    }

    public void setRangoVelocidad(String rangoVelocidad) {
        this.rangoVelocidad = rangoVelocidad;
    }

    public String getRangoTemperatura() {
        return rangoTemperatura;
    }

    public void setRangoTemperatura(String rangoTemperatura) {
        this.rangoTemperatura = rangoTemperatura;
    }

    public String getPeso2() {
        return peso2;
    }

    public void setPeso2(String peso2) {
        this.peso2 = peso2;
    }

    public String getRangoHumedad() {
        return rangoHumedad;
    }

    public void setRangoHumedad(String rangoHumedad) {
        this.rangoHumedad = rangoHumedad;
    }

    public String getManuales() {
        return manuales;
    }

    public void setManuales(String manuales) {
        this.manuales = manuales;
    }

    public String getPlanos() {
        return planos;
    }

    public void setPlanos(String planos) {
        this.planos = planos;
    }

    public String getClasificacionBiomedica() {
        return clasificacionBiomedica;
    }

    public void setClasificacionBiomedica(String clasificacionBiomedica) {
        this.clasificacionBiomedica = clasificacionBiomedica;
    }

    public String getClasificacionRiesgo() {
        return clasificacionRiesgo;
    }

    public void setClasificacionRiesgo(String clasificacionRiesgo) {
        this.clasificacionRiesgo = clasificacionRiesgo;
    }

    public String getPeriodicidadMantenimiento() {
        return periodicidadMantenimiento;
    }

    public void setPeriodicidadMantenimiento(String periodicidadMantenimiento) {
        this.periodicidadMantenimiento = periodicidadMantenimiento;
    }

    public String getRequiereCalibracion() {
        return requiereCalibracion;
    }

    public void setRequiereCalibracion(String requiereCalibracion) {
        this.requiereCalibracion = requiereCalibracion;
    }

    public String getPeriodicidadCalibracion() {
        return periodicidadCalibracion;
    }

    public void setPeriodicidadCalibracion(String periodicidadCalibracion) {
        this.periodicidadCalibracion = periodicidadCalibracion;
    }

    public String getRegistroSanitario() {
        return registroSanitario;
    }

    public void setRegistroSanitario(String registroSanitario) {
        this.registroSanitario = registroSanitario;
    }

    public String getPermisoComercializacion() {
        return permisoComercializacion;
    }

    public void setPermisoComercializacion(String permisoComercializacion) {
        this.permisoComercializacion = permisoComercializacion;
    }

    public String getRegistroImportacion() {
        return registroImportacion;
    }

    public void setRegistroImportacion(String registroImportacion) {
        this.registroImportacion = registroImportacion;
    }

    public String getFactura() {
        return factura;
    }

    public void setFactura(String factura) {
        this.factura = factura;
    }

    public String getIngresoAlmacen() {
        return ingresoAlmacen;
    }

    public void setIngresoAlmacen(String ingresoAlmacen) {
        this.ingresoAlmacen = ingresoAlmacen;
    }

    public String getActaReciboSatisfacionPrestador() {
        return actaReciboSatisfacionPrestador;
    }

    public void setActaReciboSatisfacionPrestador(String actaReciboSatisfacionPrestador) {
        this.actaReciboSatisfacionPrestador = actaReciboSatisfacionPrestador;
    }

    public String getProtocoloMantenimientoPreventivo() {
        return protocoloMantenimientoPreventivo;
    }

    public void setProtocoloMantenimientoPreventivo(String protocoloMantenimientoPreventivo) {
        this.protocoloMantenimientoPreventivo = protocoloMantenimientoPreventivo;
    }

    public String getCronogramaMantenimientoGarantia() {
        return cronogramaMantenimientoGarantia;
    }

    public void setCronogramaMantenimientoGarantia(String cronogramaMantenimientoGarantia) {
        this.cronogramaMantenimientoGarantia = cronogramaMantenimientoGarantia;
    }

    public String getGuiaRapidaOperacion() {
        return guiaRapidaOperacion;
    }

    public void setGuiaRapidaOperacion(String guiaRapidaOperacion) {
        this.guiaRapidaOperacion = guiaRapidaOperacion;
    }

    public String getActaReciboSatisfacionOperador() {
        return actaReciboSatisfacionOperador;
    }

    public void setActaReciboSatisfacionOperador(String actaReciboSatisfacionOperador) {
        this.actaReciboSatisfacionOperador = actaReciboSatisfacionOperador;
    }

    public String getRecomendacionesFrabricanteUsoAccesoriosConsumibles() {
        return recomendacionesFrabricanteUsoAccesoriosConsumibles;
    }

    public void setRecomendacionesFrabricanteUsoAccesoriosConsumibles(String recomendacionesFrabricanteUsoAccesoriosConsumibles) {
        this.recomendacionesFrabricanteUsoAccesoriosConsumibles = recomendacionesFrabricanteUsoAccesoriosConsumibles;
    }

    public String getRecomendacionesFabricanteCalibracion() {
        return recomendacionesFabricanteCalibracion;
    }

    public void setRecomendacionesFabricanteCalibracion(String recomendacionesFabricanteCalibracion) {
        this.recomendacionesFabricanteCalibracion = recomendacionesFabricanteCalibracion;
    }

    public String getEstimativoCostoAccesoriosConsumibles() {
        return estimativoCostoAccesoriosConsumibles;
    }

    public void setEstimativoCostoAccesoriosConsumibles(String estimativoCostoAccesoriosConsumibles) {
        this.estimativoCostoAccesoriosConsumibles = estimativoCostoAccesoriosConsumibles;
    }

    public String getOtrasRecomendaciones() {
        return otrasRecomendaciones;
    }

    public void setOtrasRecomendaciones(String otrasRecomendaciones) {
        this.otrasRecomendaciones = otrasRecomendaciones;
    }

    @Override
    public String toString() {
        return "HojaDeVida_TO{" + "idHoraDeVida=" + idHoraDeVida + ", direccion=" + direccion + ", telefono=" + telefono + ", email=" + email + ", codigoEquipo=" + codigoEquipo + ", rs=" + rs + ", codigoPrestado=" + codigoPrestado + ", sede=" + sede + ", distintivo=" + distintivo + ", serie=" + serie + ", invActivo=" + invActivo + ", equipo=" + equipo + ", marca=" + marca + ", modelo=" + modelo + ", tipo=" + tipo + ", servicio=" + servicio + ", ubicacion=" + ubicacion + ", tipoEquipo=" + tipoEquipo + ", formaAdquisicion=" + formaAdquisicion + ", documentoAdquisicion=" + documentoAdquisicion + ", fechaCompra=" + fechaCompra + ", actaRecibido=" + actaRecibido + ", instalacion=" + instalacion + ", inicioOperacion=" + inicioOperacion + ", vencGarantia=" + vencGarantia + ", fabricacion=" + fabricacion + ", costo=" + costo + ", vidaUtil=" + vidaUtil + ", proveedor=" + proveedor + ", telProveedor=" + telProveedor + ", correoProveedor=" + correoProveedor + ", representante=" + representante + ", telRepresentante=" + telRepresentante + ", correoRepresentante=" + correoRepresentante + ", fabricante=" + fabricante + ", telFabricante=" + telFabricante + ", pasFabricante=" + pasFabricante + ", fuenteAlimentacion=" + fuenteAlimentacion + ", tecPredominante=" + tecPredominante + ", voltajeMax=" + voltajeMax + ", voltajeMin=" + voltajeMin + ", corrienteMax=" + corrienteMax + ", corrienteMin=" + corrienteMin + ", potencia=" + potencia + ", frencuencia=" + frencuencia + ", presion=" + presion + ", velocidad=" + velocidad + ", peso=" + peso + ", temperatura=" + temperatura + ", otros=" + otros + ", rangoVoltaje=" + rangoVoltaje + ", rangoCorriente=" + rangoCorriente + ", rangoPotencia=" + rangoPotencia + ", frecuencia2=" + frecuencia2 + ", rangoPresion=" + rangoPresion + ", rangoVelocidad=" + rangoVelocidad + ", rangoTemperatura=" + rangoTemperatura + ", peso2=" + peso2 + ", rangoHumedad=" + rangoHumedad + ", otrasRecomendaciones=" + otrasRecomendaciones + ", manuales=" + manuales + ", planos=" + planos + ", clasificacionBiomedica=" + clasificacionBiomedica + ", clasificacionRiesgo=" + clasificacionRiesgo + ", periodicidadMantenimiento=" + periodicidadMantenimiento + ", requiereCalibracion=" + requiereCalibracion + ", periodicidadCalibracion=" + periodicidadCalibracion + ", registroSanitario=" + registroSanitario + ", permisoComercializacion=" + permisoComercializacion + ", registroImportacion=" + registroImportacion + ", factura=" + factura + ", ingresoAlmacen=" + ingresoAlmacen + ", actaReciboSatisfacionPrestador=" + actaReciboSatisfacionPrestador + ", protocoloMantenimientoPreventivo=" + protocoloMantenimientoPreventivo + ", cronogramaMantenimientoGarantia=" + cronogramaMantenimientoGarantia + ", guiaRapidaOperacion=" + guiaRapidaOperacion + ", actaReciboSatisfacionOperador=" + actaReciboSatisfacionOperador + ", recomendacionesFrabricanteUsoAccesoriosConsumibles=" + recomendacionesFrabricanteUsoAccesoriosConsumibles + ", recomendacionesFabricanteCalibracion=" + recomendacionesFabricanteCalibracion + ", estimativoCostoAccesoriosConsumibles=" + estimativoCostoAccesoriosConsumibles + '}';
    }

}
