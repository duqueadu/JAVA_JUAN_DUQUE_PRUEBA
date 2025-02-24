package com.com.smm.application.usecases.Pedidos.Factura;



import com.com.smm.domain.model.Pedidos.Factura;
import com.com.smm.domain.ports.in.Pedidos.Factura.RetrieveFacturaUseCase;
import com.com.smm.domain.ports.out.Pedidos.Factura.FacturaRepositoryPort;

import java.util.List;
import java.util.Optional;

public class RetrieveFacturaUseCaseImpl implements RetrieveFacturaUseCase {

    private final FacturaRepositoryPort FacturaRepositoryPort;

    public RetrieveFacturaUseCaseImpl(FacturaRepositoryPort FacturaRepositoryPort) {
        this.FacturaRepositoryPort = FacturaRepositoryPort;
    }



    @Override
    public Optional<Factura> getFacturaById(Long id) {
        return FacturaRepositoryPort.findById(id);
    }

    @Override
    public List<Factura> getAllFactura() {
        return FacturaRepositoryPort.findAll();
    }
}
