package com.com.smm.domain.ports.in.Producto.Categoria;

import com.com.smm.domain.model.Producto.Categoria;
import com.com.smm.domain.model.Seguridad.Permiso;
import com.com.smm.infrastructure.entities.Producto.Categorias;
import com.com.smm.infrastructure.entities.Seguridad.Permisos;

import java.util.Optional;

public interface UpdateCategoriaUseCase {
    Optional<Categoria> updateCategoria(Long id, Categorias updatedPermiso);
}
