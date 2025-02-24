package com.com.smm.infrastructure.repositories.Producto.Categoria;

import com.com.smm.domain.model.Producto.Categoria;
import com.com.smm.domain.ports.out.Producto.Categoria.CategoriaRepositoryPort;
import com.com.smm.infrastructure.entities.Producto.Categorias;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class JpaCategoriaRepositoryAdapter implements CategoriaRepositoryPort  {

    private final JpaCategoriaRepository  jpaCategoriaRepository;

    public JpaCategoriaRepositoryAdapter(JpaCategoriaRepository jpaCategoriaRepository) {
        this.jpaCategoriaRepository = jpaCategoriaRepository;
    }

    @Override
    public Categorias save(Categorias Categoria) {
        return null;
    }

    @Override
    public Categoria save(Categoria Categoria) {
        Categorias taskEntity = Categorias.fromDomainModel(Categoria);
        Categorias savedTaskEntity = jpaCategoriaRepository.save(taskEntity);
        return savedTaskEntity.toDomainModel();
    }

    @Override
    public Optional<Categoria> findById(Long id) {
        return jpaCategoriaRepository.findById(id).map(Categorias::toDomainModel);
    }

    @Override
    public List<Categoria> findAll() {
        return jpaCategoriaRepository.findAll().stream()
                .map(Categorias::toDomainModel)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Categoria> update(Categorias Categoria) {
        return Optional.empty();
    }

    @Override
    public Optional<Categoria> update(Categoria Categoria) {
        if (jpaCategoriaRepository.existsById(Categoria.getId())) {
            Categorias taskEntity = Categorias.fromDomainModel(Categoria);
            Categorias updatedTaskEntity = jpaCategoriaRepository.save(taskEntity);
            return Optional.of(updatedTaskEntity.toDomainModel());
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Long id) {
        if (jpaCategoriaRepository.existsById(id)) {
            jpaCategoriaRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
