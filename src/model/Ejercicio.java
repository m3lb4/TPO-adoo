package org.example.model;

public class Ejercicio {
    private Musculo musculo;
    private int series;
    private int repeticiones;
    private double pesoAsignado;
    private int nivelAerobico;
    private ExigenciaMuscular exigenciaMuscular;
    private String URLvideo;

    public Ejercicio() {
    }

    public Ejercicio(Musculo musculo, int series, int repeticiones, double pesoAsignado, int nivelAerobico, ExigenciaMuscular exigenciaMuscular, String URLvideo) {
        this.musculo = musculo;
        this.series = series;
        this.repeticiones = repeticiones;
        this.pesoAsignado = pesoAsignado;
        this.nivelAerobico = nivelAerobico;
        this.exigenciaMuscular = exigenciaMuscular;
        this.URLvideo = URLvideo;
    }

    public void iniciarEjercicio(){

    }
    public void finalizarEjercicio(Entrenamiento entrenamiento,  int seriesRealizadas, int repeticionesRealizadas, double pesoAsignado){
        Date fecha=new Date();
        RegistroEjercicio registro=new RegistroEjercicio(this, entrenamiento, seriesRealizadas, repeticionesRealizadas, pesoAsignado, fecha);
    }

    public Musculo getMusculo() {
        return musculo;
    }

    public void setMusculo(Musculo musculo) {
        this.musculo = musculo;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(int repeticiones) {
        this.repeticiones = repeticiones;
    }

    public double getPesoAsignado() {
        return pesoAsignado;
    }

    public void setPesoAsignado(double pesoAsignado) {
        this.pesoAsignado = pesoAsignado;
    }

    public int getNivelAerobico() {
        return nivelAerobico;
    }

    public void setNivelAerobico(int nivelAerobico) {
        this.nivelAerobico = nivelAerobico;
    }

    public ExigenciaMuscular getExigenciaMuscular() {
        return exigenciaMuscular;
    }

    public void setExigenciaMuscular(ExigenciaMuscular exigenciaMuscular) {
        this.exigenciaMuscular = exigenciaMuscular;
    }

    public String getURLvideo() {
        return URLvideo;
    }

    public void setURLvideo(String URLvideo) {
        this.URLvideo = URLvideo;
    }
}
