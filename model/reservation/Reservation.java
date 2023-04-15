package model.reservation;

import java.util.HashSet;
import java.util.Set;

import model.enums.Vehicle;
import model.passenger.Passenger;
import model.service.Service;

public class Reservation {

    // *=> fields

    private final int id = nextId++;
    private static int nextId = 0;

    private Passenger booker;
    private Set<Ticket> tickets;

    private Invoice invoice;

    private Vehicle vehicle = Vehicle.NULL;
    private Set<Service> additionalServices = new HashSet<Service>();

    private boolean isCheckedIn;

    // *=> constructors

    public Reservation(Passenger booker, Set<Ticket> tickets, Invoice invoice, Vehicle vehicle,
            Set<Service> additionalServices) {

        this.booker = booker;
        this.tickets = tickets;

        this.invoice = invoice;

        if (this.vehicle != null)
            this.vehicle = vehicle;

        if (additionalServices.size() > 0)
            this.additionalServices = additionalServices;
        else
            this.additionalServices.add(Service.NULL());

        this.isCheckedIn = false;
    }

    public Reservation(Passenger booker, Set<Ticket> tickets) {
        this(booker, tickets, null, null, null);
    }

    public int id() {
        return this.id;
    }

    // getters & setters

    public double cost() {
        return this.invoice.cost();
    }

    public Passenger booker() {
        return booker;
    }

    public void booker(Passenger booker) {
        this.booker = booker;
    }

    public Set<Ticket> tickets() {
        return tickets;
    }

    public boolean removeTicket(Ticket ticket) {
        return this.tickets.remove(ticket);
    }

    public Invoice invoice() {
        return invoice;
    }

    public void invoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public Vehicle vehicle() {
        return vehicle;
    }

    public void vehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Set<Service> additionalServices() {
        return additionalServices.contains(Service.NULL()) ? new HashSet<>() : additionalServices;
    }

    public boolean addAdditionalService(Service service) {
        return this.additionalServices.add(service);
    }

    public boolean removeAdditionalService(Service service) {
        return this.additionalServices.remove(service);
    }

    public boolean isCheckedIn() {
        return isCheckedIn;
    }

    public void isCheckedIn(boolean isCheckedIn) {
        this.isCheckedIn = isCheckedIn;
    }

    // *=> methods
    public double calcCost() {

        return this.tickets().stream().map(Ticket::cost).reduce((acc, sum) -> acc + sum).get() +
                this.additionalServices.stream().map(Service::cost).reduce((acc, sum) -> acc + sum).get()
                + vehicle.cost();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Reservation))
            return false;
        return ((Reservation) obj).id == this.id;
    }
}
