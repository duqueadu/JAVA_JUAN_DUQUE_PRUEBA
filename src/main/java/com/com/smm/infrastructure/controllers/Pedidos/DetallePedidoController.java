package com.com.smm.infrastructure.controllers.Pedidos;

import com.com.smm.application.services.Pedidos.DetallePedidoService;
import com.com.smm.domain.model.Pedidos.DetallePedido;
import com.com.smm.infrastructure.entities.Pedidos.DetallePedidos;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/DetallePedido")
public class DetallePedidoController {

    private final DetallePedidoService detallePedidoService;

    public DetallePedidoController(DetallePedidoService detallePedidoService) {
        this.detallePedidoService = detallePedidoService;
    }

    @PostMapping("/crear")
    public ResponseEntity<DetallePedidos> createDetallePedido(@RequestBody DetallePedidos detallePedido) {
        if (detallePedido.getPedidoId() == null) {
            return ResponseEntity.badRequest().build();
        }
        DetallePedidos createdDetallePedido = detallePedidoService.createDetallePedido(detallePedido);
        return ResponseEntity.status(201).body(createdDetallePedido);
    }

    @GetMapping("/{detallePedidoId}")
    public ResponseEntity<DetallePedido> getDetallePedidoById(@PathVariable Long detallePedidoId) {
        return detallePedidoService.getDetallePedidoById(detallePedidoId)
                .map(ResponseEntity::ok)
                .orElseGet(() -> {
                    return ResponseEntity.notFound().build();
                });
    }

    @GetMapping("/prueba")
    public ResponseEntity<String> prueba() {
        return ResponseEntity.ok("prueba");
    }

    @GetMapping("/todos")
    public ResponseEntity<List<DetallePedido>> getAllDetallesPedido() {
        List<DetallePedido> detalles = detallePedidoService.getAllDetallePedido();
        if (detalles.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(detalles);
    }

    @PutMapping("/{detallePedidoId}")
    public ResponseEntity<DetallePedido> updateDetallePedido(
            @PathVariable Long detallePedidoId,
            @RequestBody DetallePedidos updatedDetallePedido) {

        if (updatedDetallePedido == null) {
            return ResponseEntity.badRequest().build();
        }

        Optional<DetallePedido> updated = detallePedidoService.updateDetallePedido(detallePedidoId, updatedDetallePedido);
        return updated.map(ResponseEntity::ok)
                .orElseGet(() -> {
                    return ResponseEntity.notFound().build();
                });
    }

    @DeleteMapping("/{detallePedidoId}")
    public ResponseEntity<Void> deleteDetallePedidoById(@PathVariable Long detallePedidoId) {
        if (detallePedidoService.deleteDetallePedido(detallePedidoId)) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
