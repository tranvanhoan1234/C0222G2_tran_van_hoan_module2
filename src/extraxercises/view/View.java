package extraxercises.view;

import extraxercises.modol.Vehicle;

import java.util.ArrayList;
import java.util.Scanner;

public class View {
    static ArrayList<Vehicle> Array = new ArrayList<>();


   public static void addVehicle() {

    }

    public static void editVehicle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập xe cần sửa1: ");
        String seaOfControl = sc.nextLine();

        int i;
        for (i = 0; i< Array.size(); i++) {
            if (seaOfControl == Array.get(i).getSeaOfControl()) ;
        }
//        System.out.println("nhập 2: ");
//        String = sc.nextLine();
        System.out.printf("nhap 3:");
        int yearOfManufacture = Integer.parseInt(sc.nextLine());
        System.out.printf("nahp 4: ");
        String owner = sc.nextLine();

        Array.get(i).setSeaOfControl(seaOfControl);
//        Array.get(i).setManufacturersName(manufacturersName);
        Array.get(i).setYearOfManufacture(yearOfManufacture);
        Array.get(i).setOwner(owner);
    }

    public static void main(String[] args) {


    }
}
