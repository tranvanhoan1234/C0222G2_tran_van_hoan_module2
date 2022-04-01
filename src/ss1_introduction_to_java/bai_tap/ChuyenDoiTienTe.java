package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner tinh = new Scanner(System.in);
        System.out.println("mười bạn nhập số usa muốn đổi: ");
        usd = tinh.nextInt();
        double doi = usd * 23000;
        System.out.println("SỐ TIền quy đổi được là : " + doi);


    Scanner quydoi1 = new Scanner(System.in);
    System.out.println("mời bạn nhập số tiền vnd muốn đổi: ");
    usd = quydoi1.nextInt();
    double quydoi =usd/23000;
    System.out.println("số tiền đổi dc là :"+quydoi+"usd");


    }
}
