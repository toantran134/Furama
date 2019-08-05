package Practices.day_1;

public class Furama {
    private int villa = 5;
    private int house = 2;
    private int day;

    public Furama() {
    }

    public Furama(int villa, int house, int day) {
        this.villa = villa;
        this.house = house;
    }

    public int getVilla() {
        return villa;
    }

    public void setVilla(int villa) {
            this.villa = villa;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getPayment() {
        return this.day * (10 * this.villa + 5 * this.house);
    }

    @Override
    public String toString() {
        return "Furama has " + this.villa + " villas with 1 bed - price: 10$" + " and " + this.house + " houses with 4 beds - price: 5$";
    }
}
