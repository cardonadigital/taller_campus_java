package org.sofka.application.exercices;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercise13 {
    private static final Log log = LogFactory.getLog(Exercise13.class);
    private static final Scanner scanner = new Scanner(System.in);
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    public Exercise13(){
        message();
        exercise();
    }
    private void message() {
        String str = """
                Realizar un algoritmo que permita consulta la fecha
                y hora actual en el formato (AAAA/MM/DD) (HH:MM:SS)
                """;
        log.info(str);

    }

    private void exercise() {
        LocalDateTime now = LocalDateTime.now();
        log.info("fecha y hora: " + dtf.format(now));
    }
}
