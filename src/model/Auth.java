package org.example.model;

import org.example.dto.SocioLoginDTO;
import org.example.dto.SocioRegisterDTO;

public class Auth implements IAdapterAuth{
    @Override
    public Socio loggear(SocioLoginDTO datos) {
        for(Socio _socio : DB.socios) {
            if (datos.nombreUsuario == _socio.getNombreUsuario() && datos.contrasenia == _socio.getContrasenia()) {
                return _socio;
            }
        }

        return null;
    }

    @Override
    public void registrar(SocioRegisterDTO datos) {
        int _edad = Integer.parseInt(datos.edad);
        int _altura = Integer.parseInt(datos.altura);

        Socio _socio = new Socio(
                datos.nombreUsuario,
                datos.contrasenia,
                _edad,
                datos.sexo,
                _altura
        );

        DB.socios.add(_socio);
    }
}
