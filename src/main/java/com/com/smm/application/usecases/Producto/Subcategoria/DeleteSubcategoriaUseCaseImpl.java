package com.com.smm.application.usecases.Producto.Subcategoria;


import com.com.smm.domain.ports.in.Producto.Subcategoria.DeleteSubcategoriaUseCase;
import com.com.smm.domain.ports.out.Producto.Subcategoria.SubcategoriaRepositoryPort;

public class DeleteSubcategoriaUseCaseImpl implements DeleteSubcategoriaUseCase {



    private final SubcategoriaRepositoryPort subcategoriaRepositoryPort;

    public DeleteSubcategoriaUseCaseImpl(SubcategoriaRepositoryPort subcategoriaRepositoryPort) {
        this.subcategoriaRepositoryPort = subcategoriaRepositoryPort;
    }

    @Override
    public boolean deleteSubcategoria(Long id) {
        return subcategoriaRepositoryPort.deleteById(id);
    }
}
