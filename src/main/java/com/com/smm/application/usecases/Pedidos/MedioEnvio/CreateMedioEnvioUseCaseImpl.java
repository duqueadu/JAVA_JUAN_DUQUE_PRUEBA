package com.com.smm.application.usecases.Pedidos.MedioEnvio;


import com.com.smm.domain.ports.in.Pedidos.MedioEnvio.CreateMedioEnvioUseCase;
import com.com.smm.domain.ports.out.Pedidos.ModoEnvio.MedioEnvioRepositoryPort;
import com.com.smm.infrastructure.entities.Pedidos.MedioEnvios;

public class CreateMedioEnvioUseCaseImpl implements CreateMedioEnvioUseCase {

    private final MedioEnvioRepositoryPort MedioEnvioRepositoryPort;

    public CreateMedioEnvioUseCaseImpl(MedioEnvioRepositoryPort MedioEnvioRepositoryPort) {
        this.MedioEnvioRepositoryPort = MedioEnvioRepositoryPort;
    }

    @Override
    public MedioEnvios createMedioEnvio(MedioEnvios MedioEnvios) {
        return MedioEnvioRepositoryPort.save(MedioEnvios);
    }
}