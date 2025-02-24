package com.com.smm.infrastructure.repositories.Pedidos.Pedido;

import com.com.smm.domain.model.Pedidos.Pedido;
import com.com.smm.domain.ports.out.Pedidos.Pedido.PedidoRepositoryPort;
import com.com.smm.infrastructure.entities.Pedidos.Pedidos;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class JpaPedidoRepositoryAdapter implements PedidoRepositoryPort {

    private final JpaPedidosRepository jpaPedidoRepository;

    public JpaPedidoRepositoryAdapter(JpaPedidosRepository jpaPedidoRepository) {
        this.jpaPedidoRepository = jpaPedidoRepository;
    }


    @Override
    public Pedido save(Pedido Pedido) {
        Pedidos taskEntity = Pedidos.fromDomainModel(Pedido);
        Pedidos savedTaskEntity = jpaPedidoRepository.save(taskEntity);
        return savedTaskEntity.toDomainModel();
    }

    @Override
    public Optional<Pedido> findById(Long id) {
        return jpaPedidoRepository.findById(id).map(Pedidos::toDomainModel);
    }

    @Override
    public List<Pedido> findAll() {
        return jpaPedidoRepository.findAll().stream()
                .map(Pedidos::toDomainModel)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Pedidos> update(Pedidos Pedido) {
        return Optional.empty();
    }

    @Override
    public Optional<Pedido> update(Pedido Pedido) {
        if (jpaPedidoRepository.existsById(Pedido.getId())) {
            Pedidos taskEntity = Pedidos.fromDomainModel(Pedido);
            Pedidos updatedTaskEntity = jpaPedidoRepository.save(taskEntity);
            return Optional.of(updatedTaskEntity.toDomainModel());
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Long id) {
        if (jpaPedidoRepository.existsById(id)) {
            jpaPedidoRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
