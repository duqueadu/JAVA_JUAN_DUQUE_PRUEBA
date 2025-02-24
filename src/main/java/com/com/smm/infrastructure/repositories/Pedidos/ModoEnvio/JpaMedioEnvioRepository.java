package com.com.smm.infrastructure.repositories.Pedidos.ModoEnvio;

import com.com.smm.infrastructure.entities.Pedidos.MedioEnvios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaMedioEnvioRepository extends JpaRepository<MedioEnvios, Long> {
    // Puedes agregar consultas personalizadas si lo necesitas
}
