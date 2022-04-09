package ss6encapsulation.bai_tap.ClassCircleaAndClassCylinder;

import ss6encapsulation.thuc_hanh.ClassCircle1.Circle1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Circle cl = new Circle();
        Cylinder cd = new Cylinder();
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a radius: ");
        double radius = Double.parseDouble(sc.nextLine());
        cl.setRadius(radius);
        System.out.println(cl.toString());
        System.out.print("enter a height: ");
        double height = Double.parseDouble(sc.nextLine());
        cd.setHeight(height);
        System.out.println(cd.toString());
    }
}

