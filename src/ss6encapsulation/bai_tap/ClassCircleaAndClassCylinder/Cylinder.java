package ss6encapsulation.bai_tap.ClassCircleaAndClassCylinder;

import java.util.Scanner;

public class Cylinder extends Circle {
    protected double height=5.3;
    protected double wight = 10.5;
    protected double volume;

    public Cylinder() {

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWight() {
        return wight;
    }

    public void setWight(double wight) {
        this.wight = wight;

    }

    public double getVolume() {
        return this.height*Math.PI*this.wight*this.wight;
    }

    public void setVolume(double volume) {

        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", wight=" + wight +
                ", volume=" + volume +
                '}';
         }
}
