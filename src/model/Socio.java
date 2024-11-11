package org.example.model;

import org.example.dto.SocioLoginDTO;
import org.example.dto.SocioRegisterDTO;

import java.util.ArrayList;

import java.util.Date;
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
    private IAdapterAuth adapterAuth;


    public Socio(String nombreUsuario, String contrasenia, int edad, Genero sexo, int altura) {
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
        this.edad = edad;
        this.sexo = sexo;
        this.altura = altura;
        this.objetivo = null;
        this.medicion = new Medicion();
        this.trofeos = new ArrayList<Trofeo>();
        this.adapterAuth = new Auth();
    }

    public void cambiarObjetivo(Objetivo objetivo){
        this.objetivo = objetivo;
        this.objetivo.generarRutina();
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

    public IAdapterAuth getAdapterAuth() {
        return adapterAuth;
    }

    public void setAdapterAuth(IAdapterAuth adapterAuth) {
        this.adapterAuth = adapterAuth;
    }

    public double getGrasaCorporal(){
        return this.medicion.getGrasaCorporal();
    }

    public double getMasaMuscular(){
        return this.medicion.getMasaMuscular();
    }

    public double getPeso(){
        return this.medicion.getPeso();
    }

    public void realizarMediciones(Date date){
        this.medicion.realizarMediciones(this, date);
    }

    public  boolean chequearObj(){
        if (this.objetivo != null){
        return this.objetivo.chequearObj(this);
        } else {
            return false;
        }
    }

    public void loggear(){

    }

    public void registrar(){

    }
}
