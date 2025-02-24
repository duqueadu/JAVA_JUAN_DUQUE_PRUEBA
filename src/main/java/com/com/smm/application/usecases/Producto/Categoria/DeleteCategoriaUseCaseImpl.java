package com.com.smm.application.usecases.Producto.Categoria;


import com.com.smm.domain.ports.in.Producto.Categoria.DeleteCategoriaUseCase;
import com.com.smm.domain.ports.out.Producto.Categoria.CategoriaRepositoryPort;

public class DeleteCategoriaUseCaseImpl implements DeleteCategoriaUseCase {

    private final CategoriaRepositoryPort categoriaRepositoryPort;

    public DeleteCategoriaUseCaseImpl(CategoriaRepositoryPort categoriaRepositoryPort) {
        this.categoriaRepositoryPort = categoriaRepositoryPort;
    }

    @Override
    public boolean deleteCategoria(Long id) {
        return categoriaRepositoryPort.deleteById(id);
    }
}
