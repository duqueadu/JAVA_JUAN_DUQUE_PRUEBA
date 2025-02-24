package com.com.smm.application.usecases.Seguridad.Rol;

import com.com.smm.domain.model.Seguridad.Rol;
import com.com.smm.domain.ports.in.Seguridad.Rol.UpdateRolUseCase;
import com.com.smm.domain.ports.out.Seguridad.RolesRepositoryPort;
import com.com.smm.infrastructure.entities.Seguridad.Roles;

import java.util.Optional;

public class UpdateRolUseCaseImpl implements UpdateRolUseCase {

    private final RolesRepositoryPort rolRepositoryPort;

    public UpdateRolUseCaseImpl(RolesRepositoryPort rolRepositoryPort) {
        this.rolRepositoryPort = rolRepositoryPort;
    }

    @Override
    public Optional<Rol> updateRol(Long id, Roles updateRol) {
        return rolRepositoryPort.update(updateRol);
    }
}
