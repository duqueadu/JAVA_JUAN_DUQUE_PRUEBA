package com.com.smm.domain.ports.in.Usuario;

import com.com.smm.domain.model.Usuario.Usuario;

import java.util.List;
import java.util.Optional;

public interface RetrieveUsuarioUseCase {
    Optional<Usuario> getUsuarioById(Long id);
    List<Usuario> getAllUsuarios();
    public List<?> clienteMas() ;
}
