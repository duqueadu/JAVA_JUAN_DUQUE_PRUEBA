package com.com.smm.application.usecases.Pedidos.DetallePedido;


import com.com.smm.domain.ports.in.Pedidos.DetallePedido.CreateDetallePedidoUseCase;
import com.com.smm.domain.ports.out.Pedidos.DetallePedido.DetallePedidoRepositoryPort;
import com.com.smm.infrastructure.entities.Pedidos.DetallePedidos;


public class CreateDetallePedidoUseCaseImpl implements CreateDetallePedidoUseCase {

    private final DetallePedidoRepositoryPort detallePedidoRepositoryPort;

    public CreateDetallePedidoUseCaseImpl(DetallePedidoRepositoryPort detallePedidoRepositoryPort) {
        this.detallePedidoRepositoryPort = detallePedidoRepositoryPort;
    }

    @Override
    public DetallePedidos createDetallePedido(DetallePedidos DetallePedidos) {
        return detallePedidoRepositoryPort.save(DetallePedidos);
    }
}