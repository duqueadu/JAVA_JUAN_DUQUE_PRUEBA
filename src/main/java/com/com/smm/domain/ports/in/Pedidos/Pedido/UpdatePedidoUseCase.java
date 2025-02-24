package com.com.smm.domain.ports.in.Pedidos.Pedido;

import com.com.smm.infrastructure.entities.Pedidos.Pedidos;

import java.util.Optional;

public interface UpdatePedidoUseCase {
    Optional<Pedidos> updatePedido(Long id, Pedidos updatedPermiso);
}
