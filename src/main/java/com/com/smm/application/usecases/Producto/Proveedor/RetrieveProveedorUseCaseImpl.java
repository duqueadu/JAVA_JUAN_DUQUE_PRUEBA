package com.com.smm.application.usecases.Producto.Proveedor;


import com.com.smm.domain.model.Producto.Proveedor;
import com.com.smm.domain.ports.in.Producto.Proveedor.RetrieveProveedorUseCase;
import com.com.smm.domain.ports.out.Producto.Proveedor.ProveedorRepositoryPort;
import com.com.smm.infrastructure.entities.Producto.Proveedores;

import java.util.List;
import java.util.Optional;


public class RetrieveProveedorUseCaseImpl implements RetrieveProveedorUseCase {

    private final ProveedorRepositoryPort proveedorRepositoryPort;

    public RetrieveProveedorUseCaseImpl(ProveedorRepositoryPort proveedorRepositoryPort) {
        this.proveedorRepositoryPort = proveedorRepositoryPort;
    }


    @Override
    public Optional<Proveedor> getProveedorById(Long id) {
        return proveedorRepositoryPort.findById(id);
    }

    @Override
    public List<Proveedores> getAllProveedor(){
        return proveedorRepositoryPort.findAll();
    }

}

