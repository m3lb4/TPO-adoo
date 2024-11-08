package org.example.model;

import java.util.Date;

public class RegistroEjercicio {
    private Ejercicio ejercicio;
    private Entrenamiento entrenamiento;
    private int seriesRealizadas;
    private int repeticionesRealizadas;
    private double pesoAsignado;
    private Date fecha;

    public RegistroEjercicio() {}

    public static RegistrarEjercicio(Ejercicio ejercicio, Entrenamiento entrenamiento, int seriesRealizadas, int repeticionesRealizadas, double pesoAsignado, Date fecha) {
        RegistroEjercicio _registroEjercicio = new RegistroEjercicio();
        _registroEjercicio.ejercicio = ejercicio;
        _registroEjercicio.entrenamiento = entrenamiento;
        _registroEjercicio.seriesRealizadas = seriesRealizadas;
        _registroEjercicio.repeticionesRealizadas = repeticionesRealizadas;
        _registroEjercicio.pesoAsignado = pesoAsignado;
        _registroEjercicio.fecha = fecha;

        DB.ejerciciosCompletados.add(_registroEjercicio);
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
