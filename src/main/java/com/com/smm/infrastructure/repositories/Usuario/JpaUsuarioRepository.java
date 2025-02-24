package com.com.smm.infrastructure.repositories.Usuario;

import com.com.smm.domain.model.Usuario.Usuario;
import com.com.smm.infrastructure.entities.Usuario.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface JpaUsuarioRepository extends JpaRepository<Usuarios, Long> {
    boolean existsByEmail(String email);

    Usuarios findByEmail(String email);
    // Puedes agregar consultas personalizadas si lo necesitas
}
