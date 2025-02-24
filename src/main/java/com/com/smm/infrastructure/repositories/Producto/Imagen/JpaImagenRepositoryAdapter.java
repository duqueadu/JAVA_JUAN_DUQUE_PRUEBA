package com.com.smm.infrastructure.repositories.Producto.Imagen;

import com.com.smm.domain.model.Producto.Imagen;
import com.com.smm.domain.ports.out.Producto.Imagen.ImageneRepositoryPort;
import com.com.smm.infrastructure.entities.Producto.Imagenes;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class JpaImagenRepositoryAdapter implements ImageneRepositoryPort {

    private final JpaImagenRepository  jpaImagenRepository;

    public JpaImagenRepositoryAdapter(JpaImagenRepository jpaImagenRepository) {
        this.jpaImagenRepository = jpaImagenRepository;
    }



    @Override
    public Imagen save(Imagen imagen) {
        Imagenes taskEntity = Imagenes.fromDomainModel(imagen);
        Imagenes savedTaskEntity = jpaImagenRepository.save(taskEntity);
        return savedTaskEntity.toDomainModel();
    }



    @Override
    public Optional<Imagen> findById(Long id) {
        return jpaImagenRepository.findById(id).map(Imagenes::toDomainModel);
    }

    @Override
    public List<Imagen> findAll() {
        return jpaImagenRepository.findAll().stream()
                .map(Imagenes::toDomainModel)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Imagen> update(Imagenes imagen) {
        return Optional.empty();
    }

    @Override
    public Optional<Imagen> update(Imagen imagen) {
        if (jpaImagenRepository.existsById(imagen.getId())) {
            Imagenes taskEntity = Imagenes.fromDomainModel(imagen);
            Imagenes updatedTaskEntity = jpaImagenRepository.save(taskEntity);
            return Optional.of(updatedTaskEntity.toDomainModel());
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Long id) {
        if (jpaImagenRepository.existsById(id)) {
            jpaImagenRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
