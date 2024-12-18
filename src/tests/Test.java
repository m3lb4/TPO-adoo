package org.example.tests;

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

import static org.junit.jupiter.api.Assertions.*;

class Test {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        EjercitacionController ejController = EjercitacionController.getInstance();
        List<EjercicioDTO> lista = new ArrayList<>() ;
        lista.add(new EjercicioDTO("Brazos", "3", "12", "31", "10", "Medio", "http://example.com/video_1"));
        lista.add(new EjercicioDTO("Piernas", "5", "11", "38", "1", "Alto", "http://example.com/video_2"));
        lista.add(new EjercicioDTO("Hombros", "4", "12", "20", "2", "Medio", "http://example.com/video_3"));
        lista.add(new EjercicioDTO("Piernas", "4", "11", "14", "6", "Medio", "http://example.com/video_4"));
        lista.add(new EjercicioDTO("Pecho", "3", "11", "30", "3", "Medio", "http://example.com/video_5"));
        lista.add(new EjercicioDTO("Espalda", "4", "15", "50", "1", "Medio", "http://example.com/video_6"));
        lista.add(new EjercicioDTO("Hombros", "4", "13", "27", "2", "Medio", "http://example.com/video_7"));
        lista.add(new EjercicioDTO("Espalda", "4", "11", "38", "6", "Medio", "http://example.com/video_8"));
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
        lista.add(new EjercicioDTO("Brazos", "4", "12", "27", "6", "Medio", "http://example.com/video_20"));
        lista.add(new EjercicioDTO("Espalda", "3", "12", "29", "3", "Medio", "http://example.com/video_21"));
        lista.add(new EjercicioDTO("Piernas", "3", "12", "24", "2", "Medio", "http://example.com/video_22"));
        lista.add(new EjercicioDTO("Espalda", "3", "12", "10", "3", "Medio", "http://example.com/video_23"));
        lista.add(new EjercicioDTO("Hombros", "4", "9", "26", "2", "Alto", "http://example.com/video_24"));
        lista.add(new EjercicioDTO("Espalda", "4", "15", "32", "1", "Bajo", "http://example.com/video_25"));
        lista.add(new EjercicioDTO("Brazos", "5", "13", "13", "10", "Alto", "http://example.com/video_26"));
        lista.add(new EjercicioDTO("Hombros", "4", "15", "28", "10", "Alto", "http://example.com/video_27"));
        lista.add(new EjercicioDTO("Brazos", "5", "12", "30", "9", "Medio", "http://example.com/video_28"));
        lista.add(new EjercicioDTO("Espalda", "4", "13", "35", "6", "Bajo", "http://example.com/video_29"));
        lista.add(new EjercicioDTO("Hombros", "5", "8", "32", "4", "Medio", "http://example.com/video_30"));
        lista.add(new EjercicioDTO("Pecho", "5", "11", "38", "4", "Alto", "http://example.com/video_31"));
        lista.add(new EjercicioDTO("Hombros", "4", "15", "22", "3", "Alto", "http://example.com/video_32"));
        lista.add(new EjercicioDTO("Piernas", "3", "12", "21", "2", "Bajo", "http://example.com/video_33"));
        lista.add(new EjercicioDTO("Hombros", "5", "10", "49", "9", "Medio", "http://example.com/video_34"));
        lista.add(new EjercicioDTO("Hombros", "4", "14", "32", "3", "Alto", "http://example.com/video_35"));
        lista.add(new EjercicioDTO("Espalda", "4", "14", "31", "7", "Medio", "http://example.com/video_36"));
        lista.add(new EjercicioDTO("Hombros", "5", "14", "36", "3", "Bajo", "http://example.com/video_37"));
        lista.add(new EjercicioDTO("Hombros", "4", "9", "12", "1", "Bajo", "http://example.com/video_38"));
        lista.add(new EjercicioDTO("Espalda", "4", "13", "43", "7", "Bajo", "http://example.com/video_39"));
        lista.add(new EjercicioDTO("Espalda", "3", "10", "20", "3", "Alto", "http://example.com/video_40"));
        lista.add(new EjercicioDTO("Piernas", "5", "13", "12", "4", "Medio", "http://example.com/video_41"));
        lista.add(new EjercicioDTO("Hombros", "5", "15", "50", "3", "Alto", "http://example.com/video_42"));
        lista.add(new EjercicioDTO("Pecho", "4", "15", "13", "2", "Alto", "http://example.com/video_43"));
        lista.add(new EjercicioDTO("Piernas", "3", "14", "49", "4", "Alto", "http://example.com/video_44"));
        lista.add(new EjercicioDTO("Pecho", "4", "15", "26", "7", "Alto", "http://example.com/video_45"));
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
        lista.add(new EjercicioDTO("Hombros", "3", "10", "27", "7", "Alto", "http://example.com/video_66"));
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
        lista.add(new EjercicioDTO("Pecho", "3", "10", "19", "8", "Bajo", "http://example.com/video_78"));
        lista.add(new EjercicioDTO("Hombros", "4", "9", "46", "3", "Bajo", "http://example.com/video_79"));
        lista.add(new EjercicioDTO("Pecho", "3", "11", "16", "8", "Alto", "http://example.com/video_80"));
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
        lista.add(new EjercicioDTO("Piernas", "3", "8", "14", "8", "Alto", "http://example.com/video_94"));
        lista.add(new EjercicioDTO("Brazos", "5", "8", "20", "2", "Bajo", "http://example.com/video_95"));
        lista.add(new EjercicioDTO("Hombros", "5", "12", "16", "4", "Medio", "http://example.com/video_96"));
        lista.add(new EjercicioDTO("Espalda", "5", "14", "13", "9", "Bajo", "http://example.com/video_97"));
        lista.add(new EjercicioDTO("Hombros", "4", "9", "15", "9", "Alto", "http://example.com/video_98"));
        lista.add(new EjercicioDTO("Hombros", "4", "13", "49", "3", "Alto", "http://example.com/video_99"));
        lista.add(new EjercicioDTO("Piernas", "5", "15", "30", "8", "Alto", "http://example.com/video_100"));

        for (EjercicioDTO ej : lista) {
            ejController.agregarEjercicio(ej);
        }

    }

    @org.junit.jupiter.api.Test
    void crearRutina() {
        //Instancio el socio controller
        SocioController sController = SocioController.getInstance();

        //Registro al socio
        SocioRegisterDTO socioRegisterDTO = new SocioRegisterDTO("24", "Masculino", "178", "Fran", "Test123");
       sController.registrarSocio(socioRegisterDTO);

        //Loggeo al socio
        SocioLoginDTO socioLoginDTO = new SocioLoginDTO("Fran", "Test123");
        Socio socioLoggeado = sController.loggearSocio(socioLoginDTO);

        if (socioLoggeado != null) {
            //Le hago las mediciones
            sController.realizarMediciones(socioLoggeado.getNombreUsuario(), new Date());

            Medicion ultMedicion = DB.getUltimaMedicion(socioLoggeado.getNombreUsuario());

            //Le setteo el objetivo
            Objetivo obj = new TonificarCuerpo(ultMedicion.getMasaMuscular(), ultMedicion.getGrasaCorporal());
            sController.cambiarObjetivo(obj, socioLoggeado);

            //Muestro todos los entrenamientos y ejercicios de la rutina
            for (Entrenamiento entrenamiento : obj.getRutina().getEntrenamientos()) {
                System.out.println("Entrenamiento: ");
                for (Ejercicio ej : entrenamiento.getEjercicios()) {
                    System.out.println(ej.getURLvideo() + " - Nivel Aerobico: " + ej.getNivelAerobico() + " , Ejercitacion muscular: " + ej.getExigenciaMuscular());
                }
            }
        }

    }

    @org.junit.jupiter.api.Test
    void obtenerTrofeoCreido() {
        SocioController sController = SocioController.getInstance();
        SocioRegisterDTO socioRegisterDTO = new SocioRegisterDTO("24", "Masculino", "178", "Fran", "Test123");
        sController.registrarSocio(socioRegisterDTO);

        SocioLoginDTO socioLoginDTO = new SocioLoginDTO("Fran", "Test123");
        Socio socioLoggeado = sController.loggearSocio(socioLoginDTO);

        sController.cambiarObjetivo(new TonificarCuerpo(socioLoggeado.getMasaMuscular(), socioLoggeado.getGrasaCorporal()), socioLoggeado);

        sController.realizarMediciones(socioLoggeado.getNombreUsuario(), new Date(2024,8,10));
        sController.realizarMediciones(socioLoggeado.getNombreUsuario(), new Date(2024, 8, 20));
        sController.realizarMediciones(socioLoggeado.getNombreUsuario(), new Date(2024, 8, 25));

    }

    @org.junit.jupiter.api.Test
    void obtenerTrofeoConstancia(){
        EjercitacionController eController = EjercitacionController.getInstance();
        SocioController sController = SocioController.getInstance();
        SocioRegisterDTO socioRegisterDTO = new SocioRegisterDTO("24", "Masculino", "178", "Fran", "Test123");
        sController.registrarSocio(socioRegisterDTO);

        SocioLoginDTO socioLoginDTO = new SocioLoginDTO("Fran", "Test123");
        Socio socioLoggeado = sController.loggearSocio(socioLoginDTO);

        sController.cambiarObjetivo(new TonificarCuerpo(socioLoggeado.getMasaMuscular(), socioLoggeado.getGrasaCorporal()), socioLoggeado);

        sController.realizarMediciones(socioLoggeado.getNombreUsuario(), new Date());

        Medicion ultMedicion = DB.getUltimaMedicion(socioLoggeado.getNombreUsuario());


        Objetivo obj = new TonificarCuerpo(ultMedicion.getMasaMuscular(), ultMedicion.getGrasaCorporal());
        sController.cambiarObjetivo(obj, socioLoggeado);

        Rutina rutina = socioLoggeado.getObjetivo().getRutina();

        eController.iniciarRutina(rutina);
        System.out.println("Rutina: " + rutina.getEstadoRutina());

        for (Entrenamiento entrenamiento: rutina.getEntrenamientos()){
            eController.iniciarEntrenamiento(rutina, entrenamiento);
            eController.finalizarEntrenamiento(rutina, entrenamiento);
        }


        eController.finalizarRutina(rutina,socioLoggeado);


    }

    @org.junit.jupiter.api.Test
    void obtenerTrofeoDedicacion(){
        SocioController sController = SocioController.getInstance();
        SocioRegisterDTO socioRegisterDTO = new SocioRegisterDTO("24", "Masculino", "178", "Fran", "Test123");
        sController.registrarSocio(socioRegisterDTO);

        SocioLoginDTO socioLoginDTO = new SocioLoginDTO("Fran", "Test123");
        Socio socioLoggeado = sController.loggearSocio(socioLoginDTO);

        sController.realizarMediciones(socioLoggeado.getNombreUsuario(), new Date());
        BajarDePeso obj = new BajarDePeso(socioLoggeado);
        sController.cambiarObjetivo(obj, socioLoggeado);

        System.out.println("Peso Inicial: " + socioLoggeado.getPeso());
        System.out.println("Peso Ideal: " + obj.getPesoIdeal());

        while (obj.getPesoIdeal() < socioLoggeado.getPeso()) {
            sController.realizarMediciones(socioLoggeado.getNombreUsuario(), new Date());
            System.out.println("Peso Actual: " + socioLoggeado.getPeso());
        }

    }

    @org.junit.jupiter.api.Test
    void cambiarObjetivo(){
        SocioController sController = SocioController.getInstance();
        SocioRegisterDTO socioRegisterDTO = new SocioRegisterDTO("24", "Masculino", "178", "Fran", "Test123");
        sController.registrarSocio(socioRegisterDTO);

        SocioLoginDTO socioLoginDTO = new SocioLoginDTO("Fran", "Test123");
        Socio socioLoggeado = sController.loggearSocio(socioLoginDTO);

        Objetivo obj = new TonificarCuerpo(socioLoggeado.getMasaMuscular(), socioLoggeado.getGrasaCorporal());
                sController.cambiarObjetivo(obj, socioLoggeado);

            System.out.println("Rutina 1");
        System.out.println("Obj1: " + obj);


        obj = new BajarDePeso(socioLoggeado);
        sController.cambiarObjetivo(obj, socioLoggeado);

        System.out.println("Rutina 2");
        System.out.println("Obj2: " + obj);

    }

    @org.junit.jupiter.api.Test
    void reforzarRutina(){
        SocioController sController = SocioController.getInstance();
        EjercitacionController eController = EjercitacionController.getInstance();
        SocioRegisterDTO socioRegisterDTO = new SocioRegisterDTO("24", "Masculino", "178", "Fran", "Test123");
        sController.registrarSocio(socioRegisterDTO);

        SocioLoginDTO socioLoginDTO = new SocioLoginDTO("Fran", "Test123");
        Socio socioLoggeado = sController.loggearSocio(socioLoginDTO);

        sController.realizarMediciones(socioLoggeado.getNombreUsuario(), new Date());

        Medicion ultMedicion = DB.getUltimaMedicion(socioLoggeado.getNombreUsuario());


        Objetivo obj = new TonificarCuerpo(ultMedicion.getMasaMuscular(), ultMedicion.getGrasaCorporal());
        sController.cambiarObjetivo(obj, socioLoggeado);

        Rutina rutina = socioLoggeado.getObjetivo().getRutina();

        eController.iniciarRutina(rutina);
        System.out.println("Rutina: " + rutina.getEstadoRutina());

        Entrenamiento primerEntrenamiento = rutina.getEntrenamientos().getFirst();
        eController.iniciarEntrenamiento(rutina, primerEntrenamiento);
        System.out.println("Entrenamiento: " + primerEntrenamiento.getEstadoEntrenamiento());

        Ejercicio primerEjercicio = primerEntrenamiento.getEjercicios().getFirst();
        System.out.println("Ejercicio Inicial: Series: " +primerEjercicio.getSeries()+ ", Reps: " +primerEjercicio.getRepeticiones() + ", Peso: " + primerEjercicio.getPesoAsignado());
        Refuerzo ejercicioReforzado = new Refuerzo(20, 15, 100, primerEjercicio.getMusculo(), primerEjercicio.getNivelAerobico(), primerEjercicio.getExigenciaMuscular(), primerEjercicio.getURLvideo());
        System.out.println("Ejercicio Reforzado: Series: " + ejercicioReforzado.getSeries() + ", Repeticiones: " + ejercicioReforzado.getRepeticiones() + ", Peso: " + ejercicioReforzado.getPeso() );
    }

    @org.junit.jupiter.api.Test
    void registroEjercicios(){
        SocioController sController = SocioController.getInstance();
        EjercitacionController eController = EjercitacionController.getInstance();
        SocioRegisterDTO socioRegisterDTO = new SocioRegisterDTO("24", "Masculino", "178", "Fran", "Test123");
        sController.registrarSocio(socioRegisterDTO);

        SocioLoginDTO socioLoginDTO = new SocioLoginDTO("Fran", "Test123");
        Socio socioLoggeado = sController.loggearSocio(socioLoginDTO);

        sController.realizarMediciones(socioLoggeado.getNombreUsuario(), new Date());

        Medicion ultMedicion = DB.getUltimaMedicion(socioLoggeado.getNombreUsuario());


        Objetivo obj = new TonificarCuerpo(ultMedicion.getMasaMuscular(), ultMedicion.getGrasaCorporal());
        sController.cambiarObjetivo(obj, socioLoggeado);

        Rutina rutina = socioLoggeado.getObjetivo().getRutina();

        eController.iniciarRutina(rutina);
        System.out.println("Rutina: " + rutina.getEstadoRutina());

        Entrenamiento primerEntrenamiento = rutina.getEntrenamientos().getFirst();
        eController.iniciarEntrenamiento(rutina, primerEntrenamiento);
        System.out.println("Entrenamiento: " + primerEntrenamiento.getEstadoEntrenamiento());

        Ejercicio primerEjercicio = primerEntrenamiento.getEjercicios().getFirst();
        eController.registrarEjercicio(primerEjercicio, primerEntrenamiento, socioLoggeado, 4, 12, 10);
        System.out.println("Ejercicio: " + DB.ejerciciosCompletados.getFirst().getEjercicio().getURLvideo());
    }


}