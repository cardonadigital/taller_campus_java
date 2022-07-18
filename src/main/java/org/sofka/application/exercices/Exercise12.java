package org.sofka.application.exercices;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Scanner;

public class Exercise12 {
    private static final Log log = LogFactory.getLog(Exercise12.class);
    private static final Scanner scanner = new Scanner(System.in);
    StringBuilder differences = new StringBuilder();
    StringBuilder matches = new StringBuilder();

    public Exercise12() {
        message();
        exercise();
    }

    private void message() {
        String str = """
                Pedir dos palabras por teclado, indicar si son iguales, sino son iguales mostrar sus diferencias.
                Se hace comparación con las letras de la primera palabra, recomendado que tenga la misma cantidad de caracters.
                """;
        log.info(str);

    }

    private void exercise() {
        String phrase1 = scanner.nextLine();
        String phrase2 = scanner.nextLine();
        if (phrase1.equals(phrase2) && phrase1.length() == phrase2.length()){
            log.info("son iguales");
        }else {
            addDifferences(phrase1, phrase2);
        }

        log.info("letras diferentes:" + differences);
    }

    private void addDifferences(String phrase1, String phrase2){
        for (int i = 0; i < phrase1.length(); i++) {
            if (i == phrase2.length()) {
                break;
            } else {
                String vowelPhrase1 = String.valueOf(phrase1.charAt(i));
                String vowelPhrase2 = String.valueOf(phrase2.charAt(i));
                if (!vowelPhrase1.equals(vowelPhrase2)) {
                    differences.append(vowelPhrase2);
                }
            }

        }
    }
}
