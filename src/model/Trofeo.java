package org.example.model;

public abstract class Trofeo {
    private Notificador notificador;

    public Trofeo() {
        this.notificador = new Notificador();
    }


    public abstract void verificarSiOtorgar(Socio socio);
    public void notificar(){}

    public Notificador getNotificador() {
        return notificador;
    }
}
