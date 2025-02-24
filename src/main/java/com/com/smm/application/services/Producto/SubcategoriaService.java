package com.com.smm.application.services.Producto;


import com.com.smm.domain.model.Producto.Subcategoria;
import com.com.smm.domain.ports.in.Producto.Subcategoria.CreateSubcategoriaUseCase;
import com.com.smm.domain.ports.in.Producto.Subcategoria.DeleteSubcategoriaUseCase;
import com.com.smm.domain.ports.in.Producto.Subcategoria.RetrieveSubcategoriaUseCase;
import com.com.smm.domain.ports.in.Producto.Subcategoria.UpdateSubcategoriaUseCase;
import com.com.smm.infrastructure.entities.Producto.Subcategorias;


import java.util.List;
import java.util.Optional;

public class SubcategoriaService implements CreateSubcategoriaUseCase, RetrieveSubcategoriaUseCase, UpdateSubcategoriaUseCase, DeleteSubcategoriaUseCase {

    private final CreateSubcategoriaUseCase createSubcategoriaUseCase;
    private final RetrieveSubcategoriaUseCase retrieveSubcategoriasUseCase;
    private final UpdateSubcategoriaUseCase updateSubcategoriasUseCase;
    private final DeleteSubcategoriaUseCase deleteSubcategoriasUseCase;

    public SubcategoriaService(CreateSubcategoriaUseCase createSubcategoriaUseCase, RetrieveSubcategoriaUseCase retrieveSubcategoriasUseCase,
                               UpdateSubcategoriaUseCase updateSubcategoriasUseCase, DeleteSubcategoriaUseCase deleteSubcategoriasUseCase
                        ) {
        this.createSubcategoriaUseCase = createSubcategoriaUseCase;
        this.retrieveSubcategoriasUseCase = retrieveSubcategoriasUseCase;
        this.updateSubcategoriasUseCase = updateSubcategoriasUseCase;
        this.deleteSubcategoriasUseCase = deleteSubcategoriasUseCase;
    }

    @Override
    public Subcategorias createSubcategoria(Subcategorias Subcategorias) {
        return createSubcategoriaUseCase.createSubcategoria(Subcategorias);
    }

    @Override
    public Subcategoria createSubcategoria(Subcategoria subcategorias) {
        return createSubcategoriaUseCase.createSubcategoria(subcategorias);

    }

    @Override
    public Subcategoria createSubcate(Subcategoria Subcategorias) {
        return createSubcategoriaUseCase.createSubcategoria(Subcategorias);
    }

    @Override
    public Optional<Subcategoria> getSubcategoriaById(Long id) {
        return retrieveSubcategoriasUseCase.getSubcategoriaById(id);
    }

    @Override
    public List<Subcategoria> getAllSubcategoria() {
        return retrieveSubcategoriasUseCase.getAllSubcategoria();
    }



    @Override
    public boolean deleteSubcategoria(Long id) {
        return deleteSubcategoriasUseCase.deleteSubcategoria(id);
    }


    @Override
    public Optional<Subcategoria> updateSubcategoria(Long id, Subcategoria updatedPermiso) {
        return Optional.empty();
    }
}