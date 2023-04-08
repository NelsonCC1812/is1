package model.enums;

import static model.enums.Location.*;

public enum Journey {

    // *=> enum

    FUERTEVENTURA_TO_GRAN_CANARIA(25, FUERTEVENTURA, GRAN_CANARIA),
    GRAN_CANARIA_TO_FUERTEVENTURA(20, GRAN_CANARIA, FUERTEVENTURA),

    GRAN_CANARIA_TO_TENERIFE(15, GRAN_CANARIA, TENERIFE),
    TENERIFE_TO_GRAN_CANARIA(21, TENERIFE, GRAN_CANARIA),

    GRAN_CANARIA_TO_LANZAROTE(30, GRAN_CANARIA, LANZAROTE),
    LANZAROTE_TO_GRAN_CANARIA(31, LANZAROTE, GRAN_CANARIA),

    GRAN_CANARIA_TO_HUELVA(50, GRAN_CANARIA, HUELVA),
    HUELVA_TO_GRAN_CANARIA(55, HUELVA, GRAN_CANARIA);

    // *=> fields

    private final double cost;
    private final Location from;
    private final Location to;

    // *=> constructors

    Journey(double cost, Location from, Location to) {
        this.cost = cost;
        this.from = from;
        this.to = to;
    }

    // *=> getters

    public double cost() {
        return cost;
    }

    public Location from() {
        return this.from;
    }

    public Location to() {
        return this.to;
    }
}