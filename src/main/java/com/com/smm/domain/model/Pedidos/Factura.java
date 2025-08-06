package com.com.smm.domain.model.Pedidos;

import com.com.smm.domain.model.Producto.Categoria;
import com.com.smm.infrastructure.entities.Pedidos.Pedidos;
import jakarta.persistence.*;


public class Factura {


    private Long id;
    private int pedidoId;
    private Long total;
    private String estado;

    public Factura(Long id, int pedidoId, Long total, String estado) {
        this.id = id;
        this.pedidoId = pedidoId;
        this.total = total;
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getPeridoId() {
        return pedidoId;
    }

    public void setPeridoId(int peridoId) {
        this.pedidoId = peridoId;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
