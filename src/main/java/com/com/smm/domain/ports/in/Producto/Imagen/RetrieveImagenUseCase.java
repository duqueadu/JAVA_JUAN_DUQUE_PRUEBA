package com.com.smm.domain.ports.in.Producto.Imagen;

import com.com.smm.domain.model.Producto.Imagen;

import java.util.List;
import java.util.Optional;

public interface RetrieveImagenUseCase {
    Optional<Imagen> getImagenById(Long id);
    List<Imagen> getAllImagen();
}
