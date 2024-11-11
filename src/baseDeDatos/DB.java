package org.example.baseDeDatos;

import org.example.model.Ejercicio;
import org.example.model.Medicion;
import org.example.model.RegistroEjercicio;
import org.example.model.Socio;

import java.util.*;


import java.util.stream.Collectors;

public class DB {
    public static List<Socio> socios = new ArrayList<>();
    public static List<Ejercicio> ejercicios = new ArrayList<>();
    public static List<RegistroEjercicio> ejerciciosCompletados = new ArrayList<>();
    public static List<List<Object>> historialMediciones = new ArrayList<>();
    public static List<List<Object>> trofeosPorUsuario= new ArrayList<>();


    public static Medicion getUltimaMedicion(String nombreUsuario) {
        Medicion ultMed =  historialMediciones.stream()
                .filter(medicion -> medicion.get(1).equals(nombreUsuario))
                .max(Comparator.comparing(medicion -> (Date) medicion.get(2)))
                .map(medicion -> (Medicion) medicion.get(0))
                .orElse(null);

        return ultMed;
    }

   /* public static Medicion getUltimaMedicion(String nombreUsuario) {
        Medicion ultimaMedicion = null;
        Date fechaUltimaMedicion = null;

        for (List<Object> medicion : historialMediciones) {
            if (medicion.get(1).equals(nombreUsuario)) {
                Date fechaActual = (Date) medicion.get(2);
                if (fechaUltimaMedicion == null || fechaActual.after(fechaUltimaMedicion)) {
                    fechaUltimaMedicion = fechaActual;
                    ultimaMedicion = (Medicion) medicion.get(0);
                }
            }
        }

        return ultimaMedicion;
    }*/

    public static boolean tieneTrofeo(String nombreUsuario, Trofeo trofeo){
        for (List<Object> trofeosUsuario: trofeosPorUsuario){
            if (trofeosUsuario.get(0).equals(nombreUsuario)){
                List<Trofeo> listaTrofeos = (List<Trofeo>) trofeosUsuario.get(1);
                for (Object trofeoUsuario : trofeosUsuario.get(1) ){
                    if(trofeoUsuario.equals(trofeo)){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    }
