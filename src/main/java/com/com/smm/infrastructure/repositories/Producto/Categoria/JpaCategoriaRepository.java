package com.com.smm.infrastructure.repositories.Producto.Categoria;

import com.com.smm.infrastructure.entities.Producto.Categorias;
import com.com.smm.infrastructure.entities.Usuario.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaCategoriaRepository extends JpaRepository<Categorias, Long> {
    // Puedes agregar consultas personalizadas si lo necesitas


}
