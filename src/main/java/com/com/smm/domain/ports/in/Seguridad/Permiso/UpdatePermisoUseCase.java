package com.com.smm.domain.ports.in.Seguridad.Permiso;

import com.com.smm.domain.model.Seguridad.Permiso;
import com.com.smm.domain.model.Seguridad.Rol;
import com.com.smm.infrastructure.entities.Seguridad.Permisos;
import com.com.smm.infrastructure.entities.Seguridad.Roles;

import java.util.Optional;

public interface UpdatePermisoUseCase {
    Optional<Permiso> updatePermiso(Long id, Permisos updatedPermiso);
}
