package Practices.day_5;

public class VisaCard implements payment {

    @Override
    public void password() {
        System.out.println("Vui lòng Đăng nhập tài khoản");
    }

    @Override
    public void pay() {
        System.out.println("Thanh toán cao nhất 1 lần giao dịch là 50.000.000 đồng");
    }
}
