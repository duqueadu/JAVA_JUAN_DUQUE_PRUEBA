package com.com.smm.infrastructure.entities.Usuario;

import com.com.smm.domain.model.Usuario.Usuario;
import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Date;

@Entity
@Table(name = "usuarios")
public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(nullable = false, unique = true, length = 100)
    private String email;

    @Column(nullable = false)
    private String contrasena;

    @Column(name = "rol_id")
    private Long rol;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_creacion", updatable = false)
    private Date fechaCreacion;

    @Column(length = 20)
    private String telefono; // Mejor String para soportar códigos de área o formato internacional (+57)

    // Constructor vacío requerido por JPA
    public Usuarios() {
    }

    // Constructor completo
    public Usuarios(Long id, String nombre, String email, String contrasena, Long rol, Date fechaCreacion, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.contrasena = contrasena;
        this.rol = rol;
        this.fechaCreacion = fechaCreacion;
        this.telefono = telefono;
    }

    // Asignar fecha de creación automáticamente antes de insertar
    @PrePersist
    public void prePersist() {
        if (this.fechaCreacion == null) {
            this.fechaCreacion = new Date();
        }
    }

    // Mapeo desde el Dominio (Hexagonal)
    public static Usuarios fromDomainModel(Usuario usuario) {
        if (usuario == null) {
            return null;
        }
        return new Usuarios(
                usuario.getId(),
                usuario.getNombre(),
                usuario.getEmail(),
                usuario.getContrasena(),
                usuario.getRol(),
                usuario.getFechaCreacion(),
                usuario.getTelefono() != null ? usuario.getTelefono().toString() : null
        );
    }

    // Mapeo hacia el Dominio (Hexagonal)
    public Usuario toDomainModel() {
        return new Usuario(
                this.id,
                this.nombre,
                this.email,
                this.contrasena,
                this.rol,
                this.fechaCreacion,
                this.telefono
        );
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Long getRol() {
        return rol;
    }

    public void setRol(Long rol) {
        this.rol = rol;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}