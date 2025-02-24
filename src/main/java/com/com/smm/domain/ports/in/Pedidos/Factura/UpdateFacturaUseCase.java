package com.com.smm.domain.ports.in.Pedidos.Factura;

import com.com.smm.domain.model.Pedidos.Factura;
import com.com.smm.infrastructure.entities.Pedidos.Facturas;

import java.util.Optional;

public interface UpdateFacturaUseCase {
    Optional<Factura> updateCategoria(Long id, Facturas updatedFactura);

    Optional<Factura> updateFactura(Long id, Facturas updatedFacturas);
}
