package com.com.smm.infrastructure.repositories.Producto.InteresadoArriendo;

import com.com.smm.infrastructure.entities.Producto.InteresadoArriendo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JpaInteresadoArriendoRepository extends JpaRepository<InteresadoArriendo, Long> {

    boolean existsByProductoIdAndUsuarioIdAndEstadoIn(Long productoId, Long usuarioId, List<String> estados);

    List<InteresadoArriendo> findByUsuarioIdOrderByFechaRegistroDesc(Long usuarioId);

    @Query(value = "SELECT \n" +
            "    ia.id AS arriendo_id, \n" +
            "    ia.producto_id AS product_id, \n" +
            "    p.nombre AS product_title, \n" +
            "    p.precio AS canon_mensual, \n" +
            "    (SELECT STRING_AGG(i.url, ', ') FROM imagenes i WHERE i.producto = p.id) AS image_urls, \n" +
            "    ia.usuario_id AS usuario_id, \n" +
            "    u.nombre AS usuario_nombre, \n" +
            "    u.email AS usuario_email, \n" +
            "    ia.tipo_documento, \n" +
            "    ia.cedula, \n" +
            "    ia.nacionalidad, \n" +
            "    ia.ciudad_actual, \n" +
            "    ia.empresa_trabajo, \n" +
            "    ia.cargo_ocupacion, \n" +
            "    ia.tiempo_laborando, \n" +
            "    ia.ingresos_mensuales, \n" +
            "    ia.duracion_contrato, \n" +
            "    ia.fecha_ingreso, \n" +
            "    ia.cantidad_habitantes, \n" +
            "    ia.tiene_mascotas, \n" +
            "    ia.codeudor_nombre, \n" +
            "    ia.codeudor_cedula, \n" +
            "    ia.codeudor_telefono, \n" +
            "    ia.codeudor_empresa, \n" +
            "    ia.codeudor_ingresos, \n" +
            "    ia.observaciones, \n" +
            "    ia.estado, \n" +
            "    ia.fecha_registro \n" +
            "FROM public.interesado_arriendo ia \n" +
            "INNER JOIN public.productos p ON ia.producto_id = p.id \n" +
            "INNER JOIN public.usuarios u ON ia.usuario_id = u.id \n" +
            "ORDER BY ia.fecha_registro DESC",
            nativeQuery = true)
    List<?> arriendosDetalle();

    @Query(value = "SELECT \n" +
            "    ia.id AS arriendo_id, \n" +
            "    ia.producto_id AS product_id, \n" +
            "    p.nombre AS product_title, \n" +
            "    p.precio AS canon_mensual, \n" +
            "    (SELECT STRING_AGG(i.url, ', ') FROM imagenes i WHERE i.producto = p.id) AS image_urls, \n" +
            "    ia.usuario_id AS usuario_id, \n" +
            "    u.nombre AS usuario_nombre, \n" +
            "    u.email AS usuario_email, \n" +
            "    ia.tipo_documento, \n" +
            "    ia.cedula, \n" +
            "    ia.empresa_trabajo, \n" +
            "    ia.cargo_ocupacion, \n" +
            "    ia.ingresos_mensuales, \n" +
            "    ia.duracion_contrato, \n" +
            "    ia.fecha_ingreso, \n" +
            "    ia.codeudor_nombre, \n" +
            "    ia.codeudor_telefono, \n" +
            "    ia.codeudor_ingresos, \n" +
            "    ia.observaciones, \n" +
            "    ia.estado, \n" +
            "    ia.fecha_registro \n" +
            "FROM public.interesado_arriendo ia \n" +
            "INNER JOIN public.productos p ON ia.producto_id = p.id \n" +
            "INNER JOIN public.usuarios u ON ia.usuario_id = u.id \n" +
            "WHERE ia.producto_id = ? \n" +
            "ORDER BY ia.fecha_registro DESC",
            nativeQuery = true)
    List<?> arriendosPorProducto(Long productoId);

    @Query(value = "SELECT \n" +
            "    ia.*, \n" +
            "    p.nombre AS product_title, \n" +
            "    p.precio AS canon_mensual, \n" +
            "    u.nombre AS usuario_nombre, \n" +
            "    u.email AS usuario_email \n" +
            "FROM public.interesado_arriendo ia \n" +
            "INNER JOIN public.productos p ON ia.producto_id = p.id \n" +
            "INNER JOIN public.usuarios u ON ia.usuario_id = u.id \n" +
            "WHERE ia.id = ?",
            nativeQuery = true)
    List<?> arriendoDetalleId(Long id);
}