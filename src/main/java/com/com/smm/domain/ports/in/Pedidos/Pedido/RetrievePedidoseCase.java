package com.com.smm.domain.ports.in.Pedidos.Pedido;


import com.com.smm.domain.model.Pedidos.DetalleP;
import com.com.smm.domain.model.Pedidos.Pedido;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface RetrievePedidoseCase {
    Optional<Pedido> getPedidoById(Long id);
    List<Pedido> getAllPedido();

    Map<String, Object> obtenerDetallePedido(@Param("pedidoId") Long pedidoId);
}
