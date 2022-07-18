package org.sofka.application.exercices.exercise18;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.sofka.application.exercices.Exercise1and2;

import java.util.Scanner;

public class Exercise18 {
    private static final Log log = LogFactory.getLog(Exercise1and2.class);
    private static final Scanner scanner = new Scanner(System.in);

    public Exercise18() {
        message();
        exercise();
    }

    private void message() {
        String str = """
                Crear una clase llamada Serie con las siguientes características:
                Sus atributos son título, numero de temporadas, entregado, género y creador.
                                
                Crearemos una clase Videojuego con las siguientes características:             
                Sus atributos son titulo, horas estimadas, entregado, genero y compañia.
                         
                """;
        log.info(str);

    }

    private void exercise() {
        log.info("ingresa 2 numeros, el programa te dira si el numero 1 es mayor igual o menor al numero 2");

    }
}
