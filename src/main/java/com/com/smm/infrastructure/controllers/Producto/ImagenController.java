package com.com.smm.infrastructure.controllers.Producto;


import com.com.smm.application.services.Producto.ImagenService;
import com.com.smm.domain.model.Producto.Imagen;
import com.com.smm.infrastructure.entities.Producto.Imagenes;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Imagen")
public class ImagenController {

        private final ImagenService imagenservice;

        public ImagenController(ImagenService imagenservice) {
            this.imagenservice = imagenservice;
        }

        @PostMapping
        public ResponseEntity<Imagen> createUsuario(@RequestBody Imagen Imagen) {
            Imagen createdImagen = imagenservice.createImagen(Imagen);
            return new ResponseEntity<>(createdImagen, HttpStatus.CREATED);
        }

        @GetMapping("/{UsuarioId}")
        public ResponseEntity<Imagen> getUsuarioById(@PathVariable Long ImagenId) {
            return imagenservice.getImagenById(ImagenId)
                    .map(Usuario -> new ResponseEntity<>(Usuario, HttpStatus.OK))
                    .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }
        @GetMapping("/prueba")
        public String prueba() {
            return "prueba";
        }

        @GetMapping("/todos")
        public List<Imagen> getAllUsuarios() {
            List<Imagen> Imagen = imagenservice.getAllImagen();
            return Imagen;
        }

        @PutMapping("/{UsuarioId}")
        public ResponseEntity<Imagen> updateUsuario(@PathVariable Long UsuarioId, @RequestBody Imagenes updatedImagen) {
            return imagenservice.updateImagen(UsuarioId, updatedImagen)
                    .map(Usuario -> new ResponseEntity<>(Usuario, HttpStatus.OK))
                    .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }

        @DeleteMapping("/{UsuarioId}")
        public ResponseEntity<Void> deleteUsuarioById(@PathVariable Long UsuarioId) {
            if (imagenservice.deleteImagen(UsuarioId)) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }


    }

