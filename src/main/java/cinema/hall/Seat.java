package main.java.Cinema.hall;

public class Seat {
    private int row;
    private int number;
    private boolean isFree;

    public Seat(int row, int number, boolean isFree) {
        this.row = row;
        this.number = number;
        this.isFree = isFree;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

}
