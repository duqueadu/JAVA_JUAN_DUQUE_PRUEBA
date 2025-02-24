package com.com.smm.infrastructure.repositories.Pedidos.DetallePedido;

import com.com.smm.domain.model.Pedidos.DetallePedido;
import com.com.smm.domain.model.Producto.Categoria;
import com.com.smm.domain.ports.out.Pedidos.DetallePedido.DetallePedidoRepositoryPort;
import com.com.smm.infrastructure.entities.Pedidos.DetallePedidos;
import com.com.smm.infrastructure.entities.Pedidos.Envios;
import com.com.smm.infrastructure.entities.Producto.Categorias;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class JpaDetallePedidoRepositoryAdapter implements DetallePedidoRepositoryPort {

    private final JpaDetallePedidoRepository jpaDetallePedidoRepository;

    public JpaDetallePedidoRepositoryAdapter(JpaDetallePedidoRepository jpaDetallePedidoRepository) {
        this.jpaDetallePedidoRepository = jpaDetallePedidoRepository;
    }



    @Override
    public DetallePedidos save(DetallePedidos DetallePedido) {
        return jpaDetallePedidoRepository.save(DetallePedido);
    }



    @Override
    public Optional<DetallePedido> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<DetallePedido> findAll() {
        return jpaDetallePedidoRepository.findAll().stream()
                .map(DetallePedidos::toDomainModel)
                .collect(Collectors.toList());
    }


    @Override
    public Optional<DetallePedido> update(DetallePedidos DetallePedido) {
        return Optional.empty();
    }

    @Override
    public Optional<DetallePedido> update(DetallePedido DetallePedido) {
        return Optional.empty();
    }





    @Override
    public boolean deleteById(Long id) {
        if (jpaDetallePedidoRepository.existsById(id)) {
            jpaDetallePedidoRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
