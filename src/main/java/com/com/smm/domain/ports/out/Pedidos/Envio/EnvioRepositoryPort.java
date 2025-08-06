package com.com.smm.domain.ports.out.Pedidos.Envio;



import com.com.smm.domain.model.Pedidos.Envio;
import com.com.smm.infrastructure.entities.Pedidos.Envios;

import java.util.List;
import java.util.Optional;

public interface EnvioRepositoryPort {
    Envio save(Envio Envio);
    Optional<Envio> findById(Long id);
    List<Envio> findAll();
    Optional<Envios> update(Envios Envio);
    Optional<Envio> update(Envio Envio);
    boolean deleteById(Long id);

}
