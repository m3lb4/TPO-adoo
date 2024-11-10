package org.example.controller;

import org.example.baseDeDatos.DB;
import org.example.dto.EjercicioDTO;
import org.example.model.*;

import java.util.Date;

public class EjercitacionController {

    private static EjercitacionController instance;

    private EjercitacionController () {}

    public static EjercitacionController getInstance(){
        if (instance==null){
            instance = new EjercitacionController();
        }
        return instance;
    }

    public void iniciarRutina(Rutina rutina){

        rutina.iniciarRutina();


    }

    public void finalizarRutina(Rutina rutina,Socio socio){

        rutina.finalizarRutina(socio);
    }


    public void iniciarEntrenamiento(Rutina rutina, Entrenamiento entrenamiento){

        if(rutina.getRutinaFinalizada() == "Iniciada"){
            entrenamiento.iniciarEntrenamiento();

        }else{
            System.out.println("La rutina no esta iniciada");
        }

    }
    public void finalizarEntrenamiento(Rutina rutina, Entrenamiento entrenamiento){
        if(rutina.getRutinaFinalizada() == "Iniciada"){
            entrenamiento.finalizarEntrenamiento();

        }else{
            System.out.println("La rutina no esta iniciada");
        }

    }



    public void agregarEjercicio(EjercicioDTO ejercicio){
        Ejercicio _ejercicio = ejercicio.toModel();

        DB.ejercicios.add(_ejercicio);
    }

    public void registrarEjercicio(Ejercicio ejercicio, Entrenamiento entrenamiento,  Socio socio, int seriesRealizadas, int repeticionesRealizadas, double pesoAsignado){
        if (entrenamiento.isEntrenamientoFinalizado() == "Iniciado"){

            new RegistroEjercicio(ejercicio,entrenamiento, socio, seriesRealizadas,repeticionesRealizadas, pesoAsignado, new Date());
        }else{
            System.out.println("El entrenamiento no esta iniciado");
        }
    }


}
