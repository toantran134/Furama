package Practices.day_3;

public abstract class Accomodation {
    private int count;
    private int day;

    public Accomodation() {
    }

    public Accomodation(int count, int day) {
        this.count = count;
        this.day=day;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    abstract String[] getName();
    abstract int getPayment();

}
