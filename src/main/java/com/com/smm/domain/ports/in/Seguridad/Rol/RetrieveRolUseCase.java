package com.com.smm.domain.ports.in.Seguridad.Rol;

import com.com.smm.domain.model.Seguridad.Rol;

import java.util.List;
import java.util.Optional;

public interface RetrieveRolUseCase {
    Optional<Rol> getRolById(Long id);
    List<Rol> getAllRol();
}
