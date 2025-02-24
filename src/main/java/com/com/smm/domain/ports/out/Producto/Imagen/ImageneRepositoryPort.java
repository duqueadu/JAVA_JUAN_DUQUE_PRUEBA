package com.com.smm.domain.ports.out.Producto.Imagen;



import com.com.smm.domain.model.Producto.Imagen;
import com.com.smm.domain.model.Usuario.Usuario;
import com.com.smm.infrastructure.entities.Producto.Imagenes;

import java.util.List;
import java.util.Optional;

public interface ImageneRepositoryPort {



    Imagen save(Imagen imagen);

    Optional<Imagen> findById(Long id);
    List<Imagen> findAll();

    Optional<Imagen> update(Imagenes imagen);

    Optional<Imagen> update(Imagen imagen);
    boolean deleteById(Long id);
}
