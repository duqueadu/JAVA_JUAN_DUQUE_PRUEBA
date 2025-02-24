package com.com.smm.infrastructure.entities.Producto;

import com.com.smm.domain.model.Pedidos.Envio;
import com.com.smm.domain.model.Producto.Proveedor;
import com.com.smm.infrastructure.entities.Pedidos.Envios;
import jakarta.persistence.*;


@Entity
public class Proveedores {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String contacto;
    private String telefono;
    private String email;


    public Proveedores() {
    }

    public Proveedores(Long id, String nombre, String contacto, String telefono, String email) {
        this.id = id;
        this.nombre = nombre;
        this.contacto = contacto;
        this.telefono = telefono;
        this.email = email;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public static Proveedores fromDomainModel(Proveedor proveedores) {
        return new Proveedores(proveedores.getId(),proveedores.getNombre(),proveedores.getContacto(),proveedores.getTelefono(),proveedores.getEmail());
    }

    public Proveedor toDomainModel() {
        return new Proveedor( id,  nombre,  contacto,  telefono,  email);
    }
}
