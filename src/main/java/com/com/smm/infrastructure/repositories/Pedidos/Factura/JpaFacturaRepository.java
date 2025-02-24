package com.com.smm.infrastructure.repositories.Pedidos.Factura;

import com.com.smm.infrastructure.entities.Pedidos.Facturas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaFacturaRepository extends JpaRepository<Facturas, Long> {
    // Puedes agregar consultas personalizadas si lo necesitas
}
