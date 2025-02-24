package com.com.smm.infrastructure.repositories.Producto.Proveedor;

import com.com.smm.infrastructure.entities.Producto.Proveedores;
import com.com.smm.infrastructure.entities.Usuario.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaProveedorRepository extends JpaRepository<Proveedores, Long> {
    // Puedes agregar consultas personalizadas si lo necesitas
}
