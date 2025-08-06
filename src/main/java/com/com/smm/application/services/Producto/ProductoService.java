package com.com.smm.application.services.Producto;


import com.com.smm.domain.model.Producto.Producto;
import com.com.smm.domain.ports.in.Producto.Producto.CreateProductoUseCase;
import com.com.smm.domain.ports.in.Producto.Producto.DeleteProductoUseCase;
import com.com.smm.domain.ports.in.Producto.Producto.RetrieveProductoUseCase;
import com.com.smm.domain.ports.in.Producto.Producto.UpdateProductoUseCase;
import com.com.smm.infrastructure.entities.Producto.Productos;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public class ProductoService implements CreateProductoUseCase, RetrieveProductoUseCase, UpdateProductoUseCase, DeleteProductoUseCase {

    private final CreateProductoUseCase createProductoUseCase;
    private final RetrieveProductoUseCase retrieveProductosUseCase;
    private final UpdateProductoUseCase updateProductosUseCase;
    private final DeleteProductoUseCase deleteProductosUseCase;

    public ProductoService(CreateProductoUseCase createProductoUseCase, RetrieveProductoUseCase retrieveProductosUseCase,
                           UpdateProductoUseCase updateProductosUseCase, DeleteProductoUseCase deleteProductosUseCase
                        ) {
        this.createProductoUseCase = createProductoUseCase;
        this.retrieveProductosUseCase = retrieveProductosUseCase;
        this.updateProductosUseCase = updateProductosUseCase;
        this.deleteProductosUseCase = deleteProductosUseCase;
    }

    @Override
    public Productos createProducto(Productos Productos) {
        return createProductoUseCase.createProducto(Productos);
    }


    @Override
    public Producto createProducto(Producto Productos) {
        return createProductoUseCase.createProducto(Productos);
    }



    @Override
    public Optional<Producto> getProductoById(Long id) {
        return retrieveProductosUseCase.getProductoById(id);
    }

    @Override
    public List<Producto> getProducto() {
        return retrieveProductosUseCase.getProducto();
    }

    @Override
    public List<?> pmasvendido() {
        return retrieveProductosUseCase.pmasvendido();
    }

    @Override
    public List<?> productoDetalle() {
        return retrieveProductosUseCase.productoDetalle();
    }

    @Override
    public List<?> productoDetalleId(int id) {
        return retrieveProductosUseCase.productoDetalleId(id);
    }


    @Override
    public Optional<Producto> updateProducto(Long id, Productos updatedProductos) {
        return updateProductosUseCase.updateProducto(id, updatedProductos);
    }



    @Override
    public boolean deleteProductos(Long id) {
        return false;
    }


    @Override
    public List<?> buscarPorNombreYCategoria(@Param("nombre") String nombre, @Param("categoriaId") Long categoriaId)
    {
        return retrieveProductosUseCase.buscarPorNombreYCategoria(nombre,categoriaId);
    }

}