package com.com.smm.infrastructure.controllers.Seguridad;

import com.com.smm.application.services.Seguridad.RolesService;
import com.com.smm.domain.model.Seguridad.Rol;
import com.com.smm.infrastructure.entities.Seguridad.Roles;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/Roles")
public class RolController {

        private final RolesService rolService;

        public RolController(RolesService rolService) {
            this.rolService = rolService;
        }

        @PostMapping
        public ResponseEntity<Roles> createUsuario(@RequestBody Roles rol) {
            Roles createdRol = rolService.createRol(rol);
            return new ResponseEntity<>(createdRol, HttpStatus.CREATED);
        }

        @GetMapping("/{UsuarioId}")
        public ResponseEntity<Rol> getUsuarioById(@PathVariable Long rolId) {
            return rolService.getRolById(rolId)
                    .map(Usuario -> new ResponseEntity<>(Usuario, HttpStatus.OK))
                    .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }
        @GetMapping("/prueba")
        public String prueba() {
            return "prueba";
        }

        @GetMapping("/todos")
        public List<Rol> getRol() {
            return rolService.getAllRol();
        }

        @PutMapping("/{UsuarioId}")
        public ResponseEntity<Rol> updateUsuario(@PathVariable Long UsuarioId, @RequestBody Roles updatedRol) {
            return rolService.updateRol(UsuarioId, updatedRol)
                    .map(Usuario -> new ResponseEntity<>(Usuario, HttpStatus.OK))
                    .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }



        @DeleteMapping("/{UsuarioId}")
        public ResponseEntity<Void> deleteUsuarioById(@PathVariable Long UsuarioId) {
            if (rolService.deleteRol(UsuarioId)) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }


    }

