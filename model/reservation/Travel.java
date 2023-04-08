package model.reservation;

import java.time.LocalDateTime;

import model.enums.Journey;
import model.enums.Rate;

public class Travel {

    // *=> fields

    private final int id = nextId++;
    private static int nextId = 0;

    private final LocalDateTime date;
    private final int duration;
    private final Journey journey;
    private final Rate rate;

    // *=> constructors

    public Travel(LocalDateTime date, int duration, Journey journey, Rate rate) {
        this.date = date;
        this.duration = duration;
        this.journey = journey;
        this.rate = rate;
    }

    // *=> getters & setters

    public int id() {
        return this.id;
    }

    public double cost() {
        return this.journey.cost() + this.rate.cost();
    }

    public LocalDateTime date() {
        return this.date;
    }

    public int duration() {
        return this.duration;
    }

    public Journey journey() {
        return this.journey;
    }

    public Rate rate() {
        return this.rate;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Travel))
            return false;
        return ((Travel) obj).id == this.id;
    }
}