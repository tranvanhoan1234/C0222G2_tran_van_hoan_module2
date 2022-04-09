package ss6encapsulation.thuc_hanh.ClassCircle1;

import ss6encapsulation.thuc_hanh.ClassCircle1.Circle1;

public class TextCirle1 {
        public static void main(String[] args) {
            Circle1 circle = new Circle1();
            System.out.println(circle);

            circle = new Circle1(3.5);
            System.out.println(circle);

            circle = new Circle1(3.5, "indigo", false);
            System.out.println(circle);
        }
}
