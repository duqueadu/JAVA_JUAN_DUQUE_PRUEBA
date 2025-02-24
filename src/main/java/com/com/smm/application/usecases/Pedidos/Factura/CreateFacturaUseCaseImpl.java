package com.com.smm.application.usecases.Pedidos.Factura;


import com.com.smm.domain.ports.in.Pedidos.Factura.CreateFacturaUseCase;
import com.com.smm.domain.ports.out.Pedidos.Factura.FacturaRepositoryPort;
import com.com.smm.infrastructure.entities.Pedidos.Facturas;

public class CreateFacturaUseCaseImpl implements CreateFacturaUseCase {

    private final FacturaRepositoryPort  FacturaRepositoryPort;

    public CreateFacturaUseCaseImpl(com.com.smm.domain.ports.out.Pedidos.Factura.FacturaRepositoryPort FacturaRepositoryPort) {
        this.FacturaRepositoryPort = FacturaRepositoryPort;
    }

    @Override
    public Facturas createFactura(Facturas Facturas) {
        return FacturaRepositoryPort.save(Facturas);
    }
}