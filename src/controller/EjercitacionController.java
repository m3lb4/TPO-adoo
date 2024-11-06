package org.example.controller;

import java.util.ArrayList;
import java.util.List;

public class EjercitacionContoroller {

    private static EjercitacionContoroller instance=null;

    private EjercitacionContoroller(){

    }
    public static EjercitacionContoroller getInstance(){
        if (instance==null){
            instance=new EjercitacionContoroller();
        }
        return instance;
    }

    public void iniciarRutina(){}
    public void finalizarRutina(){}
    public void iniciarEntrenamiento(){}
    public void finalizarEntrenamiento(){}
    public void iniciarEjercicio(){}
    public void finalizarEjercicio(){}


}
