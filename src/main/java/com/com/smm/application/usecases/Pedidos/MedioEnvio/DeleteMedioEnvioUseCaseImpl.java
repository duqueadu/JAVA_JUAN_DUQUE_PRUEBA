package com.com.smm.application.usecases.Pedidos.MedioEnvio;


import com.com.smm.domain.ports.in.Pedidos.MedioEnvio.DeleteMedioEnvioUseCase;
import com.com.smm.domain.ports.out.Pedidos.ModoEnvio.MedioEnvioRepositoryPort;

public class DeleteMedioEnvioUseCaseImpl implements DeleteMedioEnvioUseCase {

    private final MedioEnvioRepositoryPort MedioEnvioRepositoryPort;

    public DeleteMedioEnvioUseCaseImpl(com.com.smm.domain.ports.out.Pedidos.ModoEnvio.MedioEnvioRepositoryPort MedioEnvioRepositoryPort) {
        this.MedioEnvioRepositoryPort = MedioEnvioRepositoryPort;
    }

    @Override
    public boolean deleteMedioEnvio(Long id) {
        return MedioEnvioRepositoryPort.deleteById(id);
    }
}
