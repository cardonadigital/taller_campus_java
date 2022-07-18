package org.sofka.application.exercices.exercise17.models;

public class Lavadora extends Electrodomestico{
    private Integer carga = 5;

    public Lavadora() {
        super();
    }

    public Lavadora(Integer precioBase, Integer peso) {
        super(precioBase, peso);
    }

    public Lavadora(Integer carga) {
        super();
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public Integer precioFinal(){
        if (this.carga > 30){
            return super.precioFinal()+50;
        }else{
            return super.precioFinal();
        }
    }
}
