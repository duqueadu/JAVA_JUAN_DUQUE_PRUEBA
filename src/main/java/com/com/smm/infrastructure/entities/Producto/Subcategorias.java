package com.com.smm.infrastructure.entities.Producto;

import com.com.smm.domain.model.Producto.Subcategoria;
import jakarta.persistence.*;



@Entity
@Table(name = "subcategorias")

public class Subcategorias {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String descripcion;


    public Subcategorias() {
    }



    public Subcategorias(Long id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public static Subcategorias fromDomainModel(Subcategoria subcategoria) {
        return new Subcategorias(subcategoria.getId(),subcategoria.getNombre(),subcategoria.getDescripcion());
    }

    public Subcategoria toDomainModel() {
        return new Subcategoria(id, nombre, descripcion);
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = this.descripcion;
    }


}