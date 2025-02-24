package com.com.smm.infrastructure.repositories.Pedidos.DetallePedido;

import com.com.smm.infrastructure.entities.Pedidos.DetallePedidos;
import com.com.smm.infrastructure.entities.Producto.Categorias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaDetallePedidoRepository extends JpaRepository<DetallePedidos, Long> {
    // Puedes agregar consultas personalizadas si lo necesitas
}
