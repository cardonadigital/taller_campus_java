package org.sofka.application.exercices;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.util.Scanner;

public class Exercise1and2 {
    private static final Log log = LogFactory.getLog(Exercise1and2.class);
    private static final Scanner scanner = new Scanner(System.in);

    public Exercise1and2() {
        message();
        exercise();
    }

    private void message() {
        String str = """
                Declara 2 variables numéricas (con el valor que desees),
                he indica cual es mayor de los dos. Si son iguales indicarlo
                también. Ve cambiando los valores para comprobar que funciona.
                
                Al ejercicio anterior agregar entrada por consola de dos valores 
                e indicar si son mayores, menores o iguales.
                """;
        log.info(str);

    }

    private void exercise() {
        log.info("ingresa 2 numeros, el programa te dira si el numero primer numero que ingresaste" +
                " es mayor igual o menor al segundo numero");
        Integer number1 = scanner.nextInt();
        Integer number2 = scanner.nextInt();
        if (number1 > number2) {
            log.info("el numero " + number1 + " es mayor que el numero " + number2);
        } else if (number1 < number2){
            log.info("el numero " + number1 + " es menor que el numero " + number2 );
        } else {
            log.info("son iguales");
        }

    }

}

