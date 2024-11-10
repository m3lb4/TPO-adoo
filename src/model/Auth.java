package org.example.model;

import org.example.baseDeDatos.DB;
import org.example.dto.SocioLoginDTO;
import org.example.dto.SocioRegisterDTO;

public class Auth implements IAdapterAuth{
    @Override
    public Socio loggear(SocioLoginDTO datos) {
        for(Socio _socio : DB.socios) {
            if (datos.getNombreUsuario() == _socio.getNombreUsuario() && datos.getContrasenia() == _socio.getContrasenia()) {
                return _socio;
            }
        }

        return null;
    }

    @Override
    public void registrar(SocioRegisterDTO datos) {
        int _edad = Integer.parseInt(datos.getEdad());
        int _altura = Integer.parseInt(datos.getAltura());

        Socio _socio = new Socio(
                datos.getNombreUsuario(),
                datos.getContrasenia(),
                _edad,
                Genero.valueOf(datos.getSexo()),
                _altura
        );

        DB.socios.add(_socio);
    }
}
