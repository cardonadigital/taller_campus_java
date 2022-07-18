package org.sofka.application.exercices;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Scanner;

public class Exercise15 {
    private static final Log log = LogFactory.getLog(Exercise15.class);
    private static final Scanner scanner = new Scanner(System.in);
    private Boolean exit = false;

    public Exercise15() {
        exercise();
    }

    private void exercise() {
        do {
            options();
        } while (!exit);
    }

    private void options() {
        message();
        menu();
        Integer option = scanner.nextInt();
        switch (option) {
            case 1 -> exercise();
            case 2 -> exercise();
            case 3 -> exercise();
            case 4 -> exercise();
            case 5 -> exercise();
            case 6 -> exercise();
            case 7 -> exercise();
            case 8 -> {
                log.info("has salido del programa");
                exit = true;
            }
            default -> {
                log.info("OPCION INCORRECTA");
                options();
            }
        }
    }

    private void message() {
        String str = """          
                EL SISTEMA SOLO VA A SALIR CUANDO SE DIGITE EL NUMERO 8, MIENTRAS SE DIGITE UNA
                DE LAS CINCO OPCIONES DEBE SEGUIR MOSTRADO EL MENU Y SI EL USUARIO DIGITA UN NUMERO
                QUE NO ESTA EN EL MENU SE DEBE ARROJAR UN MENSAJE " OPCION INCORRECTO". Y MOSTRAR EL MENU NUEVAMENTE.
                PISTA: CONVINAR SWICHT Y ALGUNO DE LOS BUCLES.
                """;
        log.info(str);

    }

    private void menu() {
        log.info("""
                ---------------------------
                1-NUEVO ACTOR
                2-BUSCAR ACTOR
                3-ELIMINAR ACTOR
                4-MODIFICAR ACTOR
                5-VER TODOS LOS ACTORES
                6- VER PELICULAS DE LOS ACTORES               
                7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES
                8-SALIR
                """);
    }
}
