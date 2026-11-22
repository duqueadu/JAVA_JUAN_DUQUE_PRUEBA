package com.com.smm.application.usecases.Producto.InteresadoArriendo;

import com.com.smm.domain.exception.SolicitudArriendoDuplicadaException;
import com.com.smm.domain.model.Producto.EstadoSolicitud;
import com.com.smm.domain.model.Producto.InteresadoArriendo;
import com.com.smm.domain.ports.in.Producto.InteresadoArriendo.CreateInteresadoArriendoUseCase;
import com.com.smm.domain.ports.out.Producto.InteresadoArriendo.InteresadoArriendoRepositoryPort;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CreateInteresadoArriendoUseCaseImpl implements CreateInteresadoArriendoUseCase {

    private static final Logger logger = LoggerFactory.getLogger(CreateInteresadoArriendoUseCaseImpl.class);

    private final InteresadoArriendoRepositoryPort repositoryPort;

    public CreateInteresadoArriendoUseCaseImpl(InteresadoArriendoRepositoryPort repositoryPort) {
        this.repositoryPort = repositoryPort;
    }

    @Override
    @Transactional
    public InteresadoArriendo createInteresadoArriendo(InteresadoArriendo interesadoArriendo) {
        if (interesadoArriendo == null) {
            throw new IllegalArgumentException("El objeto interesadoArriendo no puede ser nulo.");
        }

        if (interesadoArriendo.getProductoId() == null || interesadoArriendo.getUsuarioId() == null) {
            throw new IllegalArgumentException("El ID del producto y el ID del usuario son obligatorios.");
        }

        logger.info("Verificando solicitud activa para el usuario ID: {} y producto ID: {}",
                interesadoArriendo.getUsuarioId(), interesadoArriendo.getProductoId());

        boolean existeActiva = repositoryPort.existsSolicitudActiva(
                interesadoArriendo.getProductoId(),
                interesadoArriendo.getUsuarioId(),
                List.of(EstadoSolicitud.PENDIENTE, EstadoSolicitud.EN_ESTUDIO)
        );

        if (existeActiva) {
            logger.warn("Intento de solicitud duplicada para el usuario ID: {} en producto ID: {}",
                    interesadoArriendo.getUsuarioId(), interesadoArriendo.getProductoId());
            throw new SolicitudArriendoDuplicadaException(
                    "El usuario ya tiene una solicitud activa para el producto ID: " + interesadoArriendo.getProductoId()
            );
        }

        interesadoArriendo.inicializarNuevaSolicitud();
        InteresadoArriendo savedSolicitud = repositoryPort.save(interesadoArriendo);

        logger.info("Solicitud de arriendo creada exitosamente con ID: {}", savedSolicitud.getId());
        return savedSolicitud;
    }
}