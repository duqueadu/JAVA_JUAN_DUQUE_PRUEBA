package com.com.smm.domain.ports.in.Producto.Producto;

import com.com.smm.domain.model.Producto.Producto;
import com.com.smm.infrastructure.entities.Producto.Productos;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface RetrieveProductoUseCase {
    Optional<Producto> getProductoById(Long id);

    List<Producto> getProducto();

    List<?> productoDetalle();
    List<?> productoDetalleId(int id);

    List<?> buscarPorNombreYCategoria(@Param("nombre") String nombre, @Param("categoriaId") Long categoriaId);


}
