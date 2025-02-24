package com.com.smm.domain.model.Pedidos;

import com.com.smm.infrastructure.entities.Pedidos.Pedidos;

import java.util.Date;


public class Envio {


    private Long id;

    private Pedidos pedidoId;

    private Date fechaEnvio;

    private Date fechaEstimadaEntrega;

    private Date fechaEntrega;



    private String empresaEnvio;

    private String numeroSeguimiento;

    private String estado;

    public Envio(Long id, Pedidos pedidoId, Date fechaEnvio, Date fechaEstimadaEntrega, Date fechaEntrega, String empresaEnvio, String numeroSeguimiento, String estado) {
        this.id = id;
        this.pedidoId = pedidoId;
        this.fechaEnvio = fechaEnvio;
        this.fechaEstimadaEntrega = fechaEstimadaEntrega;
        this.fechaEntrega = fechaEntrega;

        this.empresaEnvio = empresaEnvio;
        this.numeroSeguimiento = numeroSeguimiento;
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pedidos getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(Pedidos pedidoId) {
        this.pedidoId = pedidoId;
    }

    public Date getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(Date fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public Date getFechaEstimadaEntrega() {
        return fechaEstimadaEntrega;
    }

    public void setFechaEstimadaEntrega(Date fechaEstimadaEntrega) {
        this.fechaEstimadaEntrega = fechaEstimadaEntrega;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }


    public String getEmpresaEnvio() {
        return empresaEnvio;
    }

    public void setEmpresaEnvio(String empresaEnvio) {
        this.empresaEnvio = empresaEnvio;
    }

    public String getNumeroSeguimiento() {
        return numeroSeguimiento;
    }

    public void setNumeroSeguimiento(String numeroSeguimiento) {
        this.numeroSeguimiento = numeroSeguimiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }



}
