package com.com.smm.application.usecases.Producto.Categoria;



import com.com.smm.domain.model.Producto.Categoria;
import com.com.smm.domain.ports.in.Producto.Categoria.RetrieveCategoriaUseCase;
import com.com.smm.domain.ports.out.Producto.Categoria.CategoriaRepositoryPort;

import java.util.List;
import java.util.Optional;

public class RetrieveCategoriaUseCaseImpl implements RetrieveCategoriaUseCase {

    private final CategoriaRepositoryPort categoriaRepositoryPort;

    public RetrieveCategoriaUseCaseImpl(CategoriaRepositoryPort categoriaRepositoryPort) {
        this.categoriaRepositoryPort = categoriaRepositoryPort;
    }



    @Override
    public Optional<Categoria> getCategoriaById(Long id) {
        return categoriaRepositoryPort.findById(id);
    }

    @Override
    public List<Categoria> getAllCategoria() {
        return categoriaRepositoryPort.findAll();
    }


}
