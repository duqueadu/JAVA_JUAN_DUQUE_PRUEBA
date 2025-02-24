package com.com.smm.domain.ports.in.Usuario;

import com.com.smm.domain.model.Usuario.Usuario;

import java.util.Optional;

public interface UpdateUsuarioUseCase {
    Optional<Usuario> updateUsuario(Long id, Usuario updatedUsuario);
}
