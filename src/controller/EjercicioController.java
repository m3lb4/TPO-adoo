package org.example.controller;

import org.example.dto.EjercicioDTO;
import org.example.model.Ejercicio;

import java.util.ArrayList;
import java.util.List;

public class EjercicioController {

    private List<Ejercicio> ejercicios;
    private static EjercicioController instance=null;

    private EjercicioController(){
        this.ejercicios=new ArrayList<>();
    }
    public static EjercicioController getInstance(){
        if (instance==null){
            instance=new EjercicioController();
        }
        return instance;
    }

    public void crearEjercicio(EjercicioDTO ejercicioDTO){

    }
    public void eliminarEjercicio(EjercicioDTO ejercicioDTO){}
}
