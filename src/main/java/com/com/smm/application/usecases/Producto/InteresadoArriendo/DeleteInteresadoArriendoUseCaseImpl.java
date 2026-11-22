package com.com.smm.application.usecases.Producto.InteresadoArriendo;

import com.com.smm.domain.ports.in.Producto.InteresadoArriendo.DeleteInteresadoArriendoUseCase;
import com.com.smm.domain.ports.out.Producto.InteresadoArriendo.InteresadoArriendoRepositoryPort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DeleteInteresadoArriendoUseCaseImpl implements DeleteInteresadoArriendoUseCase {

    private final InteresadoArriendoRepositoryPort repositoryPort;

    public DeleteInteresadoArriendoUseCaseImpl(InteresadoArriendoRepositoryPort repositoryPort) {
        this.repositoryPort = repositoryPort;
    }

    @Override
    @Transactional
    public boolean deleteInteresadoArriendo(Long id) {
        return repositoryPort.deleteById(id);
    }
}