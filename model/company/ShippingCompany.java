package model.company;

public class ShippingCompany {

    // *=> fields

    private final String name;

    // *=> constructor

    public ShippingCompany(String name) {
        this.name = name;
    }

    // *=> getter

    public String name() {
        return this.name;
    }
}