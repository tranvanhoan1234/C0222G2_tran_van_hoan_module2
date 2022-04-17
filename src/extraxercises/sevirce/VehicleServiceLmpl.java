package extraxercises.sevirce;

import extraxercises.modol.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleServiceLmpl implements VehicleService {
    List<Vehicle> vehicles = new ArrayList<>();

    {
        Munufacturer honda = new Munufacturer(1, "HONDA", "VIỆT NAM");
        Munufacturer tozota = new Munufacturer(2, "HONDA", "jaban");
        Munufacturer suzuki = new Munufacturer(3, "HONDA", "hàn quốc");
        Munufacturer vinfap = new Munufacturer(4, "HONDA", "châu phi");

        Vehicle car = new Car("91-123", honda, 2021, "tran lung tung");
        Vehicle truck = new Car("81-123", tozota, 2022, "tran lung tung");
        Vehicle moto = new Car("81-123", suzuki, 2023, "tran lung tung");
        Vehicle moto2 = new Car("81-123", vinfap, 2024, "tran lung tung");

        vehicles.add(car);
        vehicles.add(truck);
        vehicles.add(moto);
        vehicles.add(moto2);
    }


    @Override
    public void display() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean flag = true;
        do {
            System.out.println("......hiển thị danh sách xe: ");
            System.out.println("1: hiển thị Car" + "\n" +
                    "2: hiển thị truck " + "\n" +
                    "3 hiển thị motorCycle" +
                    "0: Thoát");
            System.out.println("you choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("car");
                    for (Vehicle c : vehicles) {
                        if (c instanceof Car) {
                            System.out.println(c);
                        }

                    }
                    break;
                case 2:
                    System.out.println("Truck");
                    for (Vehicle c : vehicles) {
                        if (c instanceof Truck) {
                            System.out.println(c);
                        }
                    }
                    break;
                case 3:
                    System.out.println("motorcycle");
                    for (Vehicle c : vehicles) {
                        if (c instanceof Motorcycle) {
                            System.out.println(c);
                        }
                    }
                    break;
                case 0:
                    System.out.println("thoát ");
                    flag = false;
                    break;
                default:
                    System.out.println("hiển thị lại");
                    break;
            }

        } while (flag);

    }

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean flag = true;
        do {
            System.out.println("---------- ADD NEW VEHICLES MENU ----------");
            System.out.println("1. Add car" + "\n" +
                    "2. Add truck" + "\n" +
                    "3. Add motorcycle" + "\n" +
                    "0. Exit");
            System.out.print("Your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("---------- ADD NEW CAR ----------");
                    Vehicle newCar = new Car();
                    newCar.input();
                    vehicles.add(newCar);
                    break;
                case 2:
                    System.out.println("---------- ADD NEW TRUCK ----------");
                    Vehicle newTruck = new Truck();
                    newTruck.input();
                    vehicles.add(newTruck);
                    break;
                case 3:
                    System.out.println("---------- ADD NEW MOTORCYCLE ----------");
                    Vehicle newMotorcycle = new Motorcycle();
                    newMotorcycle.input();
                    vehicles.add(newMotorcycle);
                    break;
                case 0:
                    System.out.println("---------- ADD NEW VEHICLES IS CLOSE ----------");
                    flag = false;
                    break;
                default:
                    System.out.println("---------- CHOICE AGAIN! ----------");
                    break;
            }
        } while (flag);
    }

    @Override
    public void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------- DELETE VEHICLE ----------");
        System.out.print("Enter license plate: ");
        String seaOfControl = scanner.nextLine();
        boolean flag = false;
        int choice;
        for (int i = 0; i < vehicles.size(); i++) {
            if (seaOfControl.equalsIgnoreCase(vehicles.get(i).getSeaOfControl())) {
                flag = true;
                break;
            }
        }
        if (flag) {
            do {
                System.out.println("Do you want to delete vehicles with license plate: " + seaOfControl + "?");
                System.out.println("1. Yes" + "\n" +
                        "2. No");
                System.out.print("Your choice: ");
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        for (int i = 0; i < vehicles.size(); i++) {
                            if (seaOfControl.equalsIgnoreCase(vehicles.get(i).getSeaOfControl())) {
                                vehicles.remove(i);
                                break;
                            }
                        }
                        System.out.println("---------- DELETE SUCCESS ----------");
                        flag = false;
                        break;
                    case 2:
                        System.out.println("---------- CANCEL ----------");
                        flag = false;
                        break;
                    default:
                        System.out.println("---------- CHOICE AGAIN! ----------");
                        break;
                }
            } while (flag);
        } else {
            System.out.println("License plate " + seaOfControl + " is NOT found!");
        }
    }

    @Override
    public void search() {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;

        System.out.println("---------- SEARCH VEHICLES ----------");
        System.out.print("Enter license plate: ");
        String SeaOfControl = sc.nextLine();

        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i).getSeaOfControl().contains(SeaOfControl)) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("---------- RESULT ----------");
            for (int i = 0; i < vehicles.size(); i++) {
                if (vehicles.get(i).getSeaOfControl().contains(SeaOfControl)) {
                    System.out.println(vehicles.get(i));
                }
            }
        } else {
            System.out.println("Vehicle with license plate " + SeaOfControl + " is NOT found!");
        }

    }
}



