package org.example.model;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Observable {

    private List<Trofeo> observadores = new ArrayList<>();

    public void agregar(Trofeo observador){
        observadores.add(observador);
    }

    public void eliminar(Trofeo observador) {
        observadores.remove(observador);
    }

    public void notificarObservacion(Socio socio){
        for (Trofeo observador: observadores){
            observador.verificarSiOtorgar(socio);
        }
    }

}

