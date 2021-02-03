package Cinema.film;

public class Film {
    private int id;
    private String filmName;
    private int filmDuration;
    private String filmDirector;
    private String hallName;

    public Film(int id, String filmName, int filmDuration, String filmDirector, String hallName) {
        this.id = id;
        this.filmName = filmName;
        this.filmDuration = filmDuration;
        this.filmDirector = filmDirector;
        this.hallName = hallName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public int getFilmDuration() {
        return filmDuration;
    }

    public void setFilmDuration(int filmDuration) {
        this.filmDuration = filmDuration;
    }

    public String getFilmDirector() {
        return filmDirector;
    }

    public void setFilmDirector(String filmDirector) {
        this.filmDirector = filmDirector;
    }

    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }
}
