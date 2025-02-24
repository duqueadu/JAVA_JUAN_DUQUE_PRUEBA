package com.com.smm.application.usecases.Producto.Proveedor;


import com.com.smm.domain.ports.in.Producto.Proveedor.DeleteProveedorUseCase;
import com.com.smm.domain.ports.out.Producto.Proveedor.ProveedorRepositoryPort;

public class DeleteProveedorUseCaseImpl implements DeleteProveedorUseCase {

    private final ProveedorRepositoryPort proveedorRepositoryPort;

    public DeleteProveedorUseCaseImpl(ProveedorRepositoryPort proveedorRepositoryPort) {
        this.proveedorRepositoryPort = proveedorRepositoryPort;
    }

    @Override
    public boolean deleteProveedor(Long id) {
        return proveedorRepositoryPort.deleteById(id);
    }
}
