package org.example.model;

import java.util.Date;

public class RegistroEjercicio {
    private Ejercicio ejercicio;
    private Entrenamiento entrenamiento;
    private Socio socio;
    private int seriesRealizadas;
    private int repeticionesRealizadas;
    private double pesoAsignado;
    private Date fecha;

    public RegistroEjercicio(Ejercicio ejercicio, Entrenamiento entrenamiento, Socio socio, int seriesRealizadas, int repeticionesRealizadas, double pesoAsignado, Date fecha) {
        this.ejercicio = ejercicio;
        this.entrenamiento = entrenamiento;
        this.seriesRealizadas = seriesRealizadas;
        this.repeticionesRealizadas = repeticionesRealizadas;
        this.pesoAsignado = pesoAsignado;
        this.fecha = fecha;
        this.socio = socio;

        DB.ejerciciosCompletados.add(this);
    }

    public Ejercicio getEjercicio() {
        return ejercicio;
    }

    public void setEjercicio(Ejercicio ejercicio) {
        this.ejercicio = ejercicio;
    }

    public Entrenamiento getEntrenamiento() {
        return entrenamiento;
    }

    public void setEntrenamiento(Entrenamiento entrenamiento) {
        this.entrenamiento = entrenamiento;
    }

    public int getSeriesRealizadas() {
        return seriesRealizadas;
    }

    public void setSeriesRealizadas(int seriesRealizadas) {
        this.seriesRealizadas = seriesRealizadas;
    }

    public int getRepeticionesRealizadas() {
        return repeticionesRealizadas;
    }

    public void setRepeticionesRealizadas(int repeticionesRealizadas) {
        this.repeticionesRealizadas = repeticionesRealizadas;
    }

    public double getPesoAsignado() {
        return pesoAsignado;
    }

    public void setPesoAsignado(double pesoAsignado) {
        this.pesoAsignado = pesoAsignado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
