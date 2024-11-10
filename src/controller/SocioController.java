package org.example.controller;

import org.example.baseDeDatos.DB;
import org.example.dto.SocioLoginDTO;
import org.example.dto.SocioRegisterDTO;
import org.example.model.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class SocioController {
    private static SocioController instance=null;
    private IAdapterAuth adapterAuth;

    private SocioController(){adapterAuth = new Auth();
    }
    public static SocioController getInstance(){
        if (instance==null){
            instance=new SocioController();
        }
        return instance;
    }

    public void registrarSocio (SocioRegisterDTO socio) {
        this.adapterAuth.registrar(socio);
    }

    public Socio loggearSocio (SocioLoginDTO socio) {
        return this.adapterAuth.loggear(socio);
    }

    public void realizarMediciones(String username, Date date) {
        for (Socio socio : DB.socios) {
            if (socio.getNombreUsuario() == username) {
                socio.realizarMediciones();
                List<Object> medicion = Arrays.asList(new Medicion(socio.getMedicion()), socio.getNombreUsuario(), date);
                DB.historialMediciones.add(medicion);
            }
        }
    }

    public void cambiarObjetivo(Objetivo objetivo, Socio socio) {
        socio.cambiarObjetivo(objetivo);
    }


}
