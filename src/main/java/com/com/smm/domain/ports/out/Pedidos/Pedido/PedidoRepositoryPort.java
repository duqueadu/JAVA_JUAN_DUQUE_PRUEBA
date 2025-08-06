package com.com.smm.domain.ports.out.Pedidos.Pedido;



import com.com.smm.domain.model.Pedidos.DetalleP;
import com.com.smm.domain.model.Pedidos.Pedido;
import com.com.smm.infrastructure.entities.Pedidos.Pedidos;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface PedidoRepositoryPort {
    Pedido save(Pedido Pedido);

    Optional<Pedido> findById(Long id);
    List<Pedido> findAll();

    Optional<Pedido> update(Pedido Pedido);

    Optional<Pedidos> update(Pedidos Pedido);

    Map<String, Object> obtenerDetallePedido(@Param("pedidoId") Long pedidoId);

    boolean deleteById(Long id);
}
