package com.com.smm.application.usecases.Seguridad.RolPermiso;

import com.com.smm.domain.model.Seguridad.Permiso;
import com.com.smm.domain.model.Seguridad.RolPermiso;
import com.com.smm.domain.ports.in.Seguridad.Permiso.RetrievePermisoUseCase;
import com.com.smm.domain.ports.in.Seguridad.RolPermiso.RetrieveRolPermisoUseCase;
import com.com.smm.domain.ports.out.Seguridad.PermisosRepositoryPort;
import com.com.smm.domain.ports.out.Seguridad.RolPermisoRepositoryPort;

import java.util.List;
import java.util.Optional;

public class RetrieveRolPermisoUseCaseImpl implements RetrieveRolPermisoUseCase {

    private final RolPermisoRepositoryPort  rolPermisoRepositoryPort;

    public RetrieveRolPermisoUseCaseImpl(RolPermisoRepositoryPort rolPermisoRepositoryPort) {
        this.rolPermisoRepositoryPort = rolPermisoRepositoryPort;
    }



    @Override
    public Optional<RolPermiso> getRolPermisoById(Long id) {
        return rolPermisoRepositoryPort.findById(id);
    }

    @Override
    public List<RolPermiso> getAllRolPermiso() {
        return rolPermisoRepositoryPort.findAll();
    }
}
