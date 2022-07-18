package org.sofka.application.exercices.exercise17;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.sofka.application.Main;
import org.sofka.application.exercices.exercise17.models.Electrodomestico;
import org.sofka.application.exercices.exercise17.models.Lavadora;
import org.sofka.application.exercices.exercise17.models.Television;

public class Manager {
    private static final Log log = LogFactory.getLog(Main.class);
    private Integer totalTelevisores = 0;
    private Integer totalLavadoras = 0;
    private Integer totalElectrodomesticos= 0;
    Electrodomestico electrodomestico1 = new Electrodomestico();
    Electrodomestico electrodomestico2 = new Electrodomestico(200, 20);
    Electrodomestico electrodomestico3 = new Electrodomestico(300, "negro", "f", 15);
    Lavadora lavadora1 = new Lavadora();
    Lavadora lavadora2 = new Lavadora(400, 40);
    Lavadora lavadora3 = new Lavadora(50);
    Television television1 = new Television();
    Television television2 = new Television(200, 12);
    Television television3 = new Television(32, true);
    Television television4 = new Television(50, false);

    public Manager() {
        crearListaObjetos();
    }

    private void crearListaObjetos(){
        Electrodomestico[] electrodomesticos = {
                electrodomestico1, electrodomestico2, electrodomestico3,
                lavadora1, lavadora2, lavadora3, television1, television2, television3, television4
        };

        for (Electrodomestico electrodomestico: electrodomesticos){
            var precio = electrodomestico.precioFinal();

            if (electrodomestico instanceof Lavadora){
                totalLavadoras += precio;
                log.info("lavadora precio: " + precio + "€");
            }else if(electrodomestico instanceof Television){
                totalTelevisores += precio;
                log.info("television precio: " + precio + "€");
            }else {
                totalElectrodomesticos += precio;
                log.info("electrodomestico precio: " + precio + "€");
            }
        }
        log.info("total tv:" + totalTelevisores + "€");
        log.info("total lavadoras: " + totalLavadoras + "€");
        log.info("total electrodomesticos: " + totalElectrodomesticos + "€");

        log.info("total: " + (totalLavadoras + totalTelevisores + totalElectrodomesticos) + "€");
    }
}
