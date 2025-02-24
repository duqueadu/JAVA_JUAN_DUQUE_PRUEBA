package com.com.smm.application.services.Producto;


import com.com.smm.domain.model.Producto.Categoria;

import com.com.smm.domain.ports.in.Producto.Categoria.CreateCategoriaUseCase;
import com.com.smm.domain.ports.in.Producto.Categoria.DeleteCategoriaUseCase;
import com.com.smm.domain.ports.in.Producto.Categoria.RetrieveCategoriaUseCase;
import com.com.smm.domain.ports.in.Producto.Categoria.UpdateCategoriaUseCase;
import com.com.smm.infrastructure.entities.Producto.Categorias;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CategoriaService implements CreateCategoriaUseCase, RetrieveCategoriaUseCase, UpdateCategoriaUseCase, DeleteCategoriaUseCase {

    private final CreateCategoriaUseCase createCategoriaUseCase;
    private final RetrieveCategoriaUseCase retrieveCategoriasUseCase;
    private final UpdateCategoriaUseCase updateCategoriasUseCase;
    private final DeleteCategoriaUseCase deleteCategoriasUseCase;

    public CategoriaService(CreateCategoriaUseCase createCategoriaUseCase, RetrieveCategoriaUseCase retrieveCategoriasUseCase,
                             UpdateCategoriaUseCase updateCategoriasUseCase1, DeleteCategoriaUseCase deleteCategoriasUseCase
                        ) {
        this.createCategoriaUseCase = createCategoriaUseCase;
        this.retrieveCategoriasUseCase = retrieveCategoriasUseCase;
        this.updateCategoriasUseCase = updateCategoriasUseCase1;
        this.deleteCategoriasUseCase = deleteCategoriasUseCase;
    }

    @Override
    public Categorias createCategoria(Categorias Categorias) {
        return createCategoriaUseCase.createCategoria(Categorias);
    }

    @Override
    public Categoria createCategoria(Categoria categorias) {
        return createCategoriaUseCase.createCategoria(categorias);
    }


    @Override
    public Optional<Categoria> getCategoriaById(Long id) {
        return retrieveCategoriasUseCase.getCategoriaById(id);
    }

    @Override
    public List<Categoria> getAllCategoria() {
        return retrieveCategoriasUseCase.getAllCategoria();
    }

    @Override
    public Optional<Categoria> updateCategoria(Long id, Categorias updatedCategorias) {
        return updateCategoriasUseCase.updateCategoria(id, updatedCategorias);
    }

    @Override
    public boolean deleteCategoria(Long id) {
        return deleteCategoriasUseCase.deleteCategoria(id);
    }



}