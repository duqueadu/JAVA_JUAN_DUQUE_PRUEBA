package com.com.smm.infrastructure.entities.Producto;

import com.com.smm.domain.model.Producto.Categoria;
import com.com.smm.domain.model.Producto.Imagen;
import jakarta.persistence.*;


@Entity

public class Imagenes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String url;
    private String descripcion;

 // Clave foránea que conecta con la entidad Producto
    private int producto;

    public Imagenes() {
    }

    public Imagenes(Long id, String url, String descripcion, int producto) {
        this.id = id;
        this.url = url;
        this.descripcion = descripcion;
        this.producto = producto;
    }
    public static Imagenes fromDomainModel(Imagen imagen) {
        return new Imagenes(imagen.getId(),imagen.getUrl(),imagen.getDescripcion(),imagen.getProducto());
    }

    public Imagen toDomainModel() {
        return new Imagen(id, url, descripcion,producto);
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
