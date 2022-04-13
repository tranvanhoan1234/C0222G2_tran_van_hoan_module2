package ss7_abstract_interface.bai_tap.interface_class_resizeable;

public class main {
    public static void main(String[] args) {

        int x = (int) Math.floor(Math.random() * 100);

        Circle circle = new Circle(5.5);
        System.out.println("Before");
        System.out.println(circle);
        System.out.println("After");
        System.out.println("Random: " + x);
        circle.resize(x);
        circle.setColor("Red");
        System.out.println(circle+"\n");

        Rectangle rectangle = new Rectangle(5, 5);
        System.out.println("Before");
        System.out.println(rectangle);
        System.out.println("After");
        System.out.println("Random: " + x);
        rectangle.resize(x);
        rectangle.setColor("Red");
        System.out.println(rectangle+"\n");
        
    }
}





