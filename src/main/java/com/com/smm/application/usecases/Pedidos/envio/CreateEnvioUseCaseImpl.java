package com.com.smm.application.usecases.Pedidos.envio;


import com.com.smm.domain.model.Pedidos.Envio;
import com.com.smm.domain.ports.in.Pedidos.Envio.CreateEnvioUseCase;
import com.com.smm.domain.ports.out.Pedidos.Envio.EnvioRepositoryPort;
import com.com.smm.infrastructure.entities.Pedidos.Envios;


public class CreateEnvioUseCaseImpl implements CreateEnvioUseCase {

    private final  EnvioRepositoryPort EnvioRepositoryPort;

    public CreateEnvioUseCaseImpl(EnvioRepositoryPort EnvioRepositoryPort) {
        this.EnvioRepositoryPort = EnvioRepositoryPort;
    }

    @Override
    public Envio createEnvio(Envio envios) {
        return EnvioRepositoryPort.save(envios);
    }
}