package Lista3.Exercicio2;

public class Main {
    public static void main(String[] args) {
        Passager passager = new Passager(1, "José", "000.000.000-00");
        Flight flight = new Flight(1,"Franca", "São Paulo");

        Reservation reservation = new Reservation(1, "16-12-2024", flight, passager);
        reservation.setFlight(flight);
        reservation.setPassager(passager);

        System.out.println(reservation);
    }
}
