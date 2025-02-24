package com.com.smm.domain.ports.in.Seguridad.RolPermiso;


import com.com.smm.infrastructure.entities.Seguridad.Permisos;
import com.com.smm.infrastructure.entities.Seguridad.RolPermisos;


public interface CreateRolPermisoUseCase {
        RolPermisos  createRolPermiso(RolPermisos rolPermisos);
}