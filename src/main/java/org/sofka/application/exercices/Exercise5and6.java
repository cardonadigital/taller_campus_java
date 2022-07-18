package org.sofka.application.exercices;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Scanner;

public class Exercise5and6 {
    private static final Log log = LogFactory.getLog(Exercise5and6.class);
    private static final Scanner scanner = new Scanner(System.in);

    public Exercise5and6() {
        message();
        exercise();
    }

    private void message() {
        String str = """
                Muestra los números impares y pares del 1 al 100 (ambos incluidos). Usa un bucle while.
                Realiza el ejercicio anterior usando un ciclo for.
                """;
        log.info(str);

    }

    private void exercise() {
        log.info("cliclo while:");
        int number = 0;
        while (number >= 100){
            number += 1;
            if (number % 2 == 0){
                log.info(number + " es par");
            } log.info(number + " es impar");
        }

        log.info("cliclo for:");
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0){
                log.info(i + " es par");
            } log.info(i + " es impar");
        }
    }
}
