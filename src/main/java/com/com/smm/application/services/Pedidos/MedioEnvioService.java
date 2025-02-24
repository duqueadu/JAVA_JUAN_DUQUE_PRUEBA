package com.com.smm.application.services.Pedidos;


import com.com.smm.domain.model.Pedidos.MedioEnvio;

import com.com.smm.domain.ports.in.Pedidos.MedioEnvio.CreateMedioEnvioUseCase;
import com.com.smm.domain.ports.in.Pedidos.MedioEnvio.DeleteMedioEnvioUseCase;
import com.com.smm.domain.ports.in.Pedidos.MedioEnvio.RetrieveMedioEnvioUseCase;
import com.com.smm.domain.ports.in.Pedidos.MedioEnvio.UpdateMedioEnvioUseCase;
import com.com.smm.infrastructure.entities.Pedidos.MedioEnvios;

import java.util.List;
import java.util.Optional;

public class MedioEnvioService implements CreateMedioEnvioUseCase, RetrieveMedioEnvioUseCase, UpdateMedioEnvioUseCase, DeleteMedioEnvioUseCase {

    private final CreateMedioEnvioUseCase createMedioEnvioUseCase;
    private final RetrieveMedioEnvioUseCase retrieveMedioEnviosUseCase;
    private final UpdateMedioEnvioUseCase updateMedioEnviosUseCase;
    private final DeleteMedioEnvioUseCase deleteMedioEnviosUseCase;

    public MedioEnvioService(CreateMedioEnvioUseCase createMedioEnvioUseCase, RetrieveMedioEnvioUseCase retrieveMedioEnviosUseCase,
                             UpdateMedioEnvioUseCase updateMedioEnviosUseCase, DeleteMedioEnvioUseCase deleteMedioEnviosUseCase
                        ) {
        this.createMedioEnvioUseCase = createMedioEnvioUseCase;
        this.retrieveMedioEnviosUseCase = retrieveMedioEnviosUseCase;
        this.updateMedioEnviosUseCase = updateMedioEnviosUseCase;
        this.deleteMedioEnviosUseCase = deleteMedioEnviosUseCase;
    }

    @Override
    public MedioEnvios createMedioEnvio(MedioEnvios MedioEnvios) {
        return createMedioEnvioUseCase.createMedioEnvio(MedioEnvios);
    }

    @Override
    public Optional<MedioEnvio> getMedioEnvioById(Long id) {
        return retrieveMedioEnviosUseCase.getMedioEnvioById(id);
    }

    @Override
    public List<MedioEnvio> getAllMedioEnvio() {
        return retrieveMedioEnviosUseCase.getAllMedioEnvio();
    }

    @Override
    public Optional<MedioEnvios> updateMedioEnvio(Long id, MedioEnvios updatedMedioEnvios) {
        return updateMedioEnviosUseCase.updateMedioEnvio(id, updatedMedioEnvios);
    }

    @Override
    public boolean deleteMedioEnvio(Long id) {
        return deleteMedioEnviosUseCase.deleteMedioEnvio(id);
    }



}