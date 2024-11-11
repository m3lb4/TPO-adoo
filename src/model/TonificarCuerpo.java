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
        return socio.getMasaMuscular() == calcularMasaIdeal(socio.getPeso(), socio.getAltura()) && socio.getGrasaCorporal() == calcularGrasaIdeal(socio.getPeso(), socio.getAltura(), socio.getSexo, socio.getEdad());
    }

    public boolean cumpleCondiciones(Ejercicio ejercicio) {
        if (ejercicio.getNivelAerobico() <= 4 && ejercicio.getExigenciaMuscular() == ExigenciaMuscular.Alto) {
            return true;
        }


        return false;
    }

    public double calcularMasaIdeal(double peso, int altura){
        return peso/Math.pow(altura,2);
    }

    public double calcularGrasaIdeal(double peso, int altura, Genero sexo, int edad){
        double grasaCorporal=0;
        if(sexo==Genero.Masculino){
            grasaCorporal=1.20*calcularMasaIdeal(peso,altura) + (0.23*edad) -(10.8*1)-5.4;
        }
        if (sexo==Genero.Femenino){
            grasaCorporal=1.20*calcularMasaIdeal(peso,altura) + (0.23*edad) -(10.8*2)-5.4;
        }
        return grasaCorporal;

    }
}
