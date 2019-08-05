package Practices.day_5;

public class Main {
    public static void main(String[] args) {
        VisaCard visaCard = new VisaCard();
        MasterCard masterCard= new MasterCard();
        System.out.println("Visa Card");
        visaCard.password();
        visaCard.pay();
        System.out.println("Master Card");
        masterCard.password();
        masterCard.pay();
    }
}
