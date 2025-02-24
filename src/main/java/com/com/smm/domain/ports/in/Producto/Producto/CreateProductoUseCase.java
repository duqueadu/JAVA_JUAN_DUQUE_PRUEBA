package com.com.smm.domain.ports.in.Producto.Producto;


import com.com.smm.domain.model.Producto.Producto;
import com.com.smm.infrastructure.entities.Producto.Productos;

import java.util.List;


public interface CreateProductoUseCase {
    Productos createProducto(Productos productos);

    Producto createProducto(Producto Productos);


}