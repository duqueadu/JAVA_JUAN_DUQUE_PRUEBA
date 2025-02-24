package com.com.smm.infrastructure.repositories.Pedidos.Envio;

import com.com.smm.infrastructure.entities.Pedidos.Envios;
import com.com.smm.infrastructure.entities.Producto.Categorias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaEnvioRepository extends JpaRepository<Envios, Long> {
    // Puedes agregar consultas personalizadas si lo necesitas
}
