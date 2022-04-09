package ss6encapsulation.bai_tap.ClassCircleaAndClassCylinder;

import ss6encapsulation.thuc_hanh.ClassCircle1.Circle1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Circle cl = new Cylinder();
        System.out.println("chu vi là: " + cl.getAcreage());
        System.out.println("bán kính là: " + cl.getRadius());
        Cylinder cd= new Cylinder();
        System.out.println("thể tích hình tròn là: "+cd.getVolume());
    }
}

