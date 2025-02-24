package com.com.smm.infrastructure.entities.Pedidos;

import com.com.smm.domain.model.Pedidos.Envio;
import com.com.smm.domain.model.Producto.Categoria;
import jakarta.persistence.*;

import java.util.Date;


@Entity
@Table(name = "envios")
public class Envios {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @ManyToOne
        @JoinColumn(name = "pedido_id")
        private Pedidos pedidoId;
        @JoinColumn(name = "fecha_envio")
        private Date fechaEnvio;
        @Column(name = "fecha_estimada_entrega")
        @Temporal(TemporalType.DATE)
        private Date fechaEstimadaEntrega;

        @JoinColumn(name = "fecha_entrega")
        private Date fechaEntrega;
       
       
       

        @JoinColumn(name = "empresa_envio")
        private String empresaEnvio;
        
        @Column(name = "numero_seguimiento", length = 100)  // Correcto: simple campo de tipo String
        private String numeroSeguimiento;
        

        private String estado;

        

        public Envios() {
        }

        public Envios(Long id, Pedidos pedidoId, Date fechaEnvio, Date fechaEstimadaEntrega, Date fechaEntrega, String empresaEnvio, String numeroSeguimiento, String estado) {
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

        public static Envios fromDomainModel(Envio envio) {
            return new Envios(envio.getId(),envio.getPedidoId(),envio.getFechaEnvio(),envio.getFechaEstimadaEntrega(),envio.getFechaEntrega(),envio.getEmpresaEnvio(),envio.getNumeroSeguimiento(), envio.getEstado());
        }

        public Envio toDomainModel() {
            return new Envio( id,  pedidoId,  fechaEnvio,  fechaEstimadaEntrega,  fechaEntrega,  empresaEnvio,  numeroSeguimiento,  estado);
        }




}
