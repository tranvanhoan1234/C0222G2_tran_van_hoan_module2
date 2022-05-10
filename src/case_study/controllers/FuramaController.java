package case_study.controllers;

import case_study.services.CustomerServiceImpl;
import case_study.services.EmployeeServiceImpl;
import case_study.services.FacilityServiceImpl;
import case_study.utils.check_try_cacth.CheckException;

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

            int choice = CheckException.checkExForParseInteger();
            switch (choice) {
                case 1:
                    displayEmployeeManagement();
                    break;
                case 2:
                    displayListCustomersManagement();
                    break;
                case 3:
                    displayListFacilityManagement();
                    break;
                case 4:
                    addNewBookingManagement();
                    break;
                case 5:
                case 6:
                    System.exit(6);
                    break;
            }
        } while (flag);
    }

    public void displayEmployeeManagement() {

        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        boolean flag = true;
        do {

            System.out.println("..........Main menu...........");
            System.out.println("1\tDisplay list employees\n" +
                    "2\tAdd new employee\n" +
                    "3\tEdit employee\n" +
                    "4\tReturn Main menu\n");
            System.out.println("xin mời bạn chọn: ");
            int choice = CheckException.checkExForParseInteger();
            switch (choice) {
                case 1:
                    employeeService.display();
                    break;
                case 2:
                    employeeService.add();
                    break;
                case 3:
                    employeeService.edit();
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println();
                    break;
            }
        } while (flag);

    }

    public void displayListCustomersManagement() {
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        boolean flag = true;
        do {
            System.out.println("..........Main menu...........");
            System.out.println("1.\tAdd new customer\n" +
                    "2.\tDisplay list customers\n" +
                    "3.\tEdit customer\n" +
                    "4.\tReturn Main menu\n");
            System.out.println("xin mời bạn chọn: ");
            int choice = CheckException.checkExForParseInteger();
            switch (choice) {
                case 1:
                    customerService.add();
                    break;
                case 2:
                    customerService.display();
                    break;
                case 3:
                    customerService.edit();
                    break;
                case 4:
                    flag = false;
                    break;
            }
        } while (flag);

    }

    public void displayListFacilityManagement() {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();

        boolean flag = true;
        do {
            System.out.println("..........Main menu...........");
            System.out.println("1\tDisplay list facility\n" +
                    "2\tAdd new facility\n" +
                    "3\tDisplay list facility maintenance\n" +
                    "4\tReturn main menu\n");
            System.out.println("xin mời bạn chọn: ");
            int choice1 = CheckException.checkExForParseInteger();
            switch (choice1) {
                case 1:
                    facilityService.display();
                    break;
                case 2:
                    addFacility();
                    break;
                case 3:
                    facilityService.displayMaintenance();
                    break;
                case 4:
                    flag = false;
                    break;
            }
        } while (flag);

    }

    public void addFacility() {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        boolean flag = true;
        System.out.println("---------menuFacility---------");
        System.out.println("1.\tAdd New Villa\n" +
                "2.\tAdd New House\n" +
                "3.\tAdd New Room\n" +
                "4.\tBack to menu\n");
        System.out.println("Your choice: ");
        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 1:
                facilityService.addNewVilla();
                break;
            case 2:
                facilityService.addNewHouse();
                break;
            case 3:
                facilityService.addNewRoom();
                break;
            case 4:
                flag = false;
                break;
        }


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
            int choice = CheckException.checkExForParseInteger();
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
            int choice = CheckException.checkExForParseInteger();
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
            System.out.println();
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



