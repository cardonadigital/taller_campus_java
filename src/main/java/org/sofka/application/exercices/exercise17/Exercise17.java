package org.sofka.application.exercices.exercise17;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Scanner;

public class Exercise17 {
    private static final Log log = LogFactory.getLog(Exercise17.class);
    private static final Scanner scanner = new Scanner(System.in);

    public Exercise17() {
        message();
        exercise();
    }

    private void message() {
        String str = """
                Crearemos una superclase llamada Electrodoméstico con las siguientes características:
                Sus atributos son precio base, color, consumo energético (letras entre A y F) y peso. Indican que se podrán heredar.
                Por defecto, el color será blanco, el consumo energético será F, el precioBase es de 100 € y el peso de 5 kg. Usa constantes para ello.
                Los colores disponibles son blancos, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en minúsculas.
                Los constructores que se implementarán serán:
                                
                    *Un constructor por defecto.
                    *Un constructor con el precio y peso. El resto por defecto.
                    *Un constructor con todos los atributos.
                """;
        log.info(str);

    }

    private void exercise() {
        new Manager();
    }
}
