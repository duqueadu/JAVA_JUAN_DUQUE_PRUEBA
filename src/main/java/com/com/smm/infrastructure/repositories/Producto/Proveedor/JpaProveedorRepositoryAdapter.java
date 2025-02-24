package com.com.smm.infrastructure.repositories.Producto.Proveedor;

import com.com.smm.domain.model.Producto.Proveedor;
import com.com.smm.domain.ports.out.Producto.Proveedor.ProveedorRepositoryPort;
import com.com.smm.infrastructure.entities.Producto.Proveedores;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class JpaProveedorRepositoryAdapter implements ProveedorRepositoryPort {

    private final JpaProveedorRepository ProveedorRepository;

    public JpaProveedorRepositoryAdapter(JpaProveedorRepository ProveedorRepository) {
        this.ProveedorRepository = ProveedorRepository;
    }

    @Override
    public Proveedores save(Proveedores Proveedor) {
        return null;
    }

    @Override
    public Proveedor save(Proveedor Proveedor) {
        Proveedores taskEntity = Proveedores.fromDomainModel(Proveedor);
        Proveedores savedTaskEntity = ProveedorRepository.save(taskEntity);
        return savedTaskEntity.toDomainModel();
    }

    @Override
    public Optional<Proveedor> findById(Long id) {
        return ProveedorRepository.findById(id).map(Proveedores::toDomainModel);
    }

    @Override
    public List<Proveedores> findAll() {
        return ProveedorRepository.findAll();
    }

    @Override
    public Optional<Proveedor> update(Proveedores Proveedor) {
        return Optional.empty();
    }

    @Override
    public Optional<Proveedor> update(Proveedor Proveedor) {
        if (ProveedorRepository.existsById(Proveedor.getId())) {
            Proveedores taskEntity = Proveedores.fromDomainModel(Proveedor);
            Proveedores updatedTaskEntity = ProveedorRepository.save(taskEntity);
            return Optional.of(updatedTaskEntity.toDomainModel());
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Long id) {
        if (ProveedorRepository.existsById(id)) {
            ProveedorRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
