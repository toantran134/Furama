package Practices.day_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Furama furama = new Furama();
        Customer customer = new Customer();
        Swimming swimming = new Swimming();
        Scanner input = new Scanner(System.in);
        System.out.println(furama);
        System.out.print("Nhập tên khách hàng:");
        customer.setName(input.nextLine());
        System.out.print("Nhập tuổi khách hàng:");
        customer.setAge(input.nextInt());
        input.nextLine();
        System.out.print("Nhập số phòng Villa và House muốn thuê");
        input.nextLine();
        System.out.print("Villa:");
        furama.setVilla(input.nextInt());
        input.nextLine();
        System.out.print("House:");
        furama.setHouse(input.nextInt());
        input.nextLine();
        System.out.print("Nhập vào số ngày muốn thuê:");
        furama.setDay(input.nextInt());
        input.nextLine();
        System.out.println("\n");
        System.out.println(customer);
        System.out.print("Số tiền cần thanh toán là:" + furama.getPayment() + "$\n");

        System.out.println("Nhập giờ hiện tại");
        swimming.setTime(input.nextInt());
        System.out.println(swimming.alert());
    }
}
