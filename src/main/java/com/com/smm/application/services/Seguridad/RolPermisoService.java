package com.com.smm.application.services.Seguridad;


import com.com.smm.domain.model.Seguridad.Rol;
import com.com.smm.domain.model.Seguridad.RolPermiso;
import com.com.smm.domain.ports.in.Seguridad.Rol.DeleteRolUseCase;
import com.com.smm.domain.ports.in.Seguridad.Rol.RetrieveRolUseCase;
import com.com.smm.domain.ports.in.Seguridad.Rol.UpdateRolUseCase;
import com.com.smm.domain.ports.in.Seguridad.RolPermiso.CreateRolPermisoUseCase;
import com.com.smm.domain.ports.in.Seguridad.RolPermiso.DeleteRolPermisoUseCase;
import com.com.smm.domain.ports.in.Seguridad.RolPermiso.RetrieveRolPermisoUseCase;
import com.com.smm.domain.ports.in.Seguridad.RolPermiso.UpdateRolPermisoUseCase;
import com.com.smm.infrastructure.entities.Seguridad.RolPermisos;

import java.util.List;
import java.util.Optional;

public class RolPermisoService implements CreateRolPermisoUseCase, RetrieveRolPermisoUseCase, UpdateRolPermisoUseCase, DeleteRolPermisoUseCase {

    private final CreateRolPermisoUseCase  createRolPermisoUseCase;
    private final RetrieveRolPermisoUseCase  retrieveRolPermisoUseCase;
    private final UpdateRolPermisoUseCase  updateRolPermisoUseCase;
    private final DeleteRolPermisoUseCase  deleteRolPermisoUseCase;

    public RolPermisoService(CreateRolPermisoUseCase createRolPermisoUseCase, RetrieveRolPermisoUseCase retrieveRolPermisoUseCase,
                             UpdateRolPermisoUseCase updateRolPermisoUseCase, DeleteRolPermisoUseCase deleteRolPermisoUseCase
                        ) {
        this.createRolPermisoUseCase = createRolPermisoUseCase;
        this.retrieveRolPermisoUseCase = retrieveRolPermisoUseCase;
        this.updateRolPermisoUseCase = updateRolPermisoUseCase;
        this.deleteRolPermisoUseCase = deleteRolPermisoUseCase;
    }

    @Override
    public RolPermisos createRolPermiso(RolPermisos rolpermisos) {
        return createRolPermisoUseCase.createRolPermiso(rolpermisos);
    }

    @Override
    public Optional<RolPermiso> getRolPermisoById(Long id) {
        return retrieveRolPermisoUseCase.getRolPermisoById(id);
    }

    @Override
    public List<RolPermiso> getAllRolPermiso() {
        return retrieveRolPermisoUseCase.getAllRolPermiso();
    }

    @Override
    public Optional<RolPermiso> updateRolPermiso(Long id, RolPermisos updatedRolpermisos) {
        return updateRolPermisoUseCase.updateRolPermiso(id, updatedRolpermisos);
    }

    @Override
    public boolean deleteRolPermiso(Long id) {
        return deleteRolPermisoUseCase.deleteRolPermiso(id);
    }


}