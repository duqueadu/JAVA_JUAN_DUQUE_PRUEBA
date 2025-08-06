package com.com.smm.domain.model.Producto;


import com.com.smm.infrastructure.entities.Producto.Categorias;
import com.com.smm.infrastructure.entities.Producto.Imagenes;
import com.com.smm.infrastructure.entities.Producto.Proveedores;
import com.com.smm.infrastructure.entities.Producto.Subcategorias;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Producto {



    private Long id;

    private String nombre;

    private String descripcion;

    private BigDecimal precio;


    private Long subcategoriaId;

    private Long categoriaId;

    private Long proveedorId;

    private Long stock;

    private Date fechaCreacion;

    public Producto(Long id, String nombre, String descripcion, BigDecimal precio, Long subcategoriaId, Long categoriaId, Long proveedorId, Long stock, Date fechaCreacion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.subcategoriaId = subcategoriaId;
        this.categoriaId = categoriaId;
        this.proveedorId = proveedorId;
        this.stock = stock;
        this.fechaCreacion = fechaCreacion;
    }

    public Producto() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }


    public void setSubcategoriaId(Long subcategoriaId) {
        this.subcategoriaId = subcategoriaId;
    }

    public void setCategoriaId(Long categoriaId) {
        this.categoriaId = categoriaId;
    }

    public void setProveedorId(Long proveedorId) {
        this.proveedorId = proveedorId;
    }

    public void setStock(Long stock) {
        this.stock = stock;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public BigDecimal getPrecio() {
        return precio;
    }


    public Long getSubcategoriaId() {
        return subcategoriaId;
    }

    public Long getCategoriaId() {
        return categoriaId;
    }

    public Long getProveedorId() {
        return proveedorId;
    }

    public Long getStock() {
        return stock;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }
}
