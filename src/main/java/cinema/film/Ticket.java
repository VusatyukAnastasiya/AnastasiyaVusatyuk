package cinema.film;

public class Ticket {

    private int price;

    public Ticket(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "price=" + price +
                '}';
    }
}
