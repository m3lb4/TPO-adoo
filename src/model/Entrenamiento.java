package org.example.model;

import org.example.baseDeDatos.DB;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Entrenamiento {
    private List<Ejercicio> ejercicios;
    private boolean entrenamientoFinalizado;

    public Entrenamiento(Objetivo objetivo) {
        this.ejercicios = new ArrayList<>();

        List<Ejercicio> ejerciciosDB = DB.ejercicios;
        Collections.shuffle(ejerciciosDB);

        for (int i = 0; (i < ejerciciosDB.size()) && (this.ejercicios.size() < 8); i++) {
            if (objetivo.cumpleCondiciones(ejerciciosDB.get(i))){
                ejercicios.add(ejerciciosDB.get(i));
            }
        }

        this.entrenamientoFinalizado = false;
    }

    public void iniciarEntrenamiento(){
        this.entrenamientoFinalizado=false;
    }
    public void finalizarEntrenamiento(){
        this.entrenamientoFinalizado=true;
    }

    public List<Ejercicio> getEjercicios() {
        return ejercicios;
    }

    public void setEjercicios(List<Ejercicio> ejercicios) {
        this.ejercicios = ejercicios;
    }

    public boolean isEntrenamientoFinalizado() {
        return entrenamientoFinalizado;
    }
}
