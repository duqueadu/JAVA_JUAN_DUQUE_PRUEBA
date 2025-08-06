package com.com.smm.application.usecases.Usuario;

import com.com.smm.domain.model.Usuario.Usuario;
import com.com.smm.domain.ports.in.Usuario.RetrieveUsuarioUseCase;
import com.com.smm.domain.ports.out.Usuario.UsuarioRepositoryPort;

import java.util.List;
import java.util.Optional;

public class RetrieveUsuarioUseCaseImpl implements RetrieveUsuarioUseCase {

    private final UsuarioRepositoryPort  UsuarioRepositoryPort;

    public RetrieveUsuarioUseCaseImpl(UsuarioRepositoryPort UsuarioRepositoryPort) {
        this.UsuarioRepositoryPort = UsuarioRepositoryPort;
    }

    @Override
    public Optional<Usuario> getUsuarioById(Long id) {
        return UsuarioRepositoryPort.findById(id);
    }

    @Override
    public List<Usuario> getAllUsuarios() {
        return UsuarioRepositoryPort.findAll();
    }

    @Override
    public List<?> clienteMas() {
        return UsuarioRepositoryPort.clienteMas();
    }
}
