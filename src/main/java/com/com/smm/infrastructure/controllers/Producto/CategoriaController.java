package com.com.smm.infrastructure.controllers.Producto;

import com.com.smm.application.services.Producto.CategoriaService;

import com.com.smm.domain.model.Producto.Categoria;

import com.com.smm.infrastructure.entities.Producto.Categorias;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Categoria")
public class CategoriaController {

        private final CategoriaService categoriaservice;

        public CategoriaController(CategoriaService categoriaservice) {
            this.categoriaservice = categoriaservice;
        }


        @PostMapping("/crear")
        public ResponseEntity<Categoria> createcategoria(@RequestBody Categoria categoria) {
            if (categoria.getNombre() == null || categoria.getDescripcion() == null) {
                return ResponseEntity.badRequest().body(null); // Retorna 400 Bad Request si falta algún campo
            }

            Categoria createdcategoria = categoriaservice.createCategoria(categoria);
            return new ResponseEntity<>(createdcategoria, HttpStatus.CREATED);
        }


        @GetMapping("/{UsuarioId}")
        public ResponseEntity<Categoria> getUsuarioById(@PathVariable Long CategoriaId) {
            return categoriaservice.getCategoriaById(CategoriaId)
                    .map(Usuario -> new ResponseEntity<>(Usuario, HttpStatus.OK))
                    .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }
        @GetMapping("/prueba")
        public String prueba() {
            return "prueba";
        }

        @GetMapping("/todos")
        public List<Categoria> getAllUsuarios() {
            List<Categoria> Categoria = categoriaservice.getAllCategoria();
            return Categoria;
        }

        @PutMapping("/{UsuarioId}")
        public ResponseEntity<Categoria> updateUsuario(@PathVariable Long UsuarioId, @RequestBody Categorias updatedCategoria) {
            return categoriaservice.updateCategoria(UsuarioId, updatedCategoria)
                    .map(Usuario -> new ResponseEntity<>(Usuario, HttpStatus.OK))
                    .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }

        @DeleteMapping("/{UsuarioId}")
        public ResponseEntity<Void> deleteUsuarioById(@PathVariable Long UsuarioId) {
            if (categoriaservice.deleteCategoria(UsuarioId)) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }


    }

