package Cinema.film;

import java.util.List;

public class Ticket {

    private List<Film> films;
    private int filmPrice;
    private String filmTime;

    public Ticket(List<Film> films, int filmPrice, String filmTime) {
        this.films = films;
        this.filmPrice = filmPrice;
        this.filmTime = filmTime;
    }

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }

    public int getFilmPrice() {
        return filmPrice;
    }

    public void setFilmPrice(int filmPrice) {
        this.filmPrice = filmPrice;
    }

    public String getFilmTime() {
        return filmTime;
    }

    public void setFilmTime(String filmTime) {
        this.filmTime = filmTime;
    }
}
