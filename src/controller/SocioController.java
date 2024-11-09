package org.example.controller;

import org.example.dto.SocioLoginDTO;
import org.example.dto.SocioRegisterDTO;
import org.example.model.IAdapterAuth;
import org.example.model.Objetivo;
import org.example.model.Socio;

import java.util.ArrayList;
import java.util.List;

public class SocioController {
    private static SocioController instance=null;
    private IAdapterAuth adapterAuth;

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
        this.adapterAuth.registrar(socio);
    }

    public loggearSocio (SocioLoginDTO socio) {
        this.adapterAuth.loggear(socio);
    }

    public realizarMediciones(String username) {
        for (Socio socio : DB.socios) {
            if (socio.getNombreUsuario() == username) {
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
