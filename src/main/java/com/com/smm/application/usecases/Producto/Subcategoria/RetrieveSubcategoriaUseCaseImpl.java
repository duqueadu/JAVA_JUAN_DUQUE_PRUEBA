package com.com.smm.application.usecases.Producto.Subcategoria;

import com.com.smm.domain.model.Producto.Subcategoria;
import com.com.smm.domain.ports.in.Producto.Subcategoria.RetrieveSubcategoriaUseCase;
import com.com.smm.domain.ports.out.Producto.Subcategoria.SubcategoriaRepositoryPort;

import java.util.List;
import java.util.Optional;

public class RetrieveSubcategoriaUseCaseImpl implements RetrieveSubcategoriaUseCase {

    private final SubcategoriaRepositoryPort subcategoriaRepositoryPort;

    public RetrieveSubcategoriaUseCaseImpl(SubcategoriaRepositoryPort subcategoriaRepositoryPort) {
        this.subcategoriaRepositoryPort = subcategoriaRepositoryPort;
    }


    @Override
    public Optional<Subcategoria> getSubcategoriaById(Long id) {
        return subcategoriaRepositoryPort.findById(id);
    }

    @Override
    public List<Subcategoria> getAllSubcategoria() {
        return subcategoriaRepositoryPort.findAll();
    }
}
