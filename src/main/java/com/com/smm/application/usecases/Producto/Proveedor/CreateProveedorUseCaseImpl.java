package com.com.smm.application.usecases.Producto.Proveedor;


import com.com.smm.domain.model.Producto.Proveedor;
import com.com.smm.domain.ports.in.Producto.Proveedor.CreateProveedorUseCase;
import com.com.smm.domain.ports.in.Seguridad.Permiso.CreatePermisoUseCase;
import com.com.smm.domain.ports.out.Producto.Proveedor.ProveedorRepositoryPort;
import com.com.smm.domain.ports.out.Seguridad.PermisosRepositoryPort;
import com.com.smm.infrastructure.entities.Producto.Proveedores;
import com.com.smm.infrastructure.entities.Seguridad.Permisos;

public class CreateProveedorUseCaseImpl implements CreateProveedorUseCase {

    private final ProveedorRepositoryPort proveedorRepositoryPort;

    public CreateProveedorUseCaseImpl(ProveedorRepositoryPort proveedorRepositoryPort) {
        this.proveedorRepositoryPort = proveedorRepositoryPort;
    }

    @Override
    public Proveedores createProveedor(Proveedores proveedores) {
        return proveedorRepositoryPort.save(proveedores);
    }

    @Override
    public Proveedor createProveedor(Proveedor proveedor) {
        return proveedorRepositoryPort.save(proveedor);

    }
}