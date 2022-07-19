package org.sofka.application.exercices.exercise18;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.sofka.application.exercices.exercise18.models.Serie;
import org.sofka.application.exercices.exercise18.models.Videojuego;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    private static final Log log = LogFactory.getLog(Manager.class);
    private static Integer totalEntregados = 0;
    private static List<Serie> series = new ArrayList<>();
    static List<Videojuego> videojuegos = new ArrayList<>();
    /*List<Object> entregados = new ArrayList<>();*/

    public Manager() {
        ingresarObjetos();
        entregar();
        devolver();
        maximoValor();
    }

    private void ingresarObjetos(){
        series.add(new Serie());
        series.add(new Serie("Stranger things", "hermanos duffer"));
        series.add(new Serie());
        series.add(new Serie("Punisher", 20, "accion", "Gerry Conway"));
        series.add(new Serie("Piratas del caribe", "Jerry Bruckheimer"));

        videojuegos.add(new Videojuego());
        videojuegos.add(new Videojuego("Assasins creed", 20));
        videojuegos.add(new Videojuego("Halo 5", 34));
        videojuegos.add(new Videojuego("Warcraft3", 23, "rpg", "blizzard"));
        videojuegos.add(new Videojuego("League of legends", 23, "moba", "riot"));
    }

    private void entregar(){
        series.get(1).entregar();
        series.get(2).entregar();
        videojuegos.get(0).entregar();
    }

    private static void devolver(){
        for (Serie serie : series) {
            if (serie.isEntregado()) {
                totalEntregados += 1;
                serie.devolver();
            }
        }
        series.get(1).devolver();
        series.get(2).devolver();
        videojuegos.get(0).devolver();
    }

    private void maximoValor(){
        var serie = series.stream().reduce(Serie::compareTo).get();
        var videojuego = videojuegos.stream().reduce(Videojuego::compareTo).get();
        log.info(serie.toString() + "\n" + videojuego.toString());
    }

}
