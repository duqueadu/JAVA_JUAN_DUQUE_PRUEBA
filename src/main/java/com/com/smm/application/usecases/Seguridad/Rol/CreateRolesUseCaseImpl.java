package com.com.smm.application.usecases.Seguridad.Rol;


import com.com.smm.domain.ports.in.Seguridad.Rol.CreateRolesUseCase;
import com.com.smm.domain.ports.out.Seguridad.RolesRepositoryPort;
import com.com.smm.infrastructure.entities.Seguridad.Roles;

public class CreateRolesUseCaseImpl implements CreateRolesUseCase {

    private final com.com.smm.domain.ports.out.Seguridad.RolesRepositoryPort RolesRepositoryPort;

    public CreateRolesUseCaseImpl(RolesRepositoryPort RolesRepositoryPort) {
        this.RolesRepositoryPort = RolesRepositoryPort;
    }

    @Override
    public Roles createRol(Roles rol) {
        return RolesRepositoryPort.save(rol);
    }
}