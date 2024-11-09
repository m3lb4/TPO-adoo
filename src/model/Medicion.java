package org.example.model;

import java.util.concurrent.ThreadLocalRandom;

public class Medicion extends Observable {
    private double peso;
    private double grasaCorporal;
    private double masaMuscular;
    private IAdapterMetricas adapterMetricas;

    public Medicion() {
        peso = 0;
        masaMuscular = 0;
        grasaCorporal = 0;
    }



    public void pesar(Socio socio){
        int randomNum = ThreadLocalRandom.current().nextInt(-3, 3);
        this.peso = socio.getPeso() + randomNum;
        this.notificar();
    }
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
