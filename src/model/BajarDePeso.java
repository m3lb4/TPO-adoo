package org.example.model;

public class BajarDePeso extends Objetivo {
    private double pesoIdeal;

    @Override
    public boolean chequearObj(Socio socio) {
        return socio.getPeso() <= pesoIdeal;
    }

    public boolean cumpleCondiciones(Ejercicio ejercicio) {
        if (ejercicio.getNivelAerobico() <= 3) {
            return true;
        }


        return false;
    }

    public void calcularPesoIdeal(Genero sexo, int edad, int altura){
        if(sexo==Genero.Masculino){
            this.pesoIdeal = altura - 100;
        }
        if(sexo==Genero.Femenino){
            this.pesoIdeal = altura - 105;
        }
    }
}
