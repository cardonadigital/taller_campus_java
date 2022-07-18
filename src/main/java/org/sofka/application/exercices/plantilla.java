package org.sofka.application.exercices;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Scanner;

public class plantilla {
    private static final Log log = LogFactory.getLog(Exercise1and2.class);
    private static final Scanner scanner = new Scanner(System.in);
    private void message() {
        String str = """
                Declara 2 variables numéricas (con el valor que desees),
                he indica cual es mayor de los dos. Si son iguales indicarlo
                también. Ve cambiando los valores para comprobar que funciona.
                """;
        log.info(str);

    }

    private void exercise() {
        log.info("ingresa 2 numeros, el programa te dira si el numero 1 es mayor igual o menor al numero 2");

    }
}
