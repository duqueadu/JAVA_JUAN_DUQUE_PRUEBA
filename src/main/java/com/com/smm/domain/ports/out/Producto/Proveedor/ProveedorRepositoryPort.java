package com.com.smm.domain.ports.out.Producto.Proveedor;



import com.com.smm.domain.model.Producto.Proveedor;
import com.com.smm.infrastructure.entities.Producto.Proveedores;

import java.util.List;
import java.util.Optional;

public interface ProveedorRepositoryPort {
    Proveedores save(Proveedores proveedor);

    Proveedor save(Proveedor proveedor);
    Optional<Proveedor> findById(Long id);
    List<Proveedores> findAll();

    Optional<Proveedor> update(Proveedores proveedor);

    Optional<Proveedor> update(Proveedor proveedor);
    boolean deleteById(Long id);
}
