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

    public Socio() {
    }

    public Socio(String nombreUsuario, String contrasenia, int edad, Genero sexo, int altura) {
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
        this.edad = edad;
        this.sexo = sexo;
        this.altura = altura;
        this.objetivo=null;
        this.medicion=null;
        this.trofeos=new ArrayList<>();
        this.historialEjercicios=new ArrayList<>();
        this.adapterAuth= IAdapterAuth;
    }

    public void loggear(SocioLoginDTO datos){}
    public void registrar(SocioRegisterDTO datos){}

    public void cambiarObjetivo(Objetivo objetivo){
        this.objetivo=objetivo;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Genero getSexo() {
        return sexo;
    }

    public void setSexo(Genero sexo) {
        this.sexo = sexo;
    }

    public Medicion getMedicion() {
        return medicion;
    }

    public void setMedicion(Medicion medicion) {
        this.medicion = medicion;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Objetivo getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(Objetivo objetivo) {
        this.objetivo = objetivo;
    }

    public List<Trofeo> getTrofeos() {
        return trofeos;
    }

    public void setTrofeos(List<Trofeo> trofeos) {
        this.trofeos = trofeos;
    }

    public List<RegistroEjercicio> getHistorialEjercicios() {
        return historialEjercicios;
    }

    public void setHistorialEjercicios(List<RegistroEjercicio> historialEjercicios) {
        this.historialEjercicios = historialEjercicios;
    }

    public IAdapterAuth getAdapterAuth() {
        return adapterAuth;
    }

    public void setAdapterAuth(IAdapterAuth adapterAuth) {
        this.adapterAuth = adapterAuth;
    }
}
