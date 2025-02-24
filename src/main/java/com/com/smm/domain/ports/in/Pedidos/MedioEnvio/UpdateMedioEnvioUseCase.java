package com.com.smm.domain.ports.in.Pedidos.MedioEnvio;

import com.com.smm.infrastructure.entities.Pedidos.MedioEnvios;

import java.util.Optional;

public interface UpdateMedioEnvioUseCase {
    Optional<MedioEnvios> updateMedioEnvio(Long id, MedioEnvios updatedPermiso);
}
