package ss7_abstract_interface.bai_tap.interface_class_resizeable;

public abstract class Shape {
    private String color = "green";


    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }




    @Override
    public String toString() {
        return "A Shape with color of "
                + getColor() + "color= " + color
                + " and ";

    }


    public double resize(double percent) {

        return percent;
    }
}