package org.example.controller;

import org.example.model.Ejercicio;
import org.example.model.Socio;

import java.util.ArrayList;
import java.util.List;

public class SocioController {
    private List<Socio> socios;
    private static SocioController instance=null;

    private SocioController(){
        this.socios=new ArrayList<>();
    }
    public static SocioController getInstance(){
        if (instance==null){
            instance=new SocioController();
        }
        return instance;
    }

    public registrarSocio (SocioRegisterDTO socio) {
        int _edad = Integer.valueOf(socio.edad);
        int _altura = Integer.valueOf(socio.altura);

        Socio _socio = new Socio(
                socio.nombreUsuario
                socio.contrasenia
                socio._edad
                socio.sexo
                socio._altura
        );

        socios.add(_socio);
    }

    public loggearSocio (SocioLoginDTO socio) {
        for(Socio _socio in this.socios) {
            if (socio.nombreUsuario == _socio.getNombreUsuario() && socio.contrasenia == _socio.getContrasenia()) {
                return _socio;
            }
        }

        return null;
    }

    public realizarMediciones(String username) {
        for (Socio socio in this.socios) {
            if (socio.getUsername() == username) {
                socio.pesarse();
                socio.medirGrasaCorporal();
                socio.medirMasaMuscular();
            }
        }
    }

    public cambiarObjetivo(Objetivo objetivo, Socio socio) {
        socio.cambiarObjetivo(objetivo);
    }
}
