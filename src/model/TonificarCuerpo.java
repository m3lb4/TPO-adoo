package org.example.model;

public class TonificarCuerpo extends Objetivo{
    private double masaMuscular;
    private double grasaCorporal;
    @Override
    public boolean chequearObj() {
        return false;
    }
    public double calcularMasaIdeal(double peso, int altura){
        return 0;
    }

    public double calcularGrasaIdeal(double peso, int altura, Genero sexo, int edad){
        return 0;
    }
}
