package org.example.controller;

import org.example.dto.RutinaDTO;
import org.example.model.Ejercicio;
import org.example.model.Rutina;

import java.util.ArrayList;
import java.util.List;

public class RutinaController {
    private List<Rutina> rutinas;
    private static RutinaController instance=null;

    private RutinaController(){
        this.rutinas=new ArrayList<>();
    }
    public static RutinaController getInstance(){
        if (instance==null){
            instance=new RutinaController();
        }
        return instance;
    }

    public void crearRutina(RutinaDTO rutinaDTO){}
}
