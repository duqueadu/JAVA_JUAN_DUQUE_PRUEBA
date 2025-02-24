package com.com.smm.application.usecases.Producto.Categoria;

import com.com.smm.domain.model.Producto.Categoria;
import com.com.smm.domain.model.Seguridad.Permiso;
import com.com.smm.domain.ports.in.Producto.Categoria.UpdateCategoriaUseCase;
import com.com.smm.domain.ports.in.Seguridad.Permiso.UpdatePermisoUseCase;
import com.com.smm.domain.ports.out.Producto.Categoria.CategoriaRepositoryPort;
import com.com.smm.domain.ports.out.Seguridad.PermisosRepositoryPort;
import com.com.smm.infrastructure.entities.Producto.Categorias;
import com.com.smm.infrastructure.entities.Seguridad.Permisos;

import java.util.Optional;

public class UpdateCotegoriaUseCaseImpl implements UpdateCategoriaUseCase {

    private final CategoriaRepositoryPort categoriaRepositoryPort;

    public UpdateCotegoriaUseCaseImpl(CategoriaRepositoryPort categoriaRepositoryPort) {
        this.categoriaRepositoryPort = categoriaRepositoryPort;
    }

    @Override
    public Optional<Categoria> updateCategoria(Long id, Categorias updateCategorias) {
        return categoriaRepositoryPort.update(updateCategorias);
    }
}
