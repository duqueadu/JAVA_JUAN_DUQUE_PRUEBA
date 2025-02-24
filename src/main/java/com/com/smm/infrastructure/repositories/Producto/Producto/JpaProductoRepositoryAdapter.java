package com.com.smm.infrastructure.repositories.Producto.Producto;

import com.com.smm.domain.model.Producto.Producto;
import com.com.smm.domain.ports.out.Producto.Producto.ProductosRepositoryPort;
import com.com.smm.infrastructure.entities.Producto.Productos;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class JpaProductoRepositoryAdapter implements ProductosRepositoryPort {

    private final   JpaProductoRepository JpaProductoRepository;







    public JpaProductoRepositoryAdapter(JpaProductoRepository JpaProductoRepository) {
        this.JpaProductoRepository = JpaProductoRepository;
    }


    @Override
    public List<?> productoDetalleid() {
        return null;
    }

    @Override
    public List<?> productoDetalleid(int id) {
        return JpaProductoRepository.productoDetalleid(id);
    }

    @Override
    public List<?> productoDetalleid(long id) {
        return null;
    }

    @Override
    public List<?> productoDetalle() {
        return JpaProductoRepository.productoDetalle();
    }

    @Override
    public Productos save(Productos Producto) {
        return null;
    }

    @Override
    public Producto save(Producto Producto) {
       Productos taskEntity =Productos.fromDomainModel(Producto);
       Productos savedTaskEntity = JpaProductoRepository.save(taskEntity);
        return savedTaskEntity.toDomainModel();
    }

    @Override
    public Optional<Producto> findById(Long id) {
        return JpaProductoRepository.findById(id).map(Productos::toDomainModel);
    }


    @Override
    public List<Producto> findAll() {
        return JpaProductoRepository.findAll().stream()
                .map(Productos::toDomainModel)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Producto> update(Productos Producto) {
        return Optional.empty();
    }

    @Override
    public Optional<Producto> update(Producto Producto) {
        if (JpaProductoRepository.existsById(Producto.getId())) {
           Productos taskEntity =Productos.fromDomainModel(Producto);
           Productos updatedTaskEntity = JpaProductoRepository.save(taskEntity);
            return Optional.of(updatedTaskEntity.toDomainModel());
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Long id) {
        if (JpaProductoRepository.existsById(id)) {
            JpaProductoRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public List<?> buscarPorNombreYCategoria(String nombre, Long categoriaId) {
        return JpaProductoRepository.buscarPorNombreYCategoria(nombre, categoriaId);

    }

}
