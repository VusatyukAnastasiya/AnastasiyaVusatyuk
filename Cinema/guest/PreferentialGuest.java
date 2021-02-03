package Cinema.guest;

public class PreferentialGuest extends Guest{
    private int discount;

    public PreferentialGuest(String name, int age, int discount) {
        super(name, age);
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
