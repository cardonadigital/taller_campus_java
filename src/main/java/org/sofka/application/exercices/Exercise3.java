package org.sofka.application.exercices;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Scanner;

public class Exercise3 {
    private static final Log log = LogFactory.getLog(Exercise3.class);
    private static final Scanner scanner = new Scanner(System.in);

    public Exercise3() {
        message();
        exercise();
    }

    private void message() {
        String str = """
                Haz una aplicación que calcule el área de un círculo(pi*R2).
                El radio se pedirá por teclado (recuerda pasar de String a
                double con Double.parseDouble). Usa la constante PI y el método pow de Math.
                """;
        log.info(str);
    }

    private void exercise() {
        log.info("ingresa el radio del circulo");

        Double radio = scanner.nextDouble();
        Double area = 3.1416 * Math.pow(radio,2);
        log.info("el area es: " + area);

    }
}
