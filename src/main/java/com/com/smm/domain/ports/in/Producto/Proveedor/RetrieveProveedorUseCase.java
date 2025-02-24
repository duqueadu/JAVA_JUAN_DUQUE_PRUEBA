package com.com.smm.domain.ports.in.Producto.Proveedor;

import com.com.smm.domain.model.Producto.Proveedor;
import com.com.smm.infrastructure.entities.Producto.Proveedores;

import java.util.List;
import java.util.Optional;

public interface RetrieveProveedorUseCase {
    Optional<Proveedor> getProveedorById(Long id);
    List<Proveedores> getAllProveedor();

}
