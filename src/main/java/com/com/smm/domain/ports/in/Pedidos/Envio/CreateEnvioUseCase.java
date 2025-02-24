package com.com.smm.domain.ports.in.Pedidos.Envio;


import com.com.smm.infrastructure.entities.Pedidos.Envios;



public interface CreateEnvioUseCase {
    Envios createEnvio(Envios Envios);
}