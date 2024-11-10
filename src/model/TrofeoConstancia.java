package org.example.model;

import java.util.List;

public class TrofeoConstancia extends Trofeo{

    
    @Override
    public void verificarSiOtorgar(Socio socio) {
        List<Entrenamiento> entrenamientos = socio.getObjetivo().getRutina().getEntrenamientos();
        boolean todosFinalizados = true;
        for (Entrenamiento entrenamiento : entrenamientos) {
            if (entrenamiento.isEntrenamientoFinalizado() != "Finalizado") {
                todosFinalizados = false;
                break;
            }
        }

        if (todosFinalizados) {
            this.notificar();
        }
    }
    public void notificar(){
        this.getNotificador().notificar(new Notificacion("Trofeo constancia obtenido"));
    }
}
