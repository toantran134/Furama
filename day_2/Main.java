package Practices.day_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Furama furama=new Furama();
        System.out.println("Tên các Villa có trong Furama:");
        for(int i=0; i < furama.getNameVilla().length; i++ ){
            System.out.println(furama.getNameVilla()[i]);
        }
        System.out.println("Tên các Beach House có trong Furama:");
        for(int j=0; j<furama.getNameHouse().length; j++ ){
            System.out.println(furama.getNameHouse()[j]);
        }
    }
}
