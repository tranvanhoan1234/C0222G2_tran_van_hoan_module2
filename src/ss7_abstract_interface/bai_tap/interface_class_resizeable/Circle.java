package ss7_abstract_interface.bai_tap.interface_class_resizeable;

public class Circle extends Shape {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius = " + getRadius() + "\n" +
                "Area = " + this.getArea() + "\n" +
                "Color: " + this.getColor();

    }

    @Override
    public double resize(double percent) {
        return this.radius *= percent;
    }
        @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }

}
