package com.com.smm.application.usecases.Pedidos.Pedido;



import com.com.smm.domain.model.Pedidos.DetalleP;
import com.com.smm.domain.model.Pedidos.Pedido;
import com.com.smm.domain.ports.in.Pedidos.Pedido.RetrievePedidoseCase;
import com.com.smm.domain.ports.out.Pedidos.Pedido.PedidoRepositoryPort;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class RetrievePedidoUseCaseImpl implements RetrievePedidoseCase {

    private final PedidoRepositoryPort PedidoRepositoryPort;

    public RetrievePedidoUseCaseImpl(PedidoRepositoryPort PedidoRepositoryPort) {
        this.PedidoRepositoryPort = PedidoRepositoryPort;
    }



    @Override
    public Optional<Pedido> getPedidoById(Long id) {
        return PedidoRepositoryPort.findById(id);
    }

    @Override
    public List<Pedido> getAllPedido() {
        return PedidoRepositoryPort.findAll();
    }

    @Override
    public Map<String, Object> obtenerDetallePedido(@Param("pedidoId") Long pedidoId) {

        return PedidoRepositoryPort.obtenerDetallePedido(pedidoId);
    }

}
