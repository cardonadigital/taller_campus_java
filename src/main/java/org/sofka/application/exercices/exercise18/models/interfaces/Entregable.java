package org.sofka.application.exercices.exercise18.models.interfaces;

import org.sofka.application.exercices.exercise18.models.Serie;

public interface Entregable {
    void entregar();
    void devolver();
    Boolean isEntregado();
    Object compareTo(Object a);
}
