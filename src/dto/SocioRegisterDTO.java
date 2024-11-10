package org.example.dto;

public class SocioRegisterDTO {
    private String edad;
    private String sexo;
    private String altura;
    private String nombreUsuario;
    private String contrasenia;

    public SocioRegisterDTO(String edad, String sexo, String altura, String nombreUsuario, String contrasenia) {
        this.edad = edad;
        this.sexo = sexo;
        this.altura = altura;
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
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
}
