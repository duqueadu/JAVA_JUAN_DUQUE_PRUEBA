package com.com.smm.domain.ports.in.Pedidos.Envio;


import com.com.smm.domain.model.Pedidos.Envio;
import com.com.smm.infrastructure.entities.Pedidos.Envios;



public interface CreateEnvioUseCase {
    Envio createEnvio(Envio Envios);
}