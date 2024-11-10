package org.example;

import org.example.baseDeDatos.DB;
import org.example.controller.EjercitacionController;
import org.example.controller.SocioController;
import org.example.dto.EjercicioDTO;
import org.example.dto.SocioLoginDTO;
import org.example.dto.SocioRegisterDTO;
import org.example.model.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EjercitacionController ejController = EjercitacionController.getInstance();
        List<EjercicioDTO> lista = new ArrayList<>() ;
        lista.add(new EjercicioDTO("Brazos", "3", "12", "31", "2", "Medio", "http://example.com/video_1"));
        lista.add(new EjercicioDTO("Piernas", "5", "11", "38", "1", "Alto", "http://example.com/video_2"));
        lista.add(new EjercicioDTO("Hombros", "4", "12", "20", "2", "Medio", "http://example.com/video_3"));
        lista.add(new EjercicioDTO("Piernas", "4", "11", "14", "2", "Medio", "http://example.com/video_4"));
        lista.add(new EjercicioDTO("Pecho", "3", "11", "30", "3", "Medio", "http://example.com/video_5"));
        lista.add(new EjercicioDTO("Espalda", "4", "15", "50", "1", "Medio", "http://example.com/video_6"));
        lista.add(new EjercicioDTO("Hombros", "4", "13", "27", "2", "Medio", "http://example.com/video_7"));
        lista.add(new EjercicioDTO("Espalda", "4", "11", "38", "2", "Medio", "http://example.com/video_8"));
        lista.add(new EjercicioDTO("Espalda", "4", "10", "24", "4", "Bajo", "http://example.com/video_9"));
        lista.add(new EjercicioDTO("Pecho", "3", "11", "49", "4", "Medio", "http://example.com/video_10"));
        lista.add(new EjercicioDTO("Hombros", "4", "14", "40", "4", "Alto", "http://example.com/video_11"));
        lista.add(new EjercicioDTO("Hombros", "4", "15", "48", "4", "Alto", "http://example.com/video_12"));
        lista.add(new EjercicioDTO("Piernas", "3", "12", "18", "3", "Alto", "http://example.com/video_13"));
        lista.add(new EjercicioDTO("Piernas", "5", "14", "22", "3", "Medio", "http://example.com/video_14"));
        lista.add(new EjercicioDTO("Pecho", "4", "8", "50", "4", "Medio", "http://example.com/video_15"));
        lista.add(new EjercicioDTO("Espalda", "3", "8", "33", "4", "Medio", "http://example.com/video_16"));
        lista.add(new EjercicioDTO("Brazos", "5", "13", "17", "3", "Medio", "http://example.com/video_17"));
        lista.add(new EjercicioDTO("Piernas", "3", "14", "10", "3", "Alto", "http://example.com/video_18"));
        lista.add(new EjercicioDTO("Espalda", "5", "9", "46", "3", "Bajo", "http://example.com/video_19"));
        lista.add(new EjercicioDTO("Brazos", "4", "12", "27", "1", "Medio", "http://example.com/video_20"));
        lista.add(new EjercicioDTO("Espalda", "3", "12", "29", "3", "Medio", "http://example.com/video_21"));
        lista.add(new EjercicioDTO("Piernas", "3", "12", "24", "2", "Medio", "http://example.com/video_22"));
        lista.add(new EjercicioDTO("Espalda", "3", "12", "10", "3", "Medio", "http://example.com/video_23"));
        lista.add(new EjercicioDTO("Hombros", "4", "9", "26", "2", "Alto", "http://example.com/video_24"));
        lista.add(new EjercicioDTO("Espalda", "4", "15", "32", "1", "Bajo", "http://example.com/video_25"));
        lista.add(new EjercicioDTO("Brazos", "5", "13", "13", "4", "Alto", "http://example.com/video_26"));
        lista.add(new EjercicioDTO("Hombros", "4", "15", "28", "3", "Alto", "http://example.com/video_27"));
        lista.add(new EjercicioDTO("Brazos", "5", "12", "30", "4", "Medio", "http://example.com/video_28"));
        lista.add(new EjercicioDTO("Espalda", "4", "13", "35", "3", "Bajo", "http://example.com/video_29"));
        lista.add(new EjercicioDTO("Hombros", "5", "8", "32", "4", "Medio", "http://example.com/video_30"));
        lista.add(new EjercicioDTO("Pecho", "5", "11", "38", "4", "Alto", "http://example.com/video_31"));
        lista.add(new EjercicioDTO("Hombros", "4", "15", "22", "3", "Alto", "http://example.com/video_32"));
        lista.add(new EjercicioDTO("Piernas", "3", "12", "21", "2", "Bajo", "http://example.com/video_33"));
        lista.add(new EjercicioDTO("Hombros", "5", "10", "49", "1", "Medio", "http://example.com/video_34"));
        lista.add(new EjercicioDTO("Hombros", "4", "14", "32", "3", "Alto", "http://example.com/video_35"));
        lista.add(new EjercicioDTO("Espalda", "4", "14", "31", "2", "Medio", "http://example.com/video_36"));
        lista.add(new EjercicioDTO("Hombros", "5", "14", "36", "3", "Bajo", "http://example.com/video_37"));
        lista.add(new EjercicioDTO("Hombros", "4", "9", "12", "1", "Bajo", "http://example.com/video_38"));
        lista.add(new EjercicioDTO("Espalda", "4", "13", "43", "2", "Bajo", "http://example.com/video_39"));
        lista.add(new EjercicioDTO("Espalda", "3", "10", "20", "3", "Alto", "http://example.com/video_40"));
        lista.add(new EjercicioDTO("Piernas", "5", "13", "12", "4", "Medio", "http://example.com/video_41"));
        lista.add(new EjercicioDTO("Hombros", "5", "15", "50", "3", "Alto", "http://example.com/video_42"));
        lista.add(new EjercicioDTO("Pecho", "4", "15", "13", "2", "Alto", "http://example.com/video_43"));
        lista.add(new EjercicioDTO("Piernas", "3", "14", "49", "4", "Alto", "http://example.com/video_44"));
        lista.add(new EjercicioDTO("Pecho", "4", "15", "26", "4", "Alto", "http://example.com/video_45"));
        lista.add(new EjercicioDTO("Hombros", "5", "11", "32", "2", "Alto", "http://example.com/video_46"));
        lista.add(new EjercicioDTO("Piernas", "4", "13", "45", "2", "Medio", "http://example.com/video_47"));
        lista.add(new EjercicioDTO("Piernas", "4", "8", "30", "4", "Medio", "http://example.com/video_48"));
        lista.add(new EjercicioDTO("Hombros", "3", "11", "16", "2", "Medio", "http://example.com/video_49"));
        lista.add(new EjercicioDTO("Brazos", "4", "11", "24", "1", "Medio", "http://example.com/video_50"));
        lista.add(new EjercicioDTO("Espalda", "4", "12", "22", "3", "Alto", "http://example.com/video_51"));
        lista.add(new EjercicioDTO("Brazos", "4", "13", "12", "3", "Bajo", "http://example.com/video_52"));
        lista.add(new EjercicioDTO("Pecho", "4", "9", "20", "4", "Alto", "http://example.com/video_53"));
        lista.add(new EjercicioDTO("Espalda", "3", "11", "45", "4", "Alto", "http://example.com/video_54"));
        lista.add(new EjercicioDTO("Espalda", "3", "15", "14", "2", "Medio", "http://example.com/video_55"));
        lista.add(new EjercicioDTO("Espalda", "4", "11", "34", "2", "Alto", "http://example.com/video_56"));
        lista.add(new EjercicioDTO("Espalda", "5", "11", "39", "2", "Bajo", "http://example.com/video_57"));
        lista.add(new EjercicioDTO("Hombros", "4", "9", "17", "4", "Medio", "http://example.com/video_58"));
        lista.add(new EjercicioDTO("Pecho", "4", "10", "39", "1", "Alto", "http://example.com/video_59"));
        lista.add(new EjercicioDTO("Hombros", "3", "11", "17", "1", "Medio", "http://example.com/video_60"));
        lista.add(new EjercicioDTO("Pecho", "4", "12", "21", "1", "Alto", "http://example.com/video_61"));
        lista.add(new EjercicioDTO("Hombros", "5", "11", "34", "1", "Bajo", "http://example.com/video_62"));
        lista.add(new EjercicioDTO("Espalda", "5", "13", "14", "1", "Medio", "http://example.com/video_63"));
        lista.add(new EjercicioDTO("Pecho", "4", "14", "44", "2", "Medio", "http://example.com/video_64"));
        lista.add(new EjercicioDTO("Hombros", "4", "11", "31", "3", "Medio", "http://example.com/video_65"));
        lista.add(new EjercicioDTO("Hombros", "3", "10", "27", "1", "Alto", "http://example.com/video_66"));
        lista.add(new EjercicioDTO("Espalda", "5", "8", "30", "2", "Alto", "http://example.com/video_67"));
        lista.add(new EjercicioDTO("Espalda", "3", "11", "12", "1", "Alto", "http://example.com/video_68"));
        lista.add(new EjercicioDTO("Hombros", "5", "10", "27", "4", "Alto", "http://example.com/video_69"));
        lista.add(new EjercicioDTO("Brazos", "4", "15", "28", "1", "Bajo", "http://example.com/video_70"));
        lista.add(new EjercicioDTO("Piernas", "4", "13", "35", "1", "Alto", "http://example.com/video_71"));
        lista.add(new EjercicioDTO("Espalda", "4", "10", "17", "1", "Alto", "http://example.com/video_72"));
        lista.add(new EjercicioDTO("Piernas", "5", "11", "16", "3", "Medio", "http://example.com/video_73"));
        lista.add(new EjercicioDTO("Brazos", "3", "11", "42", "4", "Bajo", "http://example.com/video_74"));
        lista.add(new EjercicioDTO("Espalda", "5", "8", "21", "4", "Medio", "http://example.com/video_75"));
        lista.add(new EjercicioDTO("Espalda", "5", "15", "32", "1", "Medio", "http://example.com/video_76"));
        lista.add(new EjercicioDTO("Espalda", "3", "10", "46", "1", "Bajo", "http://example.com/video_77"));
        lista.add(new EjercicioDTO("Pecho", "3", "10", "19", "2", "Bajo", "http://example.com/video_78"));
        lista.add(new EjercicioDTO("Hombros", "4", "9", "46", "3", "Bajo", "http://example.com/video_79"));
        lista.add(new EjercicioDTO("Pecho", "3", "11", "16", "4", "Alto", "http://example.com/video_80"));
        lista.add(new EjercicioDTO("Brazos", "4", "13", "33", "4", "Bajo", "http://example.com/video_81"));
        lista.add(new EjercicioDTO("Piernas", "3", "13", "10", "1", "Medio", "http://example.com/video_82"));
        lista.add(new EjercicioDTO("Espalda", "4", "10", "43", "3", "Medio", "http://example.com/video_83"));
        lista.add(new EjercicioDTO("Piernas", "5", "13", "15", "4", "Bajo", "http://example.com/video_84"));
        lista.add(new EjercicioDTO("Pecho", "5", "12", "25", "2", "Alto", "http://example.com/video_85"));
        lista.add(new EjercicioDTO("Pecho", "5", "14", "18", "1", "Alto", "http://example.com/video_86"));
        lista.add(new EjercicioDTO("Piernas", "4", "9", "31", "1", "Medio", "http://example.com/video_87"));
        lista.add(new EjercicioDTO("Brazos", "4", "13", "46", "2", "Bajo", "http://example.com/video_88"));
        lista.add(new EjercicioDTO("Espalda", "5", "14", "40", "4", "Medio", "http://example.com/video_89"));
        lista.add(new EjercicioDTO("Piernas", "3", "12", "28", "3", "Medio", "http://example.com/video_90"));
        lista.add(new EjercicioDTO("Espalda", "5", "9", "19", "3", "Alto", "http://example.com/video_91"));
        lista.add(new EjercicioDTO("Brazos", "3", "9", "16", "2", "Bajo", "http://example.com/video_92"));
        lista.add(new EjercicioDTO("Piernas", "5", "14", "27", "2", "Alto", "http://example.com/video_93"));
        lista.add(new EjercicioDTO("Piernas", "3", "8", "14", "4", "Alto", "http://example.com/video_94"));
        lista.add(new EjercicioDTO("Brazos", "5", "8", "20", "2", "Bajo", "http://example.com/video_95"));
        lista.add(new EjercicioDTO("Hombros", "5", "12", "16", "4", "Medio", "http://example.com/video_96"));
        lista.add(new EjercicioDTO("Espalda", "5", "14", "13", "2", "Bajo", "http://example.com/video_97"));
        lista.add(new EjercicioDTO("Hombros", "4", "9", "15", "3", "Alto", "http://example.com/video_98"));
        lista.add(new EjercicioDTO("Hombros", "4", "13", "49", "3", "Alto", "http://example.com/video_99"));
        lista.add(new EjercicioDTO("Piernas", "5", "15", "30", "2", "Alto", "http://example.com/video_100"));

        for (EjercicioDTO ej : lista) {
            ejController.agregarEjercicio(ej);
        }

        SocioController sController = SocioController.getInstance();
        SocioRegisterDTO socioRegisterDTO = new SocioRegisterDTO("24", "Masculino", "178", "Fran", "Test123");
        sController.registrarSocio(socioRegisterDTO);

        SocioLoginDTO socioLoginDTO = new SocioLoginDTO("Fran", "Test123");
        Socio socioLoggeado = sController.loggearSocio(socioLoginDTO);

        SocioRegisterDTO socioRegisterDTO2 = new SocioRegisterDTO("22", "Masculino", "168", "Pepe", "Test123");
        sController.registrarSocio(socioRegisterDTO2);

        SocioLoginDTO socioLoginDTO2 = new SocioLoginDTO("Pepe", "Test123");
        Socio socioLoggeado2 = sController.loggearSocio(socioLoginDTO2);

        sController.realizarMediciones(socioLoggeado.getNombreUsuario(), new Date(2024,8,16));
        sController.realizarMediciones(socioLoggeado.getNombreUsuario(), new Date(2024, 8, 12));
        sController.realizarMediciones(socioLoggeado.getNombreUsuario(), new Date(2024,8,13));
        sController.realizarMediciones(socioLoggeado2.getNombreUsuario(), new Date(2024,6,2));
        sController.realizarMediciones(socioLoggeado2.getNombreUsuario(), new Date(2024, 6, 18));
        sController.realizarMediciones(socioLoggeado2.getNombreUsuario(), new Date(2024, 6,24));


        boolean creido = DB.verificarSiSonDelMismoMes(socioLoggeado.getNombreUsuario());
        boolean creido2 = DB.verificarSiSonDelMismoMes(socioLoggeado2.getNombreUsuario());

            System.out.println("ES CREIDO: "+ creido);
            System.out.println("ES CREIDO 2: "+ creido2);

    }
}
