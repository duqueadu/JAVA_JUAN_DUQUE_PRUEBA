package com.com.smm.application.usecases.Producto.Imagen;


import com.com.smm.domain.model.Producto.Imagen;
import com.com.smm.domain.ports.in.Producto.Imagen.CreateImagenUseCase;
import com.com.smm.domain.ports.out.Producto.Imagen.ImageneRepositoryPort;
import com.com.smm.infrastructure.entities.Producto.Imagenes;

public class CreateImagenUseCaseImpl implements CreateImagenUseCase {

    private final ImageneRepositoryPort imageneRepositoryPort;

    public CreateImagenUseCaseImpl(ImageneRepositoryPort imageneRepositoryPort) {
        this.imageneRepositoryPort = imageneRepositoryPort;
    }

    @Override
    public Imagen createImagen(Imagen imagenes) {
        return imageneRepositoryPort.save(imagenes);
    }
}