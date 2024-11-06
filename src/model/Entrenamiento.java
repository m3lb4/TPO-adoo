package org.example.model;

import java.util.List;

public class Entrenamiento {
    private List<Ejercicio> ejercicios;
    private boolean entrenamientoFinalizado;

    public Entrenamiento() {
    }

    public Entrenamiento(List<Ejercicio> ejercicios) {
        this.ejercicios = ejercicios;
    }

    public void iniciarEntrenamiento(){

    }
    public void finalizarEntrenamiento(){

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

    public void setEntrenamientoFinalizado(boolean entrenamientoFinalizado) {
        this.entrenamientoFinalizado = entrenamientoFinalizado;
    }
}
