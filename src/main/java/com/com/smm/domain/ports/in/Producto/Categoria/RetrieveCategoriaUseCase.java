package com.com.smm.domain.ports.in.Producto.Categoria;

import com.com.smm.domain.model.Producto.Categoria;

import java.util.List;
import java.util.Optional;

public interface RetrieveCategoriaUseCase {
    Optional<Categoria> getCategoriaById(Long id);
    List<Categoria> getAllCategoria();
}
