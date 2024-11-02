package org.example.model;

import org.example.dto.SocioLoginDTO;
import org.example.dto.SocioRegisterDTO;

import java.util.List;

public class Socio {
    private String nombreUsuario;
    private String contrasenia;
    private int edad;
    private Genero sexo;
    private Medicion medicion;
    private int altura;
    private Objetivo objetivo;
    private List<Trofeo> trofeos;
    private List<RegistroEjercicio> historialEjercicios;
    private IAdapterAuth adapterAuth;

    public void loggear(SocioLoginDTO datos){}
    public void registrar(SocioRegisterDTO datos){}

    public void cambiarObjetivo(Objetivo objetivo){
        this.objetivo=objetivo;
    }


}
