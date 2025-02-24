package com.com.smm.application.usecases.Producto.Categoria;


import com.com.smm.domain.model.Producto.Categoria;
import com.com.smm.domain.ports.in.Producto.Categoria.CreateCategoriaUseCase;
import com.com.smm.domain.ports.out.Producto.Categoria.CategoriaRepositoryPort;
import com.com.smm.infrastructure.entities.Producto.Categorias;


public class CreateCategoriaUseCaseImpl implements CreateCategoriaUseCase {

    private final CategoriaRepositoryPort  categoriaRepositoryPort;

    public CreateCategoriaUseCaseImpl(CategoriaRepositoryPort categoriaRepositoryPort) {
        this.categoriaRepositoryPort = categoriaRepositoryPort;
    }

    @Override
    public Categorias createCategoria(Categorias categorias) {
        return categoriaRepositoryPort.save(categorias);
    }

    @Override
    public Categoria createCategoria(Categoria categorias) {
        return categoriaRepositoryPort.save(categorias);
    }



}