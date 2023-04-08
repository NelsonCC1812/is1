package model.enums;

public enum Vehicle {
    NULL(0),
    CAR(10),
    MOTORBIKE(5);

    private final double cost;

    Vehicle(double cost) {
        this.cost = cost;
    }

    public double cost() {
        return this.cost;
    }

    @Override
    public String toString() {
        return this.equals(NULL) ? "Nada" : super.toString();
    }
}
