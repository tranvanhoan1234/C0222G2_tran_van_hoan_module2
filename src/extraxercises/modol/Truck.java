package extraxercises.modol;

import java.util.Scanner;

public class Truck extends Vehicle {
    public double tonnage;

    public Truck() {
    }

    public Truck(double tonnage) {
        this.tonnage = tonnage;
    }

    public Truck(String seaOfControl, Munufacturer munufactureru, int yearOfManufacture, String owner, double tonnage) {
        super(seaOfControl, munufactureru, yearOfManufacture, owner);
        this.tonnage = tonnage;
    }

    public double getTonnage() {
        return tonnage;
    }

    public void setTonnage(double tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public String toString() {
        return "Truck{" +
                super.toString()+
                "tonnage=" + tonnage +
                '}';
    }

    @Override
    public void input(){
        Scanner scanner=new Scanner(System.in);
        super.input();
        System.out.println("enter tonnage: ");
        this.tonnage=Integer.parseInt(scanner.nextLine());
    }
    }

