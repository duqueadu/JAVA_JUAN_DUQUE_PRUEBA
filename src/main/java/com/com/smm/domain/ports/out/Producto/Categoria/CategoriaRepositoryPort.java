package com.com.smm.domain.ports.out.Producto.Categoria;



import com.com.smm.domain.model.Producto.Categoria;
import com.com.smm.infrastructure.entities.Producto.Categorias;

import java.util.List;
import java.util.Optional;

public interface CategoriaRepositoryPort {
    Categorias save(Categorias Categoria);

    Categoria save(Categoria Categoria);
    Optional<Categoria> findById(Long id);
    List<Categoria> findAll();

    Optional<Categoria> update(Categorias Categoria);

    Optional<Categoria> update(Categoria Categoria);
    boolean deleteById(Long id);
}
