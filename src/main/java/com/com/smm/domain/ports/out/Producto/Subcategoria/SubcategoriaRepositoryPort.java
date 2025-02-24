package com.com.smm.domain.ports.out.Producto.Subcategoria;



import com.com.smm.domain.model.Producto.Subcategoria;
import com.com.smm.infrastructure.entities.Producto.Subcategorias;

import java.util.List;
import java.util.Optional;

public interface SubcategoriaRepositoryPort {
    Subcategorias save(Subcategorias Subcategoria);

    Subcategoria save(Subcategoria Subcategoria);
    Optional<Subcategoria> findById(Long id);
    List<Subcategoria> findAll();

    Optional<Subcategoria> update(Subcategorias Subcategoria);

    Optional<Subcategoria> update(Subcategoria Subcategoria);
    boolean deleteById(Long id);
}
