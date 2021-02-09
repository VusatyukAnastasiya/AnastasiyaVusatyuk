package cinema.film;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;

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
                "datetime=" + DateTimeFormatter.ofPattern("d MMM yyyy, HH:mm", Locale.US).format(datetime) +
                ", tickets=" + tickets +
                '}';
    }
}

