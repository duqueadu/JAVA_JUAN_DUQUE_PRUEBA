package com.com.smm.domain.ports.in.Producto.InteresadoArriendo;


import com.com.smm.domain.model.Producto.EstadoSolicitud;
import com.com.smm.domain.model.Producto.InteresadoArriendo;
import java.util.Optional;

public interface UpdateInteresadoArriendoUseCase {
    Optional<InteresadoArriendo> updateEstadoInteresadoArriendo(Long id, EstadoSolicitud nuevoEstado);
}