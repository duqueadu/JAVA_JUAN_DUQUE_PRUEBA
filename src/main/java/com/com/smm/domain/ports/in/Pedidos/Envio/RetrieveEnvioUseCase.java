package com.com.smm.domain.ports.in.Pedidos.Envio;


import com.com.smm.domain.model.Pedidos.Envio;

import java.util.List;
import java.util.Optional;

public interface RetrieveEnvioUseCase {
    Optional<Envio> getEnvioById(Long id);
    List<Envio> getAllEnvio();
}
