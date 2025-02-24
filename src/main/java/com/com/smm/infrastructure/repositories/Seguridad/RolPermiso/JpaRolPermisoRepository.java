package com.com.smm.infrastructure.repositories.Seguridad.RolPermiso;

import com.com.smm.infrastructure.entities.Seguridad.RolPermisos;
import com.com.smm.infrastructure.entities.Seguridad.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaRolPermisoRepository extends JpaRepository<RolPermisos, Long> {
    // Puedes agregar consultas personalizadas si lo necesitas
}
