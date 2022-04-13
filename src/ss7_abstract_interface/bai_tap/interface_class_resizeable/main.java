package ss7_abstract_interface.bai_tap.interface_class_resizeable;

public class main {
    public static void main(String[] args) {

        int ramDomNumber = (int) Math.floor(Math.random() * 100);

        Circle circle = new Circle(5.5);
        System.out.println("Before");
        System.out.println(circle);
        System.out.println("After");
        System.out.println("Random: " + ramDomNumber);
        circle.resize(ramDomNumber);
        circle.setColor("Red");
        System.out.println(circle+"\n");

        Rectangle rectangle = new Rectangle(5, 5);
        System.out.println("Before");
        System.out.println(rectangle);
        System.out.println("After");
        System.out.println("Random: " + ramDomNumber);
        rectangle.resize(ramDomNumber);
        rectangle.setColor("Red");
        System.out.println(rectangle+"\n");

    }
}





