package com.com.smm.infrastructure.entities.Pedidos;

import com.com.smm.domain.model.Pedidos.Envio;
import com.com.smm.domain.model.Pedidos.MedioEnvio;
import jakarta.persistence.*;


@Entity
@Table(name = "MedioEnvios")
public class MedioEnvios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String costo;

    public MedioEnvios() {
    }

    public MedioEnvios(Long id, String nombre, String costo) {
        this.id = id;
        this.nombre = nombre;
        this.costo = costo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }


    public static MedioEnvios fromDomainModel(MedioEnvio MedioEnvio) {
        return new MedioEnvios(MedioEnvio.getId(),MedioEnvio.getNombre(),MedioEnvio.getCosto());
    }

    public MedioEnvio toDomainModel() {
        return new MedioEnvio( id,  nombre,  costo);
    }


}
