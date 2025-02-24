package com.com.smm.application.services.Seguridad;


import com.com.smm.domain.model.Seguridad.Rol;
import com.com.smm.domain.ports.in.Seguridad.Rol.CreateRolesUseCase;
import com.com.smm.domain.ports.in.Seguridad.Rol.DeleteRolUseCase;
import com.com.smm.domain.ports.in.Seguridad.Rol.RetrieveRolUseCase;
import com.com.smm.domain.ports.in.Seguridad.Rol.UpdateRolUseCase;
import com.com.smm.infrastructure.entities.Seguridad.Roles;

import java.util.List;
import java.util.Optional;

public class RolesService implements CreateRolesUseCase, RetrieveRolUseCase, UpdateRolUseCase, DeleteRolUseCase {

    private final CreateRolesUseCase createRolesUseCase;
    private final RetrieveRolUseCase retrieveRolesUseCase;
    private final UpdateRolUseCase updateRolesUseCase;
    private final DeleteRolUseCase deleteRolesUseCase;

    public RolesService(CreateRolesUseCase createRolesUseCase, RetrieveRolUseCase retrieveRolesUseCase,
                        UpdateRolUseCase updateRolesUseCase, DeleteRolUseCase deleteRolesUseCase
                        ) {
        this.createRolesUseCase = createRolesUseCase;
        this.retrieveRolesUseCase = retrieveRolesUseCase;
        this.updateRolesUseCase = updateRolesUseCase;
        this.deleteRolesUseCase = deleteRolesUseCase;
    }

    @Override
    public Roles createRol(Roles Roles) {
        return createRolesUseCase.createRol(Roles);
    }

    @Override
    public Optional<Rol> getRolById(Long id) {
        return retrieveRolesUseCase.getRolById(id);
    }

    @Override
    public List<Rol> getAllRol() {
        return retrieveRolesUseCase.getAllRol();
    }

    @Override
    public Optional<Rol> updateRol(Long id, Roles updatedRoles) {
        return updateRolesUseCase.updateRol(id, updatedRoles);
    }

    @Override
    public boolean deleteRol(Long id) {
        return deleteRolesUseCase.deleteRol(id);
    }


}