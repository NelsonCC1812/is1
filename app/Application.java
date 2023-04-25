package app;

import java.time.LocalDateTime;

import gui.MainFrame;
import model.Model;
import model.auxclasses.InvalidEmailException;
import model.company.ShippingCompany;
import model.complaint.Complaint;
import model.enums.Journey;
import model.enums.Rate;
import model.passenger.Client;
import model.passenger.Passenger;
import model.reservation.Travel;
import model.service.ServiceProvider;

public class Application {
    public static void main(String[] args) {

        Model model = new Model(new ShippingCompany("Friend Almas"));
        inicializar_modelo(model);

        MainFrame gui = new MainFrame(model); // se uso de esta forma ya que especificaron que existiera solo un objeto
                                              // de interfaz grafica;
    }

    public static void inicializar_modelo(Model model) {

        // travels

        generateTravels(model, Rate.STANDARD);
        generateTravels(model, Rate.SILVER);
        generateTravels(model, Rate.GOLD);

        // complaints

        try {
            model.addComplaint(
                    new Complaint(new Passenger("Señor feliz", null, "sirfeliz@siuuu.si", null), "Ha estado genial"));
        } catch (InvalidEmailException e) {
            System.out.println("El email no se ha podido crear");
        }

        try {
            model.addComplaint(
                    new Complaint(new Passenger("Señor enfadado", null, "estoy_molesto@aaaaa.com", null),
                            "No me ha gustado nada"));
        } catch (InvalidEmailException e) {
            System.out.println("El email no se ha podido crear");
        }

        // clients

        try {
            model.addClient(new Client("Cliente", "Fiel", "estoesunemail@muyserio.si", "00012"));
        } catch (InvalidEmailException e) {
            System.out.println("El email no se ha podido crear");
        }

        try {
            model.addClient(new Client("Elsa", "Pato", "elsa_pato@muyserio.si", "999666"));
        } catch (InvalidEmailException e) {
            System.out.println("El email no se ha podido crear");
        }

        // serviceProviders

        ServiceProvider sp;

        sp = new ServiceProvider("Hotel", "Trivago");
        sp.addService(50, "1 noches hotel 5 estrellas");
        sp.addService(100, "2 noches todo incluido");
        model.addServiceProviders(sp);

        sp = new ServiceProvider("Hotel", "Pisito");
        sp.addService(15, "Una noche, esta mas o menos");
        sp.addService(10, "Media noche, algo es algo");
        model.addServiceProviders(sp);

        sp = new ServiceProvider("Parque de atracciones", "Tivoli");
        sp.addService(10, "No te recomiendo ir");
        sp.addService(1, "Traumas para todos");
        model.addServiceProviders(sp);
    }

    public static int random(int min, int max) {
        return (int) Math.random() * max + min;
    }

    public static void generateTravels(Model model, Rate rate) {

        for (int i = 0; i < 3; i++)
            for (int mo = 1; mo < 12; mo++) { // month
                for (int day = 1; day < 28; day++) { // day

                    model.addTravel(new Travel(LocalDateTime.of(2022, mo, day, 16 + i, 30), 120,
                            Journey.FUERTEVENTURA_TO_GRAN_CANARIA, rate));
                    model.addTravel(new Travel(LocalDateTime.of(2022, mo, day, 19 + i, 0), 120,
                            Journey.GRAN_CANARIA_TO_FUERTEVENTURA, rate));

                    model.addTravel(new Travel(LocalDateTime.of(2022, mo, day, 11 + i, 30), 100,
                            Journey.GRAN_CANARIA_TO_TENERIFE, rate));
                    model.addTravel(new Travel(LocalDateTime.of(2022, mo, day, 14 + i, 0), 100,
                            Journey.TENERIFE_TO_GRAN_CANARIA, rate));

                    model.addTravel(new Travel(LocalDateTime.of(2022, mo, day, 10 + i, 0), 140,
                            Journey.GRAN_CANARIA_TO_LANZAROTE, rate));
                    model.addTravel(new Travel(LocalDateTime.of(2022, mo, day, 9 + i, 30), 140,
                            Journey.LANZAROTE_TO_GRAN_CANARIA, rate));

                    model.addTravel(new Travel(LocalDateTime.of(2022, mo, day, 20 + i, 30), 600,
                            Journey.GRAN_CANARIA_TO_HUELVA, rate));
                    model.addTravel(new Travel(LocalDateTime.of(2022, mo, day, 21 + i, 0), 610,
                            Journey.HUELVA_TO_GRAN_CANARIA, rate));
                }
            }
    }
}
