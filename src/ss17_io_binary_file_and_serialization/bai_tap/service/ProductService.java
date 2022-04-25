package ss17_io_binary_file_and_serialization.bai_tap.service;


import ss17_io_binary_file_and_serialization.bai_tap.common.writeAndRead.WriteAndRead;
import ss17_io_binary_file_and_serialization.bai_tap.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProduct {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Product> productList = new ArrayList<>();

    static {
        Product p = new Product(1, "Hoàn", "cty ppp", 10000);
        Product c = new Product(2, "luận", "cty ccc", 20000);
        Product d = new Product(3, "phuog", "cty 666", 30000);

        productList.add(p);
        productList.add(c);
        productList.add(d);
WriteAndRead.writerFile(productList);
    }


    @Override
    public void add() {

        System.out.println("nhập mã sản phẩm: ");
        int productCode = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap tên sản phẩm: ");
        String nameProduct = scanner.nextLine();
        System.out.println("nhập hãng sản xuất: ");
        String productCompany = scanner.nextLine();
        System.out.println("nhập giá sản phẩm: ");
        Integer price = Integer.valueOf(scanner.nextLine());
        System.out.println("list: ");
        Product product = new Product(productCode, nameProduct, productCompany, price);
        productList.add(product);
        WriteAndRead.writerFile(productList);


    }

    @Override
    public void display() {
        productList=WriteAndRead.readFile();
        for (Product s : productList) {
            System.out.print(s);
        }
    }
    @Override
    public void search() {
        productList=WriteAndRead.readFile();
        System.out.println("nhập ten sản phẩm muốn tìm: ");
        int ten = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getProductCode() == ten) {
                System.out.println(productList.get(i));

            }
        }
    }

}
