package org.example.baseDeDatos;

import org.example.model.Ejercicio;
import org.example.model.Medicion;
import org.example.model.RegistroEjercicio;
import org.example.model.Socio;
import java.util.Comparator;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DB {
    public static List<Socio> socios = new ArrayList<>();
    public static List<Ejercicio> ejercicios = new ArrayList<>();
    public static List<RegistroEjercicio> ejerciciosCompletados = new ArrayList<>();
    public static List<List<Object>> historialMediciones = new ArrayList<>();


    public static Medicion getUltimaMedicion(String nombreUsuario) {
        return historialMediciones.stream()
                .filter(medicion -> medicion.get(1) instanceof Socio && ((Socio) medicion.get(1)).getNombreUsuario().equals(nombreUsuario))  // Filtra por nombre de usuario
                .max(Comparator.comparing(medicion -> (Date) medicion.get(2)))  // Ordena por fecha
                .map(medicion -> (Medicion) medicion.get(0))  // Obtiene la instancia de Medicion
                .orElse(null);  // Devuelve null si no hay mediciones para el usuario
    }

}