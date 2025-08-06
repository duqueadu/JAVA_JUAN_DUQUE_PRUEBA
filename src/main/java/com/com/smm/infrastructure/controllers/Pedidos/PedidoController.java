package com.com.smm.infrastructure.controllers.Pedidos;

import com.com.smm.application.services.Pedidos.PedidoService;
import com.com.smm.domain.model.Pedidos.DetalleP;
import com.com.smm.domain.model.Pedidos.Pedido;
import com.com.smm.domain.model.Seguridad.RolPermiso;
import com.com.smm.infrastructure.entities.Pedidos.Pedidos;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/Pedido")
public class PedidoController {

    private final PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @PostMapping()
    public ResponseEntity<Pedido> createPedido(@RequestBody Pedido p) {

        Pedido createdPedido = pedidoService.createPedido(p);
        return new ResponseEntity<>(createdPedido, HttpStatus.CREATED);
    }


    @GetMapping("/{PedidoId}")
    public ResponseEntity<Pedido> getPedidoById(@PathVariable Long PedidoId) {
        return pedidoService.getPedidoById(PedidoId)
                .map(pedido -> new ResponseEntity<>(pedido, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/prueba")
    public String prueba() {
        return "prueba";
    }

    @GetMapping("/todos")
    public List<Pedido> getpedido() {
        List<Pedido> pedido = pedidoService.getAllPedido();
        return pedido;
    }

    @PutMapping("/{PedidoId}")
    public ResponseEntity<Pedidos> updatePedido(@PathVariable Long PedidoId, @RequestBody Pedidos updatedPedido) {
        return pedidoService.updatePedido(PedidoId, updatedPedido)
                .map(pedido -> new ResponseEntity<>(pedido, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{PedidoId}")
    public ResponseEntity<Void> deletePedidoById(@PathVariable Long PedidoId) {
        if (pedidoService.deletePedido(PedidoId)) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    @GetMapping("obtenerDetallePedido/{PedidoId}")
    public Map<String, Object> detallePedido(@PathVariable Long PedidoId) {
        return pedidoService.obtenerDetallePedido(PedidoId);
    }
}
