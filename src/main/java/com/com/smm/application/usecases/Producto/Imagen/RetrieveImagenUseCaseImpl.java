package com.com.smm.application.usecases.Producto.Imagen;

import com.com.smm.domain.model.Producto.Imagen;
import com.com.smm.domain.ports.in.Producto.Imagen.RetrieveImagenUseCase;
import com.com.smm.domain.ports.out.Producto.Imagen.ImageneRepositoryPort;

import java.util.List;
import java.util.Optional;

public class RetrieveImagenUseCaseImpl implements RetrieveImagenUseCase {

    private final ImageneRepositoryPort imageneRepositoryPort;

    public RetrieveImagenUseCaseImpl(ImageneRepositoryPort imageneRepositoryPort) {
        this.imageneRepositoryPort = imageneRepositoryPort;
    }


    @Override
    public Optional<Imagen> getImagenById(Long id) {
        return imageneRepositoryPort.findById(id);
    }

    @Override
    public List<Imagen> getAllImagen() {
        return imageneRepositoryPort.findAll();
    }
}
