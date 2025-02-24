package com.com.smm.application.usecases.Seguridad.RolPermiso;


import com.com.smm.domain.ports.in.Seguridad.Permiso.CreatePermisoUseCase;
import com.com.smm.domain.ports.in.Seguridad.RolPermiso.CreateRolPermisoUseCase;
import com.com.smm.domain.ports.out.Seguridad.PermisosRepositoryPort;
import com.com.smm.domain.ports.out.Seguridad.RolPermisoRepositoryPort;
import com.com.smm.infrastructure.entities.Seguridad.Permisos;
import com.com.smm.infrastructure.entities.Seguridad.RolPermisos;

public class CreateRolPermisosUseCaseImpl implements CreateRolPermisoUseCase {

    private final RolPermisoRepositoryPort rolPermisosRepositoryPort;

    public CreateRolPermisosUseCaseImpl(RolPermisoRepositoryPort rolPermisosRepositoryPort) {
        this.rolPermisosRepositoryPort = rolPermisosRepositoryPort;
    }

    @Override
    public RolPermisos createRolPermiso(RolPermisos RolPermisos) {
        return rolPermisosRepositoryPort.save(RolPermisos);
    }
}