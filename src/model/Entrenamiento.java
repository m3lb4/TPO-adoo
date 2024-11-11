package org.example.model;

import org.example.baseDeDatos.DB;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Entrenamiento {
    private List<Ejercicio> ejercicios;
    private String estadoEntrenamiento;

    public Entrenamiento(Objetivo objetivo) {
        this.ejercicios = new ArrayList<>();

        List<Ejercicio> ejerciciosDB = DB.ejercicios;
        Collections.shuffle(ejerciciosDB);

        for (int i = 0; (i < ejerciciosDB.size()) && (this.ejercicios.size() < 8); i++) {
            if (objetivo.cumpleCondiciones(ejerciciosDB.get(i))){
                ejercicios.add(ejerciciosDB.get(i));
            }
        }

        this.estadoEntrenamiento = "Creado";
    }

    public void iniciarEntrenamiento() {

        this.estadoEntrenamiento = "Iniciado";
    }

    public void finalizarEntrenamiento(){
        this.estadoEntrenamiento = "Finalizado";
    }

    public List<Ejercicio> getEjercicios() {
        return ejercicios;
    }

    public void setEjercicios(List<Ejercicio> ejercicios) {
        this.ejercicios = ejercicios;
    }


    public String getEstadoEntrenamiento() {
        return estadoEntrenamiento;
    }
}
