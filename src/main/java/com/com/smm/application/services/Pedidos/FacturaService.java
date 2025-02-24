package com.com.smm.application.services.Pedidos;


import com.com.smm.domain.model.Pedidos.Factura;
import com.com.smm.domain.ports.in.Pedidos.Factura.CreateFacturaUseCase;
import com.com.smm.domain.ports.in.Pedidos.Factura.DeleteFacturaUseCase;
import com.com.smm.domain.ports.in.Pedidos.Factura.RetrieveFacturaUseCase;
import com.com.smm.domain.ports.in.Pedidos.Factura.UpdateFacturaUseCase;
import com.com.smm.infrastructure.entities.Pedidos.Facturas;

import java.util.List;
import java.util.Optional;

public class FacturaService implements CreateFacturaUseCase, RetrieveFacturaUseCase, UpdateFacturaUseCase, DeleteFacturaUseCase {

    private final CreateFacturaUseCase createFacturaUseCase;
    private final RetrieveFacturaUseCase retrieveFacturasUseCase;
    private final UpdateFacturaUseCase updateFacturasUseCase;
    private final DeleteFacturaUseCase deleteFacturasUseCase;

    public FacturaService(CreateFacturaUseCase createFacturaUseCase, RetrieveFacturaUseCase retrieveFacturasUseCase,
                          UpdateFacturaUseCase updateFacturasUseCase, DeleteFacturaUseCase deleteFacturasUseCase
                        ) {
        this.createFacturaUseCase = createFacturaUseCase;
        this.retrieveFacturasUseCase = retrieveFacturasUseCase;
        this.updateFacturasUseCase = updateFacturasUseCase;
        this.deleteFacturasUseCase = deleteFacturasUseCase;
    }

    @Override
    public Facturas createFactura(Facturas Facturas) {
        return createFacturaUseCase.createFactura(Facturas);
    }

    @Override
    public Optional<Factura> getFacturaById(Long id) {
        return retrieveFacturasUseCase.getFacturaById(id);
    }

    @Override
    public List<Factura> getAllFactura() {
        return retrieveFacturasUseCase.getAllFactura();
    }

    @Override
    public Optional<Factura> updateCategoria(Long id, Facturas updatedFactura) {
        return Optional.empty();
    }

    @Override
    public Optional<Factura> updateFactura(Long id, Facturas updatedFacturas) {
        return updateFacturasUseCase.updateFactura(id, updatedFacturas);
    }

    @Override
    public boolean deleteFactura(Long id) {
        return deleteFacturasUseCase.deleteFactura(id);
    }



}