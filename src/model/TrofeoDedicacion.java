package org.example.model;

import org.example.baseDeDatos.DB;

import java.util.Arrays;
import java.util.List;

public class TrofeoDedicacion extends Trofeo
{
    @Override
    public void verificarSiOtorgar(Socio socio) {
        if (socio.chequearObj()) {
            if (!DB.tieneTrofeo(socio.getNombreUsuario(), this )){
                List<Object> trofeos = Arrays.asList(socio.getNombreUsuario(), this);
                DB.trofeosPorSocio.add(trofeos);
                this.notificar();
            }
        }
    }
    public void notificar(){
        System.out.println("Trofeo dedicacion obtenido");
    }
}
