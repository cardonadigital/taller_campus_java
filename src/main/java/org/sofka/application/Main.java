package org.sofka.application;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.sofka.application.exercices.Exercise11;
import org.sofka.application.exercices.Exercise12;
import org.sofka.application.exercices.Exercise13;
import org.sofka.application.exercices.Exercise14;
import org.sofka.application.exercices.Exercise15;
import org.sofka.application.exercices.Exercise1and2;
import org.sofka.application.exercices.Exercise3;
import org.sofka.application.exercices.Exercise4;
import org.sofka.application.exercices.Exercise5and6;
import org.sofka.application.exercices.Exercise7;
import org.sofka.application.exercices.Exercise8;
import org.sofka.application.exercices.Exercise9and10;
import org.sofka.application.exercices.exercise16.Exercise16;
import org.sofka.application.exercices.exercise17.Exercise17;
import org.sofka.application.exercices.exercise18.Exercise18;

import java.util.Scanner;

public class Main {
    private static final Log log = LogFactory.getLog(Main.class);
    private static final Scanner scanner = new Scanner(System.in);
    private static Boolean exit = false;

    public static void main(String[] args) {
        do {
            menu();
        }while (!exit);
    }

    private static void menu(){
        log.info("""
                Ingresa el numero del ejercicio que quieras ejecutar
                
                1-2. Ingresar al ejericio 1-2
                3.   Ingresar al ejericio 3
                4.   Ingresar al ejericio 4
                5-6. Ingresar al ejericio 5-6
                7.   Ingresar al ejericio 7
                8.   Ingresar al ejericio 8
                9-10.Ingresar al ejericio 9-10
                11.  Ingresar al ejericio 11
                12.  Ingresar al ejericio 12
                13.  Ingresar al ejericio 13
                14.  Ingresar al ejericio 14
                15.  Ingresar al ejericio 15
                16.  Ingresar al ejericio 16
                17.  Ingresar al ejericio 17
                18.  Ingresar al ejericio 18
                19.salir
                """);

        Integer option = scanner.nextInt();
        option(option);
    }

    private static void option(Integer option){
        switch (option){
            case 1, 2:
                new Exercise1and2();
                break;
            case 3:
                new Exercise3();
                break;
            case 4:
                new Exercise4();
                break;
            case 5, 6:
                new Exercise5and6();
                break;
            case 7:
                new Exercise7();
                break;
            case 8:
                new Exercise8();
                break;
            case 9, 10:
                new Exercise9and10();
                break;
            case 11:
                new Exercise11();
                break;
            case 12:
                new Exercise12();
                break;
            case 13:
                new Exercise13();
                break;
            case 14:
                new Exercise14();
                break;
            case 15:
                new Exercise15();
                break;
            case 16:
                new Exercise16();
                break;
            case 17:
                new Exercise17();
                break;
            case 18:
                new Exercise18();
                break;
            case 19:
                exit = true;
                break;
        }
    }

}
