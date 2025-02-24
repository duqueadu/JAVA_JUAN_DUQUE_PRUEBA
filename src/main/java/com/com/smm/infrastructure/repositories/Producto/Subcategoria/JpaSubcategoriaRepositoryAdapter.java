package com.com.smm.infrastructure.repositories.Producto.Subcategoria;

import com.com.smm.domain.model.Producto.Subcategoria;
import com.com.smm.domain.ports.out.Producto.Subcategoria.SubcategoriaRepositoryPort;
import com.com.smm.infrastructure.entities.Producto.Subcategorias;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class JpaSubcategoriaRepositoryAdapter implements SubcategoriaRepositoryPort {

    private final JpaSubcategoriaRepository  jpaSubcategoriaRepository;

    public JpaSubcategoriaRepositoryAdapter(JpaSubcategoriaRepository jpaSubcategoriaRepository) {
        this.jpaSubcategoriaRepository = jpaSubcategoriaRepository;
    }

    @Override
    public Subcategorias save(Subcategorias subcategoria) {
        return null;
    }

    @Override
    public Subcategoria save(Subcategoria subcategoria) {
        Subcategorias taskEntity = Subcategorias.fromDomainModel(subcategoria);
        Subcategorias savedTaskEntity = jpaSubcategoriaRepository.save(taskEntity);
        return savedTaskEntity.toDomainModel();
    }

    @Override
    public Optional<Subcategoria> findById(Long id) {
        return jpaSubcategoriaRepository.findById(id).map(Subcategorias::toDomainModel);
    }

    @Override
    public List<Subcategoria> findAll() {
        return jpaSubcategoriaRepository.findAll().stream()
                .map(Subcategorias::toDomainModel)
                .collect(Collectors.toList());
    }


    @Override
    public Optional<Subcategoria> update(Subcategorias Subcategoria) {
        return Optional.empty();
    }

    @Override
    public Optional<Subcategoria> update(Subcategoria subcategoria) {
        if (jpaSubcategoriaRepository.existsById(subcategoria.getId())) {
            Subcategorias taskEntity = Subcategorias.fromDomainModel(subcategoria);
            Subcategorias updatedTaskEntity = jpaSubcategoriaRepository.save(taskEntity);
            return Optional.of(updatedTaskEntity.toDomainModel());
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Long id) {
        if (jpaSubcategoriaRepository.existsById(id)) {
            jpaSubcategoriaRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
