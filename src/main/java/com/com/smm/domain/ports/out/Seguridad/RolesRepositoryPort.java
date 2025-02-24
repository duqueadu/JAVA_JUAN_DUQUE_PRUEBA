package com.com.smm.domain.ports.out.Seguridad;

import com.com.smm.domain.model.Seguridad.Rol;
import com.com.smm.infrastructure.entities.Seguridad.Roles;

import java.util.List;
import java.util.Optional;

public interface RolesRepositoryPort {
    Roles save(Roles rol);

    Rol save(Rol rol);
    Optional<Rol> findById(Long id);

    Optional<Rol> update(Roles rol);

    List<Rol> findAll();

    Optional<Rol> update(Rol roles);

    boolean deleteById(Long id);
}
