package com.com.smm.application.services.Pedidos;


import com.com.smm.domain.model.Pedidos.Envio;
import com.com.smm.domain.ports.in.Pedidos.Envio.CreateEnvioUseCase;
import com.com.smm.domain.ports.in.Pedidos.Envio.DeleteEnvioUseCase;
import com.com.smm.domain.ports.in.Pedidos.Envio.RetrieveEnvioUseCase;
import com.com.smm.domain.ports.in.Pedidos.Envio.UpdateEnvioUseCase;
import com.com.smm.infrastructure.entities.Pedidos.Envios;

import java.util.List;
import java.util.Optional;

public class EnvioService implements CreateEnvioUseCase, RetrieveEnvioUseCase, UpdateEnvioUseCase, DeleteEnvioUseCase {

    private final CreateEnvioUseCase createEnvioUseCase;
    private final RetrieveEnvioUseCase retrieveEnviosUseCase;
    private final UpdateEnvioUseCase updateEnviosUseCase;
    private final DeleteEnvioUseCase deleteEnviosUseCase;

    public EnvioService(CreateEnvioUseCase createEnvioUseCase, RetrieveEnvioUseCase retrieveEnviosUseCase,
                        UpdateEnvioUseCase updateEnviosUseCase, DeleteEnvioUseCase deleteEnviosUseCase
                        ) {
        this.createEnvioUseCase = createEnvioUseCase;
        this.retrieveEnviosUseCase = retrieveEnviosUseCase;
        this.updateEnviosUseCase = updateEnviosUseCase;
        this.deleteEnviosUseCase = deleteEnviosUseCase;
    }

    @Override
    public Envios createEnvio(Envios Envios) {
        return createEnvioUseCase.createEnvio(Envios);
    }

    @Override
    public Optional<Envio> getEnvioById(Long id) {
        return retrieveEnviosUseCase.getEnvioById(id);
    }

    @Override
    public List<Envio> getAllEnvio() {
        return retrieveEnviosUseCase.getAllEnvio();
    }

    @Override
    public Optional<Envios> updateEnvio(Long id, Envios updatedEnvios) {
        return updateEnviosUseCase.updateEnvio(id, updatedEnvios);
    }

    @Override
    public boolean deleteEnvio(Long id) {
        return deleteEnviosUseCase.deleteEnvio(id);
    }



}