package com.com.smm.application.usecases.Pedidos.envio;



import com.com.smm.domain.ports.in.Pedidos.Envio.UpdateEnvioUseCase;
import com.com.smm.domain.ports.out.Pedidos.Envio.EnvioRepositoryPort;
import com.com.smm.infrastructure.entities.Pedidos.Envios;

import java.util.Optional;

public class UpdateEnvioUseCaseImpl implements UpdateEnvioUseCase {

    private final EnvioRepositoryPort EnvioRepositoryPort;

    public UpdateEnvioUseCaseImpl(com.com.smm.domain.ports.out.Pedidos.Envio.EnvioRepositoryPort EnvioRepositoryPort) {
        this.EnvioRepositoryPort = EnvioRepositoryPort;
    }

    @Override
    public Optional<Envios> updateEnvio(Long id, Envios updateEnvios) {
        return EnvioRepositoryPort.update(updateEnvios);
    }
}
