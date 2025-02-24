package com.com.smm.domain.ports.in.Pedidos.MedioEnvio;

import com.com.smm.domain.model.Pedidos.MedioEnvio;

import java.util.List;
import java.util.Optional;

public interface RetrieveMedioEnvioUseCase {
    Optional<MedioEnvio> getMedioEnvioById(Long id);
    List<MedioEnvio> getAllMedioEnvio();
}
