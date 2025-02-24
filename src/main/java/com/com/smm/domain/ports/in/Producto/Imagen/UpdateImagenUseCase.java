package com.com.smm.domain.ports.in.Producto.Imagen;

import com.com.smm.domain.model.Producto.Imagen;
import com.com.smm.infrastructure.entities.Producto.Imagenes;

import java.util.Optional;

public interface UpdateImagenUseCase {
    Optional<Imagen> updateImagen(Long id, Imagenes updatedImagen);
}
