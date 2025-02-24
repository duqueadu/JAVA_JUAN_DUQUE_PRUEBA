package com.com.smm.domain.ports.in.Seguridad.Rol;

import com.com.smm.domain.model.Seguridad.Rol;
import com.com.smm.infrastructure.entities.Seguridad.Roles;

import java.util.Optional;

public interface UpdateRolUseCase {
    Optional<Rol> updateRol(Long id, Roles updatedRol);
}
