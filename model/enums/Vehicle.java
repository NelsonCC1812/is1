package model.enums;

public enum Vehicle {
    CAR(10),
    MOTORBIKE(5),
    NULL(0);

    private final double cost;

    Vehicle(double cost) {
        this.cost = cost;
    }

    public double cost() {
        return this.cost;
    }

}
