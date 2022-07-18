package org.sofka.application.exercices;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Scanner;

public class Exercise14 {
    private static final Log log = LogFactory.getLog(Exercise14.class);
    private static final Scanner scanner = new Scanner(System.in);

    public Exercise14(){
        message();
        exercise();
    }

    private void message() {
        String str = """
                Crear un programa que pida un numero por teclado
                y que imprima por pantalla los números desde el numero
                introducido hasta 1000 con saldos de 2 en 2.
                """;
        log.info(str);

    }

    private void exercise() {
        Integer number = scanner.nextInt();
        for (int i = number; i <= 1000; i+=2) {
            log.info(i);
        }

    }
}
