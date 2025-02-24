package com.com.smm.application.usecases.Usuario;


import com.com.smm.domain.model.Usuario.Usuario;
import com.com.smm.domain.ports.in.Usuario.CreateUsuarioUseCase;
import com.com.smm.domain.ports.out.Usuario.UsuarioRepositoryPort;

public class CreateUsuarioUseCaseImpl implements CreateUsuarioUseCase  {

    private final UsuarioRepositoryPort  UsuarioRepositoryPort;

    public CreateUsuarioUseCaseImpl(UsuarioRepositoryPort UsuarioRepositoryPort) {
        this.UsuarioRepositoryPort = UsuarioRepositoryPort;
    }

    @Override
    public Usuario createUsuario(Usuario usuario) {
        return UsuarioRepositoryPort.save(usuario);
    }


}