package org.example.model;

public class MantenerLaFigura  extends Objetivo{
    private double umbralDeOscilacion;
    private double pesoInicial;
    //Segun consigna: Este objetivo se cumple si el peso oscila entre +-N unidades en comparación con el peso inicial (siendo N un valor configurable).

    @Override
    public boolean chequearObj(Socio socio) {
        return socio.getPeso()>= (this.pesoInicial-this.umbralDeOscilacion) || socio.getPeso()<=(this.pesoInicial+this.umbralDeOscilacion);
    }


    public boolean cumpleCondiciones(Ejercicio ejercicio) {
        if (ejercicio.getNivelAerobico() > 2  && ejercicio.getNivelAerobico() < 4  && ejercicio.getExigenciaMuscular() != ExigenciaMuscular.Alto) {
            return true;
        }


        return false;
    }

    public double getUmbralDeOscilacion() {
        return umbralDeOscilacion;
    }

    public void setUmbralDeOscilacion(double n) {
        this.umbralDeOscilacion = n ;
    }
}
