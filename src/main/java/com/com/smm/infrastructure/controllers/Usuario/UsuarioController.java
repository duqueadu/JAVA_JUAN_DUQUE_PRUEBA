package com.com.smm.infrastructure.controllers.Usuario;

import com.com.smm.application.services.UsuarioService;
import com.com.smm.domain.model.Usuario.Usuario;
import com.com.smm.domain.model.Usuario.loginUsuario;
import com.com.smm.domain.model.Usuario.token;
import com.com.smm.infrastructure.config.TokenGenerator;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.crypto.SecretKey;
import java.util.*;

@RestController
@RequestMapping("/api/Usuario")
public class UsuarioController {

        private final UsuarioService UsuarioService;

        public UsuarioController(UsuarioService UsuarioService) {

            this.UsuarioService = UsuarioService;
        }


        @PostMapping("/usuarios")
        public ResponseEntity<?> usuarios(@RequestBody Usuario usuario) {
            try {
                // Intentar crear el usuario
                Usuario createdUsuario = UsuarioService.createUsuario(usuario);
                if(createdUsuario == null ){
                    return new ResponseEntity<>(null, HttpStatus.CREATED);
                }
                return new ResponseEntity<>(createdUsuario, HttpStatus.CREATED);


            } catch (Exception e) {
                // Manejo general de excepciones
                return new ResponseEntity<>("Error inesperado al crear el usuario", HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }



        @GetMapping("/datosSesion")
        public ResponseEntity<?> getHeaders(
                @RequestHeader(HttpHeaders.AUTHORIZATION) String authorizationHeader) {

            // Extraer el token
            String token = TokenGenerator.extractToken(authorizationHeader);

            if (token != null) {
                // Decodificar el token
                Claims claims = TokenGenerator.getClaims(token);
                // Extraer y mostrar los datos
                System.out.println("ID: " + claims.get("id"));
                Optional<Usuario> usuario;
                usuario =  UsuarioService.getUsuarioById(  claims.get("id", Long.class));
                return ResponseEntity.ok(usuario);

            }
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid Token");
        }


        @PostMapping("/login")
        public ResponseEntity<?> login(@RequestBody loginUsuario loginRequest) {
            try {
                String token = UsuarioService.login(loginRequest.getEmail(), loginRequest.getContrasena());
                if (token != null) {
                    Map<String, String> response = new HashMap<>();
                    response.put("access_token", token);
                    return ResponseEntity.ok(response);
                } else {
                    return new ResponseEntity<>("Credenciales incorrectas", HttpStatus.UNAUTHORIZED);
                }
            } catch (Exception e) {
                return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }


        @PostMapping("/createUsuario")
        public ResponseEntity<?> createUsuario(Usuario Usuario) {
            Usuario createdUsuario = UsuarioService.createUsuario(Usuario);
            if(createdUsuario == null){

                return new ResponseEntity<>("El correo ya esta registrado", HttpStatus.BAD_REQUEST);

            }
            return new ResponseEntity<>(createdUsuario, HttpStatus.CREATED);
        }




        @GetMapping("/{UsuarioId}")
        public ResponseEntity<Usuario> getUsuarioById(@PathVariable Long UsuarioId) {
            return UsuarioService.getUsuarioById(UsuarioId)
                    .map(Usuario -> new ResponseEntity<>(Usuario, HttpStatus.OK))
                    .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }
        @GetMapping("/prueba")
        public String prueba() {
            return "prueba";
        }

        @GetMapping("/todos")
        public List<Usuario> getAllUsuarios() {
            List<Usuario> Usuarios = UsuarioService.getAllUsuarios();
            return Usuarios;
        }

        @PutMapping("/{UsuarioId}")
        public ResponseEntity<Usuario> updateUsuario(@PathVariable Long UsuarioId, @RequestBody Usuario updatedUsuario) {
            return UsuarioService.updateUsuario(UsuarioId, updatedUsuario)
                    .map(Usuario -> new ResponseEntity<>(Usuario, HttpStatus.OK))
                    .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }

        @DeleteMapping("/{UsuarioId}")
        public ResponseEntity<Void> deleteUsuarioById(@PathVariable Long UsuarioId) {
            if (UsuarioService.deleteUsuario(UsuarioId)) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }


    }

