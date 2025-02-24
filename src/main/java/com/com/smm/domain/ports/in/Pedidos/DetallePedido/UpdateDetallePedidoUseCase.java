package com.com.smm.domain.ports.in.Pedidos.DetallePedido;

import com.com.smm.domain.model.Pedidos.DetallePedido;
import com.com.smm.infrastructure.entities.Pedidos.DetallePedidos;

import java.util.Optional;

public interface UpdateDetallePedidoUseCase {
    Optional<DetallePedido> updateDetallePedido(Long id, DetallePedidos updatedPermiso);
}
