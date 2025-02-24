package com.com.smm.domain.model.Pedidos;

import com.com.smm.domain.model.Producto.Categoria;
import com.com.smm.domain.model.Usuario.Usuario;
import com.com.smm.infrastructure.entities.Usuario.Usuarios;

import java.util.Date;


public class Pedido {


    private Long id;

    private int clienteId;
    private Date fechaPedido;
    private Long estado;
    private String total;

    private String direccion;


    private String metodoPago;


    public Pedido() {
    }

    public Pedido(Long id, int clienteId, Date fechaPedido, Long estado, String total, String direccion, String metodoPago) {
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

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public Long getEstado() {
        return estado;
    }

    public void setEstado(Long estado) {
        this.estado = estado;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
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
