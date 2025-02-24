package com.com.smm.domain.ports.in.Pedidos.Pedido;


import com.com.smm.domain.model.Pedidos.Pedido;


public interface CreatePedidoUseCase {
    Pedido createPedido(Pedido pedido);
}