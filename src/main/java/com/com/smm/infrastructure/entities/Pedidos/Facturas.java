package com.com.smm.infrastructure.entities.Pedidos;

import jakarta.persistence.*;


@Entity
@Table(name = "facturas")
public class Facturas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "pedido_id")
    private int pedidoId;

    private Long total;
    private String estado;

    public Facturas() {
    }

    public Facturas(Long id, int pedidoId, Long total, String estado) {
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

    public void setPeridoId(int pedidoId) {
        this.pedidoId = pedidoId;
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

    public static Facturas fromDomainModel(com.com.smm.domain.model.Pedidos.Factura factura) {
        return new Facturas(factura.getId(),factura.getPeridoId(),factura.getTotal(),factura.getEstado());
    }

    public com.com.smm.domain.model.Pedidos.Factura toDomainModel() {
        return new com.com.smm.domain.model.Pedidos.Factura( id,  pedidoId,  total,  estado) ;
    }


}
