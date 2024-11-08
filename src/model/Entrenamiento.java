package org.example.model;

import java.util.List;

public class Entrenamiento {
    private List<Ejercicio> ejercicios;
    private boolean entrenamientoFinalizado;

    public Entrenamiento() {
    }

    public Entrenamiento() {
        this.ejercicios = new ArrayList<>();
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
    //no se si es necesario el setter de entrenamientoFinalizado
    public void setEntrenamientoFinalizado(boolean entrenamientoFinalizado) {
        this.entrenamientoFinalizado = entrenamientoFinalizado;
    }
}
