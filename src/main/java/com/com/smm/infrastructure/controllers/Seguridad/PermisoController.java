package com.com.smm.infrastructure.controllers.Seguridad;

import com.com.smm.application.services.Seguridad.PermisosService;
import com.com.smm.domain.model.Seguridad.Permiso;
import com.com.smm.infrastructure.entities.Seguridad.Permisos;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Permiso")
public class PermisoController {

        private final PermisosService PermisoService;

        public PermisoController(PermisosService PermisoService) {
            this.PermisoService = PermisoService;
        }

        @PostMapping
        public ResponseEntity<Permisos> createUsuario(@RequestBody Permisos Permiso) {
            Permisos createdPermiso = PermisoService.createPermiso(Permiso);
            return new ResponseEntity<>(createdPermiso, HttpStatus.CREATED);
        }

        @GetMapping("/{UsuarioId}")
        public ResponseEntity<Permiso> getUsuarioById(@PathVariable Long PermisoId) {
            return PermisoService.getPermisoById(PermisoId)
                    .map(Usuario -> new ResponseEntity<>(Usuario, HttpStatus.OK))
                    .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }
        @GetMapping("/prueba")
        public String prueba() {
            return "prueba";
        }

        @GetMapping("/todos")
        public List<Permiso> getAllUsuarios() {
            List<Permiso> Permiso = PermisoService.getAllPermiso();
            return Permiso;
        }

        @PutMapping("/{UsuarioId}")
        public ResponseEntity<Permiso> updateUsuario(@PathVariable Long UsuarioId, @RequestBody Permisos updatedPermiso) {
            return PermisoService.updatePermiso(UsuarioId, updatedPermiso)
                    .map(Usuario -> new ResponseEntity<>(Usuario, HttpStatus.OK))
                    .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }

        @DeleteMapping("/{UsuarioId}")
        public ResponseEntity<Void> deleteUsuarioById(@PathVariable Long UsuarioId) {
            if (PermisoService.deletePermiso(UsuarioId)) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }


    }

