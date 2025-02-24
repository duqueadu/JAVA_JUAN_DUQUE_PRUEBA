package com.com.smm.application.usecases.Producto.Producto;


import com.com.smm.domain.ports.in.Producto.Producto.DeleteProductoUseCase;
import com.com.smm.domain.ports.out.Producto.Producto.ProductosRepositoryPort;

public class DeleteProductoUseCaseImpl implements DeleteProductoUseCase {

    private final ProductosRepositoryPort productoRepositoryPort;

    public DeleteProductoUseCaseImpl(ProductosRepositoryPort productoRepositoryPort) {
        this.productoRepositoryPort = productoRepositoryPort;
    }

    @Override
    public boolean deleteProductos(Long id) {
        return productoRepositoryPort.deleteById(id);
    }
}
