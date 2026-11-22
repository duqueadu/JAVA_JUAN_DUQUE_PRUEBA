package com.com.smm.application.usecases.Producto.InteresadoArriendo;

import com.com.smm.domain.model.Producto.InteresadoArriendo;
import com.com.smm.domain.ports.in.Producto.InteresadoArriendo.RetrieveInteresadoArriendoUseCase;
import com.com.smm.domain.ports.out.Producto.InteresadoArriendo.InteresadoArriendoRepositoryPort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class RetrieveInteresadoArriendoUseCaseImpl implements RetrieveInteresadoArriendoUseCase {

    private final InteresadoArriendoRepositoryPort repositoryPort;

    public RetrieveInteresadoArriendoUseCaseImpl(InteresadoArriendoRepositoryPort repositoryPort) {
        this.repositoryPort = repositoryPort;
    }

    @Override
    public Optional<InteresadoArriendo> getInteresadoArriendoById(Long id) {
        return repositoryPort.findById(id);
    }

    @Override
    public List<InteresadoArriendo> getAllInteresadoArriendo() {
        return repositoryPort.findAll();
    }

    @Override
    public List<InteresadoArriendo> getInteresadoArriendoByUsuarioId(Long usuarioId) {
        return repositoryPort.findByUsuarioId(usuarioId);
    }

    @Override
    public List<?> getSolicitudesConDetalle(Long productoId) {
        return repositoryPort.findAllConDetalle(productoId);
    }

    @Override
    public List<?> getSolicitudDetalleById(Long id) {
        return repositoryPort.findDetalleById(id);
    }
}