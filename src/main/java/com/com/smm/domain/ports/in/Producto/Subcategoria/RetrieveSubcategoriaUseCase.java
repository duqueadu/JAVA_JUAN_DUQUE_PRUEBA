package com.com.smm.domain.ports.in.Producto.Subcategoria;

import com.com.smm.domain.model.Producto.Subcategoria;
import com.com.smm.domain.model.Seguridad.Permiso;
import com.com.smm.infrastructure.entities.Producto.Subcategorias;

import java.util.List;
import java.util.Optional;

public interface RetrieveSubcategoriaUseCase {
    Optional<Subcategoria> getSubcategoriaById(Long id);
    List<Subcategoria> getAllSubcategoria();
}
