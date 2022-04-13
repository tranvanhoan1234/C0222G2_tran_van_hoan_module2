package ss6encapsulation.thuc_hanh.ClassShape;

public class testShape {
    public static void main(String[] args) {
        Shape shape = new Shape() {

        };
        System.out.println(shape);

        shape = new Shape("red", false) {

        };
        System.out.println(shape);
    }
}
