package com.com.smm.application.usecases.Pedidos.Pedido;


import com.com.smm.domain.model.Pedidos.Pedido;
import com.com.smm.domain.ports.in.Pedidos.Pedido.CreatePedidoUseCase;
import com.com.smm.domain.ports.out.Pedidos.Pedido.PedidoRepositoryPort;
import com.com.smm.infrastructure.entities.Pedidos.Pedidos;

public class CreatePedidoUseCaseImpl implements CreatePedidoUseCase {

    private final PedidoRepositoryPort PedidoRepositoryPort;

    public CreatePedidoUseCaseImpl(PedidoRepositoryPort PedidoRepositoryPort) {
        this.PedidoRepositoryPort = PedidoRepositoryPort;
    }

    @Override
    public Pedido createPedido(Pedido Pedidos) {
        return PedidoRepositoryPort.save(Pedidos);
    }
}