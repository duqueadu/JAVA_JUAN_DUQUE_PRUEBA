package com.com.smm.application.usecases.Seguridad.RolPermiso;


import com.com.smm.domain.ports.in.Seguridad.RolPermiso.DeleteRolPermisoUseCase;
import com.com.smm.domain.ports.out.Seguridad.PermisosRepositoryPort;
import com.com.smm.domain.ports.out.Seguridad.RolPermisoRepositoryPort;

public class DeleteRolPermisoUseCaseImpl implements DeleteRolPermisoUseCase  {

    private final RolPermisoRepositoryPort rolPermisosRepositoryPort;

    public DeleteRolPermisoUseCaseImpl( RolPermisoRepositoryPort rolPermisosRepositoryPort) {
        this.rolPermisosRepositoryPort = rolPermisosRepositoryPort;

    }


    @Override
    public boolean deleteRolPermiso(Long id) {
        return rolPermisosRepositoryPort.deleteById(id);
    }
}
