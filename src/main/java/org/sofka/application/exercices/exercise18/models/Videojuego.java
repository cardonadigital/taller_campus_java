package org.sofka.application.exercices.exercise18.models;

import org.sofka.application.exercices.exercise18.models.interfaces.Entregable;

public class Videojuego implements Entregable {
    private String titulo = "God of war";
    private Integer horasEstimadas = 10;
    private Boolean entregado = false;
    private String genero = "accion";
    private String compañia = "Santa monica";

    public Videojuego() {
    }

    public Videojuego(String titulo, Integer horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    public Videojuego(String titulo, Integer horasEstimadas, String genero, String compañia) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compañia = compañia;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getHorasEstimadas() {
        return horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setHorasEstimadas(Integer horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    @Override
    public String toString() {
        return """
                titulo : %s
                horas estimadas: %s
                entregado: %s
                genero: %s
                compañia: %s
                """.formatted(titulo, horasEstimadas, entregado, genero, compañia);
    }

    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public Boolean isEntregado() {
        return this.entregado = false;
    }

    @Override
    public Videojuego compareTo(Object a) {
       Videojuego videojuego;
        if (this.horasEstimadas < ((Videojuego) a).getHorasEstimadas()) {
            videojuego = (Videojuego) a;
        } else {
            videojuego = this;
        }
        return videojuego;
    }
}
