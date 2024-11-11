package org.example.model;

import org.example.baseDeDatos.DB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TrofeoConstancia extends Trofeo{

    
    @Override
    public void verificarSiOtorgar(Socio socio) {
        List<Entrenamiento> entrenamientos = socio.getObjetivo().getRutina().getEntrenamientos();
        boolean todosFinalizados = true;
        for (Entrenamiento entrenamiento : entrenamientos) {
            if (entrenamiento.getEstadoEntrenamiento() != "Finalizado") {
                todosFinalizados = false;
                break;

            }
        }

        if (todosFinalizados) {


            if (!DB.tieneTrofeo(socio.getNombreUsuario(), this )){
                List<Object> trofeos = Arrays.asList(socio.getNombreUsuario(), this);
                DB.trofeosPorSocio.add(trofeos);
                this.notificar();
            }

        }
    }
    public void notificar(){
        this.getNotificador().notificar(new Notificacion("Trofeo constancia obtenido"));
    }
}
