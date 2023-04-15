package model.complaint;

import java.time.LocalDateTime;

import model.auxclasses.Auxiliar;
import model.auxclasses.InvalidEmailException;
import model.passenger.Passenger;

public class Complaint {

    // *=> fields

    private final int id = nextId++;
    private static int nextId = 0;

    private String name;
    private String email;
    private String comment;
    private Passenger passenger;
    private LocalDateTime date;

    // *=> constructors

    public Complaint(Passenger passenger, String comment) throws InvalidEmailException {
        this.passenger = passenger;
        this.name = name;
        if (!email(email))
            throw new InvalidEmailException(email);
        this.comment = comment;
        this.date = LocalDateTime.now();
    }

    // *=> getters & setters

    public int id() {
        return this.id;
    }

    public String name() {
        return this.name;
    }

    private boolean email(String email) {
        if (!Auxiliar.isEmail(email))
            return false;
        this.email = email;
        return true;
    }

    public String email() {
        return this.email;
    }

    public String comment() {
        return this.comment;
    }

    public LocalDateTime date() {
        return this.date;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Complaint))
            return false;
        return ((Complaint) obj).id == this.id;
    }
}