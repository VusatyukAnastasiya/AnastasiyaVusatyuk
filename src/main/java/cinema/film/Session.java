package cinema.film;

import java.time.LocalDateTime;
import java.util.List;

public class Session {

    private LocalDateTime datetime;
    private List<Ticket> tickets;

    public Session(LocalDateTime datetime, List<Ticket> tickets) {
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
