package com.com.smm.domain.ports.in.Usuario;

import com.com.smm.domain.model.Usuario.AdditionalUsuarioInfo;

public interface GetAdditionalUsuarioInfoUseCase {
    AdditionalUsuarioInfo getAdditionalUsuarioInfo(Long id);

}
