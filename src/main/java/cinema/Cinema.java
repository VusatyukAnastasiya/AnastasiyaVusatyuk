package cinema;

import cinema.film.Film;
import cinema.film.Session;

import java.util.*;

public class Cinema {

    private String name;
    private List<Film> films;

    public Cinema(String name, List<Film> films) {
        this.name = name;
        this.films = films;
    }

    public List<Session> getAllSessions() {
        List<Session> allSessions = new LinkedList<>();
        for (Film film : films) {
            allSessions.addAll(film.getSessions());
        }
        return allSessions;
    }

    public List<Film> getFilmsByGenre(String genre) {
        List<Film> filteredFilms = new LinkedList<>();
        for (Film film : films) {
            if (genre.equals(film.getGenre())) {
                filteredFilms.add(film);
            }
        }
        return filteredFilms;
    }

    public List<Film> sortFilmsAlphabetically() {
        Comparator<Film> filmComparator = new Comparator<Film>() {
            @Override
            public int compare(Film o1, Film o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        films.sort(filmComparator);
        return films;
    }

    public boolean isFilmEqualDuration(int duration) {
        for (Film film : films) {
            if (duration == film.getDuration())
                return true;
        }
        return false;
    }

    public boolean isAllFilmsEqualDuration(int duration) {
        for (Film film : films) {
            if (duration != film.getDuration())
                return false;
        }
        return true;
    }

    public boolean isNoneOfFilmsEqualDuration(int duration) {
        for (Film film : films) {
            if (duration == film.getDuration())
                return false;
        }
        return true;
    }

    public void printUniqueGenresAlphabetically() {
        Set<String> uniqueGenres = new TreeSet<>();
        for (Film film : films) {
            uniqueGenres.add(film.getGenre());
        }

        System.out.println(String.join(",", uniqueGenres));
    }
}



