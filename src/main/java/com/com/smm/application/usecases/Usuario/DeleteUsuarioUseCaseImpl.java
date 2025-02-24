package com.com.smm.application.usecases.Usuario;

import com.com.smm.domain.ports.out.Usuario.UsuarioRepositoryPort;
import com.com.smm.domain.ports.in.Usuario.DeleteUsuarioUseCase;

public class DeleteUsuarioUseCaseImpl implements DeleteUsuarioUseCase {

    private final UsuarioRepositoryPort UsuarioRepositoryPort;

    public DeleteUsuarioUseCaseImpl(UsuarioRepositoryPort UsuarioRepositoryPort) {
        this.UsuarioRepositoryPort = UsuarioRepositoryPort;
    }

    @Override
    public boolean deleteUsuario(Long id) {
        return UsuarioRepositoryPort.deleteById(id);
    }
}
