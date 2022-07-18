package org.sofka.application.exercices;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Scanner;

public class Exercise9and10 {
    private static final Log log = LogFactory.getLog(Exercise9and10.class);
    private static final Scanner scanner = new Scanner(System.in);

    public Exercise9and10() {
        message();
        exercise();
    }

    private void message() {
        String str = """
                Del texto, “La sonrisa sera la mejor arma contra la tristeza” Reemplaza
                todas las a del String anterior por una e, adicionalmente concatenar a
                esta frase una adicional que ustedes quieran incluir por consola y las muestre luego unidas.
                
                Realizar una aplicación de consola, que al ingresar una frase por teclado elimine los espacios que esta contenga.
                """;
        log.info(str);

    }

    private void exercise() {
        String phrase = "La sonrisa sera la mejor arma contra la tristeza ";
        String replacedPhrase = phrase.replace("a", "e");
        log.info("introduzca una frase");
        String yourPhrase = scanner.nextLine();
        String yourPhraseReplaced = yourPhrase.replace(" ", "");
        log.info(replacedPhrase.concat(yourPhraseReplaced));
    }
}
