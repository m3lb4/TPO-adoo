package org.example.model;

import org.example.baseDeDatos.DB;

import java.util.List;
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

    public Medicion(Medicion medicion) {
        peso = medicion.getPeso();
        masaMuscular = medicion.getMasaMuscular();
        grasaCorporal = medicion.getGrasaCorporal();
    }

    public static Medicion fromObject (List<Object> o) {


        if (o.getFirst() instanceof Medicion) {
            return (Medicion) o.getFirst();
        }
        return null;
    }

    public void pesar(Socio socio){
        if (socio.getMedicion().getPeso() == 0) {
            this.peso = ThreadLocalRandom.current().nextInt(60, 80);
        } else {
            this.peso = socio.getPeso();
            int randomNum = ThreadLocalRandom.current().nextInt(-3, 3);
            this.peso += randomNum;
            this.notificarObservacion(socio);
        }
    }

    public void medirGrasaCorporal(Socio socio){

    }
    public void medirMasaMuscular(Socio socio){

    }

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
