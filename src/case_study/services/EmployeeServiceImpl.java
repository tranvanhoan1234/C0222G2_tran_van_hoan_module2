package case_study.services;

import case_study.models.Employee;
import case_study.models.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Mã nhân viên, Họ tên, Ngày sinh, Giới tính, Số CMND,
// Số Điện Thoại, Email, Trình độ, Vị trí, lương
//this.fullName = fullName;
//public Person(String fullName, String dateOfBirth, String gender,
//        Integer identityCard, long phoneNumber, String email) {

public abstract class EmployeeServiceImpl implements IEmployeeService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Employee> employeeList = new ArrayList<>();

    static {
        Employee p = new Employee("hoan", "13/1/1996", "nam", 12312, 847655345768l, "demngoikhoc1@gmail.com", 01, "trưởng phòng", 23.123);
        employeeList.add(p);

    }

    @Override
    public void add() {
        System.out.println("nhập mã nhân vien muốn thêm: ");
        String fullName = scanner.nextLine();
        System.out.println("nhập ngay muốn thêm: ");
        String dateOfBirth = scanner.nextLine();
        System.out.println("nhập giới tính muốn thêm: ");
        String gender = scanner.nextLine();
        System.out.println("nhập cmnd muốn thêm: ");
        Integer identityCard = Integer.valueOf(scanner.nextLine());
        System.out.println("nhập số điện thoai muốn thêm: ");
        Long phoneNumber = Long.valueOf(scanner.nextLine());
        System.out.println("nhập email muốn thêm: ");
        String email = scanner.nextLine();
        System.out.println("nhập mã nhân viên muốn thêm muốn thêm: ");
        Integer employeeCode = Integer.valueOf(scanner.nextLine());
        System.out.println("nhập chức vụ muốn thêm muốn thêm: ");
        String position = scanner.nextLine();
 System.out.println("nhập lương muốn thêm muốn thêm: ");
        Double salary = Double.valueOf(scanner.nextLine());
        Employee employee = new Employee(fullName,dateOfBirth,gender,identityCard,phoneNumber,email,employeeCode,position,salary);
employeeList.add(employee);
    }
    @Override
    public void display() {
        for (Person furamaController :employeeList ) {
            System.out.println(furamaController);
        }

    }
}
