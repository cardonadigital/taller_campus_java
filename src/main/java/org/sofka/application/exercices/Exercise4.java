package org.sofka.application.exercices;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Scanner;

public class Exercise4 {
    private static final Log log = LogFactory.getLog(Exercise1and2.class);
    private static final Scanner scanner = new Scanner(System.in);

    public Exercise4() {
        message();
        exercise();
    }

    private void message() {
        String str = """
                Lee un número por teclado que pida el precio de un producto (puede tener decimales)
                y calcule el precio final con IVA. El IVA sera una constante que sera del 21%.
                """;
        log.info(str);

    }

    private void exercise() {
        log.info("Ingresa el valor del producto al cual se le añadira el 21% del iva");
        Double price = scanner.nextDouble();

        Double iva = price * 0.21;
        Double completePrice = iva+price;

        log.info("el precio del producto con iva es: " + completePrice);
    }
}
