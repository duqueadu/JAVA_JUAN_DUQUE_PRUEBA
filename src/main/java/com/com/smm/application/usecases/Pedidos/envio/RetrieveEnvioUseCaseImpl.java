package com.com.smm.application.usecases.Pedidos.envio;




import com.com.smm.domain.model.Pedidos.Envio;
import com.com.smm.domain.ports.in.Pedidos.Envio.RetrieveEnvioUseCase;

import com.com.smm.domain.ports.out.Pedidos.Envio.EnvioRepositoryPort;

import java.util.List;
import java.util.Optional;

public class RetrieveEnvioUseCaseImpl implements RetrieveEnvioUseCase {

    private final EnvioRepositoryPort EnvioRepositoryPort;

    public RetrieveEnvioUseCaseImpl(EnvioRepositoryPort EnvioRepositoryPort) {
        this.EnvioRepositoryPort = EnvioRepositoryPort;
    }



    @Override
    public Optional<Envio> getEnvioById(Long id) {
        return EnvioRepositoryPort.findById(id);
    }

    @Override
    public List<Envio> getAllEnvio() {
        return EnvioRepositoryPort.findAll();
    }
}
