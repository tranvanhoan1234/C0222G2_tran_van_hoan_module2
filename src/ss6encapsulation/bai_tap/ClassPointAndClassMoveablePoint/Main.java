package ss6encapsulation.bai_tap.ClassPointAndClassMoveablePoint;

public class Main {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint();
        movablePoint.setXY(10.0f, 10.5f);
        movablePoint.setSpeed(5.5f, 5.4f);
        for (int i = 0; i < movablePoint.getSpeed().length; i++) {
            System.out.println(movablePoint.getSpeed()[i]);

        }
        System.out.println(movablePoint.toString());
        System.out.println(movablePoint.move());
    }
}
