package com.com.smm.infrastructure.repositories.Producto.Subcategoria;

import com.com.smm.infrastructure.entities.Producto.Subcategorias;
import com.com.smm.infrastructure.entities.Usuario.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaSubcategoriaRepository extends JpaRepository<Subcategorias, Long> {
    // Puedes agregar consultas personalizadas si lo necesitas
}
