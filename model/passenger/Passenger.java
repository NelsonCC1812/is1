package model.passenger;

import static model.auxclasses.Auxiliar.isEmail;

import model.auxclasses.InvalidEmailException;;

public class Passenger {

    // *=> fields

    private final int id = nextId++;
    private static int nextId = 0;

    private final String name;
    private final String lastName;
    private String phoneNumber;
    private String email;

    // *=> constructors

    public Passenger(String name, String lastName, String email, String phoneNumber) throws InvalidEmailException {
        this.name = name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        if (!this.setEmail(email))
            throw new InvalidEmailException(email);
    }

    // *=> getters & setters

    public int id() {
        return this.id;
    }

    private boolean setEmail(String email) {
        if (!isEmail(email))
            return false;

        this.email = email;
        return true;
    }

    public String name() {
        return this.name;
    }

    public String lastName() {
        return this.lastName;
    }

    public String phoneNumber() {
        return this.phoneNumber;
    }

    public String email() {
        return this.email;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Passenger))
            return false;
        return ((Passenger) obj).id == this.id;
    }
}