package ss6encapsulation.bai_tap.ClassCircleaAndClassCylinder;

import java.util.Scanner;

public class Cylinder extends Circle {
    protected double height = 5.3;

    public Cylinder() {

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double surroundingArea() {
        return super.getPerimeter() * this.height;
    }

    public double totalArea() {
        return this.surroundingArea() + 2 * super.getArea();

    }

    public double volume() {
        return super.getArea() * this.height;

    }

    @Override
    public String toString() {
        return "Cylinder{" +
                " surroundingArea= " + this.surroundingArea() +
                " totalArea= " + this.totalArea() +
                " volume= " + this.volume() +
                " height=" + height +

                '}';
    }
}
