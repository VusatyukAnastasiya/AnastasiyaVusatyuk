package Cinema.hall;

import java.util.List;

public class Hall {

    private String name;
    private List<Seat> seats;

    public Hall(String name, List<Seat> seats) {
        this.name = name;
        this.seats = seats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    public void reserveSeat(int row, int number){
        //TO DO
    }


}
