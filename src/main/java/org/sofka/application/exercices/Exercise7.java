package org.sofka.application.exercices;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Scanner;

public class Exercise7 {
    private static final Log log = LogFactory.getLog(Exercise8.class);
    private static final Scanner scanner = new Scanner(System.in);

    public Exercise7() {
        message();
        exercise();
    }

    private void message() {
        String str = """
                Lee un número por teclado y comprueba
                que este numero es mayor o igual que cero,
                si no lo es lo volverá a pedir (do while),
                después muestra ese número por consola.
                """;
        log.info(str);

    }

    private void exercise() {
        Integer number;
        do {
            number = scanner.nextInt();
            log.info("su numero es: " + number);
        } while (number <= 0 );

    }
}
