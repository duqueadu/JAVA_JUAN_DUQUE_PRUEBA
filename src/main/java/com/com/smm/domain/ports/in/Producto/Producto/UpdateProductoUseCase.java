package com.com.smm.domain.ports.in.Producto.Producto;

import com.com.smm.domain.model.Producto.Producto;
import com.com.smm.domain.model.Seguridad.Permiso;
import com.com.smm.infrastructure.entities.Producto.Productos;
import com.com.smm.infrastructure.entities.Seguridad.Permisos;

import java.util.Optional;

public interface UpdateProductoUseCase {
    Optional<Producto> updateProducto(Long id, Productos updatedPermiso);
}
