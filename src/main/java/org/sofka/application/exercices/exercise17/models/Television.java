package org.sofka.application.exercices.exercise17.models;

public class Television extends Electrodomestico{
    private Integer resolucion = 20;
    private Boolean sintonizador = false;

    public Television() {
        super();
    }

    public Television(Integer precioBase, Integer peso) {
        super(precioBase, peso);
    }

    public Television(Integer resolucion, Boolean sintonizador) {
        super();
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public Boolean getSintonizador() {
        return sintonizador;
    }

    public Integer precioFinal(){
        Integer valor = super.precioFinal();
        Integer porcentaje = (valor * valor) / (100);
        if (resolucion > 40){
            if (sintonizador){
                return valor + porcentaje + 50;
            }return valor + porcentaje;
        } else if (sintonizador){
            return valor + 50;
        } else {
            return valor;
        }
    }
}
