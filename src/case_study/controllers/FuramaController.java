package case_study.controllers;

import case_study.services.EmployeeServiceImpl;

import java.util.Scanner;

public class FuramaController {
    public static Scanner scanner = new Scanner(System.in);


    public void displayMainMenu() {
        boolean flag = true;
        do {
            System.out.println("..........Main menu...........");

            System.out.println("1.\tEmployee Management\n" +
                    "2.\tCustomer Management\n" +
                    "3.\tFacility Management \n" +
                    "4.\tBooking Management\n" +
                    "5.\tPromotion Management\n" +
                    "6.\tExit\n");
            System.out.println("xin mời bạn chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    displayEmployeeManagement();
                case 2:
                    displayListCustomersManagement();
                case 3:
                    addNewBookingManagement();
                case 4:
                    displayListFacilityManagement();
                case 5:
                case 6:
                    flag = false;
                    System.exit(6);
                    break;
            }
        } while (false);
    }

    public void displayEmployeeManagement() {

        EmployeeServiceImpl employeeService = new EmployeeServiceImpl() {
        };
        boolean flag = true;
        do {

            System.out.println("..........Main menu...........");
            System.out.println("1\tDisplay list employees\n" +
                    "2\tAdd new employee\n" +
                    "3\tEdit employee\n" +
                    "4\tReturn Main menu\n");
            System.out.println("xin mời bạn chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    employeeService.display();
                case 2:
                    employeeService.add();
                case 3:
                    employeeService.edit();
                case 4:
                    System.exit(4);
                default:
                    System.out.println();
                    break;
            }
        } while (flag);

    }

    public void displayListCustomersManagement() {
        boolean flag = true;
        do {
            System.out.println("..........Main menu...........");
            System.out.println("1.\tDisplay list customers\n" +
                    "2.\tAdd new customer\n" +
                    "3.\tEdit customer\n" +
                    "4.\tReturn Main menu\n");
            System.out.println("xin mời bạn chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                default:
                    System.out.println();
                    break;
            }
        } while (flag);

    }

    public void displayListFacilityManagement() {
        boolean flag = true;
        do {
            System.out.println("..........Main menu...........");
            System.out.println("1\tDisplay list facility\n" +
                    "2\tAdd new facility\n" +
                    "3\tDisplay list facility maintenance\n" +
                    "4\tReturn Main menu\n");
            System.out.println("xin mời bạn chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                default:
                    System.out.println();
                    break;
            }
        } while (flag);

    }

    public void addNewBookingManagement() {
        boolean flag = true;
        do {
            System.out.println("..........Main menu...........");
            System.out.println("1.\tAdd new booking\n" +
                    "2.\tDisplay list booking\n" +
                    "3.\tCreate new constracts\n" +
                    "4.\tDisplay list contracts\n" +
                    "5.\tEdit contracts\n" +
                    "6.\tReturn Main menu\n");
            System.out.println("xin mời bạn chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                default:
                    System.out.println();
                    break;
            }
        } while (flag);

    }

    public void listCustomersUseServiceManagement() {
        boolean flag = true;
        do {
            System.out.println("..........Main menu...........");
            System.out.println("1.\tDisplay list customers use service\n" +
                    "2.\tDisplay list customers get voucher\n" +
                    "3.\tReturn Main menu\n");
            System.out.println("xin mời bạn chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                default:
                    System.out.println();
                    break;
            }
        } while (flag);

    }

    public void promotionManagement() {
        boolean flag = true;
        do {
            System.out.println("..........Main menu...........");
            System.out.println("1.\t‘//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’’");
            System.out.println("xin mời bạn chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                default:
                    System.out.println();
                    break;
            }
        } while (flag);

    }
}



