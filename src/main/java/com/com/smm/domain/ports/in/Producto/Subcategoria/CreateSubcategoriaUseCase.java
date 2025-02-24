package com.com.smm.domain.ports.in.Producto.Subcategoria;


import com.com.smm.domain.model.Producto.Subcategoria;
import com.com.smm.infrastructure.entities.Producto.Subcategorias;


public interface CreateSubcategoriaUseCase {
    Subcategorias createSubcategoria(Subcategorias subcategorias);


    Subcategoria createSubcategoria(Subcategoria subcategorias);

    Subcategoria createSubcate(Subcategoria Subcategorias);
}