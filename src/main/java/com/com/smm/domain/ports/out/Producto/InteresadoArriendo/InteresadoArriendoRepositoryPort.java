package com.com.smm.domain.ports.out.Producto.InteresadoArriendo;

import com.com.smm.domain.model.Producto.EstadoSolicitud;
import com.com.smm.domain.model.Producto.InteresadoArriendo;

import java.util.List;
import java.util.Optional;

public interface InteresadoArriendoRepositoryPort {

    InteresadoArriendo save(InteresadoArriendo interesadoArriendo);

    Optional<InteresadoArriendo> findById(Long id);

    List<InteresadoArriendo> findAll();

    List<InteresadoArriendo> findByUsuarioId(Long usuarioId);

    List<?> findAllConDetalle(Long productoId);

    List<?> findDetalleById(Long id);

    boolean existsSolicitudActiva(Long productoId, Long usuarioId, List<EstadoSolicitud> estados);

    boolean deleteById(Long id);
}