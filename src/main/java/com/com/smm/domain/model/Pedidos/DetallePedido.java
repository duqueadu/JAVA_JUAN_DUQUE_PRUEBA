package com.com.smm.domain.model.Pedidos;

import java.math.BigDecimal;

public class DetallePedido {

    private Long id;
    private Long pedidoId;  // Store Pedido ID as Long
    private Long productoId; // Store Producto ID as Long
    private Integer cantidad;
    private BigDecimal precioUnitario;


    // Constructor
    public DetallePedido(Long id, Long pedidoId, Long productoId, Integer cantidad, BigDecimal precioUnitario) {
        this.id = id;
        this.pedidoId = pedidoId;
        this.productoId = productoId;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(Long pedidoId) {
        this.pedidoId = pedidoId;
    }

    public Long getProductoId() {
        return productoId;
    }

    public void setProductoId(Long productoId) {
        this.productoId = productoId;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(BigDecimal precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
}
