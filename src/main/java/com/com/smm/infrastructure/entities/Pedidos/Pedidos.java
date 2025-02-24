package com.com.smm.infrastructure.entities.Pedidos;

import com.com.smm.domain.model.Pedidos.Pedido;
import com.com.smm.domain.model.Producto.Categoria;
import com.com.smm.domain.model.Usuario.Usuario;
import com.com.smm.infrastructure.entities.Usuario.Usuarios;
import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.math.BigDecimal;
import java.util.Date;




    @Entity
    @Table(name = "pedidos")
    public class Pedidos {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "cliente_id", nullable = false)
        private int clienteId;

        @Column(name = "fecha_pedido")
        private Date fechaPedido;

        private Long estado;

        private String total;

        private String direccion;


        @Column(name = "metodo_pago")
        private String metodoPago;


        public Pedidos() {
    }

    public Pedidos(Long id, int clienteId, Date fechaPedido, Long estado, String total, String direccion, String metodoPago) {
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

    public static Pedidos fromDomainModel(Pedido pedido) {
        return new Pedidos();
    }

    public Pedido toDomainModel() {
        return new Pedido( id,    clienteId,  fechaPedido,  estado,  total,  direccion,  metodoPago);
    }


}
