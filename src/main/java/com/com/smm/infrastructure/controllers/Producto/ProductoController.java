package com.com.smm.infrastructure.controllers.Producto;

import com.com.smm.application.services.Producto.ProductoService;
import com.com.smm.domain.model.Producto.Producto;

import com.com.smm.infrastructure.entities.Producto.Productos;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;

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

    @GetMapping("/pmasvendido")
    public List<?> pmasvendido() {
        return productoservice.pmasvendido();

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



    @PostMapping("/actualizarStock")
    public ResponseEntity<Producto> actualizarStock(@RequestBody Map<String, Object> request) {
        try {
            // Validación de los campos esperados
            if (!request.containsKey("productoId") || !request.containsKey("cantidadCompra")) {
                return error("Faltan campos requeridos: 'productoId' y 'cantidadCompra'.", HttpStatus.BAD_REQUEST);
            }

            Long productoId = Long.valueOf(request.get("productoId").toString());
            int cantidad = Integer.parseInt(request.get("cantidadCompra").toString());

            if (cantidad < 0) {
                return error("La cantidad de compra no puede ser negativa.", HttpStatus.BAD_REQUEST);
            }

            return productoservice.getProductoById(productoId)
                    .map(producto -> {
                        long nuevoStock = producto.getStock() + cantidad;
                        if (nuevoStock < 0) {
                            return error("No hay suficiente stock para la compra.", HttpStatus.BAD_REQUEST);
                        }

                        producto.setStock(nuevoStock);
                        try {
                            productoservice.updateProducto(producto.getId(), Productos.fromDomainModel(producto));
                            return ResponseEntity.ok(producto);
                        } catch (Exception e) {
                            return error("Error al actualizar el producto: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
                        }
                    })
                    .orElseGet(() -> error("Producto no encontrado.", HttpStatus.NOT_FOUND));

        } catch (NumberFormatException e) {
            return error("Formato inválido para 'productoId' o 'cantidadCompra'.", HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            return error("Error inesperado: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    private ResponseEntity<Producto> error(String mensaje, HttpStatus status) {
        Producto errorProducto = new Producto();
        errorProducto.setNombre("Error: " + mensaje);
        return new ResponseEntity<>(errorProducto, status);
    }



    @GetMapping("/Fwiltro")
    public String filtrawrProductos() {
        return "ddd";
    }

}

