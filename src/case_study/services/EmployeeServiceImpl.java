package case_study.services;

import case_study.models.Employee;
import case_study.utils.check_try_cacth.CheckException;
import case_study.utils.reader_writer.ReaderWriter;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
//Mã nhân viên, Họ tên, Ngày sinh, Giới tính, Số CMND,
// Số Điện Thoại, Email, Trình độ, Vị trí, lương


public class EmployeeServiceImpl implements IEmployeeService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Employee> employeeList = new LinkedList<>();

//    static {
//        Employee p = new Employee("hoan", "13/1/1996", "nam", 12312, 847655345768l, "demngoikhoc1@gmail.com", 01, "trưởng phòng", 23.123);
//        employeeList.add(p);
//
//    }
    //Mã nhân viên, Họ tên, Ngày sinh, Giới tính, Số CMND,
// Số Điện Thoại, Email, Trình độ, Vị trí, lương

    @Override
    public void add() {
        System.out.println("nhập ten nhân vien muốn thêm: ");
        String fullName = scanner.nextLine();
        System.out.println("nhập ngay sinh muốn thêm: ");
        String dateOfBirth = scanner.nextLine();
        System.out.println("nhập giới tính muốn thêm: ");
        String gender = scanner.nextLine();
        System.out.println("nhập cmnd muốn thêm: ");
        Integer identityCard = Integer.valueOf(scanner.nextLine());
        System.out.println("nhập số điện thoai muốn thêm: ");
        String phoneNumber1 = scanner.nextLine();
        long phoneNumber=CheckException.checkExForParseLong(phoneNumber1);

        System.out.println("nhập email muốn thêm: ");
        String email = scanner.nextLine();
        System.out.println("nhập mã nhân viên muốn thêm: ");
        Integer employeeCode = Integer.valueOf(scanner.nextLine());
        System.out.println("nhập vị trí nhân viên muốn thêm: ");
        String position = scanner.nextLine();

        System.out.println("nhập lương muốn thêm muốn thêm: ");
        Double salary = CheckException.checkExForParseDouble();

        Employee employee = new Employee(fullName, dateOfBirth, gender, identityCard, phoneNumber, email, employeeCode, position, salary);
        employeeList.add(employee);
        ReaderWriter.writeEmployee(employeeList);


    }

    @Override
    public void display() {
        employeeList = ReaderWriter.readFileemploye();
        for (Employee e : employeeList) {
            System.out.println(e);
        }


    }

    @Override
    public void edit() {
        System.out.println("Nhập tên nhân viên cần sửa: ");
        String fullName = scanner.nextLine();
        for (int i = 0; i < employeeList.size(); i++) {
            //kiểu string không dc so sánh 2 dấu bằng hãy sử dụng equa container timg kiêm gần chính sác
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
                break;

            }

        }

    }
}
