package com.com.smm.domain.ports.in.Seguridad.Rol;

import com.com.smm.domain.model.Usuario.AdditionalUsuarioInfo;

public interface GetAdditionalUsuarioInfoUseCase {
    AdditionalUsuarioInfo getAdditionalUsuarioInfo(Long id);

}
