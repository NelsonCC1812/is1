package model.service;

public class Service {

    // *=> fields

    private final int id = nextId++;
    private static int nextId = 0;

    private static Service nuller = new Service(null, 0, null);

    private final ServiceProvider serviceProvider;
    private final double cost;
    private final String description;

    // *=> constructor

    public Service(ServiceProvider serviceProvider, double cost, String description) {
        this.serviceProvider = serviceProvider;
        this.cost = cost;
        this.description = description;
    }

    // *=> getters

    public int id() {
        return this.id;
    }

    public ServiceProvider serviceProvider() {
        return this.serviceProvider;
    }

    public double cost() {
        return this.cost;
    }

    public String description() {
        return this.description;
    }

    public static Service NULL() {
        return nuller;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.description();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Service))
            return false;
        return ((Service) obj).id == this.id;
    }
}
