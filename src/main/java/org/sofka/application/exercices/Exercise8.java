package org.sofka.application.exercices;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Scanner;

public class Exercise8 {
    private static final Log log = LogFactory.getLog(Exercise1and2.class);
    private static final Scanner scanner = new Scanner(System.in);

    public Exercise8() {
        message();
        exercise();
    }

    private void message() {
        String str = """
                Crea una aplicación por consola que nos pida un día 
                de la semana y que nos diga si es un día laboral o no. 
                Usa un switch para ello.
                """;
        log.info(str);

    }

    private void exercise() {
        String day = scanner.nextLine();
        String workDay = "es día laboral";
        String restDay = "es día de descanso";
        switch (day) {
            case "lunes" -> log.info("el día lunes " + workDay);
            case "martes" -> log.info("el día martes " + workDay);
            case "miercoles" -> log.info("el día miercoles " + workDay);
            case "jueves" -> log.info("el día jueves " + workDay);
            case "viernes" -> log.info("el día viernes " + workDay);
            case "sabado" -> log.info("el día sabado " + restDay);
            case "somingo" -> log.info("el día domingo " + restDay);
            default -> log.warn("ingrese un día de la semana valido");
        }

    }

}
