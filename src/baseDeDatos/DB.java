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


    public static Medicion getUltimaMedicion(String nombreUsuario) {
        Medicion ultMed =  historialMediciones.stream()
                .filter(medicion -> medicion.get(1).equals(nombreUsuario))
                .max(Comparator.comparing(medicion -> (Date) medicion.get(2)))
                .map(medicion -> (Medicion) medicion.get(0))
                .orElse(null);

        return ultMed;
    }

    public static boolean verificarSiSonDelMismoMes(String nombreUsuario) {
        // Obtener las últimas 3 mediciones asociadas al usuario, ordenadas por fecha
        List<List<Object>> ultimasMediciones = historialMediciones.stream()
                .filter(medicion -> medicion.get(1).equals(nombreUsuario)) // Filtrar por nombre de usuario
                .sorted(Comparator.comparing(medicion -> (Date) medicion.get(2), Comparator.reverseOrder())) // Ordenar por fecha descendente
                .limit(3) // Limitar a las 3 últimas
                .collect(Collectors.toList()); // Recoger en una lista

        if (ultimasMediciones.size() < 3) {
            // Si no hay suficientes mediciones para comparar, devolvemos false
            return false;
        }

        // Obtener el mes y el año de la primera medición
        Date fechaPrimeraMedicion = (Date) ultimasMediciones.get(0).get(2);  // Obtener la fecha desde el índice 2
        Calendar cal = Calendar.getInstance();
        cal.setTime(fechaPrimeraMedicion);
        int mes = cal.get(Calendar.MONTH);
        int anio = cal.get(Calendar.YEAR);

        // Verificar si todas las mediciones tienen el mismo mes y año
        for (List<Object> medicion : ultimasMediciones) {
            Date fechaMedicion = (Date) medicion.get(2);  // Obtener la fecha desde el índice 2
            cal.setTime(fechaMedicion);

            // Comparar mes y año de la fecha de la medición actual con los de la primera medición
            if (cal.get(Calendar.MONTH) != mes || cal.get(Calendar.YEAR) != anio) {
                // Si alguna medición no tiene el mismo mes y año, devolvemos false
                return false;
            }
        }

        // Si todas las mediciones fueron en el mismo mes
        return true;
    }}
