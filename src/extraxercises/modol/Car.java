package extraxercises.modol;

import java.util.Scanner;

public class Car extends Vehicle {
    public int numberOfSeats;
    public String vehicleType;

    public Car() {

    }

    public Car(String seaOfControl, Munufacturer manufacturersName, int yearOfManufacture, String owner) {
        super(seaOfControl, manufacturersName, yearOfManufacture, owner);
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }


    @Override
    public String toString() {
        return "Car{" +
                "NumberOfSeats=" + numberOfSeats +
                ", vehicleType='" + vehicleType + '\'' +
                '}';

    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        super.input();
        System.out.println("enter NUMBER ofseats: ");
        this.numberOfSeats = Integer.parseInt(scanner.nextLine());

        System.out.println("enter NUMBER ofseats: ");
        this.vehicleType = scanner.nextLine();
    }
}