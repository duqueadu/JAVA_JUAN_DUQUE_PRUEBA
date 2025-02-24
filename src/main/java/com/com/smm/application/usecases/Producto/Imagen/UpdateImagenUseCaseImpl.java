package com.com.smm.application.usecases.Producto.Imagen;


import com.com.smm.domain.model.Producto.Imagen;
import com.com.smm.domain.ports.in.Producto.Imagen.UpdateImagenUseCase;
import com.com.smm.domain.ports.out.Producto.Imagen.ImageneRepositoryPort;
import com.com.smm.infrastructure.entities.Producto.Imagenes;


import java.util.Optional;

public class UpdateImagenUseCaseImpl implements UpdateImagenUseCase {

    private final ImageneRepositoryPort imageneRepositoryPort;

    public UpdateImagenUseCaseImpl(ImageneRepositoryPort imageneRepositoryPort) {
        this.imageneRepositoryPort = imageneRepositoryPort;
    }

    @Override
    public Optional<Imagen> updateImagen(Long id, Imagenes updateImagen) {
        return imageneRepositoryPort.update(updateImagen);
    }
}
