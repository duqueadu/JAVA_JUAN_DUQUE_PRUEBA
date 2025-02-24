package com.com.smm.infrastructure.repositories.Pedidos.ModoEnvio;

import com.com.smm.domain.model.Pedidos.MedioEnvio;
import com.com.smm.domain.ports.out.Pedidos.ModoEnvio.MedioEnvioRepositoryPort;
import com.com.smm.infrastructure.entities.Pedidos.MedioEnvios;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class JpaMedioEnvioRepitoryAdapter implements MedioEnvioRepositoryPort {

    private final JpaMedioEnvioRepository jpaMedioEnvioRepository;

    public JpaMedioEnvioRepitoryAdapter(JpaMedioEnvioRepository jpaMedioEnvioRepository) {
        this.jpaMedioEnvioRepository = jpaMedioEnvioRepository;
    }

    @Override
    public MedioEnvios save(MedioEnvios MedioEnvio) {
        return null;
    }

    @Override
    public MedioEnvio save(MedioEnvio MedioEnvio) {
        MedioEnvios taskEntity = MedioEnvios.fromDomainModel(MedioEnvio);
        MedioEnvios savedTaskEntity = jpaMedioEnvioRepository.save(taskEntity);
        return savedTaskEntity.toDomainModel();
    }

    @Override
    public Optional<MedioEnvio> findById(Long id) {
        return jpaMedioEnvioRepository.findById(id).map(MedioEnvios::toDomainModel);
    }

    @Override
    public List<MedioEnvio> findAll() {
        return jpaMedioEnvioRepository.findAll().stream()
                .map(MedioEnvios::toDomainModel)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<MedioEnvios> update(MedioEnvios MedioEnvio) {
        return Optional.empty();
    }

    @Override
    public Optional<MedioEnvio> update(MedioEnvio MedioEnvio) {
        if (jpaMedioEnvioRepository.existsById(MedioEnvio.getId())) {
            MedioEnvios taskEntity = MedioEnvios.fromDomainModel(MedioEnvio);
            MedioEnvios updatedTaskEntity = jpaMedioEnvioRepository.save(taskEntity);
            return Optional.of(updatedTaskEntity.toDomainModel());
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Long id) {
        if (jpaMedioEnvioRepository.existsById(id)) {
            jpaMedioEnvioRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
