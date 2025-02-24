package com.com.smm.application.usecases.Seguridad.Permiso;

import com.com.smm.domain.model.Seguridad.Permiso;
import com.com.smm.domain.ports.in.Seguridad.Permiso.UpdatePermisoUseCase;

import com.com.smm.domain.ports.out.Seguridad.PermisosRepositoryPort;
import com.com.smm.infrastructure.entities.Seguridad.Permisos;

import java.util.Optional;

public class UpdatePermisoUseCaseImpl implements UpdatePermisoUseCase {

    private final PermisosRepositoryPort PermisoRepositoryPort;

    public UpdatePermisoUseCaseImpl(PermisosRepositoryPort PermisoRepositoryPort) {
        this.PermisoRepositoryPort = PermisoRepositoryPort;
    }

    @Override
    public Optional<Permiso> updatePermiso(Long id, Permisos updatePermiso) {
        return PermisoRepositoryPort.update(updatePermiso);
    }
}
