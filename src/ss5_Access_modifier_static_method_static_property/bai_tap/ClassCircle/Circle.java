package ss5_Access_modifier_static_method_static_property.bai_tap.ClassCircle;

public class Circle {

    public static String get;
    private double radius = 1.0;
    private String colo = "red";

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColo() {
        return colo;
    }

    public void setColo(String colo) {
        this.colo = colo;
    }

    public double getArea() {
        return radius*radius* Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", colo='" + colo + '\'' +
                '}';
    }
}