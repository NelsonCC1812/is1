package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import model.company.ShippingCompany;
import model.complaint.Complaint;
import model.enums.Journey;
import model.enums.Location;
import model.enums.Rate;
import model.enums.Vehicle;
import model.passenger.Client;
import model.passenger.Passenger;
import model.reservation.Reservation;
import model.reservation.Travel;
import model.service.ServiceProvider;

public class Model {

    // *=> fields

    private final ShippingCompany company;

    private final List<Travel> travels;
    private final List<Complaint> complaints;
    private final List<Client> clients;
    private final List<Reservation> reservations;
    private final List<ServiceProvider> serviceProviders;

    public Model(ShippingCompany shippingCompany) {
        this.company = shippingCompany;

        this.travels = new ArrayList<>();
        this.complaints = new ArrayList<>();
        this.clients = new ArrayList<>();
        this.reservations = new ArrayList<>();
        this.serviceProviders = new ArrayList<>();
    }

    // *=> methods

    public ShippingCompany company() {
        return this.company;
    }

    // *=> travels

    public List<Travel> travels() {
        return this.travels;
    }

    public boolean addTravel(Travel travel) {
        return this.travels.add(travel);
    }

    public boolean removeTravel(Travel travel) {
        return this.travels.remove(travel);
    }

    public Travel findTravelById(int id) {
        return this.travels.stream().filter(elm -> elm.id() == id).toList().get(0);
    }

    public List<Travel> findTravelsByDate(LocalDate date) {
        return this.travels.stream().filter(elm -> elm.date().toLocalDate().equals(date)).toList();
    }

    public List<Travel> findTravelsByJourney(Journey journey) {
        return this.travels.stream().filter(elm -> elm.journey().equals(journey)).toList();
    }

    public List<LocalDateTime> travelsDateFrom() {
        return this.travels.stream().map(elm -> elm.date()).distinct().toList();
    }

    public List<LocalDateTime> filterTravelsDatesGreatherThan(LocalDateTime date) {
        return this.travels.stream().map(elm -> elm.date()).distinct().filter(elm -> elm.compareTo(date) > 0).toList();
    }

    public Journey findJourneyByFromAndTo(Location from, Location to) {
        return Arrays.asList(Journey.values()).stream()
                .filter(elm -> (from.equals(elm.from()) && to.equals(elm.to())))
                .toList().get(0);
    }

    // *=> complaints

    public List<Complaint> complaints() {
        return this.complaints;
    }

    public boolean addComplaint(Complaint complaint) {
        return this.complaints.add(complaint);
    }

    public boolean removeComplaint(Complaint complaint) {
        return this.complaints.remove(complaint);
    }

    public Complaint findComplaintById(int id) {
        return this.complaints.stream().filter(elm -> elm.id() == id).toList().get(0);
    }

    // *=> clients

    public List<Client> clients() {
        return this.clients;
    }

    public boolean addClient(Client client) {
        return this.clients.add(client);
    }

    public boolean removeClient(Client client) {
        return this.clients.remove(client);
    }

    public Client findClientById(int id) {
        return this.clients.stream().filter(elm -> elm.id() == id).toList().get(0);
    }

    // *=> reservations

    public List<Reservation> reservations() {
        return this.reservations;
    }

    public boolean addReservation(Reservation reservation) {
        return this.reservations.add(reservation);
    }

    public boolean removeReservation(Reservation reservation) {
        return this.reservations.remove(reservation);
    }

    public Reservation findReservationById(int id) {
        List<Reservation> ress = this.reservations.stream().filter(elm -> elm.id() == id).toList();
        return ress.size() > 0 ? ress.get(0) : null;
    }

    public List<Reservation> findReservationsByBooker(Passenger pass) {
        return this.reservations.stream().filter(elm -> elm.booker().id() == pass.id()).toList();
    }

    // *=> serviceProviders

    public List<ServiceProvider> serviceProviders() {
        return this.serviceProviders;
    }

    public boolean addServiceProviders(ServiceProvider serviceProvider) {
        return this.serviceProviders.add(serviceProvider);
    }

    public boolean removeServiceProvider(ServiceProvider serviceProvider) {
        return this.serviceProviders.remove(serviceProvider);
    }

    public ServiceProvider findServiceProviderById(int id) {
        return this.serviceProviders.stream().filter(elm -> elm.id() == id).toList().get(0);
    }

    public List<ServiceProvider> findServiceProvidersByType(String type) {
        return this.serviceProviders.stream().filter(elm -> elm.type().equals(type)).toList();
    }

    public List<ServiceProvider> findServiceProvidersByName(String name) {
        return this.serviceProviders.stream().filter(elm -> elm.name().equals(name)).toList();
    }

    public List<String> getServiceTypes() {
        return this.serviceProviders.stream().map(elm -> elm.type()).distinct().toList();
    }

    // *=> locations

    public List<Location> locations() {
        return Arrays.asList(Location.values()).stream().map(elm -> elm).toList();
    }

    public Location location(String name) {
        return Arrays.asList(Location.values()).stream().filter(elm -> elm.name() == name).toList().get(0);
    }

    public List<Location> findLocationsByFrom(Location from) {
        return Arrays.asList(Journey.values()).stream().filter(elm -> elm.from() == from).map(elm -> elm.to()).toList();
    }

    // *=> vehicles

    public List<Vehicle> vehicles() {
        List<Vehicle> lst = new ArrayList<>(Arrays.asList(Vehicle.values()));
        return lst.stream().map(elm -> elm).toList();
    }

    public Vehicle vehicle(String name) {
        return Arrays.asList(Vehicle.values()).stream().filter(elm -> elm.name() == name).toList().get(0);
    }

    // *=> rates

    public List<Rate> rates() {
        return Arrays.asList(Rate.values());
    }
}