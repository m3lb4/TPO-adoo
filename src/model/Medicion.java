package org.example.model;

public class Medicion {
    private double peso;
    private double grasaCorporal;
    private double masaMuscular;
    private IAdapterMetricas adapterMetricas;

    public void pesar(Socio socio){}
    public void medirGrasaCorporal(Socio socio){}
    public void medirMasaMuscular(Socio socio){}

    public double getPeso() {
        return peso;
    }

    public double getGrasaCorporal() {
        return grasaCorporal;
    }

    public double getMasaMuscular() {
        return masaMuscular;
    }
}
