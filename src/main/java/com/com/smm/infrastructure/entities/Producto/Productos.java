package com.com.smm.infrastructure.entities.Producto;

import com.com.smm.domain.model.Producto.Imagen;
import com.com.smm.domain.model.Producto.Producto;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "productos")
public class Productos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "descripcion", nullable = false, columnDefinition = "TEXT")
    private String descripcion;

    @Column(name = "precio", nullable = false, precision = 10, scale = 2)
    private BigDecimal precio;


    @Column(name = "subcategoria_id")
    private Long subcategoriaId;

    @Column(name = "categoria_id")
    private Long categoriaId;

    @Column(name = "proveedor_id")
    private Long proveedorId;

    @Column(name = "stock")
    private Long stock;

    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;

    // Constructor predeterminado
    public Productos() {
    }

    // Constructor parametrizado

    public Productos(Long id, String nombre, String descripcion, BigDecimal precio, Long subcategoriaId, Long categoriaId, Long proveedorId, Long stock, Date fechaCreacion) {
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


    // Getters y Setters

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

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }



    public Long getSubcategoriaId() {
        return subcategoriaId;
    }

    public void setSubcategoriaId(Long subcategoriaId) {
        this.subcategoriaId = subcategoriaId;
    }

    public Long getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(Long categoriaId) {
        this.categoriaId = categoriaId;
    }

    public Long getProveedorId() {
        return proveedorId;
    }

    public void setProveedorId(Long proveedorId) {
        this.proveedorId = proveedorId;
    }

    public Long getStock() {
        return stock;
    }

    public void setStock(Long stock) {
        this.stock = stock;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public static Productos fromDomainModel(Producto producto) {
        return new Productos(
                producto.getId(),
                producto.getNombre(),
                producto.getDescripcion(),
                producto.getPrecio(),
                producto.getSubcategoriaId(),   // Ajustado para obtener el ID de la subcategoría
                producto.getCategoriaId(),      // Ajustado para obtener el ID de la categoría
                producto.getProveedorId(),      // Ajustado para obtener el ID del proveedor
                producto.getStock(),
                producto.getFechaCreacion()
        );
    }


    public Producto toDomainModel() {
        return new Producto(
                this.id,
                this.nombre,
                this.descripcion,
                this.precio,
                this.subcategoriaId,   // ID de la subcategoría
                this.categoriaId,      // ID de la categoría
                this.proveedorId,      // ID del proveedor
                this.stock,
                this.fechaCreacion
        );
    }



}


