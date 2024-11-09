package org.example.controller;

import org.example.baseDeDatos.DB;
import org.example.dto.EjercicioDTO;
import org.example.model.Ejercicio;
import org.example.model.Entrenamiento;
import org.example.model.RegistroEjercicio;
import org.example.model.Socio;

import java.util.Date;

public class EjercitacionController {

    private static EjercitacionController instance = null;

    private EjercitacionController(){}

    public static EjercitacionController getInstance(){
        if (instance==null){
            instance=new EjercitacionController();
        }
        return instance;
    }

    public void iniciarRutina(){}
    public void finalizarRutina(){}
    public void iniciarEntrenamiento(){}
    public void finalizarEntrenamiento(){}

    public void agregarEjercicio(EjercicioDTO ejercicio){
        Ejercicio _ejercicio = ejercicio.toModel();

        DB.ejercicios.add(_ejercicio);
    }

    public void registrarEjercicio(Ejercicio ejercicio, Entrenamiento entrenamiento,  Socio socio, int seriesRealizadas, int repeticionesRealizadas, double pesoAsignado){
        new RegistroEjercicio(ejercicio,entrenamiento, socio, seriesRealizadas,repeticionesRealizadas, pesoAsignado, new Date());
    }


}
