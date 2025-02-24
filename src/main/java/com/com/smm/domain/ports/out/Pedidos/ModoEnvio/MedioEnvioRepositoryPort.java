package com.com.smm.domain.ports.out.Pedidos.ModoEnvio;



import com.com.smm.domain.model.Pedidos.MedioEnvio;
import com.com.smm.infrastructure.entities.Pedidos.MedioEnvios;

import java.util.List;
import java.util.Optional;

public interface MedioEnvioRepositoryPort {
    MedioEnvio save(MedioEnvio MedioEnvio);

    MedioEnvios save(MedioEnvios MedioEnvio);
    Optional<MedioEnvio> findById(Long id);
    List<MedioEnvio> findAll();

    Optional<MedioEnvios> update(MedioEnvios MedioEnvio);

    Optional<MedioEnvio> update(MedioEnvio MedioEnvio);
    boolean deleteById(Long id);
}
