package com.com.smm.application.usecases.Seguridad.Permiso;


import com.com.smm.domain.ports.in.Seguridad.Permiso.CreatePermisoUseCase;
import com.com.smm.domain.ports.out.Seguridad.PermisosRepositoryPort;
import com.com.smm.infrastructure.entities.Seguridad.Permisos;

public class CreatePermisosUseCaseImpl implements CreatePermisoUseCase {

    private final com.com.smm.domain.ports.out.Seguridad.PermisosRepositoryPort PermisosRepositoryPort;

    public CreatePermisosUseCaseImpl(PermisosRepositoryPort PermisosRepositoryPort) {
        this.PermisosRepositoryPort = PermisosRepositoryPort;
    }

    @Override
    public Permisos createPermiso(Permisos rol) {
        return PermisosRepositoryPort.save(rol);
    }
}