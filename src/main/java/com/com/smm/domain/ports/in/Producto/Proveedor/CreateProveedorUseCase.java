package com.com.smm.domain.ports.in.Producto.Proveedor;


import com.com.smm.domain.model.Producto.Proveedor;
import com.com.smm.infrastructure.entities.Producto.Proveedores;
import com.com.smm.infrastructure.entities.Seguridad.Permisos;


public interface CreateProveedorUseCase {
    Proveedores createProveedor(Proveedores proveedores);

    Proveedor createProveedor(Proveedor proveedor);
}