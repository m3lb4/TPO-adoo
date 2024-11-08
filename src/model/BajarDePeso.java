package org.example.model;

public class BajarDePeso extends Objetivo {
    private double pesoIdeal;

    @Override
    public boolean chequearObj(Socio socio) {
        return socio.getPeso()<=pesoIdeal;
    }
    public boolean cumpleCondiciones(){}
    public void calcularPesoIdeal(Genero sexo, int edad, int altura){
        if(sexo=="hombre"){
            this.pesoIdeal=altura-100;
        }
        if(sexo=="mujer"){
            this.pesoIdeal=altura-105;
        }
    }
}
