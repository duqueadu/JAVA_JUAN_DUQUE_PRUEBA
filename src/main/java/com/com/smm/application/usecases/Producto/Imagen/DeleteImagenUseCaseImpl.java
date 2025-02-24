package com.com.smm.application.usecases.Producto.Imagen;


import com.com.smm.domain.ports.in.Producto.Imagen.DeleteImagenUseCase;
import com.com.smm.domain.ports.in.Seguridad.Permiso.DeletePermisoUseCase;
import com.com.smm.domain.ports.out.Producto.Imagen.ImageneRepositoryPort;
import com.com.smm.domain.ports.out.Seguridad.PermisosRepositoryPort;

public class DeleteImagenUseCaseImpl implements DeleteImagenUseCase {

    private final ImageneRepositoryPort imageneRepositoryPort;

    public DeleteImagenUseCaseImpl(ImageneRepositoryPort imageneRepositoryPort) {
        this.imageneRepositoryPort = imageneRepositoryPort;
    }

    @Override
    public boolean deleteImagen(Long id) {
        return imageneRepositoryPort.deleteById(id);
    }


}
