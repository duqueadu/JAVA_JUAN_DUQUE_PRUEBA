package com.com.smm.application.usecases.Seguridad.Permiso;


import com.com.smm.domain.ports.in.Seguridad.Permiso.DeletePermisoUseCase;
import com.com.smm.domain.ports.in.Seguridad.Rol.DeleteRolUseCase;
import com.com.smm.domain.ports.out.Seguridad.PermisosRepositoryPort;

public class DeletePermisoUseCaseImpl implements DeletePermisoUseCase {

    private final com.com.smm.domain.ports.out.Seguridad.PermisosRepositoryPort PermisosRepositoryPort;

    public DeletePermisoUseCaseImpl(PermisosRepositoryPort PermisosRepositoryPort) {
        this.PermisosRepositoryPort = PermisosRepositoryPort;
    }

    @Override
    public boolean deletePermiso(Long id) {
        return PermisosRepositoryPort.deleteById(id);
    }
}
