package com.com.smm.application.usecases.Pedidos.Pedido;

import com.com.smm.domain.ports.in.Pedidos.Pedido.UpdatePedidoUseCase;
import com.com.smm.domain.ports.out.Pedidos.Pedido.PedidoRepositoryPort;
import com.com.smm.infrastructure.entities.Pedidos.Pedidos;

import java.util.Optional;

public class UpdatePedidoUseCaseImpl implements UpdatePedidoUseCase {

    private final com.com.smm.domain.ports.out.Pedidos.Pedido.PedidoRepositoryPort PedidoRepositoryPort;

    public UpdatePedidoUseCaseImpl(PedidoRepositoryPort PedidoRepositoryPort) {
        this.PedidoRepositoryPort = PedidoRepositoryPort;
    }

    @Override
    public Optional<Pedidos> updatePedido(Long id, Pedidos updatePedidos) {
        return PedidoRepositoryPort.update(updatePedidos);
    }
}
