package com.com.smm.application.usecases.Producto.Producto;

import com.com.smm.domain.model.Producto.Producto;
import com.com.smm.domain.ports.in.Producto.Producto.UpdateProductoUseCase;
import com.com.smm.domain.ports.out.Producto.Producto.ProductosRepositoryPort;
import com.com.smm.infrastructure.entities.Producto.Productos;

import java.util.Optional;

public class UpdateProductoUseCaseImpl implements UpdateProductoUseCase {

    private final ProductosRepositoryPort productoRepositoryPort;

    public UpdateProductoUseCaseImpl(ProductosRepositoryPort productoRepositoryPort) {
        this.productoRepositoryPort = productoRepositoryPort;
    }


    @Override
    public Optional<Producto> updateProducto(Long id, Productos updateProducto) {
        return productoRepositoryPort.update(updateProducto);
    }
}
