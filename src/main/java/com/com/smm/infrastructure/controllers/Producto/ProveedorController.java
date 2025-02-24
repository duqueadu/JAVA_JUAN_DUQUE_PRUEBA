package com.com.smm.infrastructure.controllers.Producto;

import com.com.smm.application.services.Producto.ProveedorService;
import com.com.smm.domain.model.Producto.Proveedor;
import com.com.smm.infrastructure.entities.Producto.Proveedores;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Proveedor")
public class ProveedorController {

        private final ProveedorService proveedoreservice;

        public ProveedorController(ProveedorService proveedoreservice) {
            this.proveedoreservice = proveedoreservice;
        }

        @PostMapping("/crear")
        public ResponseEntity<Proveedor> createproveedor(@RequestBody Proveedor proveedor) {

            Proveedor createdproveedor = proveedoreservice.createProveedor(proveedor);
            return new ResponseEntity<>(createdproveedor, HttpStatus.CREATED);
        }

        @PostMapping("/createProveedor")
        @ResponseStatus(HttpStatus.CREATED)
        public ResponseEntity<Proveedor> createProveedor(@RequestBody Proveedor proveedor) {
            // Verificar si Proveedor es nulo o tiene campos obligatorios faltantes
            if (proveedor.getNombre() == null || proveedor.getContacto() == null) {
                return ResponseEntity.badRequest().body(null); // Retorna 400 Bad Request si falta algún campo
            }

            Proveedor createdProveedor = proveedoreservice.createProveedor(proveedor);
            return new ResponseEntity<>(createdProveedor, HttpStatus.CREATED);
        }



    @GetMapping("/{UsuarioId}")
        public ResponseEntity<Proveedor> getUsuarioById(@PathVariable Long ProveedorId) {
            return proveedoreservice.getProveedorById(ProveedorId)
                    .map(Usuario -> new ResponseEntity<>(Usuario, HttpStatus.OK))
                    .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }
        @GetMapping("/prueba")
        public String prueba() {
            return "prueba";
        }

        @GetMapping("/todos")
        public List<Proveedores> getAllUsuarios() {
            List<Proveedores> Proveedor = proveedoreservice.getAllProveedor();
            return Proveedor;
        }

        @PutMapping("/{UsuarioId}")
        public ResponseEntity<Proveedor> updateUsuario(@PathVariable Long UsuarioId, @RequestBody Proveedor updatedProveedor) {
            return proveedoreservice.updateProveedor(UsuarioId, updatedProveedor)
                    .map(Usuario -> new ResponseEntity<>(Usuario, HttpStatus.OK))
                    .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }

        @DeleteMapping("/{UsuarioId}")
        public ResponseEntity<Void> deleteUsuarioById(@PathVariable Long UsuarioId) {
            if (proveedoreservice.deleteProveedor(UsuarioId)) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }


    }

