package ss12_collection_framework.bai_tap.service;

import ss12_collection_framework.bai_tap.model.Product;

import java.util.*;

public class ProductSevirce implements IProduct {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Product> products = new ArrayList<>();

    static {
        Product p = new Product(1, "sua", 2000.0);
        Product r = new Product(2, "keo", 3000.0);
        Product c = new Product(3, "banhquy", 4000.0);

        products.add(r);
        products.add(p);
        products.add(c);
    }


    @Override
    public void add() {

        System.out.println("nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap tên sản phẩm: ");
        String ten = scanner.nextLine();
        System.out.println("nhap giá thành: ");
        Double gia = Double.parseDouble(scanner.nextLine());
        Product product = new Product(id, ten, gia);
        products.add(product);

    }

    @Override
    public void display() {
        for (Product pro : products) {
            System.out.println(pro);
        }
    }

    @Override
    public void delete() {
        System.out.println("nhập id muốn xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.remove(i);
                break;
            }

        }
    }

    @Override
    public void search() {

        System.out.println("nhập ten sản phẩm muốn tìm: ");
        String ten = scanner.nextLine();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getTen().contains(ten)) {
                System.out.println(products.get(i));

            }

        }
    }

    @Override
    public void sort() {
        System.out.println("sắp xếp theo cái bạn muốn: ");
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o1.getGia() - o2.getGia());
            }
        });
        display();
    }

    public void edit() {
        System.out.println("nhap id muon sua: ");
    int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId()== id) {

                System.out.println("sua id: ");
                products.get(i).setId(Integer.parseInt(scanner.nextLine()));
                System.out.println("sua ten: ");
                products.get(i).setTen(scanner.nextLine());
                System.out.println("sửa gia: ");
                products.get(i).setGia(Double.valueOf(scanner.nextLine()));
                break;
            }
        }
    }
}
