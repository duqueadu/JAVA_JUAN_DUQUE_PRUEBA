package com.com.smm.infrastructure.entities.Pedidos;

import com.com.smm.domain.model.Pedidos.Pedido;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "pedidos")
public class Pedidos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cliente_id", nullable = false)
    private int clienteId;

    @Column(name = "fecha_pedido", nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime fechaPedido;

    @Column(nullable = false)
    private Long estado;

    @Column(nullable = false)
    private int total;

    @Column(nullable = false)
    private String direccion;

    @Column(name = "metodo_pago")
    private String metodoPago;

    // Constructor vacío
    public Pedidos() {
        // opcional: puedes poner this.fechaPedido = LocalDateTime.now(); aquí
    }

    // Se ejecuta justo antes de insertar en la base de datos
    @PrePersist
    protected void onCreate() {
        if (this.fechaPedido == null) {
            this.fechaPedido = LocalDateTime.now();
        }
    }

    // Constructor completo
    public Pedidos(Long id, int clienteId, LocalDateTime fechaPedido, Long estado, int total, String direccion, String metodoPago) {
        this.id = id;
        this.clienteId = clienteId;
        this.fechaPedido = fechaPedido;
        this.estado = estado;
        this.total = total;
        this.direccion = direccion;
        this.metodoPago = metodoPago;
    }

    // Getters y setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public int getClienteId() { return clienteId; }
    public void setClienteId(int clienteId) { this.clienteId = clienteId; }

    public LocalDateTime getFechaPedido() { return fechaPedido; }
    public void setFechaPedido(LocalDateTime fechaPedido) { this.fechaPedido = fechaPedido; }

    public Long getEstado() { return estado; }
    public void setEstado(Long estado) { this.estado = estado; }

    public int getTotal() { return total; }
    public void setTotal(int total) { this.total = total; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getMetodoPago() { return metodoPago; }
    public void setMetodoPago(String metodoPago) { this.metodoPago = metodoPago; }

    // Convertir desde modelo de dominio
    public static Pedidos fromDomainModel(Pedido pedido) {
        return new Pedidos(
                pedido.getId(),
                pedido.getClienteId(),
                pedido.getFechaPedido(),
                pedido.getEstado(),
                pedido.getTotal(),
                pedido.getDireccion(),
                pedido.getMetodoPago()
        );
    }

    // Convertir a modelo de dominio
    public Pedido toDomainModel() {
        return new Pedido(id, clienteId, fechaPedido, estado, total, direccion, metodoPago);
    }
}
