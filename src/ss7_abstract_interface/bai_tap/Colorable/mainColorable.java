package ss7_abstract_interface.bai_tap.Colorable;

import ss7_abstract_interface.bai_tap.interface_class_resizeable.Circle;
import ss7_abstract_interface.bai_tap.interface_class_resizeable.Rectangle;
import ss7_abstract_interface.bai_tap.interface_class_resizeable.Shape;
import ss7_abstract_interface.bai_tap.interface_class_resizeable.Square;

public class mainColorable {




    public static void main(String[] args) {

        Shape[] shape = new Shape[3];
        {
            shape[0] = new Circle(10,"hoàn",true);
            shape[1] = new Rectangle(3,5);
            shape[2] = new Square(10);
            for (Shape shapes :shape ) {
            if (shapes instanceof Circle) {

                System.out.println("Area of the Circle is: "+ ((Circle) shapes).getArea());

            }
            if (shapes instanceof Rectangle) {
                System.out.println("AREA OF the Rectangle is: " + ((Rectangle) shapes).getArea());
            }
            if (shapes instanceof Square) {
                System.out.println("area of the square is: " + ((Square) shapes).getArea());

            }
            }
        }
    }
}