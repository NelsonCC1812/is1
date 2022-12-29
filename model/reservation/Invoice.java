package model.reservation;

import java.time.LocalDateTime;

public class Invoice {

    // *=> fields

    private final int id = nextId++;
    private static int nextId = 0;

    private final double cost;
    private final LocalDateTime date;

    // *=> constructors

    public Invoice(double cost, LocalDateTime date) {
        this.cost = cost;
        this.date = date;
    }

    // *=> getters

    public int id() {
        return this.id;
    }

    public double cost() {
        return this.cost;
    }

    public LocalDateTime date() {
        return this.date;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Invoice))
            return false;
        return ((Invoice) obj).id == this.id;
    }
}