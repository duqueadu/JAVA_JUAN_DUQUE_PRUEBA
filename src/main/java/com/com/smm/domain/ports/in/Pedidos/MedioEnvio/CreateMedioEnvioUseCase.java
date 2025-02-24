package com.com.smm.domain.ports.in.Pedidos.MedioEnvio;


import com.com.smm.domain.model.Pedidos.MedioEnvio;
import com.com.smm.infrastructure.entities.Pedidos.MedioEnvios;


public interface CreateMedioEnvioUseCase {
    MedioEnvios createMedioEnvio(MedioEnvios medioEnvio);
}