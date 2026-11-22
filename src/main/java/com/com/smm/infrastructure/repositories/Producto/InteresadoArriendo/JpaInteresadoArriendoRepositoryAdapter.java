package com.com.smm.infrastructure.repositories.Producto.InteresadoArriendo;

import com.com.smm.domain.model.Producto.EstadoSolicitud;
import com.com.smm.domain.model.Producto.InteresadoArriendo;
import com.com.smm.domain.ports.out.Producto.InteresadoArriendo.InteresadoArriendoRepositoryPort;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class JpaInteresadoArriendoRepositoryAdapter implements InteresadoArriendoRepositoryPort {

    private static final Logger logger = LoggerFactory.getLogger(JpaInteresadoArriendoRepositoryAdapter.class);

    private final JpaInteresadoArriendoRepository jpaRepository;

    public JpaInteresadoArriendoRepositoryAdapter(JpaInteresadoArriendoRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public InteresadoArriendo save(InteresadoArriendo interesadoArriendo) {
        if (interesadoArriendo == null) {
            throw new IllegalArgumentException("La solicitud de arriendo no puede ser nula.");
        }
        logger.info("Guardando solicitud de arriendo para producto ID: {} y usuario ID: {}",
                interesadoArriendo.getProductoId(), interesadoArriendo.getUsuarioId());

        var entity = toEntity(interesadoArriendo);
        var saved = jpaRepository.save(entity);
        return toDomain(saved);
    }

    @Override
    public Optional<InteresadoArriendo> findById(Long id) {
        if (id == null) return Optional.empty();
        return jpaRepository.findById(id).map(this::toDomain);
    }

    @Override
    public List<InteresadoArriendo> findAll() {
        return jpaRepository.findAll(Sort.by(Sort.Direction.DESC, "fechaRegistro"))
                .stream()
                .map(this::toDomain)
                .toList();
    }

    @Override
    public List<InteresadoArriendo> findByUsuarioId(Long usuarioId) {
        if (usuarioId == null) return List.of();
        return jpaRepository.findByUsuarioIdOrderByFechaRegistroDesc(usuarioId)
                .stream()
                .map(this::toDomain)
                .toList();
    }

    @Override
    public List<?> findAllConDetalle(Long productoId) {
        if (productoId == null) {
            return jpaRepository.arriendosDetalle();
        }
        return jpaRepository.arriendosPorProducto(productoId);
    }

    @Override
    public List<?> findDetalleById(Long id) {
        if (id == null) return List.of();
        return jpaRepository.arriendoDetalleId(id);
    }

    @Override
    public boolean existsSolicitudActiva(Long productoId, Long usuarioId, List<EstadoSolicitud> estados) {
        if (productoId == null || usuarioId == null || estados == null || estados.isEmpty()) {
            return false;
        }
        List<String> estadosStr = estados.stream().map(Enum::name).toList();
        return jpaRepository.existsByProductoIdAndUsuarioIdAndEstadoIn(productoId, usuarioId, estadosStr);
    }

    @Override
    public boolean deleteById(Long id) {
        if (id == null || !jpaRepository.existsById(id)) {
            return false;
        }
        jpaRepository.deleteById(id);
        logger.info("Solicitud de arriendo con ID: {} eliminada de la base de datos.", id);
        return true;
    }

    private com.com.smm.infrastructure.entities.Producto.InteresadoArriendo toEntity(InteresadoArriendo domain) {
        if (domain == null) return null;

        var entity = new com.com.smm.infrastructure.entities.Producto.InteresadoArriendo();

        entity.setId(domain.getId());
        entity.setProductoId(domain.getProductoId());
        entity.setUsuarioId(domain.getUsuarioId());
        entity.setTipoDocumento(domain.getTipoDocumento());
        entity.setCedula(domain.getCedula());
        entity.setNacionalidad(domain.getNacionalidad());
        entity.setLugarOrigen(domain.getLugarOrigen());
        entity.setCiudadActual(domain.getCiudadActual());
        entity.setDireccionActual(domain.getDireccionActual());
        entity.setEmpresaTrabajo(domain.getEmpresaTrabajo());
        entity.setCargoOcupacion(domain.getCargoOcupacion());
        entity.setTiempoLaborando(domain.getTiempoLaborando());
        entity.setIngresosMensuales(domain.getIngresosMensuales());
        entity.setDuracionContrato(domain.getDuracionContrato());
        entity.setFechaIngreso(domain.getFechaIngreso());
        entity.setCantidadHabitantes(domain.getCantidadHabitantes());
        entity.setTieneMascotas(domain.getTieneMascotas());
        entity.setCodeudorNombre(domain.getCodeudorNombre());
        entity.setCodeudorCedula(domain.getCodeudorCedula());
        entity.setCodeudorTelefono(domain.getCodeudorTelefono());
        entity.setCodeudorEmpresa(domain.getCodeudorEmpresa());
        entity.setCodeudorIngresos(domain.getCodeudorIngresos());
        entity.setObservaciones(domain.getObservaciones());
        entity.setEstado(domain.getEstado() != null ? domain.getEstado() : EstadoSolicitud.PENDIENTE);
        entity.setFechaRegistro(domain.getFechaRegistro());

        return entity;
    }

    private InteresadoArriendo toDomain(com.com.smm.infrastructure.entities.Producto.InteresadoArriendo entity) {
        if (entity == null) return null;

        InteresadoArriendo domain = new InteresadoArriendo();

        domain.setId(entity.getId());
        domain.setProductoId(entity.getProductoId());
        domain.setUsuarioId(entity.getUsuarioId());
        domain.setTipoDocumento(entity.getTipoDocumento());
        domain.setCedula(entity.getCedula());
        domain.setNacionalidad(entity.getNacionalidad());
        domain.setLugarOrigen(entity.getLugarOrigen());
        domain.setCiudadActual(entity.getCiudadActual());
        domain.setDireccionActual(entity.getDireccionActual());
        domain.setEmpresaTrabajo(entity.getEmpresaTrabajo());
        domain.setCargoOcupacion(entity.getCargoOcupacion());
        domain.setTiempoLaborando(entity.getTiempoLaborando());
        domain.setIngresosMensuales(entity.getIngresosMensuales());
        domain.setDuracionContrato(entity.getDuracionContrato());
        domain.setFechaIngreso(entity.getFechaIngreso());
        domain.setCantidadHabitantes(entity.getCantidadHabitantes());
        domain.setTieneMascotas(entity.getTieneMascotas());
        domain.setCodeudorNombre(entity.getCodeudorNombre());
        domain.setCodeudorCedula(entity.getCodeudorCedula());
        domain.setCodeudorTelefono(entity.getCodeudorTelefono());
        domain.setCodeudorEmpresa(entity.getCodeudorEmpresa());
        domain.setCodeudorIngresos(entity.getCodeudorIngresos());
        domain.setObservaciones(entity.getObservaciones());
        domain.setEstado(entity.getEstado());
        domain.setFechaRegistro(entity.getFechaRegistro());

        return domain;
    }
}