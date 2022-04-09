package ss6encapsulation.bai_tap.ClassCircleaAndClassCylinder;

public class Circle {
    public double radius=5.6;
    public double acreage=5.6;

    public Circle() {

    }

    public double getRadius() {
        return radius * radius * Math.PI;

    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getAcreage() {
        return 2 * radius * Math.PI;
    }

    public void setAcreage(double acreage) {
        this.acreage = acreage;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", acreage=" + acreage +
                '}';
    }
}
