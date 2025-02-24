package com.com.smm.application.usecases.Seguridad.RolPermiso;

import com.com.smm.domain.model.Seguridad.Permiso;
import com.com.smm.domain.model.Seguridad.RolPermiso;
import com.com.smm.domain.ports.in.Seguridad.Permiso.UpdatePermisoUseCase;
import com.com.smm.domain.ports.in.Seguridad.RolPermiso.UpdateRolPermisoUseCase;
import com.com.smm.domain.ports.out.Seguridad.PermisosRepositoryPort;
import com.com.smm.domain.ports.out.Seguridad.RolPermisoRepositoryPort;
import com.com.smm.infrastructure.entities.Seguridad.Permisos;
import com.com.smm.infrastructure.entities.Seguridad.RolPermisos;

import java.util.Optional;

public class UpdateRolPermisoUseCaseImpl implements UpdateRolPermisoUseCase {

    private final RolPermisoRepositoryPort rolPermisoRepositoryPort;

    public UpdateRolPermisoUseCaseImpl(RolPermisoRepositoryPort rolPermisoRepositoryPort) {
        this.rolPermisoRepositoryPort = rolPermisoRepositoryPort;
    }

    @Override
    public Optional<RolPermiso> updateRolPermiso(Long id, RolPermisos updateRolPermiso) {
        return rolPermisoRepositoryPort.update(updateRolPermiso);
    }
}
