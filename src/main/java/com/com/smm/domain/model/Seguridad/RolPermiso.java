package com.com.smm.domain.model.Seguridad;


import com.com.smm.infrastructure.entities.Seguridad.Permisos;
import com.com.smm.infrastructure.entities.Seguridad.Roles;
import jakarta.persistence.*;

public class RolPermiso {


    private Long id;


    private Roles rol;


    private Permisos permiso;

    public RolPermiso(Long id, Roles rol, Permisos permiso) {
        this.id = id;
        this.rol = rol;
        this.permiso = permiso;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Roles getRol() {
        return rol;
    }

    public void setRol(Roles rol) {
        this.rol = rol;
    }

    public Permisos getPermiso() {
        return permiso;
    }

    public void setPermiso(Permisos permiso) {
        this.permiso = permiso;
    }
}
