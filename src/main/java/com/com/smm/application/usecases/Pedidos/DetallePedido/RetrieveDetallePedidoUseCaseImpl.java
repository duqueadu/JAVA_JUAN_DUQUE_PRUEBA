package com.com.smm.application.usecases.Pedidos.DetallePedido;



import com.com.smm.domain.model.Pedidos.DetallePedido;
import com.com.smm.domain.ports.in.Pedidos.DetallePedido.RetrieveDetallePedidoUseCase;
import com.com.smm.domain.ports.out.Pedidos.DetallePedido.DetallePedidoRepositoryPort;

import java.util.List;
import java.util.Optional;

public class RetrieveDetallePedidoUseCaseImpl implements RetrieveDetallePedidoUseCase {

    private final DetallePedidoRepositoryPort DetallePedidoRepositoryPort;

    public RetrieveDetallePedidoUseCaseImpl(com.com.smm.domain.ports.out.Pedidos.DetallePedido.DetallePedidoRepositoryPort DetallePedidoRepositoryPort) {
        this.DetallePedidoRepositoryPort = DetallePedidoRepositoryPort;
    }



    @Override
    public Optional<DetallePedido> getDetallePedidoById(Long id) {
        return DetallePedidoRepositoryPort.findById(id);
    }

    @Override
    public List<DetallePedido> getAllDetallePedido() {
        return DetallePedidoRepositoryPort.findAll();
    }
}
