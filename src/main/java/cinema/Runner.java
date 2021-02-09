package cinema;

import cinema.film.Film;
import cinema.film.Session;
import cinema.film.Ticket;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

        List<Ticket> tickets = new LinkedList<>();
        tickets.add(new Ticket(100));

        List<Session> sessions = new LinkedList<>();
        sessions.add(new Session(LocalDateTime.now(), tickets));

        List<Film> films = new LinkedList<>();
        films.add(new Film("g", 90, "horror", sessions));
        films.add(new Film("shsfs", 100, "drama", sessions));
        films.add(new Film("teueu", 100, "drama", sessions));
        films.add(new Film("shg", 70, "horror", sessions));
        films.add(new Film("ast", 150, "drama", sessions));

        Cinema cinema = new Cinema("Ton", films);

        //#1
        List<Session> allSessions = cinema.getAllSessions();

        //#2
        List<Film> filmsWithGenre = cinema.getFilmsByGenre(/*"horror"*/ film -> "horror".equals(film.getGenre()));

        //#3
        List<Film> filmsSorted = cinema.sortFilmsAlphabetically();

        //#4
        boolean isFilmEqualDuration = cinema.isFilmEqualDuration(/*150*/ film -> film.getDuration() == 150);

        //#5
        boolean isAllFilmsEqualDuration = cinema.isAllFilmsEqualDuration(/*150*/ film -> film.getDuration() == 150);

        //#6
        boolean isNoneOfFilmsDuration = cinema.isNoneOfFilmsEqualDuration(/*100*/ film -> film.getDuration() == 100);

        //#7
        cinema.printUniqueGenresAlphabetically();

    }
}
