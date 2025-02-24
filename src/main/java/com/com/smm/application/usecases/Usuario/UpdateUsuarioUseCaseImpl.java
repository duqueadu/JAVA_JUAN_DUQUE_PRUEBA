package com.com.smm.application.usecases.Usuario;

import com.com.smm.domain.model.Usuario.Usuario;
import com.com.smm.domain.ports.in.Usuario.UpdateUsuarioUseCase;
import com.com.smm.domain.ports.out.Usuario.UsuarioRepositoryPort;

import java.util.Optional;

public class UpdateUsuarioUseCaseImpl implements UpdateUsuarioUseCase {

    private final UsuarioRepositoryPort usuarioRepositoryPort;

    public UpdateUsuarioUseCaseImpl(UsuarioRepositoryPort usuarioRepositoryPort) {
        this.usuarioRepositoryPort = usuarioRepositoryPort;
    }

    @Override
    public Optional<Usuario> updateUsuario(Long id, Usuario updatedUsuario) {
        return usuarioRepositoryPort.update(updatedUsuario);
    }
}
