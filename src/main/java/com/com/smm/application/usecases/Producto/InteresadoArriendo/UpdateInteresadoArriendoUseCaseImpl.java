package com.com.smm.application.usecases.Producto.InteresadoArriendo;

import com.com.smm.domain.model.Producto.EstadoSolicitud;
import com.com.smm.domain.model.Producto.InteresadoArriendo;
import com.com.smm.domain.ports.in.Producto.InteresadoArriendo.UpdateInteresadoArriendoUseCase;
import com.com.smm.domain.ports.out.Producto.InteresadoArriendo.InteresadoArriendoRepositoryPort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class UpdateInteresadoArriendoUseCaseImpl implements UpdateInteresadoArriendoUseCase {

    private final InteresadoArriendoRepositoryPort repositoryPort;

    public UpdateInteresadoArriendoUseCaseImpl(InteresadoArriendoRepositoryPort repositoryPort) {
        this.repositoryPort = repositoryPort;
    }

    @Override
    @Transactional
    public Optional<InteresadoArriendo> updateEstadoInteresadoArriendo(Long id, EstadoSolicitud nuevoEstado) {
        return repositoryPort.findById(id).map(solicitud -> {
            solicitud.cambiarEstado(nuevoEstado);
            return repositoryPort.save(solicitud);
        });
    }
}