package org.example.model;

import org.example.baseDeDatos.DB;

import java.util.Arrays;
import java.util.List;
import java.util.Date;
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
        this.agregar(new TrofeoCreido());
        this.agregar(new TrofeoDedicacion());
    }

    public Medicion(Medicion medicion) {
        peso = medicion.getPeso();
        masaMuscular = medicion.getMasaMuscular();
        grasaCorporal = medicion.getGrasaCorporal();
        this.agregar(new TrofeoCreido());
        this.agregar(new TrofeoDedicacion());
    }

    public static Medicion fromObject (List<Object> o) {


        if (o.getFirst() instanceof Medicion) {
            return (Medicion) o.getFirst();
        }
        return null;
    }

    public void pesar(Socio socio){
        if (socio.getPeso() == 0) {

            this.peso = socio.getAltura() - 95;

        } else {
            this.peso = socio.getPeso();
            int randomNum = ThreadLocalRandom.current().nextInt(-3, 3);
            this.peso += randomNum;
        }
    }

    public void medirGrasaCorporal(Socio socio){
        if (socio.getGrasaCorporal() == 0) {
            this.grasaCorporal = ThreadLocalRandom.current().nextInt(10, 20);
        } else {
            this.grasaCorporal = socio.getGrasaCorporal();
            int randomNum = ThreadLocalRandom.current().nextInt(-1, 1);
            this.grasaCorporal += randomNum;
        }
    }
    public void medirMasaMuscular(Socio socio){
        if (socio.getMasaMuscular() == 0) {
            this.masaMuscular = ThreadLocalRandom.current().nextInt(15, 25);
        } else {
            this.masaMuscular = socio.getMasaMuscular();
            int randomNum = ThreadLocalRandom.current().nextInt(-1, 1);
            this.masaMuscular += randomNum;
        }
    }

    public void realizarMediciones(Socio socio, Date date){
        this.pesar(socio);
        this.medirMasaMuscular(socio);
        this.medirGrasaCorporal(socio);
        List<Object> medicion = Arrays.asList(new Medicion(socio.getMedicion()), socio.getNombreUsuario(), date);
        DB.historialMediciones.add(medicion);
        this.notificarObservacion(socio);
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
