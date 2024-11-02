package org.example.model;

import org.example.dto.SocioLoginDTO;
import org.example.dto.SocioRegisterDTO;

public interface IAdapterAuth {
    void loggear(SocioLoginDTO datos);
    void registrar(SocioRegisterDTO datos);
}
