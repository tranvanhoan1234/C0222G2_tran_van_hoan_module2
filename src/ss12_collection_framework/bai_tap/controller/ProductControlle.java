package ss12_collection_framework.bai_tap.controller;

import ss12_collection_framework.bai_tap.service.ProductSevirce;

import java.util.Scanner;

public class ProductControlle {
    private static Scanner scanner = new Scanner(System.in);
    private static ProductSevirce productManager = new ProductSevirce();

    public void displayProductMenu() {

        while (true) {
            System.out.println("1.add " + "\n" + "2.hien thi: " + "\n" +
                    "3.sửa" + "\n" + "4.xóa" + "\n" + "5.tìm kiếm" + "\n" + "6.sắp xếp" + "\n" + "0.exit" +
                    "\n");
            System.out.println("mời mọi người chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productManager.add();
                    break;
                case 2:
                    productManager.display();
                    break;
                case 3:
                    productManager.edit();
                    break;
                case 4:
                    productManager.delete();
                    break;
                case 5:
                    productManager.search();
                    break;
                case 6:
                    productManager.sort();
                    break;
                case 0:
                    System.exit(0);
                    break;

            }
        }
    }
}
