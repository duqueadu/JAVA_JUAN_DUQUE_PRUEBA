package com.com.smm.application.usecases.Producto.Proveedor;

import com.com.smm.domain.model.Producto.Proveedor;
import com.com.smm.domain.ports.in.Producto.Proveedor.UpdateProveedorUseCase;
import com.com.smm.domain.ports.out.Producto.Proveedor.ProveedorRepositoryPort;
import com.com.smm.infrastructure.entities.Producto.Proveedores;

import java.util.Optional;

public class UpdateProveedorUseCaseImpl implements UpdateProveedorUseCase {

    private final ProveedorRepositoryPort proveedorRepositoryPort;

    public UpdateProveedorUseCaseImpl(ProveedorRepositoryPort proveedorRepositoryPort) {
        this.proveedorRepositoryPort = proveedorRepositoryPort;
    }

    @Override
    public  Optional<Proveedor> updateProveedor(Long id, Proveedor updatedPermiso){
        return proveedorRepositoryPort.update(updatedPermiso);
    }
}
