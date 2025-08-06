package com.com.smm.domain.ports.in.Pedidos.Factura;


import com.com.smm.domain.model.Pedidos.Factura;
import com.com.smm.infrastructure.entities.Pedidos.Facturas;


public interface CreateFacturaUseCase {
    Factura createFactura(Factura Facturas);
}