package com.com.smm.domain.model.Producto;


import com.com.smm.infrastructure.entities.Producto.Productos;

public class Imagen {

    private Long id;
    private String url;
    private String descripcion;
    private int producto;
    public Imagen(){

    }
    public Imagen(Long id, String url, String descripcion, int producto) {
        this.id = id;
        this.url = url;
        this.descripcion = descripcion;
        this.producto = producto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getProducto() {
        return producto;
    }

    public void setProducto(int producto) {
        this.producto = producto;
    }
}
