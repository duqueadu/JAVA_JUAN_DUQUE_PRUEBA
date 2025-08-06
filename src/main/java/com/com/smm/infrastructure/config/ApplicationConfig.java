package com.com.smm.infrastructure.config;

import com.com.smm.application.services.Pedidos.*;
import com.com.smm.application.services.Producto.*;
import com.com.smm.application.services.Seguridad.PermisosService;
import com.com.smm.application.services.Seguridad.RolPermisoService;
import com.com.smm.application.services.Seguridad.RolesService;
import com.com.smm.application.services.UsuarioService;
import com.com.smm.application.usecases.Pedidos.DetallePedido.CreateDetallePedidoUseCaseImpl;
import com.com.smm.application.usecases.Pedidos.DetallePedido.DeleteDetallePedidoUseCaseImpl;
import com.com.smm.application.usecases.Pedidos.DetallePedido.RetrieveDetallePedidoUseCaseImpl;
import com.com.smm.application.usecases.Pedidos.DetallePedido.UpdateDetallePedidoUseCaseImpl;
import com.com.smm.application.usecases.Pedidos.Factura.CreateFacturaUseCaseImpl;
import com.com.smm.application.usecases.Pedidos.Factura.DeleteFacturaUseCaseImpl;
import com.com.smm.application.usecases.Pedidos.Factura.RetrieveFacturaUseCaseImpl;
import com.com.smm.application.usecases.Pedidos.Factura.UpdateFacturaUseCaseImpl;
import com.com.smm.application.usecases.Pedidos.MedioEnvio.CreateMedioEnvioUseCaseImpl;
import com.com.smm.application.usecases.Pedidos.MedioEnvio.DeleteMedioEnvioUseCaseImpl;
import com.com.smm.application.usecases.Pedidos.MedioEnvio.RetrieveMedioEnvioUseCaseImpl;
import com.com.smm.application.usecases.Pedidos.MedioEnvio.UpdateMedioEnvioUseCaseImpl;
import com.com.smm.application.usecases.Pedidos.Pedido.CreatePedidoUseCaseImpl;
import com.com.smm.application.usecases.Pedidos.Pedido.DeletePedidoUseCaseImpl;
import com.com.smm.application.usecases.Pedidos.Pedido.RetrievePedidoUseCaseImpl;
import com.com.smm.application.usecases.Pedidos.Pedido.UpdatePedidoUseCaseImpl;
import com.com.smm.application.usecases.Pedidos.envio.CreateEnvioUseCaseImpl;
import com.com.smm.application.usecases.Pedidos.envio.DeleteEnvioUseCaseImpl;
import com.com.smm.application.usecases.Pedidos.envio.RetrieveEnvioUseCaseImpl;
import com.com.smm.application.usecases.Pedidos.envio.UpdateEnvioUseCaseImpl;
import com.com.smm.application.usecases.Producto.Categoria.CreateCategoriaUseCaseImpl;
import com.com.smm.application.usecases.Producto.Categoria.DeleteCategoriaUseCaseImpl;
import com.com.smm.application.usecases.Producto.Categoria.RetrieveCategoriaUseCaseImpl;
import com.com.smm.application.usecases.Producto.Categoria.UpdateCotegoriaUseCaseImpl;
import com.com.smm.application.usecases.Producto.Imagen.CreateImagenUseCaseImpl;
import com.com.smm.application.usecases.Producto.Imagen.DeleteImagenUseCaseImpl;
import com.com.smm.application.usecases.Producto.Imagen.RetrieveImagenUseCaseImpl;
import com.com.smm.application.usecases.Producto.Imagen.UpdateImagenUseCaseImpl;
import com.com.smm.application.usecases.Producto.Producto.CreateProductoUseCaseImpl;
import com.com.smm.application.usecases.Producto.Producto.DeleteProductoUseCaseImpl;
import com.com.smm.application.usecases.Producto.Producto.RetrieveProductoUseCaseImpl;
import com.com.smm.application.usecases.Producto.Producto.UpdateProductoUseCaseImpl;
import com.com.smm.application.usecases.Producto.Proveedor.CreateProveedorUseCaseImpl;
import com.com.smm.application.usecases.Producto.Proveedor.DeleteProveedorUseCaseImpl;
import com.com.smm.application.usecases.Producto.Proveedor.RetrieveProveedorUseCaseImpl;
import com.com.smm.application.usecases.Producto.Proveedor.UpdateProveedorUseCaseImpl;
import com.com.smm.application.usecases.Producto.Subcategoria.CreateSubcategoriaUseCaseImpl;
import com.com.smm.application.usecases.Producto.Subcategoria.DeleteSubcategoriaUseCaseImpl;
import com.com.smm.application.usecases.Producto.Subcategoria.RetrieveSubcategoriaUseCaseImpl;
import com.com.smm.application.usecases.Producto.Subcategoria.UpdateSubcategoriaUseCaseImpl;
import com.com.smm.application.usecases.Seguridad.Permiso.CreatePermisosUseCaseImpl;
import com.com.smm.application.usecases.Seguridad.Permiso.DeletePermisoUseCaseImpl;
import com.com.smm.application.usecases.Seguridad.Permiso.RetrievePermisoUseCaseImpl;
import com.com.smm.application.usecases.Seguridad.Permiso.UpdatePermisoUseCaseImpl;
import com.com.smm.application.usecases.Seguridad.Rol.CreateRolesUseCaseImpl;
import com.com.smm.application.usecases.Seguridad.Rol.DeleteRolUseCaseImpl;
import com.com.smm.application.usecases.Seguridad.Rol.RetrieveRolUseCaseImpl;
import com.com.smm.application.usecases.Seguridad.Rol.UpdateRolUseCaseImpl;
import com.com.smm.application.usecases.Seguridad.RolPermiso.CreateRolPermisosUseCaseImpl;
import com.com.smm.application.usecases.Seguridad.RolPermiso.DeleteRolPermisoUseCaseImpl;
import com.com.smm.application.usecases.Seguridad.RolPermiso.RetrieveRolPermisoUseCaseImpl;
import com.com.smm.application.usecases.Seguridad.RolPermiso.UpdateRolPermisoUseCaseImpl;
import com.com.smm.application.usecases.Usuario.*;
import com.com.smm.domain.model.Pedidos.DetallePedido;
import com.com.smm.domain.model.Producto.Categoria;
import com.com.smm.domain.ports.in.Producto.Categoria.UpdateCategoriaUseCase;
import com.com.smm.domain.ports.out.Pedidos.DetallePedido.DetallePedidoRepositoryPort;
import com.com.smm.domain.ports.out.Pedidos.Envio.EnvioRepositoryPort;
import com.com.smm.domain.ports.out.Pedidos.Factura.FacturaRepositoryPort;
import com.com.smm.domain.ports.out.Pedidos.ModoEnvio.MedioEnvioRepositoryPort;
import com.com.smm.domain.ports.out.Pedidos.Pedido.PedidoRepositoryPort;
import com.com.smm.domain.ports.out.Producto.Categoria.CategoriaRepositoryPort;
import com.com.smm.domain.ports.out.Producto.Imagen.ImageneRepositoryPort;
import com.com.smm.domain.ports.out.Producto.Producto.ProductosRepositoryPort;
import com.com.smm.domain.ports.out.Producto.Proveedor.ProveedorRepositoryPort;
import com.com.smm.domain.ports.out.Producto.Subcategoria.SubcategoriaRepositoryPort;
import com.com.smm.domain.ports.out.Seguridad.PermisosRepositoryPort;
import com.com.smm.domain.ports.out.Seguridad.RolPermisoRepositoryPort;
import com.com.smm.domain.ports.out.Seguridad.RolesRepositoryPort;
import com.com.smm.domain.ports.out.Usuario.UsuarioRepositoryPort;

import com.com.smm.infrastructure.entities.Producto.Categorias;
import com.com.smm.infrastructure.repositories.Pedidos.DetallePedido.JpaDetallePedidoRepository;
import com.com.smm.infrastructure.repositories.Pedidos.DetallePedido.JpaDetallePedidoRepositoryAdapter;
import com.com.smm.infrastructure.repositories.Pedidos.Envio.JpaEnvioRepositoryAdapter;
import com.com.smm.infrastructure.repositories.Pedidos.Factura.JpaFacturaRepitoryAdapter;
import com.com.smm.infrastructure.repositories.Pedidos.ModoEnvio.JpaMedioEnvioRepitoryAdapter;
import com.com.smm.infrastructure.repositories.Pedidos.Pedido.JpaPedidoRepositoryAdapter;
import com.com.smm.infrastructure.repositories.Producto.Categoria.JpaCategoriaRepositoryAdapter;
import com.com.smm.infrastructure.repositories.Producto.Imagen.JpaImagenRepositoryAdapter;
import com.com.smm.infrastructure.repositories.Producto.Producto.JpaProductoRepositoryAdapter;
import com.com.smm.infrastructure.repositories.Producto.Proveedor.JpaProveedorRepository;
import com.com.smm.infrastructure.repositories.Producto.Proveedor.JpaProveedorRepositoryAdapter;
import com.com.smm.infrastructure.repositories.Producto.Subcategoria.JpaSubcategoriaRepository;
import com.com.smm.infrastructure.repositories.Producto.Subcategoria.JpaSubcategoriaRepositoryAdapter;
import com.com.smm.infrastructure.repositories.Seguridad.Permiso.JpaPermisoRepositoryAdapter;
import com.com.smm.infrastructure.repositories.Seguridad.Rol.JpaRolRepositoryAdapter;
import com.com.smm.infrastructure.repositories.Seguridad.RolPermiso.JpaRolPermisoRepositoryAdapter;
import com.com.smm.infrastructure.repositories.Usuario.JpaUsuarioRepositoryAdapter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Configuration
public class ApplicationConfig {

   

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/api/**")
                        .allowedOrigins("http://localhost:4200")  // Cambia el puerto según tu frontend
                        .allowedMethods("GET", "POST", "PUT", "DELETE")
                        .allowedHeaders("*")
                        .allowCredentials(true);
            }
        };
    }
    //SEGURIDAD
    //USUARIO
    @Bean
    public UsuarioService UsuarioService(UsuarioRepositoryPort  usuarioRepositoryPort ) {
        return new UsuarioService(
                new CreateUsuarioUseCaseImpl(usuarioRepositoryPort),
                new RetrieveUsuarioUseCaseImpl(usuarioRepositoryPort),
                new UpdateUsuarioUseCaseImpl(usuarioRepositoryPort),
                new DeleteUsuarioUseCaseImpl(usuarioRepositoryPort),
                new LoginUsuarioUseCaseImpl(usuarioRepositoryPort)

        );
    }
    @Bean
    public UsuarioRepositoryPort usuarioRepositoryPort(JpaUsuarioRepositoryAdapter jpaUsuarioRepositoryAdapter) {
        return jpaUsuarioRepositoryAdapter;
    }
   // ROLES
    @Bean
    public RolesService RolesService(RolesRepositoryPort RepositoryPort ) {
        return new RolesService(
                new CreateRolesUseCaseImpl(RepositoryPort),
                new RetrieveRolUseCaseImpl(RepositoryPort),
                new UpdateRolUseCaseImpl(RepositoryPort),
                new DeleteRolUseCaseImpl(RepositoryPort)
        );
    }

    @Bean
    public RolesRepositoryPort rolesRepositoryPort(JpaRolRepositoryAdapter jpaRolRepositoryAdapter) {
        return jpaRolRepositoryAdapter;
    }
    //PERMISO
    @Bean
    public PermisosService PermisosService(PermisosRepositoryPort permisosRepositoryPort ) {
        return new PermisosService(
                new CreatePermisosUseCaseImpl(permisosRepositoryPort),
                new RetrievePermisoUseCaseImpl(permisosRepositoryPort),
                new UpdatePermisoUseCaseImpl(permisosRepositoryPort),
                new DeletePermisoUseCaseImpl(permisosRepositoryPort)
        );
    }


    @Bean
    public PermisosRepositoryPort PermisosRepositoryPort(JpaPermisoRepositoryAdapter jpaPermisoRepositoryAdapter) {
        return jpaPermisoRepositoryAdapter;
    }
    //ROL PERMISO
    @Bean
    public RolPermisoService RolPermisoService(RolPermisoRepositoryPort rolPermisoRepositoryPort ) {
        return new RolPermisoService(
                new CreateRolPermisosUseCaseImpl(rolPermisoRepositoryPort),
                new RetrieveRolPermisoUseCaseImpl(rolPermisoRepositoryPort),
                new UpdateRolPermisoUseCaseImpl(rolPermisoRepositoryPort),
                new DeleteRolPermisoUseCaseImpl(rolPermisoRepositoryPort)
        );
    }

    @Bean
    public RolPermisoRepositoryPort RolPermisoRepositoryPort(JpaRolPermisoRepositoryAdapter jpaRolPermisoRepositoryAdapter) {
        return jpaRolPermisoRepositoryAdapter;
    }



    //PRODUCTO
    //PRODUCTO
    @Bean
    public ProductoService ProductoService(ProductosRepositoryPort productosRepositoryPort ) {
        return new ProductoService(
                new CreateProductoUseCaseImpl(productosRepositoryPort),
                new RetrieveProductoUseCaseImpl(productosRepositoryPort),
                new UpdateProductoUseCaseImpl(productosRepositoryPort),
                new DeleteProductoUseCaseImpl(productosRepositoryPort)
        );
    }



    @Bean
    public CategoriaService categoriaService(@Qualifier("jpaCategoriaRepositoryAdapter") CategoriaRepositoryPort categoriaRepositoryPort) {
        return new CategoriaService( new CreateCategoriaUseCaseImpl(categoriaRepositoryPort),
                new RetrieveCategoriaUseCaseImpl(categoriaRepositoryPort),
                new UpdateCotegoriaUseCaseImpl(categoriaRepositoryPort),
                new DeleteCategoriaUseCaseImpl(categoriaRepositoryPort));
    }

    //SUBCATEGORIA
    @Bean
    public SubcategoriaService  SubcategoriaService(SubcategoriaRepositoryPort SubcategoriaRepositoryPort ) {
        return new SubcategoriaService(
                new CreateSubcategoriaUseCaseImpl(SubcategoriaRepositoryPort),
                new RetrieveSubcategoriaUseCaseImpl(SubcategoriaRepositoryPort),
                new UpdateSubcategoriaUseCaseImpl(SubcategoriaRepositoryPort),
                new DeleteSubcategoriaUseCaseImpl(SubcategoriaRepositoryPort)
        );
    }

    @Bean
    public SubcategoriaRepositoryPort SubcategoriaRepositoryPort(JpaSubcategoriaRepositoryAdapter JpaSubcategoriaRepositoryAdapter) {
        return JpaSubcategoriaRepositoryAdapter;
    }


    //PROVEEDOR
    @Bean
    public ProveedorService ProveedorService(ProveedorRepositoryPort ProveedorRepositoryPort ) {
        return new ProveedorService(
                new CreateProveedorUseCaseImpl(ProveedorRepositoryPort),
                new RetrieveProveedorUseCaseImpl(ProveedorRepositoryPort),
                new UpdateProveedorUseCaseImpl(ProveedorRepositoryPort),
                new DeleteProveedorUseCaseImpl(ProveedorRepositoryPort)
        );
    }

    @Bean
    public ProveedorRepositoryPort ProveedorRepositoryPort(JpaProveedorRepositoryAdapter JpaProveedorRepositoryAdapter) {
        return  JpaProveedorRepositoryAdapter;
    }

    //IMAGEN
    @Bean
    public ImagenService ImagenService(ImageneRepositoryPort ImageneRepositoryPort ) {
        return new ImagenService(
                new CreateImagenUseCaseImpl(ImageneRepositoryPort),
                new RetrieveImagenUseCaseImpl(ImageneRepositoryPort),
                new UpdateImagenUseCaseImpl(ImageneRepositoryPort),
                new DeleteImagenUseCaseImpl(ImageneRepositoryPort)
        );
    }

    @Bean
    public ImageneRepositoryPort ImageneRepositoryPort(JpaImagenRepositoryAdapter JpaImagenRepositoryAdapter) {
        return  JpaImagenRepositoryAdapter;
    }



    //PEDIDOS
    //DETALLE PEDIDO
    @Bean
    public DetallePedidoService DetallePedidoService(DetallePedidoRepositoryPort detallePedidoRepositoryPort ) {
        return new DetallePedidoService(
                new CreateDetallePedidoUseCaseImpl(detallePedidoRepositoryPort),
                new RetrieveDetallePedidoUseCaseImpl(detallePedidoRepositoryPort),
                new UpdateDetallePedidoUseCaseImpl(detallePedidoRepositoryPort),
                new DeleteDetallePedidoUseCaseImpl(detallePedidoRepositoryPort)
        );
    }





    //PEDIDO
    @Bean
    public PedidoService PedidoService(PedidoRepositoryPort PedidoRepositoryPort ) {
        return new PedidoService(
                new CreatePedidoUseCaseImpl(PedidoRepositoryPort),
                new RetrievePedidoUseCaseImpl(PedidoRepositoryPort),
                new UpdatePedidoUseCaseImpl(PedidoRepositoryPort),
                new DeletePedidoUseCaseImpl(PedidoRepositoryPort)
        );
    }

    @Bean
    public PedidoRepositoryPort PedidoRepositoryPort(JpaPedidoRepositoryAdapter JpaPedidoRepositoryAdapter) {
        return JpaPedidoRepositoryAdapter;
    }



    //ENVIO
    @Bean
    public EnvioService EnvioService(EnvioRepositoryPort EnvioRepositoryPort ) {
        return new EnvioService(
                new CreateEnvioUseCaseImpl(EnvioRepositoryPort),
                new RetrieveEnvioUseCaseImpl(EnvioRepositoryPort),
                new UpdateEnvioUseCaseImpl(EnvioRepositoryPort),
                new DeleteEnvioUseCaseImpl(EnvioRepositoryPort)
        );
    }

    @Bean
    @Primary
    public EnvioRepositoryPort EnvioRepositoryPort(JpaEnvioRepositoryAdapter jpaEnvioRepositoryAdapter) {
        return  jpaEnvioRepositoryAdapter;
    }



    //MEDIO ENVIO
    @Bean
    public MedioEnvioService  MedioEnvioService(MedioEnvioRepositoryPort MedioEnvioRepositoryPort ) {
        return new MedioEnvioService(
                new CreateMedioEnvioUseCaseImpl(MedioEnvioRepositoryPort),
                new RetrieveMedioEnvioUseCaseImpl(MedioEnvioRepositoryPort),
                new UpdateMedioEnvioUseCaseImpl(MedioEnvioRepositoryPort),
                new DeleteMedioEnvioUseCaseImpl(MedioEnvioRepositoryPort)
        );
    }

    @Bean
    public MedioEnvioRepositoryPort MedioEnvioRepositoryPort(JpaMedioEnvioRepitoryAdapter JpaMedioEnvioRepitoryAdapter) {
        return  JpaMedioEnvioRepitoryAdapter;
    }


    //Facrura
    @Bean
    public FacturaService FacturaService(FacturaRepositoryPort FacturaRepositoryPort ) {
        return new FacturaService(
                new CreateFacturaUseCaseImpl(FacturaRepositoryPort),
                new RetrieveFacturaUseCaseImpl(FacturaRepositoryPort),
                new UpdateFacturaUseCaseImpl(FacturaRepositoryPort),
                new DeleteFacturaUseCaseImpl(FacturaRepositoryPort)
        );
    }

    @Bean
    public FacturaRepositoryPort FacturaRepositoryPort(JpaFacturaRepitoryAdapter JpaFacturaRepitoryAdapter) {
        return  JpaFacturaRepitoryAdapter;
    }



    @Bean
    public DetallePedidoService detallePedidoService(DetallePedidoRepositoryPort detallePedidoRepositoryPort) {
        return new DetallePedidoService(
                new CreateDetallePedidoUseCaseImpl(detallePedidoRepositoryPort),
                new RetrieveDetallePedidoUseCaseImpl(detallePedidoRepositoryPort),
                new UpdateDetallePedidoUseCaseImpl(detallePedidoRepositoryPort),
                new DeleteDetallePedidoUseCaseImpl(detallePedidoRepositoryPort)
        );
    }



    @Bean
    public DetallePedidoRepositoryPort detallePedidoRepositoryPort(JpaDetallePedidoRepositoryAdapter j) {
        return j;
    }



}
