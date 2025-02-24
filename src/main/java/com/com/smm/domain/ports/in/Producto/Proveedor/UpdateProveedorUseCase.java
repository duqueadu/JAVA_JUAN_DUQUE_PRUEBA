package com.com.smm.domain.ports.in.Producto.Proveedor;

import com.com.smm.domain.model.Producto.Proveedor;
import com.com.smm.domain.model.Seguridad.Permiso;
import com.com.smm.infrastructure.entities.Seguridad.Permisos;

import java.util.Optional;

public interface UpdateProveedorUseCase {
    Optional<Proveedor> updateProveedor(Long id, Proveedor updatedPermiso);
}
