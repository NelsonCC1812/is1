# clases
[ ] Controller

    [x] ShippingCompany
    [x] Reservation
        [x] Vehicle
        [x] Localizator
        [x] Ticket
            [x] Bonus
            [x] Rate
            [x] Invoice
            [x] Travel
                [x] Journey
    [x] Passenger
        [x] Client
    [x] Service
    [x] ServiceProvider
    [x] Complaint

[ ] TODO debes hacer unos filtros para las listas que estan en control, por ejemplo, filtrar los viajes por destino

# Casos de uso

TODO

[ ] Comprar billete
    [ ] Consultar horario
    [ ] Contratar servicios adicionales
[ ] Pagar
[ ] Gestionar reserva
    [ ] cambiar tarifa
    [ ] consultar reserva
    [ ] cancelar reserva
        [ ] reembolso

[ ] añadir queja?


TODO: 3 casos de uso principales
TODO: Compilar
TODO: video


// *=> Modificaciones en el diagrama
Pasajero a tickets es unidireccional
Reserva a Passenger es unidireccional
Los Ids no aparecen en el diagrama
Enumerados solo se enlazan con asociaciones (Bonus)




Quitar addTickets de la clase reserva
Passenger da datos a complaint
