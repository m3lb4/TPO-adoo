package org.example.dto;

import org.example.model.Ejercicio;
import org.example.model.ExigenciaMuscular;
import org.example.model.Musculo;

public class EjercicioDTO {

    private String musculo;
    private String series;
    private String repeticiones;
    private String pesoAsignado;
    private String nivelAerobico;
    private String exigenciaMuscular;
    private String urlVideo;

    public String getMusculo() {
        return musculo;
    }

    public void setMusculo(String musculo) {
        this.musculo = musculo;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(String repeticiones) {
        this.repeticiones = repeticiones;
    }

    public String getPesoAsignado() {
        return pesoAsignado;
    }

    public void setPesoAsignado(String pesoAsignado) {
        this.pesoAsignado = pesoAsignado;
    }

    public String getNivelAerobico() {
        return nivelAerobico;
    }

    public void setNivelAerobico(String nivelAerobico) {
        this.nivelAerobico = nivelAerobico;
    }

    public String getExigenciaMuscular() {
        return exigenciaMuscular;
    }

    public void setExigenciaMuscular(String exigenciaMuscular) {
        this.exigenciaMuscular = exigenciaMuscular;
    }

    public String getUrlVideo() {
        return urlVideo;
    }

    public void setUrlVideo(String urlVideo) {
        this.urlVideo = urlVideo;
    }

    public Ejercicio toModel () {
        Ejercicio ejercicio = new Ejercicio(
                Musculo.valueOf(this.musculo),
                Integer.parseInt(this.series),
                Integer.parseInt(this.repeticiones),
                Double.parseDouble(this.repeticiones),
                Integer.parseInt(this.nivelAerobico),
                ExigenciaMuscular.valueOf(this.exigenciaMuscular),
                this.urlVideo
        );

        return ejercicio;
    }
}
