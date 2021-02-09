package cinema;

import cinema.film.Film;
import cinema.film.Session;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Cinema {

    private String name;
    private List<Film> films;

    public Cinema(String name, List<Film> films) {
        this.name = name;
        this.films = films;
    }

    public List<Session> getAllSessions() {
//        List<Session> allSessions = new LinkedList<>();
//        for (Film film : films) {
//            allSessions.addAll(film.getSessions());
//        }
//        return allSessions;
        return films.stream()
                .map(Film::getSessions)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    public List<Film> getFilmsByGenre(/*String genre*/ Predicate<Film> filmPredicate) {
//        List<Film> filteredFilms = new LinkedList<>();
//        for (Film film : films) {
//            if (genre.equals(film.getGenre())) {
//                filteredFilms.add(film);
//            }
//        }
//        return filteredFilms;
        return films.stream().filter(filmPredicate).collect(Collectors.toList());
    }

    public List<Film> sortFilmsAlphabetically() {
//        Comparator<Film> filmComparator = new Comparator<Film>() {
//            @Override
//            public int compare(Film o1, Film o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        };
//        films.sort(filmComparator);
//        return films;
        return films.stream().sorted(Comparator.comparing(Film::getName)).collect(Collectors.toList());
    }

    public boolean isFilmEqualDuration(/*int duration*/ Predicate<Film> filmPredicate) {
//        for (Film film : films) {
//            if (duration == film.getDuration())
//                return true;
//        }
//        return false;
        return films.stream().anyMatch(filmPredicate);
    }

    public boolean isAllFilmsEqualDuration(/*int duration*/Predicate<Film> filmPredicate) {
//        for (Film film : films) {
//            if (duration != film.getDuration())
//                return false;
//        }
//        return true;
        return films.stream().allMatch(filmPredicate);
    }

    public boolean isNoneOfFilmsEqualDuration(/*int duration*/Predicate<Film> filmPredicate) {
//        for (Film film : films) {
//            if (duration == film.getDuration())
//                return false;
//        }
//        return true;
        return films.stream().noneMatch(filmPredicate);
    }

    public void printUniqueGenresAlphabetically() {
//        Set<String> uniqueGenres = new TreeSet<>();
//        for (Film film : films) {
//            uniqueGenres.add(film.getGenre());
//        }
//        System.out.println(String.join(",", uniqueGenres));

        System.out.println(films.stream()
                .map(Film::getGenre)
                .distinct()
                .sorted()
                .collect(Collectors.joining(",")));
    }
}



