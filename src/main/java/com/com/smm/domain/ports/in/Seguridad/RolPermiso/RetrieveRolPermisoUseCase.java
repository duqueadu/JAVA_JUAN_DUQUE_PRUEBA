package com.com.smm.domain.ports.in.Seguridad.RolPermiso;

import com.com.smm.domain.model.Seguridad.Permiso;
import com.com.smm.domain.model.Seguridad.RolPermiso;
import com.com.smm.infrastructure.entities.Seguridad.RolPermisos;

import java.util.List;
import java.util.Optional;

public interface RetrieveRolPermisoUseCase {
    Optional<RolPermiso> getRolPermisoById(Long id);
    List<RolPermiso> getAllRolPermiso();
}
