package ss6encapsulation.bai_tap.ClassPoint2DAndClassPoint3D;

import javafx.geometry.Point3D;

public class Main {
    public static void main(String[] args) {
        Point3D point3D = new Point3D(2, 4, 5);
        point3D.toString();
        System.out.println(point3D);
        Point2D point2D = new Point2D();
        point2D.getXY();
        System.out.println(point2D);
    }
}
