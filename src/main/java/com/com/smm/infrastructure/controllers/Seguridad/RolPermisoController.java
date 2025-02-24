package com.com.smm.infrastructure.controllers.Seguridad;

import com.com.smm.application.services.Seguridad.RolPermisoService;
import com.com.smm.domain.model.Seguridad.Rol;
import com.com.smm.domain.model.Seguridad.RolPermiso;
import com.com.smm.infrastructure.entities.Seguridad.RolPermisos;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/RolPermiso")
public class RolPermisoController {

        private final RolPermisoService rolPermisoService;

        public RolPermisoController(RolPermisoService rolPermisoService) {
            this.rolPermisoService = rolPermisoService;
        }

        @PostMapping
        public ResponseEntity<RolPermisos> createUsuario(@RequestBody RolPermisos rolPermiso) {
            RolPermisos createdRol = rolPermisoService.createRolPermiso(rolPermiso);
            return new ResponseEntity<>(createdRol, HttpStatus.CREATED);
        }

        @GetMapping("/{UsuarioId}")
        public ResponseEntity<RolPermiso> getUsuarioById(@PathVariable Long rolId) {
            return rolPermisoService.getRolPermisoById(rolId)
                    .map(Usuario -> new ResponseEntity<>(Usuario, HttpStatus.OK))
                    .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }
        @GetMapping("/prueba")
        public String prueba() {
            return "prueba";
        }

        @GetMapping("/todos")
        public List<RolPermiso> getAllUsuarios() {
            List<RolPermiso> rolPermiso = rolPermisoService.getAllRolPermiso();
            return rolPermiso;
        }

    @GetMapping("/editar/{id}")  // Usar GetMapping aunque no es recomendable para actualizaciones
    public ResponseEntity<RolPermiso> actualizarRolPermiso(@PathVariable Long id, @RequestBody RolPermisos rolPermisoActualizado) {
        try {
            Optional<RolPermiso> rolPermiso = rolPermisoService.updateRolPermiso(id, rolPermisoActualizado);
            return rolPermiso.map(rp -> new ResponseEntity<>(rp, HttpStatus.OK))
                    .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        } catch (Exception e) {
            // Log para depuración
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }



    @DeleteMapping("/{UsuarioId}")
        public ResponseEntity<Void> deleteUsuarioById(@PathVariable Long UsuarioId) {
            if (rolPermisoService.deleteRolPermiso(UsuarioId)) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }


    }

