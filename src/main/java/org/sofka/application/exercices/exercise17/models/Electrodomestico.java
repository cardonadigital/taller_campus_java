package org.sofka.application.exercices.exercise17.models;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Electrodomestico {
    private Integer precioBase = 100;
    private String color = "blanco";
    private String consumoEnergetico = "f";
    private Integer peso = 5;

    public Electrodomestico() {

    }

    public Electrodomestico(Integer precioBase, Integer peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomestico(Integer precioBase, String color, String consumoEnergetico, Integer peso) {
        this.precioBase = precioBase;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public Integer getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public Integer getPeso() {
        return peso;
    }

    private void comprobarConsumoEnergetico(String letra){
        List<String> letrasDsiponibles = Arrays.asList("a","b","c", "d", "e", "f");
        if (letrasDsiponibles.contains(letra)){
            this.consumoEnergetico = letra;
        }
    }

    private void comprobarColor(String color){
        List<String> coloresDisponibles = Arrays.asList("blanco","negro","rojo", "azul", "gris");
        if (coloresDisponibles.contains(color)){
            this.color = color;
        }
    }

    public Integer precioFinal(){
        var consumo = getConsumoEnergetico();
        var peso = getPeso();
        Map<String, Integer> letraPrecio = Map.of(
                "a", 100,
                "b", 80,
                "c", 60,
                "d", 50,
                "e", 30,
                "f", 10
        );
        return letraPrecio.get(consumo) + comprobarValor(peso) + precioBase;
    }

    private static Integer comprobarValor(Integer valor){
        if (valor < 19){
            return 10;
        }else if (valor >20 && valor < 49){
            return 50;
        }else if (valor >50 && valor < 79){
            return 80;
        }else {
            return 100;
        }
    }


}
