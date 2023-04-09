package model.service;

import java.util.ArrayList;
import java.util.List;

public class ServiceProvider {

    // *=> fields

    private final int id = nexId++;
    private static int nexId = 0;

    private final String type;
    private final String name;
    private final List<Service> services;

    // *=> constructors

    public ServiceProvider(String type, String name) {
        this.type = type;
        this.name = name;
        services = new ArrayList<>();
    }

    // *=> getters & getters

    public int id() {
        return this.id;
    }

    public String type() {
        return this.type;
    }

    public String name() {
        return this.name;
    }

    public List<Service> services() {
        return this.services;
    }

    public Service addService(double cost, String description) {
        Service service = new Service(this, cost, description);
        this.services.add(service);
        return service;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ServiceProvider))
            return false;
        return ((ServiceProvider) obj).id == this.id;
    }
}