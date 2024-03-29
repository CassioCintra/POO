package Lista3.Exercicio2;

import java.util.Date;

public class Reservation {
    private int id;
    private String date;
    private Flight flight;
    private Passager passager;

    public Reservation() {
    }

    public Reservation(int id, String date, Flight flight, Passager passager) {
        this.id = id;
        this.date = date;
        this.flight = new Flight();
        this.passager = new Passager();
    }
    public void setFlight(Flight flight){
        this.flight = flight;
    }

    public Flight getFlight() {
        return flight;
    }
    public void setPassager(Passager passager){
        this.passager = passager;
    }
    public Passager getPassager(){
        return passager;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", date='" + date + "', " +
                flight + passager +
                '}';
    }
}
