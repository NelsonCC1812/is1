package model.passenger;

import model.auxclasses.InvalidEmailException;

public class Client extends Passenger {

    // *=> fields

    private int points;

    // *=> constructors

    public Client(String name, String lastName, String email, String phoneNumber) throws InvalidEmailException {
        super(name, lastName, email, phoneNumber);
        this.points = 0;
    }

    public Client(String name, String lastName, String email, String phoneNumber, int points)
            throws InvalidEmailException {
        super(name, lastName, email, phoneNumber);
        this.points = points;
    }

    // *=> getters & setters

    public int points() {
        return this.points;
    }

    public int addPoints(int points) {
        return this.points += points;
    }

    public int substractPoints(int points) {
        return this.points -= points;
    }
}