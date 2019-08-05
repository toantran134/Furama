package Practices.day_3;

public class Villa extends Accomodation {
    public Villa() {
    }

    public Villa(int count, int day) {
        super(count, day);
    }

    public int getPayment(){
        return 10*super.getCount()*super.getDay();
    }
    public String[] getName(){
       String[] nameVilla={"Villa1","Villa2","Villa3","Villa4","Villa5"};
       return nameVilla;
    }
}
