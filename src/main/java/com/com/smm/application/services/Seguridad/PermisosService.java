package com.com.smm.application.services.Seguridad;


import com.com.smm.domain.model.Producto.Imagen;
import com.com.smm.domain.model.Seguridad.Permiso;
import com.com.smm.domain.ports.in.Seguridad.Permiso.CreatePermisoUseCase;

import com.com.smm.domain.ports.in.Seguridad.Permiso.DeletePermisoUseCase;
import com.com.smm.domain.ports.in.Seguridad.Permiso.RetrievePermisoUseCase;
import com.com.smm.domain.ports.in.Seguridad.Permiso.UpdatePermisoUseCase;
import com.com.smm.infrastructure.entities.Producto.Imagenes;
import com.com.smm.infrastructure.entities.Seguridad.Permisos;

import java.util.List;
import java.util.Optional;

public class PermisosService implements CreatePermisoUseCase, RetrievePermisoUseCase, UpdatePermisoUseCase, DeletePermisoUseCase {

    private final CreatePermisoUseCase createPermisoUseCase;
    private final RetrievePermisoUseCase retrievePermisosUseCase;
    private final UpdatePermisoUseCase updatePermisosUseCase;
    private final DeletePermisoUseCase deletePermisosUseCase;

    public PermisosService(CreatePermisoUseCase createPermisoUseCase, RetrievePermisoUseCase retrievePermisosUseCase,
                           UpdatePermisoUseCase updatePermisosUseCase, DeletePermisoUseCase deletePermisosUseCase
                        ) {
        this.createPermisoUseCase = createPermisoUseCase;
        this.retrievePermisosUseCase = retrievePermisosUseCase;
        this.updatePermisosUseCase = updatePermisosUseCase;
        this.deletePermisosUseCase = deletePermisosUseCase;
    }

    @Override
    public Permisos createPermiso(Permisos Permisos) {
        return createPermisoUseCase.createPermiso(Permisos);
    }

    @Override
    public Optional<Permiso> getPermisoById(Long id) {
        return retrievePermisosUseCase.getPermisoById(id);
    }

    @Override
    public List<Permiso> getAllPermiso() {
        return retrievePermisosUseCase.getAllPermiso();
    }

    @Override
    public Optional<Permiso> updatePermiso(Long id, Permisos updatedPermisos) {
        return updatePermisosUseCase.updatePermiso(id, updatedPermisos);
    }

    @Override
    public boolean deletePermiso(Long id) {
        return deletePermisosUseCase.deletePermiso(id);
    }



}