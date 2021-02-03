package Cinema.film;

import java.util.List;

public class Ticket {

    private List<Film> films;
    private int FilmPrice;
    private String FilmTime;

    public Ticket(List<Film> films, int filmPrice, String filmTime) {
        this.films = films;
        FilmPrice = filmPrice;
        FilmTime = filmTime;
    }

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }

    public int getFilmPrice() {
        return FilmPrice;
    }

    public void setFilmPrice(int filmPrice) {
        FilmPrice = filmPrice;
    }

    public String getFilmTime() {
        return FilmTime;
    }

    public void setFilmTime(String filmTime) {
        FilmTime = filmTime;
    }
}
