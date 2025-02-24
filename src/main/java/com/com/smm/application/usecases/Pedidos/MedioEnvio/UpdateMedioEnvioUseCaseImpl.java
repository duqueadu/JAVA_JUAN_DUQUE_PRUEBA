package com.com.smm.application.usecases.Pedidos.MedioEnvio;



import com.com.smm.domain.ports.in.Pedidos.MedioEnvio.UpdateMedioEnvioUseCase;
import com.com.smm.domain.ports.out.Pedidos.ModoEnvio.MedioEnvioRepositoryPort;
import com.com.smm.infrastructure.entities.Pedidos.MedioEnvios;

import java.util.Optional;

public class UpdateMedioEnvioUseCaseImpl implements UpdateMedioEnvioUseCase {

    private final MedioEnvioRepositoryPort MedioEnvioRepositoryPort;

    public UpdateMedioEnvioUseCaseImpl(MedioEnvioRepositoryPort MedioEnvioRepositoryPort) {
        this.MedioEnvioRepositoryPort = MedioEnvioRepositoryPort;
    }

    @Override
    public Optional<MedioEnvios> updateMedioEnvio(Long id, MedioEnvios updateMedioEnvios) {
        return MedioEnvioRepositoryPort.update(updateMedioEnvios);
    }
}
