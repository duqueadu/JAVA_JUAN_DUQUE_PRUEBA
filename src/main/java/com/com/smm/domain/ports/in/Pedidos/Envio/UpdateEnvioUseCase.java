package com.com.smm.domain.ports.in.Pedidos.Envio;

import com.com.smm.infrastructure.entities.Pedidos.Envios;

import java.util.Optional;

public interface UpdateEnvioUseCase {
    Optional<Envios> updateEnvio(Long id, Envios updatedPermiso);
}
