package com.com.smm.application.services.Producto;



import com.com.smm.domain.model.Producto.Proveedor;
import com.com.smm.domain.ports.in.Producto.Proveedor.CreateProveedorUseCase;
import com.com.smm.domain.ports.in.Producto.Proveedor.DeleteProveedorUseCase;
import com.com.smm.domain.ports.in.Producto.Proveedor.RetrieveProveedorUseCase;
import com.com.smm.domain.ports.in.Producto.Proveedor.UpdateProveedorUseCase;

import com.com.smm.infrastructure.entities.Producto.Proveedores;


import java.util.List;
import java.util.Optional;

public class ProveedorService implements CreateProveedorUseCase, RetrieveProveedorUseCase, UpdateProveedorUseCase, DeleteProveedorUseCase {

    private final CreateProveedorUseCase createProveedorUseCase;
    private final RetrieveProveedorUseCase retrieveProveedoresUseCase;
    private final UpdateProveedorUseCase updateProveedoresUseCase;
    private final DeleteProveedorUseCase deleteProveedoresUseCase;

    public ProveedorService(CreateProveedorUseCase createProveedorUseCase, RetrieveProveedorUseCase retrieveProveedoresUseCase,
                            UpdateProveedorUseCase updateProveedoresUseCase, DeleteProveedorUseCase deleteProveedoresUseCase
                        ) {
        this.createProveedorUseCase = createProveedorUseCase;
        this.retrieveProveedoresUseCase = retrieveProveedoresUseCase;
        this.updateProveedoresUseCase = updateProveedoresUseCase;
        this.deleteProveedoresUseCase = deleteProveedoresUseCase;
    }

    @Override
    public Proveedores createProveedor(Proveedores proveedores) {
        return createProveedorUseCase.createProveedor(proveedores);
    }

    @Override
    public Proveedor createProveedor(Proveedor proveedor) {
        return createProveedorUseCase.createProveedor(proveedor);
    }

    @Override
    public boolean deleteProveedor(Long id) {
        return deleteProveedoresUseCase.deleteProveedor(id);
    }


    @Override
    public Optional<Proveedor> getProveedorById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Proveedores> getAllProveedor() {
        return retrieveProveedoresUseCase.getAllProveedor();
    }


    @Override
    public Optional<Proveedor> updateProveedor(Long id, Proveedor updatedPermiso) {
        return Optional.empty();
    }
}