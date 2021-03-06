package extraxercises.modol;

import java.util.Scanner;

public class Motorcycle extends Vehicle {
    public double motorcycle;

    public Motorcycle() {
    }

    public double getMotorcycle() {
        return motorcycle;
    }

    public void setMotorcycle(double motorcycle) {
        this.motorcycle = motorcycle;
    }

    public Motorcycle(double motorcycle) {
        this.motorcycle = motorcycle;
    }

    public Motorcycle(String seaOfControl, Munufacturer munufactureru, int yearOfManufacture, String owner, double motorcycle) {
        super(seaOfControl, munufactureru, yearOfManufacture, owner);
        this.motorcycle = motorcycle;
    }



    @Override
    public String toString() {
        return "Motorcycle{" +
                "motorcycle=" + motorcycle +
                ", seaOfControl=" + seaOfControl +
                '}';
    }

    @Override
    public void input() {
        super.input();
        Scanner scanner=new Scanner(System.in);
        super.input();
        System.out.println("enter tonnage: ");
        this.motorcycle=Integer.parseInt(scanner.nextLine());
    }
}
