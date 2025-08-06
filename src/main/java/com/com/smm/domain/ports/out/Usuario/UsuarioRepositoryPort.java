package com.com.smm.domain.ports.out.Usuario;



import com.com.smm.domain.model.Usuario.Usuario;
import com.com.smm.infrastructure.entities.Usuario.Usuarios;

import java.util.List;
import java.util.Optional;

public interface UsuarioRepositoryPort {
    Usuarios save(Usuarios usuario);

    Usuario save(Usuario usuario);
    Optional<Usuario> findById(Long id);
    List<Usuario> findAll();
    List<?> clienteMas();
    Optional<Usuario> update(Usuarios usuario);

    Optional<Usuario> update(Usuario usuario);
    boolean deleteById(Long id);

     String login(String email, String password) throws Exception;
}
