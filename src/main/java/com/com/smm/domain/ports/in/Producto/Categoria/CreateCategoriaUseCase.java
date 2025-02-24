package com.com.smm.domain.ports.in.Producto.Categoria;


import com.com.smm.domain.model.Producto.Categoria;
import com.com.smm.infrastructure.entities.Producto.Categorias;


public interface CreateCategoriaUseCase {
    Categorias createCategoria(Categorias categorias);


    Categoria createCategoria(Categoria categorias);
}