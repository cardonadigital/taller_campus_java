package org.sofka.application.exercices.exercise18.models;

import org.sofka.application.exercices.exercise18.models.interfaces.Entregable;

public class Serie implements Entregable {
    private String titulo = "madagascar";
    private Integer numeroTemporadas = 3;
    private Boolean entregado = false;
    private String genero = "infantil";
    private String creador = "pepe";

    public Serie() {
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(String titulo, Integer numeroTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumeroTemporadas(Integer numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return """
                titulo : %s
                numero temporada: %s
                entregado: %s
                genero: %s
                creador: %s
                """.formatted(titulo, numeroTemporadas, entregado, genero, creador);
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
    public Serie compareTo(Object a) {
        Serie serie;
        if (this.numeroTemporadas < ((Serie) a).getNumeroTemporadas()) {
            serie = (Serie) a;
        } else {
            serie = this;
        }
        return serie;
    }
}
