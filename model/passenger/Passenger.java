package model.passenger;

import static model.auxclasses.Auxiliar.isEmail;

public class Passenger {

    // *=> fields

    private final int id = nextId++;
    private static int nextId = 0;

    private String name;
    private String lastName;
    private String phoneNumber;
    private String email;

    // *=> constructors

    public Passenger(String name, String lastName, String email, String phoneNumber) {
        this.name = name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
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

    public void name(String name) {
        this.name = name;
    }

    public String lastName() {
        return this.lastName;
    }

    public void lastName(String lastName) {
        this.lastName = lastName;
    }

    public String phoneNumber() {
        return this.phoneNumber;
    }

    public void phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String email() {
        return this.email;
    }

    public void email(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Passenger))
            return false;
        return ((Passenger) obj).id == this.id;
    }
}