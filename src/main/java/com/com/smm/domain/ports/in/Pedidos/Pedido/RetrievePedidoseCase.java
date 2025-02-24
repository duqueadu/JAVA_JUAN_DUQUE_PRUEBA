package com.com.smm.domain.ports.in.Pedidos.Pedido;


import com.com.smm.domain.model.Pedidos.Pedido;

import java.util.List;
import java.util.Optional;

public interface RetrievePedidoseCase {
    Optional<Pedido> getPedidoById(Long id);
    List<Pedido> getAllPedido();
}
