package com.com.smm.application.usecases.Pedidos.Factura;

import com.com.smm.domain.model.Pedidos.Factura;
import com.com.smm.domain.ports.in.Pedidos.Factura.UpdateFacturaUseCase;
import com.com.smm.domain.ports.out.Pedidos.Factura.FacturaRepositoryPort;
import com.com.smm.infrastructure.entities.Pedidos.Facturas;

import java.util.Optional;

public class UpdateFacturaUseCaseImpl implements UpdateFacturaUseCase {

    private final com.com.smm.domain.ports.out.Pedidos.Factura.FacturaRepositoryPort FacturaRepositoryPort;

    public UpdateFacturaUseCaseImpl(FacturaRepositoryPort FacturaRepositoryPort) {
        this.FacturaRepositoryPort = FacturaRepositoryPort;
    }

    @Override
    public Optional<Factura> updateCategoria(Long id, Facturas updatedFactura) {
        return Optional.empty();
    }

    @Override
    public Optional<Factura> updateFactura(Long id, Facturas updateFacturas) {
        return FacturaRepositoryPort.update(updateFacturas);
    }
}
