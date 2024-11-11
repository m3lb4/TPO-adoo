package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Rutina extends Observable {
    private int diasRestantes;
    private List<Entrenamiento> entrenamientos;
    private String estadoRutina;



    public Rutina (Objetivo objetivo) {
        List<Entrenamiento> entrenamientos = new ArrayList<>();
        for (int i = 0; i < 28; i++) {
            entrenamientos.add(new Entrenamiento(objetivo));
        }
        this.entrenamientos = entrenamientos;
        this.diasRestantes = 28;
        this.agregar(new TrofeoConstancia());
        estadoRutina = "Creada";
    }


    public void iniciarRutina() {
        this.estadoRutina = "Iniciada";

    }

    public void finalizarRutina(Socio socio) {
        this.estadoRutina = "Finalizada";

        this.notificarObservacion(socio);
    }

    public int getDiasRestantes() {
        return diasRestantes;
    }

    public List<Entrenamiento> getEntrenamientos() {
        return entrenamientos;
    }

    public String getEstadoRutina() {
        return estadoRutina;
    }

    public void setEstadoRutina(String estadoRutina) {
        this.estadoRutina = estadoRutina;
    }

    public void setDiasRestantes(int diasRestantes) {
        this.diasRestantes = diasRestantes;
    }

    public void setEntrenamientos(List<Entrenamiento> entrenamientos) {
        this.entrenamientos = entrenamientos;
    }
}
