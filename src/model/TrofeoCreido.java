package org.example.model;

import org.example.baseDeDatos.DB;

import java.util.List;

public class TrofeoCreido extends Trofeo{
    @Override
    public void verificarSiOtorgar(Socio socio) {

        if(DB.verificarSiSonDelMismoMes(socio.getNombreUsuario())){
            this.notificar();
        }





    }


    public void notificar(){
        System.out.println("Notificando Trofeo");
    }
}
