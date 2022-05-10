package case_study.services;

import case_study.models.Customer;
import case_study.utils.reader_writer.ReaderWriter;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Customer> customerList = new LinkedList<>();

//    static {
//
//        Customer p = new Customer("hoan", "13/1/1996", "nam", 12312, 847655345768l, "demngoikhoc1@gmail.com", 01, "trưởng phòng", "DN");
//        customerList.add(p);
//
//    }

    @Override
    public void add() {

        System.out.println("nhập tên khách hàng: ");
        String name = scanner.nextLine();

        System.out.println("nhập ngày sinh: ");
       String dateOfBirth = scanner.nextLine();

        System.out.println("nhập giới tính muốn thêm: ");
        String gender = scanner.nextLine();


        System.out.println("nhập số cmnd muốn thêm: ");
        Integer identityCard = Integer.valueOf(scanner.nextLine());

        System.out.println("nhập sđt muốn thêm: ");
        Long phoneNumber = Long.valueOf(scanner.nextLine());

        System.out.println("nhập email muốn thêm: ");
        String email = scanner.nextLine();

        System.out.println("nhập mã khách hàng: ");
        int customersCode = Integer.parseInt(scanner.nextLine());

        System.out.println("nhập loại khách  muốn thêm: ");
        String typeOfGuest = scanner.nextLine();

        System.out.println("nhập Địa chỉ muốn thêm: ");
        String address = scanner.nextLine();
        Customer customer = new Customer(name, dateOfBirth, gender, identityCard, phoneNumber
                , email, customersCode, typeOfGuest, address);
        customerList.add(customer);
        ReaderWriter.writeCustumer(customerList);


    }

    @Override
    public void display() {
        customerList= ReaderWriter.readFileCustomer();
        for (Customer c : customerList) {
            System.out.println(c);


        }

    }

    @Override
    public void edit() {
        System.out.println("nhập mã khách hàng cần sửa:");
        int customer = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getCustomersCode() == customer) {

                System.out.println(" sửa name khách hàng: ");
                customerList.get(i).setFullName(scanner.nextLine());

                System.out.println("sửa ngày sinh khách hàng: ");
                customerList.get(i).setDateOfBirth(scanner.nextLine());

                System.out.println("sửa giới tính khách hàng: ");
              customerList.get(i).setGender(scanner.nextLine());

                System.out.println("sửa số cmnd khách hàng: ");
               customerList.get(i).setIdentityCard(Integer.valueOf(scanner.nextLine()));

                System.out.println("sửa số điện thoại khách hàng: ");
                customerList.get(i).setPhoneNumber(Long.valueOf(scanner.nextLine()));

                System.out.println("sửa email khách hàng: ");
              customerList.get(i).setEmail(scanner.nextLine());

                System.out.println("sửa mã khách hàng: ");
                customerList.get(i).setCustomersCode(Integer.parseInt(scanner.nextLine()));

                System.out.println("sửa loại khách: ");
              customerList.get(i).setTypeOfGuest(scanner.nextLine());

                System.out.println("sửa Địa chỉ khách hàng: ");
                customerList.get(i).setAddress(scanner.nextLine());

                break;
            }

        }


    }
}
