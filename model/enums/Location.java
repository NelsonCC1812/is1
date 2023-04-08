package model.enums;

public enum Location {

    GRAN_CANARIA("Gran Canaria"),
    FUERTEVENTURA("Fuerteventura"),
    TENERIFE("Tenerife"),
    LANZAROTE("Lanzarote"),
    HUELVA("Huelva");

    public final String name;

    Location(String name) {
        this.name = name;
    }
}
