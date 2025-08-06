package com.com.smm.domain.model.Pedidos;

import com.com.smm.domain.model.Producto.Categoria;
import com.com.smm.domain.model.Usuario.Usuario;
import com.com.smm.infrastructure.entities.Usuario.Usuarios;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;
import java.util.Date;


public class Pedido {


    private Long id;

    private int clienteId;
    private LocalDateTime fechaPedido;
    private Long estado;
    private int total;

    private String direccion;


    private String metodoPago;


    public Pedido() {
    }

    public Pedido(Long id, int clienteId, LocalDateTime  fechaPedido, Long estado, int total, String direccion, String metodoPago) {
        this.id = id;
        this.clienteId = clienteId;
        this.fechaPedido = fechaPedido;
        this.estado = estado;
        this.total = total;
        this.direccion = direccion;
        this.metodoPago = metodoPago;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public LocalDateTime  getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(LocalDateTime  fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public Long getEstado() {
        return estado;
    }

    public void setEstado(Long estado) {
        this.estado = estado;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }




}
