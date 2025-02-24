package com.com.smm.application.usecases.Producto.Subcategoria;

import com.com.smm.domain.model.Producto.Subcategoria;
import com.com.smm.domain.ports.in.Producto.Subcategoria.UpdateSubcategoriaUseCase;
import com.com.smm.domain.ports.out.Producto.Subcategoria.SubcategoriaRepositoryPort;
import com.com.smm.infrastructure.entities.Producto.Subcategorias;


import java.util.Optional;

public class UpdateSubcategoriaUseCaseImpl implements UpdateSubcategoriaUseCase {

    private final SubcategoriaRepositoryPort subcategoriaRepositoryPort;

    public UpdateSubcategoriaUseCaseImpl(SubcategoriaRepositoryPort subcategoriaRepositoryPort) {
        this.subcategoriaRepositoryPort = subcategoriaRepositoryPort;
    }

    @Override
    public Optional<Subcategoria> updateSubcategoria(Long id, Subcategoria updatedPermiso) {
        return subcategoriaRepositoryPort.update(updatedPermiso);
    }
}
