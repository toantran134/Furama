package Practices.day_3;

public class House extends Accomodation {
    public House(){}
    public House(int count, int day){
        super(count, day);
    }
    public int getPayment(){
        return 5*super.getCount()*super.getDay();
    }
    public String[] getName() {
        String[] nameHouse = {"BeachHouse1", "BeachHouse2"};
        return nameHouse;
    }
}
