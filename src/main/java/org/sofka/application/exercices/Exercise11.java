package org.sofka.application.exercices;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Scanner;

public class Exercise11 {
    private static final Log log = LogFactory.getLog(Exercise11.class);
    private static final Scanner scanner = new Scanner(System.in);
    Integer vowelA = 0;
    Integer vowelE = 0;
    Integer vowelI = 0;
    Integer vowelO = 0;
    Integer vowelU = 0;

    public Exercise11() {
        message();
        exercise();
    }

    private void message() {
        String str = """
                Realizar la construcción de un algoritmo que permita de acuerdo
                a una frase pasada por consola, indicar cual es la longitud de
                esta frase, adicionalmente cuantas vocales tiene de “a,e,i,o,u”.
                """;
        log.info(str);

    }

    private void exercise() {
        String phrase = scanner.nextLine();
        for (int i = 0; i < phrase.length(); i++) {
            String vowel = String.valueOf(phrase.charAt(i));
            switch (vowel) {
                case "a" -> this.vowelA++;
                case "e" -> this.vowelE++;
                case "i" -> this.vowelI++;
                case "o" -> this.vowelO++;
                case "u" -> this.vowelU++;
            }
        }

        log.info("""
                La frase que introdujo tienes una longitud de: %s
                Vocales a cantidad: %s
                Vocales e cantidad: %s
                Vocales i cantidad: %s
                Vocales o cantidad: %s
                Vocales u cantidad: %s
                """.formatted(phrase.length(), vowelA, vowelE, vowelI, vowelO, vowelU));

    }
}
