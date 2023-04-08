package model.auxclasses;

public class InvalidEmailException extends Exception {

    private final String email;

    public InvalidEmailException(String email) {
        super();
        this.email = email;
    }

    public String email() {
        return this.email;
    }
}
