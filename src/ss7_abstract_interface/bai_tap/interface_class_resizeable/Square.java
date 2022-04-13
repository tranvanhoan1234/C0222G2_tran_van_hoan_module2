package ss7_abstract_interface.bai_tap.interface_class_resizeable;

public class Square extends Rectangle {
    public Square(int a) {
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }


}