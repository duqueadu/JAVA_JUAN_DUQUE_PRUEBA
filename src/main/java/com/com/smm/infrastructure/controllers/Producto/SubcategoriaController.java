package com.com.smm.infrastructure.controllers.Producto;

import com.com.smm.application.services.Producto.SubcategoriaService;
import com.com.smm.domain.model.Producto.Subcategoria;
import com.com.smm.infrastructure.entities.Producto.Subcategorias;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Subcategoria")
public class SubcategoriaController {

        private final SubcategoriaService subcategoriaService;

        public SubcategoriaController(SubcategoriaService subcategoriaService) {
            this.subcategoriaService = subcategoriaService;
        }

        @PostMapping("/createsubcategoria")
        @ResponseStatus(HttpStatus.CREATED)
        public ResponseEntity<Subcategoria> createSubcategoria(@RequestBody Subcategoria subcategoria) {
            // Verificar si subcategoria es nulo o tiene campos obligatorios faltantes
            if (subcategoria.getNombre() == null || subcategoria.getDescripcion() == null) {
                return ResponseEntity.badRequest().body(null); // Retorna 400 Bad Request si falta algún campo
            }

            Subcategoria createdSubcategoria = subcategoriaService.createSubcategoria(subcategoria);
            return new ResponseEntity<>(createdSubcategoria, HttpStatus.CREATED);
        }

        @GetMapping("/{UsuarioId}")
        public ResponseEntity<Subcategoria> getUsuarioById(@PathVariable Long SubcategoriaId) {
            return subcategoriaService.getSubcategoriaById(SubcategoriaId)
                    .map(Usuario -> new ResponseEntity<>(Usuario, HttpStatus.OK))
                    .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }
        @GetMapping("/prueba")
        public String prueba() {
            return "prueba";
        }

        @GetMapping("/todos")
        public List<Subcategoria> getAllUsuarios() {
            List<Subcategoria> Subcategoria = subcategoriaService.getAllSubcategoria();
            return Subcategoria;
        }

        @PutMapping("/{UsuarioId}")
        public ResponseEntity<Subcategoria> updateUsuario(@PathVariable Long UsuarioId, @RequestBody Subcategoria updatedSubcategoria) {
            return subcategoriaService.updateSubcategoria(UsuarioId, updatedSubcategoria)
                    .map(Usuario -> new ResponseEntity<>(Usuario, HttpStatus.OK))
                    .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }

        @DeleteMapping("/{UsuarioId}")
        public ResponseEntity<Void> deleteUsuarioById(@PathVariable Long UsuarioId) {
            if (subcategoriaService.deleteSubcategoria(UsuarioId)) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }


    }

