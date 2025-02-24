package com.com.smm.application.usecases.Pedidos.MedioEnvio;



import com.com.smm.domain.model.Pedidos.MedioEnvio;
import com.com.smm.domain.ports.in.Pedidos.MedioEnvio.RetrieveMedioEnvioUseCase;
import com.com.smm.domain.ports.out.Pedidos.ModoEnvio.MedioEnvioRepositoryPort;

import java.util.List;
import java.util.Optional;

public class RetrieveMedioEnvioUseCaseImpl implements RetrieveMedioEnvioUseCase {

    private final MedioEnvioRepositoryPort MedioEnvioRepositoryPort;

    public RetrieveMedioEnvioUseCaseImpl(com.com.smm.domain.ports.out.Pedidos.ModoEnvio.MedioEnvioRepositoryPort MedioEnvioRepositoryPort) {
        this.MedioEnvioRepositoryPort = MedioEnvioRepositoryPort;
    }



    @Override
    public Optional<MedioEnvio> getMedioEnvioById(Long id) {
        return MedioEnvioRepositoryPort.findById(id);
    }

    @Override
    public List<MedioEnvio> getAllMedioEnvio() {
        return MedioEnvioRepositoryPort.findAll();
    }
}
