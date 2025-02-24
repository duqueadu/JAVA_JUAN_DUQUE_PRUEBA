package com.com.smm.application.usecases.Pedidos.Factura;


import com.com.smm.domain.ports.in.Pedidos.Factura.DeleteFacturaUseCase;
import com.com.smm.domain.ports.out.Pedidos.Factura.FacturaRepositoryPort;

public class DeleteFacturaUseCaseImpl implements DeleteFacturaUseCase {

    private final FacturaRepositoryPort FacturaRepositoryPort;

    public DeleteFacturaUseCaseImpl(FacturaRepositoryPort FacturaRepositoryPort) {
        this.FacturaRepositoryPort = FacturaRepositoryPort;
    }

    @Override
    public boolean deleteFactura(Long id) {
        return FacturaRepositoryPort.deleteById(id);
    }
}
