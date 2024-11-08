package org.example.model;

public class TonificarCuerpo extends Objetivo{
    private double masaMuscular;
    private double grasaCorporal;
    @Override
    public boolean chequearObj(Socio socio) {
        return socio.getMasaMuscular() == masaMuscular && socio.getGrasaCorporal()==grasaCorporal;
    }
    public boolean cumpleCondiciones(){}
    //me parece que el metodo de cumpleCondiciones esta demas, podriamos validarlo en chequearObjetivo
    public double calcularMasaIdeal(double peso, int altura){
        return 0;
    }

    public double calcularGrasaIdeal(double peso, int altura, Genero sexo, int edad){
        return 0;
    }
}
