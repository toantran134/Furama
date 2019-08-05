package Practices.day_5;

public class MasterCard implements payment {
    @Override
    public void password() {
        System.out.println("Vui lòng nhập mật khẩu gồm 6 chữ số");
    }

    @Override
    public void pay() {
        System.out.println("1 lần giao dịch không vượt quá 20.000.000 đồng");
    }
}
