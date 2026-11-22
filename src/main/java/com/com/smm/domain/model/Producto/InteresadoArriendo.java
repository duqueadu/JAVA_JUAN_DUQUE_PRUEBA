package com.com.smm.domain.model.Producto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class InteresadoArriendo {

    private Long id;
    private Long productoId;
    private Long usuarioId;
    private String tipoDocumento;
    private String cedula;
    private String nacionalidad;
    private String lugarOrigen;
    private String ciudadActual;
    private String direccionActual;
    private String empresaTrabajo;
    private String cargoOcupacion;
    private String tiempoLaborando;
    private BigDecimal ingresosMensuales;
    private String duracionContrato;
    private LocalDate fechaIngreso;
    private Integer cantidadHabitantes;
    private String tieneMascotas;
    private String codeudorNombre;
    private String codeudorCedula;
    private String codeudorTelefono;
    private String codeudorEmpresa;
    private BigDecimal codeudorIngresos;
    private String observaciones;
    private EstadoSolicitud estado;
    private LocalDateTime fechaRegistro;

    public void inicializarNuevaSolicitud() {
        this.estado = EstadoSolicitud.PENDIENTE;
        this.fechaRegistro = LocalDateTime.now();
    }

    public void cambiarEstado(EstadoSolicitud nuevoEstado) {
        if (this.estado == EstadoSolicitud.APROBADO && nuevoEstado == EstadoSolicitud.PENDIENTE) {
            throw new IllegalStateException("No se puede revertir una solicitud ya aprobada a PENDIENTE.");
        }
        this.estado = nuevoEstado;
    }

    public boolean tieneCapacidadFinancieraMinima(BigDecimal canonMensual) {
        if (canonMensual == null || ingresosMensuales == null) return false;
        return ingresosMensuales.compareTo(canonMensual.multiply(BigDecimal.TWO)) >= 0;
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Long getProductoId() { return productoId; }
    public void setProductoId(Long productoId) { this.productoId = productoId; }
    public Long getUsuarioId() { return usuarioId; }
    public void setUsuarioId(Long usuarioId) { this.usuarioId = usuarioId; }
    public String getTipoDocumento() { return tipoDocumento; }
    public void setTipoDocumento(String tipoDocumento) { this.tipoDocumento = tipoDocumento; }
    public String getCedula() { return cedula; }
    public void setCedula(String cedula) { this.cedula = cedula; }
    public String getNacionalidad() { return nacionalidad; }
    public void setNacionalidad(String nacionalidad) { this.nacionalidad = nacionalidad; }
    public String getLugarOrigen() { return lugarOrigen; }
    public void setLugarOrigen(String lugarOrigen) { this.lugarOrigen = lugarOrigen; }
    public String getCiudadActual() { return ciudadActual; }
    public void setCiudadActual(String ciudadActual) { this.ciudadActual = ciudadActual; }
    public String getDireccionActual() { return direccionActual; }
    public void setDireccionActual(String direccionActual) { this.direccionActual = direccionActual; }
    public String getEmpresaTrabajo() { return empresaTrabajo; }
    public void setEmpresaTrabajo(String empresaTrabajo) { this.empresaTrabajo = empresaTrabajo; }
    public String getCargoOcupacion() { return cargoOcupacion; }
    public void setCargoOcupacion(String cargoOcupacion) { this.cargoOcupacion = cargoOcupacion; }
    public String getTiempoLaborando() { return tiempoLaborando; }
    public void setTiempoLaborando(String tiempoLaborando) { this.tiempoLaborando = tiempoLaborando; }
    public BigDecimal getIngresosMensuales() { return ingresosMensuales; }
    public void setIngresosMensuales(BigDecimal ingresosMensuales) { this.ingresosMensuales = ingresosMensuales; }
    public String getDuracionContrato() { return duracionContrato; }
    public void setDuracionContrato(String duracionContrato) { this.duracionContrato = duracionContrato; }
    public LocalDate getFechaIngreso() { return fechaIngreso; }
    public void setFechaIngreso(LocalDate fechaIngreso) { this.fechaIngreso = fechaIngreso; }
    public Integer getCantidadHabitantes() { return cantidadHabitantes; }
    public void setCantidadHabitantes(Integer cantidadHabitantes) { this.cantidadHabitantes = cantidadHabitantes; }
    public String getTieneMascotas() { return tieneMascotas; }
    public void setTieneMascotas(String tieneMascotas) { this.tieneMascotas = tieneMascotas; }
    public String getCodeudorNombre() { return codeudorNombre; }
    public void setCodeudorNombre(String codeudorNombre) { this.codeudorNombre = codeudorNombre; }
    public String getCodeudorCedula() { return codeudorCedula; }
    public void setCodeudorCedula(String codeudorCedula) { this.codeudorCedula = codeudorCedula; }
    public String getCodeudorTelefono() { return codeudorTelefono; }
    public void setCodeudorTelefono(String codeudorTelefono) { this.codeudorTelefono = codeudorTelefono; }
    public String getCodeudorEmpresa() { return codeudorEmpresa; }
    public void setCodeudorEmpresa(String codeudorEmpresa) { this.codeudorEmpresa = codeudorEmpresa; }
    public BigDecimal getCodeudorIngresos() { return codeudorIngresos; }
    public void setCodeudorIngresos(BigDecimal codeudorIngresos) { this.codeudorIngresos = codeudorIngresos; }
    public String getObservaciones() { return observaciones; }
    public void setObservaciones(String observaciones) { this.observaciones = observaciones; }
    public EstadoSolicitud getEstado() { return estado; }
    public void setEstado(EstadoSolicitud estado) { this.estado = estado; }
    public LocalDateTime getFechaRegistro() { return fechaRegistro; }
    public void setFechaRegistro(LocalDateTime fechaRegistro) { this.fechaRegistro = fechaRegistro; }
}