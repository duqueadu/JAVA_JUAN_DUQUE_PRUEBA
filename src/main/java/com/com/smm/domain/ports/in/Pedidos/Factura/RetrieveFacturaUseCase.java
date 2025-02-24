package com.com.smm.domain.ports.in.Pedidos.Factura;

import com.com.smm.domain.model.Pedidos.Factura;

import java.util.List;
import java.util.Optional;

public interface RetrieveFacturaUseCase {
    Optional<Factura> getFacturaById(Long id);
    List<Factura> getAllFactura();
}
