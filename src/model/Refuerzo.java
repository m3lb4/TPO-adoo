package org.example.model;

public class Refuerzo {
    private Ejercicio ejercicio;
    private int series;
    private int repeticiones;
    private double peso;

    public Refuerzo() {
    }

    public Refuerzo(Ejercicio ejercicio, int series, int repeticiones, double peso) {
        this.ejercicio = ejercicio;
        this.series = series;
        this.repeticiones = repeticiones;
        this.peso = peso;
    }

    public int getSeries() {
        return series;
    }

    public int getRepeticiones() {
        return repeticiones;
    }

    public double getPeso() {
        return peso;
    }
}
