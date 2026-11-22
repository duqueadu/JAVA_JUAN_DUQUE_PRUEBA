package com.com.smm.infrastructure.entities.Producto;

import com.com.smm.domain.model.Producto.EstadoSolicitud;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "interesado_arriendo")
public class InteresadoArriendo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "producto_id", nullable = false)
    private Long productoId;

    @Column(name = "usuario_id", nullable = false)
    private Long usuarioId;

    @Column(name = "tipo_documento", nullable = false, length = 20)
    private String tipoDocumento;

    @Column(name = "cedula", nullable = false, length = 20)
    private String cedula;

    @Column(name = "nacionalidad", nullable = false, length = 50)
    private String nacionalidad;

    @Column(name = "lugar_origen", nullable = false, length = 100)
    private String lugarOrigen;

    @Column(name = "ciudad_actual", nullable = false, length = 100)
    private String ciudadActual;

    @Column(name = "direccion_actual", nullable = false, length = 255)
    private String direccionActual;

    @Column(name = "empresa_trabajo", nullable = false, length = 150)
    private String empresaTrabajo;

    @Column(name = "cargo_ocupacion", nullable = false, length = 100)
    private String cargoOcupacion;

    @Column(name = "tiempo_laborando", nullable = false, length = 50)
    private String tiempoLaborando;

    @Column(name = "ingresos_mensuales", nullable = false, precision = 15, scale = 2)
    private BigDecimal ingresosMensuales;

    @Column(name = "duracion_contrato", nullable = false, length = 50)
    private String duracionContrato;

    @Column(name = "fecha_ingreso", nullable = false)
    private LocalDate fechaIngreso;

    @Column(name = "cantidad_habitantes", nullable = false)
    private Integer cantidadHabitantes;

    @Column(name = "tiene_mascotas", length = 20)
    private String tieneMascotas;

    @Column(name = "codeudor_nombre", nullable = false, length = 150)
    private String codeudorNombre;

    @Column(name = "codeudor_cedula", nullable = false, length = 20)
    private String codeudorCedula;

    @Column(name = "codeudor_telefono", nullable = false, length = 20)
    private String codeudorTelefono;

    @Column(name = "codeudor_empresa", nullable = false, length = 150)
    private String codeudorEmpresa;

    @Column(name = "codeudor_ingresos", nullable = false, precision = 15, scale = 2)
    private BigDecimal codeudorIngresos;

    @Column(name = "observaciones", columnDefinition = "TEXT")
    private String observaciones;

    @Enumerated(EnumType.STRING)
    @Column(name = "estado", nullable = false, length = 30)
    private EstadoSolicitud estado;

    @Column(name = "fecha_registro", updatable = false)
    private LocalDateTime fechaRegistro;

    public InteresadoArriendo() {
    }

    public InteresadoArriendo(
            Long id,
            Long productoId,
            Long usuarioId,
            String tipoDocumento,
            String cedula,
            String nacionalidad,
            String lugarOrigen,
            String ciudadActual,
            String direccionActual,
            String empresaTrabajo,
            String cargoOcupacion,
            String tiempoLaborando,
            BigDecimal ingresosMensuales,
            String duracionContrato,
            LocalDate fechaIngreso,
            Integer cantidadHabitantes,
            String tieneMascotas,
            String codeudorNombre,
            String codeudorCedula,
            String codeudorTelefono,
            String codeudorEmpresa,
            BigDecimal codeudorIngresos,
            String observaciones,
            EstadoSolicitud estado,
            LocalDateTime fechaRegistro
    ) {
        this.id = id;
        this.productoId = productoId;
        this.usuarioId = usuarioId;
        this.tipoDocumento = tipoDocumento;
        this.cedula = cedula;
        this.nacionalidad = nacionalidad;
        this.lugarOrigen = lugarOrigen;
        this.ciudadActual = ciudadActual;
        this.direccionActual = direccionActual;
        this.empresaTrabajo = empresaTrabajo;
        this.cargoOcupacion = cargoOcupacion;
        this.tiempoLaborando = tiempoLaborando;
        this.ingresosMensuales = ingresosMensuales;
        this.duracionContrato = duracionContrato;
        this.fechaIngreso = fechaIngreso;
        this.cantidadHabitantes = cantidadHabitantes;
        this.tieneMascotas = tieneMascotas;
        this.codeudorNombre = codeudorNombre;
        this.codeudorCedula = codeudorCedula;
        this.codeudorTelefono = codeudorTelefono;
        this.codeudorEmpresa = codeudorEmpresa;
        this.codeudorIngresos = codeudorIngresos;
        this.observaciones = observaciones;
        this.estado = estado;
        this.fechaRegistro = fechaRegistro;
    }

    @PrePersist
    public void prePersist() {
        if (this.fechaRegistro == null) {
            this.fechaRegistro = LocalDateTime.now();
        }
        if (this.estado == null) {
            this.estado = EstadoSolicitud.PENDIENTE;
        }
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

    public static InteresadoArriendo fromDomainModel(com.com.smm.domain.model.Producto.InteresadoArriendo domain) {
        if (domain == null) {
            return null;
        }
        return new InteresadoArriendo(
                domain.getId(),
                domain.getProductoId(),
                domain.getUsuarioId(),
                domain.getTipoDocumento(),
                domain.getCedula(),
                domain.getNacionalidad(),
                domain.getLugarOrigen(),
                domain.getCiudadActual(),
                domain.getDireccionActual(),
                domain.getEmpresaTrabajo(),
                domain.getCargoOcupacion(),
                domain.getTiempoLaborando(),
                domain.getIngresosMensuales(),
                domain.getDuracionContrato(),
                domain.getFechaIngreso(),
                domain.getCantidadHabitantes(),
                domain.getTieneMascotas(),
                domain.getCodeudorNombre(),
                domain.getCodeudorCedula(),
                domain.getCodeudorTelefono(),
                domain.getCodeudorEmpresa(),
                domain.getCodeudorIngresos(),
                domain.getObservaciones(),
                domain.getEstado(),
                domain.getFechaRegistro()
        );
    }

    public com.com.smm.domain.model.Producto.InteresadoArriendo toDomainModel() {
        com.com.smm.domain.model.Producto.InteresadoArriendo domain =
                new com.com.smm.domain.model.Producto.InteresadoArriendo();
        domain.setId(this.id);
        domain.setProductoId(this.productoId);
        domain.setUsuarioId(this.usuarioId);
        domain.setTipoDocumento(this.tipoDocumento);
        domain.setCedula(this.cedula);
        domain.setNacionalidad(this.nacionalidad);
        domain.setLugarOrigen(this.lugarOrigen);
        domain.setCiudadActual(this.ciudadActual);
        domain.setDireccionActual(this.direccionActual);
        domain.setEmpresaTrabajo(this.empresaTrabajo);
        domain.setCargoOcupacion(this.cargoOcupacion);
        domain.setTiempoLaborando(this.tiempoLaborando);
        domain.setIngresosMensuales(this.ingresosMensuales);
        domain.setDuracionContrato(this.duracionContrato);
        domain.setFechaIngreso(this.fechaIngreso);
        domain.setCantidadHabitantes(this.cantidadHabitantes);
        domain.setTieneMascotas(this.tieneMascotas);
        domain.setCodeudorNombre(this.codeudorNombre);
        domain.setCodeudorCedula(this.codeudorCedula);
        domain.setCodeudorTelefono(this.codeudorTelefono);
        domain.setCodeudorEmpresa(this.codeudorEmpresa);
        domain.setCodeudorIngresos(this.codeudorIngresos);
        domain.setObservaciones(this.observaciones);
        domain.setEstado(this.estado);
        domain.setFechaRegistro(this.fechaRegistro);
        return domain;
    }
}