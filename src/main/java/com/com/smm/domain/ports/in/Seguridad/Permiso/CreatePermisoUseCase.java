package com.com.smm.domain.ports.in.Seguridad.Permiso;


import com.com.smm.infrastructure.entities.Seguridad.Permisos;


public interface CreatePermisoUseCase {
    Permisos createPermiso(Permisos permiso);
}