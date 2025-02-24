package com.com.smm.infrastructure.controllers.Pedidos;

import com.com.smm.application.services.Pedidos.EnvioService;
import com.com.smm.domain.model.Pedidos.Envio;
import com.com.smm.infrastructure.entities.Pedidos.Envios;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/envio")
public class EnvioController {

    private final EnvioService envioService;

    public EnvioController(EnvioService envioService) {
        this.envioService = envioService;
    }

    @PostMapping("/crear")
    public ResponseEntity<Envios> createEnvio(@RequestBody Envios envio) {
        if (envio.getEmpresaEnvio() == null || envio.getEmpresaEnvio() == null) {
            return ResponseEntity.badRequest().body(null); // Retorna 400 Bad Request si falta algún campo
        }
        Envios createdEnvio = envioService.createEnvio(envio);
        return new ResponseEntity<>(createdEnvio, HttpStatus.CREATED);
    }

    @GetMapping("/{envioId}")
    public ResponseEntity<Envio> getEnvioById(@PathVariable Long envioId) {
        return envioService.getEnvioById(envioId)
                .map(envio -> new ResponseEntity<>(envio, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/prueba")
    public String prueba() {
        return "prueba";
    }

    @GetMapping("/todos")
    public List<Envio> getAllEnvios() {
        return envioService.getAllEnvio();
    }

    @PutMapping("/{envioId}")
    public ResponseEntity<Envios> updateEnvio(@PathVariable Long envioId, @RequestBody Envios updatedEnvio) {
        return envioService.updateEnvio(envioId, updatedEnvio)
                .map(envio -> new ResponseEntity<>(envio, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{envioId}")
    public ResponseEntity<Void> deleteEnvioById(@PathVariable Long envioId) {
        if (envioService.deleteEnvio(envioId)) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}