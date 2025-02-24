package com.com.smm.application.usecases.Pedidos.Pedido;


import com.com.smm.domain.ports.in.Pedidos.Pedido.DeletePedidoUseCase;
import com.com.smm.domain.ports.out.Pedidos.Pedido.PedidoRepositoryPort;

public class DeletePedidoUseCaseImpl implements DeletePedidoUseCase {

    private final com.com.smm.domain.ports.out.Pedidos.Pedido.PedidoRepositoryPort PedidoRepositoryPort;

    public DeletePedidoUseCaseImpl(PedidoRepositoryPort PedidoRepositoryPort) {
        this.PedidoRepositoryPort = PedidoRepositoryPort;
    }

    @Override
    public boolean deletePedido(Long id) {
        return PedidoRepositoryPort.deleteById(id);
    }
}
