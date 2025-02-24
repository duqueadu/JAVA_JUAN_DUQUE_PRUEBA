package com.com.smm.domain.ports.in.Producto.Subcategoria;

import com.com.smm.domain.model.Producto.Subcategoria;
import com.com.smm.domain.model.Seguridad.Permiso;
import com.com.smm.infrastructure.entities.Seguridad.Permisos;

import java.util.Optional;

public interface UpdateSubcategoriaUseCase {
    Optional<Subcategoria> updateSubcategoria(Long id, Subcategoria updatedPermiso);
}
