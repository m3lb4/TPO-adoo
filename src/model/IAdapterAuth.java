package org.example.model;

import org.example.dto.SocioLoginDTO;
import org.example.dto.SocioRegisterDTO;

public interface IAdapterAuth {
    Socio loggear(SocioLoginDTO datos);
    void registrar(SocioRegisterDTO datos);
}
