package com.com.smm.application.usecases.Producto.Producto;

import com.com.smm.domain.model.Producto.Producto;
import com.com.smm.domain.ports.in.Producto.Producto.RetrieveProductoUseCase;
import com.com.smm.domain.ports.out.Producto.Producto.ProductosRepositoryPort;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public class RetrieveProductoUseCaseImpl implements RetrieveProductoUseCase {

    private final ProductosRepositoryPort productoRepositoryPort;

    public RetrieveProductoUseCaseImpl(ProductosRepositoryPort productoRepositoryPort) {
        this.productoRepositoryPort = productoRepositoryPort;
    }


    @Override
    public Optional<Producto> getProductoById(Long id) {
        return productoRepositoryPort.findById(id);
    }


    @Override
    public List<Producto> getProducto() {
        return productoRepositoryPort.findAll();
    }

    @Override
    public List<?> pmasvendido() {
        return productoRepositoryPort.pmasvendido();
    }

    @Override
    public List<?> productoDetalle() {
        return productoRepositoryPort.productoDetalle();
    }

    @Override
    public List<?> productoDetalleId(int id) {
        return productoRepositoryPort.productoDetalleid(id);

    }


    @Override
    public List<?> buscarPorNombreYCategoria(@Param("nombre") String nombre, @Param("categoriaId") Long categoriaId)
    {
       return productoRepositoryPort.buscarPorNombreYCategoria( nombre,categoriaId);

    }



}
