package com.com.smm.infrastructure.repositories.Pedidos.Pedido;

import com.com.smm.domain.model.Pedidos.DetalleP;
import com.com.smm.infrastructure.entities.Pedidos.Pedidos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.Optional;

@Repository
public interface JpaPedidosRepository extends JpaRepository<Pedidos, Long> {
    @Query(value = """
        SELECT 
            p.id AS pedido_id,
            p.fecha_pedido,
            p.estado AS estado_pedido,
            p.total,
            p.direccion,
            p.metodo_pago,

            e.id AS envio_id,
            e.fecha_envio,
            e.fecha_estimada_entrega,

            f.id AS factura_id,
            f.total AS total_factura,

            json_agg(
                to_jsonb(pp) || jsonb_build_object(
                    'nombre_producto', pr.nombre,
                    'descripcion', pr.descripcion,
                    'precio_catalogo', pr.precio,
                     'url',i.url
                )
            ) AS productos_json

        FROM public.pedidos p
        LEFT JOIN public.envios e ON e.pedido_id = p.id
        LEFT JOIN public.facturas f ON f.pedido_id = p.id
        LEFT JOIN public.detalle_pedidos pp ON pp.pedido_id = p.id
        LEFT JOIN public.productos pr ON pr.id = pp.producto_id
        LEFT JOIN public.imagenes i ON pr.id = i.producto
        
        WHERE p.id = :pedidoId

        GROUP BY 
            p.id, p.fecha_pedido, p.estado, p.total, p.direccion, p.metodo_pago,
            e.id, e.fecha_envio, e.fecha_estimada_entrega,
            f.id, f.total

        ORDER BY p.id
        """, nativeQuery = true)
    Map<String, Object> obtenerDetallePedido(@Param("pedidoId") Long pedidoId);


}
