package org.example.model;

import org.example.baseDeDatos.DB;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class TrofeoCreido extends Trofeo{
    @Override
    public void verificarSiOtorgar(Socio socio) {

        boolean sePeso3Veces = true;

        List<List<Object>> ultimasMediciones = DB.historialMediciones.stream()
                .filter(medicion -> medicion.get(1).equals(socio.getNombreUsuario()))
                .sorted(Comparator.comparing(medicion -> (Date) medicion.get(2), Comparator.reverseOrder()))
                .limit(3)
                .collect(Collectors.toList());

        if (ultimasMediciones.size() < 3 || DB.tieneTrofeo(socio.getNombreUsuario)) {
            sePeso3Veces = false;
        }

        Date fechaPrimeraMedicion = (Date) ultimasMediciones.get(0).get(2);
        int  mesPrimero = fechaPrimeraMedicion.getMonth();


        for (List<Object> mediciones : ultimasMediciones ){
            Date fecha = (Date) mediciones.get(2);
            int mes = fecha.getMonth();
            if(mes != mesPrimero){
                sePeso3Veces = false;
            }

        }

        if (sePeso3Veces) {
            this.notificar();
        }


    }


    public void notificar(){
        this.getNotificador().notificar(new Notificacion("Trofeo creido obtenido"));
    }
}
