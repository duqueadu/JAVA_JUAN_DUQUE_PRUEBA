package com.com.smm.infrastructure.repositories.Producto.Imagen;

import com.com.smm.infrastructure.entities.Producto.Imagenes;
import com.com.smm.infrastructure.entities.Usuario.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaImagenRepository extends JpaRepository<Imagenes, Long> {
    // Puedes agregar consultas personalizadas si lo necesitas
}
