package com.com.smm.domain.model.Pedidos;

import jakarta.persistence.*;



public class MedioEnvio {


    private Long id;

    private String nombre;

    private String costo;

    public MedioEnvio() {
    }

    public MedioEnvio(Long id, String nombre, String costo) {
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


}
