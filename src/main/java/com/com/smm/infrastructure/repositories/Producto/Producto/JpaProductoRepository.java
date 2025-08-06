package com.com.smm.infrastructure.repositories.Producto.Producto;

import com.com.smm.domain.model.Producto.Producto;
import com.com.smm.infrastructure.entities.Producto.Productos;
import com.com.smm.infrastructure.entities.Usuario.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JpaProductoRepository extends JpaRepository<Productos, Long> {


    @Query(value = "SELECT \n" +
            "    p.id AS product_id, \n" +
            "    p.nombre AS title, \n" +
            "    p.precio AS price, \n" +
            "    p.descripcion AS description,\n" +
            "    (SELECT STRING_AGG(i.url, ', ') FROM imagenes i WHERE i.producto = p.id) AS image_urls,\n" +
            "    (SELECT STRING_AGG(i.descripcion, ', ') FROM imagenes i WHERE i.producto = p.id) AS image_descriptions,\n" +
            "    c.id AS category_id, -- ID de la categoría\n" +
            "    c.nombre AS category_name, -- Nombre de la categoría\n" +
            "    c.descripcion AS category_description, -- Descripción de la categoría\n" +
            "    (SELECT STRING_AGG(c2.id || '-' || c2.nombre || '-' || c2.descripcion, ', ')  \n" +
            "     FROM categorias c2 \n" +
            "     WHERE c2.id = p.categoria_id) AS categorias -- Agrupar categorías relacionadas\n" +
            "FROM \n" +
            "    productos p\n" +
            "LEFT JOIN \n" +
            "    categorias c ON p.categoria_id = c.id;",
            nativeQuery = true)
    List<?> productoDetalle();

    @Query(value = "SELECT p.*, SUM(dp.cantidad) AS total_vendida\n" +
            "FROM public.productos p\n" +
            "JOIN public.detalle_pedidos dp ON p.id = dp.producto_id\n" +
            "GROUP BY p.id;\n",
            nativeQuery = true)
    List<?> pmasvendido();


    @Query(value = " SELECT \n" +
            "    p.id AS product_id, \n" +
            "    p.nombre AS title, \n" +
            "    p.precio AS price, \n" +
            "    p.descripcion AS description,\n" +
            "\n" +
            "    (SELECT STRING_AGG(i.url, ', ') FROM imagenes i WHERE i.producto = p.id) AS image_urls,\n" +
            "    (SELECT STRING_AGG(i.descripcion, ', ') FROM imagenes i WHERE i.producto = p.id) AS image_descriptions,\n" +
            "\n" +
            "    c.id AS category_id,\n" +
            "    c.nombre AS category_name,\n" +
            "    c.descripcion AS category_description,\n" +
            "\n" +
            "    (SELECT STRING_AGG(c2.id || '|' || c2.nombre || '|' || c2.descripcion, ', ')\n" +
            "     FROM categorias c2 \n" +
            "     WHERE c2.id = p.categoria_id) AS categorias\n" +
            "\n" +
            "FROM productos p\n" +
            "LEFT JOIN categorias c ON p.categoria_id = c.id \n" +
            "WHERE p.id = ?;\n",
            nativeQuery = true)
    List<?> productoDetalleid(int id);




    @Query(value = "SELECT \n" +
            "    p.id AS product_id, \n" +
            "    p.nombre AS title, \n" +
            "    p.precio AS price, \n" +
            "    p.descripcion AS description,\n" +
            "    (SELECT GROUP_CONCAT(i.url SEPARATOR ', ') FROM imagenes i WHERE i.producto = p.id) AS image_urls,\n" +
            "    (SELECT GROUP_CONCAT(i.descripcion SEPARATOR ', ') FROM imagenes i WHERE i.producto = p.id) AS image_descriptions,\n" +
            "    c.id AS category_id, -- ID de la categoría\n" +
            "    c.nombre AS category_name, -- Nombre de la categoría\n" +
            "    c.descripcion AS category_description, -- Descripción de la categoría\n" +
            "    (SELECT GROUP_CONCAT(c2.id, c2.nombre , c2.descripcion SEPARATOR ', ')  \n" +
            "     FROM categorias c2 \n" +
            "     WHERE c2.id = p.categoria_id) AS categorias -- Agrupar categorías relacionadas\n" +
            "FROM \n" +
            "    productos p\n" +
            "LEFT JOIN \n" +
            "    categorias c ON p.categoria_id = c.id  WHERE \n" +
            "    (:nombre IS NULL OR LOWER(p.nombre) LIKE LOWER(CONCAT('%', :nombre, '%'))) \n" +
            "    AND (:categoriaId IS NULL OR p.categoria_id = :categoriaId);\n",
            nativeQuery = true)
    List<?> buscarPorNombreYCategoria(@Param("nombre") String nombre,
                                      @Param("categoriaId") Long categoriaId);


    // Puedes agregar consultas personalizadas si lo necesitas
}
