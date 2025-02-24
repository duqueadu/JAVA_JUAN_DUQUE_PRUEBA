package com.com.smm.infrastructure.controllers.Pedidos;

import com.com.smm.application.services.Pedidos.MedioEnvioService;
import com.com.smm.domain.model.Pedidos.MedioEnvio;
import com.com.smm.infrastructure.entities.Pedidos.MedioEnvios;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/MedioEnvio")
public class MedioEnvioController {

    private final MedioEnvioService medioEnvioService;

    public MedioEnvioController(MedioEnvioService medioEnvioService) {
        this.medioEnvioService = medioEnvioService;
    }

    @PostMapping("/crear")
    public ResponseEntity<MedioEnvios> createMedioEnvio( @RequestBody MedioEnvios medioEnvio) {
        if (medioEnvio.getNombre() == null) {
            return ResponseEntity.badRequest().body(null); // Retorna 400 Bad Request si falta algún campo
        }
        MedioEnvios createdMedioEnvio = medioEnvioService.createMedioEnvio(medioEnvio);
        return new ResponseEntity<>(createdMedioEnvio, HttpStatus.CREATED);
    }

    @GetMapping("/{medioEnvioId}")
    public ResponseEntity<MedioEnvio> getMedioEnvioById(@PathVariable Long medioEnvioId) {
        return medioEnvioService.getMedioEnvioById(medioEnvioId)
                .map(medioEnvio -> new ResponseEntity<>(medioEnvio, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }



    @GetMapping("/todos")
    public List<MedioEnvio> getAllMediosEnvio() {
        return medioEnvioService.getAllMedioEnvio();
    }

    @PutMapping("/{medioEnvioId}")
    public ResponseEntity<MedioEnvios> updateMedioEnvio(@PathVariable Long medioEnvioId, @RequestBody MedioEnvios updatedMedioEnvio) {
        return medioEnvioService.updateMedioEnvio(medioEnvioId, updatedMedioEnvio)
                .map(medioEnvio -> new ResponseEntity<>(medioEnvio, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{medioEnvioId}")
    public ResponseEntity<Void> deleteMedioEnvioById(@PathVariable Long medioEnvioId) {
        if (medioEnvioService.deleteMedioEnvio(medioEnvioId)) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
