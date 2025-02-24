package com.com.smm.application.usecases.Producto.Producto;


import com.com.smm.domain.model.Producto.Producto;
import com.com.smm.domain.ports.in.Producto.Producto.CreateProductoUseCase;
import com.com.smm.domain.ports.out.Producto.Producto.ProductosRepositoryPort;
import com.com.smm.infrastructure.entities.Producto.Productos;

import java.util.List;


public class CreateProductoUseCaseImpl implements CreateProductoUseCase {

    private final ProductosRepositoryPort productoRepositoryPort;

    public CreateProductoUseCaseImpl(ProductosRepositoryPort productoRepositoryPort) {
        this.productoRepositoryPort = productoRepositoryPort;
    }

    @Override
    public Productos createProducto(Productos productos) {
        return productoRepositoryPort.save(productos);
    }

    @Override
    public Producto createProducto(Producto Productos) {
        return productoRepositoryPort.save(Productos);
    }

}