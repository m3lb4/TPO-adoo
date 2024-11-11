package org.example.model;

public class Refuerzo extends Ejercicio{
    private int series;
    private int repeticiones;
    private double peso;


    public Refuerzo(int series, int repeticiones, double peso, Musculo musculo, int nivelAerobico, ExigenciaMuscular exigenciaMuscular,String URLvideo) {
        super(musculo, series, repeticiones, peso, nivelAerobico, exigenciaMuscular, URLvideo);
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
