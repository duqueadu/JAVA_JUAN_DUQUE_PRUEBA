package com.com.smm.domain.ports.out.Seguridad;

import com.com.smm.domain.model.Seguridad.Permiso;
import com.com.smm.domain.model.Seguridad.Rol;
import com.com.smm.infrastructure.entities.Seguridad.Permisos;

import java.util.List;
import java.util.Optional;

public interface PermisosRepositoryPort {
    Permisos save(Permisos permiso);

    Permiso save(Permiso permiso);
    Optional<Permiso> findById(Long id);

    Optional<Permiso> update(Permisos permiso);

    List<Permiso> findAll();

    Optional<Permiso> update(Permiso permisos);

    boolean deleteById(Long id);
}
