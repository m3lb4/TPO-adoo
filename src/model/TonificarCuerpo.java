package org.example.model;

public class TonificarCuerpo extends Objetivo {
    private double masaMuscular;
    private double grasaCorporal;

    public TonificarCuerpo(double masaMuscular, double grasaCorporal) {
        this.masaMuscular = masaMuscular;
        this.grasaCorporal = grasaCorporal;
    }

    @Override
    public boolean chequearObj(Socio socio) {
        return socio.getMasaMuscular() == masaMuscular && socio.getGrasaCorporal() == grasaCorporal;
    }

    public boolean cumpleCondiciones(Ejercicio ejercicio) {
        if (ejercicio.getNivelAerobico() <= 4 && ejercicio.getExigenciaMuscular() == ExigenciaMuscular.Alto) {
            return true;
        }


        return false;
    }

    public double calcularMasaIdeal(double peso, int altura){
        return 0;
    }

    public double calcularGrasaIdeal(double peso, int altura, Genero sexo, int edad){
        return 0;
    }
}
