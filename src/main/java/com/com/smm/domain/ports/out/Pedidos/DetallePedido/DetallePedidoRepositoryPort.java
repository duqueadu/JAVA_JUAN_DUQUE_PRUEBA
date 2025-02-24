package com.com.smm.domain.ports.out.Pedidos.DetallePedido;



import com.com.smm.domain.model.Pedidos.DetallePedido;
import com.com.smm.infrastructure.entities.Pedidos.DetallePedidos;

import java.util.List;
import java.util.Optional;

public interface DetallePedidoRepositoryPort {
    DetallePedidos save(DetallePedidos DetallePedido);

    Optional<DetallePedido> findById(Long id);
    List<DetallePedido> findAll();

    Optional<DetallePedido> update(DetallePedidos DetallePedido);

    Optional<DetallePedido> update(DetallePedido DetallePedido);
    boolean deleteById(Long id);
}
