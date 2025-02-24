package com.com.smm.infrastructure.entities.Pedidos;

import com.com.smm.domain.model.Pedidos.DetallePedido;
import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "detalle_pedidos")
public class DetallePedidos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO_INCREMENT
    @Column(name = "id")
    private Long id;

    @Column(name = "pedido_id", nullable = false)
    private Long pedidoId;  // Store Pedido ID as Long

    @Column(name = "producto_id", nullable = false)
    private Long productoId; // Store Producto ID as Long

    @Column(name = "cantidad", nullable = false)
    private Integer cantidad;

    @Column(name = "precio_unitario", precision = 10, scale = 2, nullable = false)
    private BigDecimal precioUnitario;

    // Default constructor
    public DetallePedidos() {
    }

    // Constructor with all parameters
    public DetallePedidos(Long id, Long pedidoId, Long productoId, Integer cantidad, BigDecimal precioUnitario) {
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

    // Convert from domain model to entity
    public static DetallePedidos fromDomainModel(DetallePedido detallePedido) {
        return new DetallePedidos(
                detallePedido.getId(),
                detallePedido.getPedidoId(),  // Directly using Pedido ID
                detallePedido.getProductoId(), // Directly using Producto ID
                detallePedido.getCantidad(),
                detallePedido.getPrecioUnitario()
        );
    }

    // Convert from entity to domain model
    public DetallePedido toDomainModel() {
        return new DetallePedido(
                id,
                pedidoId,  // Using Pedido ID
                productoId, // Using Producto ID
                cantidad,
                precioUnitario
        );
    }
}
