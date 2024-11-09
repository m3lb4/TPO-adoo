package org.example.controller;

import org.example.dto.EjercicioDTO;
import org.example.model.Ejercicio;
import org.example.model.RegistroEjercicio;
import org.example.db.DB;

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
        Ejercicio _ejercicio = new Ejercicio(
                ejercicio.musculo,
                ejercicio.series,
                ejercicio.repeticiones,
                ejercicio.pesoAsignado,
                ejercicio.nivelAerobico,
                ejercicio.exigenciaMuscular,
                ejercicio.urlVideo
                );

        DB.ejercicios.add(_ejercicio);
    }

    public void registrarEjercicio(Ejercicio ejercicio){
        new RegistroEjercicio(ejercicio);
    }


}
