package ss5_Access_modifier_static_method_static_property.bai_tap.ClassCircle;

import ss5_Access_modifier_static_method_static_property.bai_tap.ClassCircle.Circle;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("inter radius: ");
        double radius =sc.nextDouble();
        Circle cr=new Circle(radius);
        System.out.println("area: "+ cr.getArea());
    }
}
