package com.com.smm.infrastructure.repositories.Pedidos.Factura;

import com.com.smm.domain.model.Pedidos.Factura;
import com.com.smm.domain.ports.out.Pedidos.Factura.FacturaRepositoryPort;
import com.com.smm.infrastructure.entities.Pedidos.Facturas;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class JpaFacturaRepitoryAdapter implements FacturaRepositoryPort {

    private final JpaFacturaRepository jpaFacturaRepository;

    public JpaFacturaRepitoryAdapter(JpaFacturaRepository jpaFacturaRepository) {
        this.jpaFacturaRepository = jpaFacturaRepository;
    }


    @Override
    public Factura save(Factura Factura) {
        Facturas taskEntity = Facturas.fromDomainModel(Factura);
        Facturas savedTaskEntity = jpaFacturaRepository.save(taskEntity);
        return savedTaskEntity.toDomainModel();
    }

    @Override
    public Optional<Factura> findById(Long id) {
        return jpaFacturaRepository.findById(id).map(Facturas::toDomainModel);
    }

    @Override
    public List<Factura> findAll() {
        return jpaFacturaRepository.findAll().stream()
                .map(Facturas::toDomainModel)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Factura> update(Facturas Factura) {
        return Optional.empty();
    }

    @Override
    public Optional<Factura> update(Factura Factura) {
        if (jpaFacturaRepository.existsById(Factura.getId())) {
            Facturas taskEntity = Facturas.fromDomainModel(Factura);
            Facturas updatedTaskEntity = jpaFacturaRepository.save(taskEntity);
            return Optional.of(updatedTaskEntity.toDomainModel());
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Long id) {
        if (jpaFacturaRepository.existsById(id)) {
            jpaFacturaRepository.deleteById(id);
            return true;
        }
        return false;
    }


}
