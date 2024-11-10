package org.example.model;

import java.util.Date;

public abstract class Objetivo {
    protected Date fechaDeInicio;
    protected Rutina rutina;

    public abstract boolean chequearObj(Socio socio);
    public abstract boolean cumpleCondiciones(Ejercicio ejercicio);
    public void generarRutina(){
        this.rutina = new Rutina(this);
    }

    public Date getFechaDeInicio() {
        return fechaDeInicio;
    }

    public Rutina getRutina() {
        return rutina;
    }
}
