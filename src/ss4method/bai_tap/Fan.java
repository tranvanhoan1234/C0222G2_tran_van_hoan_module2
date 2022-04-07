package ss4method.bai_tap;

public class Fan {

    public Fan() {
    }

    public static final byte SLOW = 1;
    public static final byte MEDIUM = 2;
    public static final byte FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean getOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (this.on) {
            return "Fan is on \n" +
                    "Speed: " + this.speed + "\n" +
                    "Color: " + this.color + "\n" +
                    "Radius: " + this.radius;
        } else {
            return "Fan is off \n" +
                    "Color: " + this.color + "\n" +
                    "Radius: " + this.radius;
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(FAST);
        fan1.setRadius(10);
        fan1.setColor("blue");
        fan1.setOn(true);
        System.out.println(fan1.toString());
        System.out.println("*************");
        Fan fan2=new Fan();
      fan2.setSpeed(MEDIUM);
      fan2.setRadius(3);
      fan2.setColor("màu đen");
      fan2.setOn(false);
        System.out.println(fan2.toString());
        System.out.println("************");
    }
}

