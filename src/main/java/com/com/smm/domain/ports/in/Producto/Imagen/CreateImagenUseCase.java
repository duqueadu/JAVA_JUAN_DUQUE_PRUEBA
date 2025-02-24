package com.com.smm.domain.ports.in.Producto.Imagen;


import com.com.smm.domain.model.Producto.Imagen;
import com.com.smm.infrastructure.entities.Producto.Imagenes;
import com.com.smm.infrastructure.entities.Seguridad.Permisos;


public interface CreateImagenUseCase {
    Imagen createImagen(Imagen imagenes);
}