package org.example.baseDeDatos;

import org.example.model.Ejercicio;
import org.example.model.RegistroEjercicio;
import org.example.model.Socio;

import java.util.ArrayList;
import java.util.List;

public class DB {
    public static List<Socio> socios = new ArrayList<>();
    public static List<Ejercicio> ejercicios = new ArrayList<>();
    public static List<RegistroEjercicio> ejerciciosCompletados = new ArrayList<>();
    public static List<Object> historialMediciones = new ArrayList<>();
}