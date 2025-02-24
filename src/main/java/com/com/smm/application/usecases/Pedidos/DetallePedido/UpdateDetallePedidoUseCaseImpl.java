package com.com.smm.application.usecases.Pedidos.DetallePedido;



import com.com.smm.domain.model.Pedidos.DetallePedido;
import com.com.smm.domain.ports.in.Pedidos.DetallePedido.UpdateDetallePedidoUseCase;
import com.com.smm.domain.ports.out.Pedidos.DetallePedido.DetallePedidoRepositoryPort;
import com.com.smm.infrastructure.entities.Pedidos.DetallePedidos;

import java.util.Optional;

public class UpdateDetallePedidoUseCaseImpl implements UpdateDetallePedidoUseCase {

    private final com.com.smm.domain.ports.out.Pedidos.DetallePedido.DetallePedidoRepositoryPort DetallePedidoRepositoryPort;

    public UpdateDetallePedidoUseCaseImpl(DetallePedidoRepositoryPort DetallePedidoRepositoryPort) {
        this.DetallePedidoRepositoryPort = DetallePedidoRepositoryPort;
    }

    @Override
    public Optional<DetallePedido> updateDetallePedido(Long id, DetallePedidos updateDetallePedidos) {
        return DetallePedidoRepositoryPort.update(updateDetallePedidos);
    }
}
