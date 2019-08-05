package Practices.day_3;

public class Tent extends Accomodation {
    public Tent(){}
    public Tent(int count, int day){
        super(count, day);
    }
    public int getPayment(){
        return 15*super.getCount()*super.getDay();
    }
    public String[] getName(){
        String[] nameTent={"Tent1","Tent2","Tent3"};
        return nameTent;
    }
}
