package com.com.smm.infrastructure.controllers.Pedidos;

import com.com.smm.application.services.Pedidos.FacturaService;
import com.com.smm.domain.model.Pedidos.Factura;
import com.com.smm.infrastructure.entities.Pedidos.Facturas;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/Factura")
public class FacturaController {

    private final FacturaService facturaService;

    public FacturaController(FacturaService facturaService) {
        this.facturaService = facturaService;
    }

    @PostMapping("/crear")
    public ResponseEntity<Facturas> createFactura(@RequestBody Facturas factura) {
        if (factura.getTotal() == null || factura.getPeridoId() == null) {
            return ResponseEntity.badRequest().body(null);
        }
        Facturas createdFactura = facturaService.createFactura(factura);
        return new ResponseEntity<>(createdFactura, HttpStatus.CREATED);
    }

    @GetMapping("/{FacturaId}")
    public ResponseEntity<Factura> getFacturaById(@PathVariable Long FacturaId) {
        return facturaService.getFacturaById(FacturaId)
                .map(factura -> new ResponseEntity<>(factura, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/prueba")
    public String prueba() {
        return "prueba";
    }

    @GetMapping("/todos")
    public List<Factura> getAllFacturas() {
        return facturaService.getAllFactura();
    }

    @PutMapping("/{FacturaId}")
    public ResponseEntity<Factura> updateFactura(@PathVariable Long FacturaId, @RequestBody Facturas updatedFactura) {
        return facturaService.updateFactura(FacturaId, updatedFactura)
                .map(factura -> new ResponseEntity<>(factura, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{FacturaId}")
    public ResponseEntity<Void> deleteFacturaById(@PathVariable Long FacturaId) {
        if (facturaService.deleteFactura(FacturaId)) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
