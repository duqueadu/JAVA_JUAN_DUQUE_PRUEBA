package com.com.smm.infrastructure.controllers.Producto;

import com.com.smm.application.services.Producto.ProductoService;
import com.com.smm.domain.model.Producto.Filtro;
import com.com.smm.domain.model.Producto.Producto;

import com.com.smm.infrastructure.entities.Producto.Productos;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/Producto")
public class ProductoController {

        private final ProductoService productoservice;

        public ProductoController(ProductoService productoservice) {
            this.productoservice = productoservice;
        }

        @PostMapping("/crear")
        public ResponseEntity<Producto> createcategoria(@RequestBody Producto categoria) {
            categoria.setFechaCreacion(new Date()); // Establecer la fecha de creación
            Producto createdcategoria = productoservice.createProducto(categoria);

            return new ResponseEntity<>(createdcategoria, HttpStatus.CREATED);
        }




    @GetMapping("/{ProductoId}")
        public ResponseEntity<Producto> getProductoById(@PathVariable Long ProductoId) {
            return productoservice.getProductoById(ProductoId)
                    .map(Producto -> new ResponseEntity<>(Producto, HttpStatus.OK))
                    .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }
        @GetMapping("/prueba")
        public String prueba() {
            return "prueba";
        }

            @GetMapping("/todos")
            public List<Producto> getAllUsuarios() {
                List<Producto> producto = productoservice.getProducto();
                return producto;
            }



        @PutMapping("/{ProductoId}")
        public ResponseEntity<Producto> updateProducto(@PathVariable Long ProductoId, @RequestBody Productos updatedProducto) {
            return productoservice.updateProducto(ProductoId, updatedProducto)
                    .map(Producto -> new ResponseEntity<>(Producto, HttpStatus.OK))
                    .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }

        @DeleteMapping("/{ProductoId}")
        public ResponseEntity<Void> deleteProductoById(@PathVariable Long ProductoId) {
            if (productoservice.deleteProductos(ProductoId)) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }



    @GetMapping("/productoDetalle")
    public List<?> getProductById() {
        return productoservice.productoDetalle();

    }



    @GetMapping("/producto")
    public List<?> someMethod(int id) {
        // 'id' will be 0 if not provided in the request
        return productoservice.productoDetalleId(id);
    }

    @PostMapping("/productoDetalleId")
    public List<?> getProductById(int id) {
        return productoservice.productoDetalleId(id);

    }



    @GetMapping("/Filtro")
    public ResponseEntity<?> buscarProductos(
            @RequestParam(required = false) String nombre,
            @RequestParam(required = false) Long categoriaId) {

        // Lógica del servicio
        return ResponseEntity.ok(productoservice.buscarPorNombreYCategoria(nombre, categoriaId));
    }




    @GetMapping("/Fwiltro")
    public String filtrawrProductos() {
        return "ddd";
    }

}

