package org.example.model;


public abstract class Observable {

    private List<Trofeo> observadores= new ArrayList<>();

    public void agregar(Trofeo observador){
        observadores.add(observador);
    }

    public void eliminar(Trofeo observador){
        for (Trofeo observer: observadores){
            if (Objects.equals(observador)){
                observadores.remove(observador, observer);
            }
        }
    }

    public void notificarObservacion(Socio socio){
        for (Trofeo observador: observadores){
            observador.verificarSiOtorgar(socio);
        }
    }

}
