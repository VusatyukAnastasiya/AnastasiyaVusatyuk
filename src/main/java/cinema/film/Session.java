package cinema.film;

import java.util.List;

public class Session {

    private String datetime;
    private List<Ticket> tickets;

    public Session(String datetime, List<Ticket> tickets) {
        this.datetime = datetime;
        this.tickets = tickets;
    }

    @Override
    public String toString() {
        return "Session{" +
                "datetime='" + datetime + '\'' +
                ", tickets=" + tickets +
                '}';
    }
}
