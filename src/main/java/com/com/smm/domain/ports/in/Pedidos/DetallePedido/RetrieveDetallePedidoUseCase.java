package com.com.smm.domain.ports.in.Pedidos.DetallePedido;

import com.com.smm.domain.model.Pedidos.DetallePedido;

import java.util.List;
import java.util.Optional;

public interface RetrieveDetallePedidoUseCase {
    Optional<DetallePedido> getDetallePedidoById(Long id);
    List<DetallePedido> getAllDetallePedido();
}
