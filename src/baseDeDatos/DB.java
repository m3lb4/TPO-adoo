package org.example.baseDeDatos;

import org.example.model.*;

import java.util.*;


import java.util.stream.Collectors;

public class DB {
    public static List<Socio> socios = new ArrayList<>();
    public static List<Ejercicio> ejercicios = new ArrayList<>();
    public static List<RegistroEjercicio> ejerciciosCompletados = new ArrayList<>();
    public static List<List<Object>> historialMediciones = new ArrayList<>();
    public static List<List<Object>> trofeosPorSocio= new ArrayList<>();


    public static Medicion getUltimaMedicion(String nombreUsuario) {
        Medicion ultMed =  historialMediciones.stream()
                .filter(medicion -> medicion.get(1).equals(nombreUsuario))
                .max(Comparator.comparing(medicion -> (Date) medicion.get(2)))
                .map(medicion -> (Medicion) medicion.get(0))
                .orElse(null);

        return ultMed;
    }

    public static boolean tieneTrofeo(String nombreUsuario, Trofeo trofeo){

        List<Trofeo> listaTrofeos = new ArrayList<>();

        for (List<Object> trofeosXSocio: trofeosPorSocio){
            if (trofeosXSocio.get(0).equals(nombreUsuario)){
                listaTrofeos.add((Trofeo) trofeosXSocio.get(1));

            }
        }

        for (Object trofeosSocio : listaTrofeos ){
            if(trofeosSocio.equals(trofeo)){
                return true;
            }
        }
        return false;
    }

    }
