package ss7_abstract_interface.thuc_hanh.ComparableCircle;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circle1 = new ComparableCircle[3];
        circle1[0] = new ComparableCircle(3.6);
        circle1[1] = new ComparableCircle();
        circle1[2] = new ComparableCircle(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (ComparableCircle circle : circle1) {
            System.out.println(circle);
        }

        Arrays.sort(circle1);

        System.out.println("After-sorted:");
        for (ComparableCircle circle : circle1) {
            System.out.println(circle);
        }
    }
}