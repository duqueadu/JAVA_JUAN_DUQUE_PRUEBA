package com.com.smm.domain.ports.in.Producto.InteresadoArriendo;

import com.com.smm.domain.model.Producto.InteresadoArriendo;

import java.util.List;
import java.util.Optional;

public interface RetrieveInteresadoArriendoUseCase {

    Optional<InteresadoArriendo> getInteresadoArriendoById(Long id);

    List<InteresadoArriendo> getAllInteresadoArriendo();

    List<InteresadoArriendo> getInteresadoArriendoByUsuarioId(Long usuarioId);

    List<?> getSolicitudesConDetalle(Long productoId);

    List<?> getSolicitudDetalleById(Long id);
}