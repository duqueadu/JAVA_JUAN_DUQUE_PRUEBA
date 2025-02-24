package com.com.smm.application.usecases.Pedidos.DetallePedido;


import com.com.smm.domain.ports.in.Pedidos.DetallePedido.DeleteDetallePedidoUseCase;
import com.com.smm.domain.ports.out.Pedidos.DetallePedido.DetallePedidoRepositoryPort;

public class DeleteDetallePedidoUseCaseImpl implements DeleteDetallePedidoUseCase {

    private final DetallePedidoRepositoryPort DetallePedidoRepositoryPort;

    public DeleteDetallePedidoUseCaseImpl(DetallePedidoRepositoryPort DetallePedidoRepositoryPort) {
        this.DetallePedidoRepositoryPort = DetallePedidoRepositoryPort;
    }

    @Override
    public boolean deleteDetallePedido(Long id) {
        return DetallePedidoRepositoryPort.deleteById(id);
    }
}
