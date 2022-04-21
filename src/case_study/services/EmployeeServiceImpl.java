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
        System.out.println("nhập mã nhân viên muốn thêm: ");
        Integer employeeCode = Integer.valueOf(scanner.nextLine());
        System.out.println("nhập vị trí nhân viên muốn thêm: ");
        String position = scanner.nextLine();
        System.out.println("nhập lương muốn thêm muốn thêm: ");
        Double salary = Double.valueOf(scanner.nextLine());
        Employee employee = new Employee(fullName, dateOfBirth, gender, identityCard, phoneNumber, email, employeeCode, position, salary);
        employeeList.add(employee);
    }

    @Override
    public void display() {
        for (Person furamaController : employeeList) {
            System.out.println(furamaController);
            break;
        }


    }

    @Override
    public void edit() {
        System.out.println("Nhập tên nhân viên cần sửa: ");
        String fullName = scanner.nextLine();
        for (int i = 0; i < employeeList.size(); i++) {
            //kiểu không dc so sánh 2 dấu bằng hãy sử dụng equa container timg kiêm gần chính sác
            if (employeeList.get(i).getFullName().equals(fullName)) {
                System.out.println("sửa fullname: ");
//    fullName,dateOfBirth,gender,identityCard,phoneNumber,email,employeeCode,position,salary
                employeeList.get(i).setFullName(scanner.nextLine());
                System.out.println("sửa ngày sinh: ");
                employeeList.get(i).setDateOfBirth(scanner.nextLine());
                System.out.println("sửa giới tính: ");
                employeeList.get(i).setGender(scanner.nextLine());
                System.out.println("sửa số cmnd: ");
                employeeList.get(i).setIdentityCard(Integer.valueOf(scanner.nextLine()));
                System.out.println("sửa số điện thoại: ");
                employeeList.get(i).setPhoneNumber(Long.valueOf(scanner.nextLine()));
                System.out.println("sửa email: ");
                employeeList.get(i).setEmail(scanner.nextLine());
                System.out.println("sửa mã nhân viên: ");
                employeeList.get(i).setEmployeeCode(Integer.valueOf(scanner.nextLine()));
                System.out.println("sửa chức vụ nhân viên : ");
                employeeList.get(i).setPosition(scanner.nextLine());
                System.out.println("sửa lương nhân viên : ");
                employeeList.get(i).setSalary(Double.valueOf(scanner.nextLine()));

            }

        }
        display();
    }
}
