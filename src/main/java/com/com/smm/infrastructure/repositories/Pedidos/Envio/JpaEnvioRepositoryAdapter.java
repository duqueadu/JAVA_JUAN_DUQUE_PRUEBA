package com.com.smm.infrastructure.repositories.Pedidos.Envio;

import com.com.smm.domain.model.Pedidos.Envio;
import com.com.smm.domain.ports.out.Pedidos.Envio.EnvioRepositoryPort;
import com.com.smm.infrastructure.entities.Pedidos.Envios;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class JpaEnvioRepositoryAdapter implements EnvioRepositoryPort {

    private final JpaEnvioRepository jpaEnvioRepository;

    public JpaEnvioRepositoryAdapter(JpaEnvioRepository jpaEnvioRepository) {
        this.jpaEnvioRepository = jpaEnvioRepository;
    }

    @Override
    public Envios save(Envios Envio) {
        return null;
    }

    @Override
    public Envio save(Envio Envio) {
        Envios taskEntity = Envios.fromDomainModel(Envio);
        Envios savedTaskEntity = jpaEnvioRepository.save(taskEntity);
        return savedTaskEntity.toDomainModel();
    }

    @Override
    public Optional<Envio> findById(Long id) {
        return jpaEnvioRepository.findById(id).map(Envios::toDomainModel);
    }

    @Override
    public List<Envio> findAll() {
        return jpaEnvioRepository.findAll().stream()
                .map(Envios::toDomainModel)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Envios> update(Envios Envio) {
        return Optional.empty();
    }


    @Override
    public Optional<Envio> update(Envio Envio) {
        if (jpaEnvioRepository.existsById(Envio.getId())) {
            Envios taskEntity = Envios.fromDomainModel(Envio);
            Envios updatedTaskEntity = jpaEnvioRepository.save(taskEntity);
            return Optional.of(updatedTaskEntity.toDomainModel());
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Long id) {
        if (jpaEnvioRepository.existsById(id)) {
            jpaEnvioRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
