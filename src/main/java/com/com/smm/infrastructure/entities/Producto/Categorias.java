package com.com.smm.infrastructure.entities.Producto;

import com.com.smm.domain.model.Producto.Categoria;
import jakarta.persistence.*;


@Entity
@Table(name = "categoria")
public class Categorias {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String descripcion;

    public Categorias() {
    }

    public Categorias(Long id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public static Categorias fromDomainModel(Categoria permiso) {
        return new Categorias(permiso.getId(), permiso.getNombre(), permiso.getDescripcion());
    }

    public Categoria toDomainModel() {
        return new Categoria(id, nombre, descripcion);
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
        this.descripcion = descripcion;
    }
}
