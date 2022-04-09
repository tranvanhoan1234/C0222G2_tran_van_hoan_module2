package ss6encapsulation.bai_tap.ClassCircleaAndClassCylinder;

public class Circle {
    public double radius = 5.6;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;

    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * this.radius * Math.PI;

    }

    @Override
    public String toString() {
        return "Circle{" +
                " radius=" + this.radius +
                " area= " + this.getArea() +
                " Perimeter= " + this.getPerimeter() +
                '}';
    }
}
