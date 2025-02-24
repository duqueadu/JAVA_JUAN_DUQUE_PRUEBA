package com.com.smm.application.usecases.Seguridad.Rol;


import com.com.smm.domain.ports.in.Seguridad.Rol.DeleteRolUseCase;
import com.com.smm.domain.ports.out.Seguridad.RolesRepositoryPort;

public class DeleteRolUseCaseImpl implements DeleteRolUseCase {

    private final com.com.smm.domain.ports.out.Seguridad.RolesRepositoryPort RolesRepositoryPort;

    public DeleteRolUseCaseImpl(RolesRepositoryPort RolesRepositoryPort) {
        this.RolesRepositoryPort = RolesRepositoryPort;
    }

    @Override
    public boolean deleteRol(Long id) {
        return RolesRepositoryPort.deleteById(id);
    }
}
