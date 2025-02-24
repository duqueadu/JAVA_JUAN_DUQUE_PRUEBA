package com.com.smm.domain.ports.in.Seguridad.Permiso;

import com.com.smm.domain.model.Seguridad.Permiso;

import java.util.List;
import java.util.Optional;

public interface RetrievePermisoUseCase {
    Optional<Permiso> getPermisoById(Long id);
    List<Permiso> getAllPermiso();
}
