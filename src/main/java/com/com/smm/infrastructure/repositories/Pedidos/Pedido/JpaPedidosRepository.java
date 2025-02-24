package com.com.smm.infrastructure.repositories.Pedidos.Pedido;

import com.com.smm.infrastructure.entities.Pedidos.Pedidos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaPedidosRepository extends JpaRepository<Pedidos, Long> {
    // Puedes agregar consultas personalizadas si lo necesitas
}
