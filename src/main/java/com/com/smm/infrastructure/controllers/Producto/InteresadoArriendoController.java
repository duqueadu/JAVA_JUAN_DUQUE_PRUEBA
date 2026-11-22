package com.com.smm.infrastructure.controllers.Producto;

import com.com.smm.application.services.Producto.InteresadoArriendoService;
import com.com.smm.domain.exception.SolicitudArriendoDuplicadaException;
import com.com.smm.domain.model.Producto.EstadoSolicitud;
import com.com.smm.domain.model.Producto.InteresadoArriendo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/arriendos")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*", methods = {
        RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.PATCH, RequestMethod.OPTIONS
})
public class InteresadoArriendoController {

    private static final Logger logger = LoggerFactory.getLogger(InteresadoArriendoController.class);

    private final InteresadoArriendoService arriendoService;

    public InteresadoArriendoController(InteresadoArriendoService arriendoService) {
        this.arriendoService = arriendoService;
    }

    @PostMapping
    public ResponseEntity<?> crearArriendo(@RequestBody InteresadoArriendo interesadoArriendo) {
        try {
            if (interesadoArriendo == null) {
                return ResponseEntity.badRequest().body(Map.of("error", "El cuerpo de la solicitud no puede estar vacío."));
            }

            logger.info("Recibiendo petición POST /api/arriendos para producto ID: {} y usuario ID: {}",
                    interesadoArriendo.getProductoId(), interesadoArriendo.getUsuarioId());

            InteresadoArriendo nuevaSolicitud = arriendoService.createInteresadoArriendo(interesadoArriendo);
            return ResponseEntity.status(HttpStatus.CREATED).body(nuevaSolicitud);

        } catch (SolicitudArriendoDuplicadaException e) {
            logger.warn("Conflicto de solicitud duplicada: {}", e.getMessage());
            return ResponseEntity.status(HttpStatus.CONFLICT).body(Map.of("error", e.getMessage()));
        } catch (IllegalArgumentException e) {
            logger.warn("Solicitud inválida: {}", e.getMessage());
            return ResponseEntity.badRequest().body(Map.of("error", e.getMessage()));
        } catch (Exception e) {
            logger.error("Error interno al crear la solicitud de arriendo: ", e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(Map.of("error", "Ocurrió un error interno al procesar la solicitud de arriendo."));
        }
    }

    @GetMapping
    public ResponseEntity<List<InteresadoArriendo>> listarArriendos() {
        List<InteresadoArriendo> arriendos = arriendoService.getAllInteresadoArriendo();
        return ResponseEntity.ok(arriendos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> obtenerArriendoPorId(@PathVariable Long id) {
        Optional<InteresadoArriendo> arriendo = arriendoService.getInteresadoArriendoById(id);
        if (arriendo.isPresent()) {
            return ResponseEntity.ok(arriendo.get());
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(Map.of("error", "No se encontró la solicitud de arriendo con ID: " + id));
    }

    @GetMapping("/usuario/{usuarioId}")
    public ResponseEntity<List<InteresadoArriendo>> listarArriendosPorUsuario(@PathVariable Long usuarioId) {
        List<InteresadoArriendo> arriendos = arriendoService.getInteresadoArriendoByUsuarioId(usuarioId);
        return ResponseEntity.ok(arriendos);
    }


    @PutMapping("/{id}/estado")
    public ResponseEntity<?> actualizarEstadoArriendo(@PathVariable Long id, @RequestParam EstadoSolicitud estado) {
        try {
            Optional<InteresadoArriendo> actualizada = arriendoService.updateEstadoInteresadoArriendo(id, estado);
            if (actualizada.isPresent()) {
                return ResponseEntity.ok(actualizada.get());
            }
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(Map.of("error", "No se encontró la solicitud de arriendo con ID: " + id));
        } catch (Exception e) {
            logger.error("Error al actualizar estado de la solicitud ID {}: ", id, e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(Map.of("error", "Error al actualizar el estado de la solicitud."));
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarArriendo(@PathVariable Long id) {
        boolean eliminado = arriendoService.deleteInteresadoArriendo(id);
        if (eliminado) {
            return ResponseEntity.ok(Map.of("mensaje", "Solicitud de arriendo eliminada correctamente."));
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(Map.of("error", "No se encontró la solicitud de arriendo con ID: " + id));
    }
}