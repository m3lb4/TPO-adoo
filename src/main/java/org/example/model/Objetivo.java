package org.example.model;

import java.util.Date;

public abstract class Objetivo {
    protected Date fechaDeInicio;
    protected Rutina rutina;

    public abstract boolean chequearObj();
    public static void generarRutina(){}

}
