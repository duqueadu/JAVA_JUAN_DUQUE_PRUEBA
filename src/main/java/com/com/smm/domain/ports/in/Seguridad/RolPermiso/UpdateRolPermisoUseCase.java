package com.com.smm.domain.ports.in.Seguridad.RolPermiso;

import com.com.smm.domain.model.Seguridad.Permiso;
import com.com.smm.domain.model.Seguridad.RolPermiso;
import com.com.smm.infrastructure.entities.Seguridad.Permisos;
import com.com.smm.infrastructure.entities.Seguridad.RolPermisos;

import java.util.Optional;

public interface UpdateRolPermisoUseCase {
    Optional<RolPermiso> updateRolPermiso(Long id, RolPermisos updatedRolPermiso);
}
