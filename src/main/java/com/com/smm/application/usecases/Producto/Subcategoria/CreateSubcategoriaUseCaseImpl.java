package com.com.smm.application.usecases.Producto.Subcategoria;


import com.com.smm.domain.model.Producto.Subcategoria;
import com.com.smm.domain.ports.in.Producto.Subcategoria.CreateSubcategoriaUseCase;
import com.com.smm.domain.ports.out.Producto.Subcategoria.SubcategoriaRepositoryPort;
import com.com.smm.infrastructure.entities.Producto.Subcategorias;


public class CreateSubcategoriaUseCaseImpl implements CreateSubcategoriaUseCase {

    private final SubcategoriaRepositoryPort subcategoriaRepositoryPort;

    public CreateSubcategoriaUseCaseImpl(SubcategoriaRepositoryPort subcategoriaRepositoryPort) {
        this.subcategoriaRepositoryPort = subcategoriaRepositoryPort;
    }

    @Override
    public Subcategorias createSubcategoria(Subcategorias subcategorias){
        return subcategoriaRepositoryPort.save(subcategorias);
    }

    @Override
    public Subcategoria createSubcate(Subcategoria Subcategorias) {
        return null;
    }

    @Override
    public Subcategoria createSubcategoria(Subcategoria subcategorias){
        return subcategoriaRepositoryPort.save(subcategorias);
    }
}