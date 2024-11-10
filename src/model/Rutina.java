package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Rutina extends Observable {
    private int diasRestantes;
    private List<Entrenamiento> entrenamientos;
    private String rutinaFinalizada;

    public Rutina(int diasRestantes, List<Entrenamiento> entrenamientos) {
        this.diasRestantes = diasRestantes;
        this.entrenamientos = entrenamientos;
        this.agregar(new TrofeoConstancia());
        rutinaFinalizada = "Creada";
    }


    public Rutina (Objetivo objetivo) {
        List<Entrenamiento> entrenamientos = new ArrayList<>();
        for (int i = 0; i < 28; i++) {
            entrenamientos.add(new Entrenamiento(objetivo));
        }
        this.entrenamientos = entrenamientos;
        this.diasRestantes = 28;
    }


    public void iniciarRutina() {
        this.rutinaFinalizada = "Iniciada";

    }

    public void finalizarRutina(Socio socio) {
        this.rutinaFinalizada = "Finalizada";

        this.notificarObservacion(socio);
    }

    public int getDiasRestantes() {
        return diasRestantes;
    }

    public List<Entrenamiento> getEntrenamientos() {
        return entrenamientos;
    }

    public String getRutinaFinalizada() {
        return rutinaFinalizada;
    }

    public void setRutinaFinalizada(String rutinaFinalizada) {
        this.rutinaFinalizada = rutinaFinalizada;
    }

    public void setDiasRestantes(int diasRestantes) {
        this.diasRestantes = diasRestantes;
    }

    public void setEntrenamientos(List<Entrenamiento> entrenamientos) {
        this.entrenamientos = entrenamientos;
    }
}
