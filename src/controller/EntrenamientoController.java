package org.example.controller;

import org.example.dto.EntrenamientoDTO;
import org.example.model.Ejercicio;
import org.example.model.Entrenamiento;

import java.util.ArrayList;
import java.util.List;

public class EntrenamientoController {
    private List<Entrenamiento> entrenamientos;
    private static EntrenamientoController instance=null;

    private EntrenamientoController(){
        this.entrenamientos=new ArrayList<>();
    }
    public static EntrenamientoController getInstance(){
        if (instance==null){
            instance=new EntrenamientoController();
        }
        return instance;
    }

    public void crearEntrenamiento(EntrenamientoDTO entrenamientoDTO){}
}
