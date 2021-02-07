package cinema.film;

import java.util.List;

public class Film {

    private String name;
    private int duration;
    private String genre;
    private List<Session> sessions;

    public Film(String name, int duration, String genre, List<Session> sessions) {
        this.name = name;
        this.duration = duration;
        this.genre = genre;
        this.sessions = sessions;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public String getGenre() {
        return genre;
    }

    public List<Session> getSessions() {
        return sessions;
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                ", genre='" + genre + '\'' +
                ", sessions=" + sessions +
                '}';
    }
}
