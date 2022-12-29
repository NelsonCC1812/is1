package model.reservation;

import static model.enums.Bonus.applyDeductions;

import java.util.Set;

import model.enums.Bonus;
import model.passenger.Passenger;

public class Ticket {

    // *=> fields

    private final int id = nextId++;
    private static int nextId = 0;

    private final Passenger passenger;
    private final Set<Bonus> bonus;
    private Travel departure;
    private Travel comeback;

    // *=> constructors

    public Ticket(Passenger passenger, Set<Bonus> bonus, Travel departure, Travel comeback) {
        this.passenger = passenger;
        this.bonus = bonus;
        this.departure = departure;
        this.comeback = comeback;
    }

    public Ticket(Passenger passenger, Set<Bonus> bonus, Travel departure) {
        this.passenger = passenger;
        this.bonus = bonus;
        this.departure = departure;
    }

    // *=> getters & setters

    public int id() {
        return this.id;
    }

    public Passenger passenger() {
        return this.passenger;
    }

    public Set<Bonus> bonus() {
        return this.bonus;
    }

    public Travel departure() {
        return this.departure;
    }

    public void departure(Travel departure) {
        this.departure = departure;
    }

    public Travel comeback() {
        return this.comeback;
    }

    public void comeback(Travel comeback) {
        this.comeback = comeback;
    }

    public double cost() {
        return applyDeductions(this.bonus, departure.cost() + (comeback == null ? 0 : comeback.cost()));
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Ticket))
            return false;
        return ((Ticket) obj).id == this.id;
    }
}
