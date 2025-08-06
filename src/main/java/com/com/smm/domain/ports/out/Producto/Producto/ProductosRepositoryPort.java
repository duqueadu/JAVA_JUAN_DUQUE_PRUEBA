package com.com.smm.domain.ports.out.Producto.Producto;



import com.com.smm.domain.model.Producto.Producto;
import com.com.smm.domain.model.Usuario.Usuario;
import com.com.smm.infrastructure.entities.Producto.Productos;
import com.com.smm.infrastructure.entities.Usuario.Usuarios;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ProductosRepositoryPort {

    List<?> productoDetalleid();
    List<?> productoDetalleid(int id);

    List<?> productoDetalleid(long id);

    List<?> productoDetalle();

    Productos save(Productos producto);

    Producto save(Producto producto);
    Optional<Producto> findById(Long id);
    List<Producto> findAll();

    Optional<Producto> update(Productos producto);

    Optional<Producto> update(Producto producto);
    boolean deleteById(Long id);

    List<?> pmasvendido();

    List<?> buscarPorNombreYCategoria(@Param("nombre") String nombre, @Param("categoriaId") Long categoriaId);


    
}
