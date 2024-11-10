package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Rutina {
    private int diasRestantes;
    private List<Entrenamiento> entrenamientos;

    public Rutina(int diasRestantes, List<Entrenamiento> entrenamientos) {
        this.diasRestantes = diasRestantes;
        this.entrenamientos = entrenamientos;
    }


    public Rutina (Objetivo objetivo) {
        List<Entrenamiento> entrenamientos = new ArrayList<>();
        for (int i = 0; i < 28; i++) {
            entrenamientos.add(new Entrenamiento(objetivo));
        }
        this.entrenamientos = entrenamientos;
        this.diasRestantes = 28;
    }

    public void iniciarRutina(){

    }
    public void finalizarRutina(){

    }

    public int getDiasRestantes() {
        return diasRestantes;
    }

    public List<Entrenamiento> getEntrenamientos() {
        return entrenamientos;
    }
}
