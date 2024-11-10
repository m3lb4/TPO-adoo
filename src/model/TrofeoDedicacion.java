package org.example.model;

public class TrofeoDedicacion extends Trofeo
{
    @Override
    public void verificarSiOtorgar(Socio socio) {
        if (socio.chequearObj()) {
            this.notificar();
        }
    }
    public void notificar(){
        System.out.println("Trofeo dedicacion obtenido");
    }
}
