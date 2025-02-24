package com.com.smm.application.usecases.Usuario;

import com.com.smm.domain.model.Usuario.Usuario;
import com.com.smm.domain.ports.in.Usuario.UpdateUsuarioUseCase;
import com.com.smm.domain.ports.in.Usuario.loginUsuarioUseCase;
import com.com.smm.domain.ports.out.Usuario.UsuarioRepositoryPort;

import java.util.Optional;

public class LoginUsuarioUseCaseImpl implements loginUsuarioUseCase {

    private final UsuarioRepositoryPort usuarioRepositoryPort;

    public LoginUsuarioUseCaseImpl(UsuarioRepositoryPort usuarioRepositoryPort) {
        this.usuarioRepositoryPort = usuarioRepositoryPort;
    }

    @Override
    public String login(String email, String password) throws Exception{
        return this.usuarioRepositoryPort.login(email,password);
    }
}
