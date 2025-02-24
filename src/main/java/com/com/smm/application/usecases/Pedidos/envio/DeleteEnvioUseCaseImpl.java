package com.com.smm.application.usecases.Pedidos.envio;


import com.com.smm.domain.ports.in.Pedidos.Envio.DeleteEnvioUseCase;
import com.com.smm.domain.ports.out.Pedidos.Envio.EnvioRepositoryPort;

public class DeleteEnvioUseCaseImpl implements DeleteEnvioUseCase {

    private final EnvioRepositoryPort EnvioRepositoryPort;

    public DeleteEnvioUseCaseImpl(com.com.smm.domain.ports.out.Pedidos.Envio.EnvioRepositoryPort EnvioRepositoryPort) {
        this.EnvioRepositoryPort = EnvioRepositoryPort;
    }

    @Override
    public boolean deleteEnvio(Long id) {
        return EnvioRepositoryPort.deleteById(id);
    }
}
