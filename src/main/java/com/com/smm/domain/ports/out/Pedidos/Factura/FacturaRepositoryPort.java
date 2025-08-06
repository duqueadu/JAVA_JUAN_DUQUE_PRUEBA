package com.com.smm.domain.ports.out.Pedidos.Factura;



import com.com.smm.domain.model.Pedidos.Factura;
import com.com.smm.infrastructure.entities.Pedidos.Facturas;

import java.util.List;
import java.util.Optional;

public interface FacturaRepositoryPort {

    Factura save(Factura Factura);
    Optional<Factura> findById(Long id);
    List<Factura> findAll();

    Optional<Factura> update(Facturas Factura);

    Optional<Factura> update(Factura Factura);
    boolean deleteById(Long id);

}
