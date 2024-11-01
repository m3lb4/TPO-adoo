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
}
