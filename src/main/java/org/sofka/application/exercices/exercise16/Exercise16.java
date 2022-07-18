package org.sofka.application.exercices.exercise16;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.sofka.application.exercices.Exercise1and2;

import java.util.Locale;
import java.util.Scanner;

public class Exercise16 {
    private static final Log log = LogFactory.getLog(Exercise16.class);
    Scanner scanner = new Scanner(System.in).useLocale(Locale.UK);

    public Exercise16() {
        message();
        exercise();
    }

    private void message() {
        String str = """
                Haz una clase llamada Persona que siga las siguientes condiciones:               
                Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer), peso 
                y altura. 
                                
                No queremos que se accedan directamente a ellos. Piensa que
                modificador de acceso es el más adecuado, también su tipo. Si quieres a
                ñadir algún atributo puedes hacerlo.               
                                
                Por defecto, todos los atributos menos el DNI serán valores por defecto 
                según su tipo (0 números, cadena vacía para String, etc.). Sexo será hombre 
                por defecto, usa una constante para ello.
                """;
        log.info(str);

    }

    private void exercise() {
        menu();
    }

    private void menu() {
        log.info("Ingrese un nombre");
        String nombre = scanner.nextLine();
        log.info("Ingrese la edad");
        Integer edad = scanner.nextInt();
        scanner.nextLine();
        log.info("Ingrese un sexo(femenino)(masculino)");
        String sexo = scanner.nextLine();
        log.info("Ingrese la peso (con decimales)");
        Double peso = scanner.nextDouble();
        log.info("Ingrese la altura (con decimales)");
        Double altura = scanner.nextDouble();

        persona1(nombre, edad, sexo, peso, altura);
        persona2(nombre, edad, sexo);
        persona3();


    }

    private void persona1(String nombre, Integer edad, String sexo, Double peso, Double altura) {
        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
        comprobarPeso(persona1.calcularIMC());
        comprobarEdad(persona1.esMayorDeEdad());
        log.info(persona1.toString());
    }

    private void persona2(String nombre, Integer edad, String sexo) {
        Persona persona2 = new Persona(nombre, edad, sexo);
        persona2.setPeso(65.5);
        persona2.setAltura(1.75);
        comprobarPeso(persona2.calcularIMC());
        comprobarEdad(persona2.esMayorDeEdad());
        log.info(persona2.toString());
    }

    private void persona3() {
        Persona persona3 = new Persona();
        persona3.setNombre("Maria Camila Gonzales Zapata");
        persona3.setEdad(23);
        persona3.setSexo("M");
        persona3.setPeso(62.0);
        persona3.setAltura(1.65);
        comprobarPeso(persona3.calcularIMC());
        comprobarEdad(persona3.esMayorDeEdad());
        log.info(persona3.toString());
    }

    private void comprobarPeso(Integer imc) {
        if (imc.equals(-1)) {
            log.info("bajo de peso");
        } else if (imc.equals(0)) {
            log.info("peso normal");
        } else if (imc.equals(1)){
            log.info("sobrepeso");
        }

    }

    private void comprobarEdad(Boolean edad) {
        if (Boolean.TRUE.equals(edad)) {
            log.info("es mayor de edad");
        }else {
            log.info("es menor de edad");
        }
    }
}
