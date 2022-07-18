package org.sofka.application.exercices.exercise16;

import java.util.Random;

public class Persona {
    StringBuilder str = new StringBuilder();
    Random rand = new Random();
    private String nombre = "Daniel David Cardona";
    private Integer edad ;
    private String dni = "sajsjdds";
    private String sexo = "H";
    private Double peso;
    private Double altura;


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Persona() {
        generaDNI();
    }

    public Persona(String nombre, Integer edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        generaDNI();
        comprobarSexo(sexo);
    }

    public Persona(String nombre, Integer edad, String sexo, Double peso, Double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        generaDNI();
        comprobarSexo(sexo);
    }

    public Integer calcularIMC(){
        final Integer pesoBajo = -1;
        final Integer pesoIdeal = 0;
        final Integer sobrePeso = 1;
        Double imc = this.peso/(Math.pow(this.altura, 2));
        if (imc < 20){
            return pesoBajo;
        } else if (imc >20 && imc < 25){
            return pesoIdeal;
        } return sobrePeso;
    }

    public boolean esMayorDeEdad(){
        return this.edad >= 18;
    }

    public void comprobarSexo(String sexo) {
        String genero = "H";
        if (sexo.equals("femenino")) {
            genero = "M";
        } else if (sexo.equals("masculino")) {
            genero = "H";
        } setSexo(genero);
    }

    public String toString(){
        return  "" +
                "Nombre: " + this.nombre + "\n" +
                "Edad: " + this.edad + "\n" +
                "DNI: " + this.dni + "\n" +
                "Sexo: " + this.sexo + "\n" +
                "Peso: " + this.peso + "\n" +
                "Altura: " + this.altura + "\n";
    }

    public void generaDNI(){
        String alphabet = "abcdefghijklmnopqrsuvwxyz";
        StringBuilder letras = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            Integer random = rand.nextInt(alphabet.length());
            String letra = String.valueOf(alphabet.charAt(random));
            letras.append(letra);
        }this.dni = String.valueOf(letras);
    }
}
