package ss17_io_binary_file_and_serialization.thuc_hanh.read_write_file_studen;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class main {
//    Tạo lớp Main và tạo phương thức writeToObject(String path, List<Student> students)
//    để ghi danh sách học viên hiện có vào trong file nhị phân như sau:
    public static void writeToFile(String path, List<Student> students) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
//        Tạo phương thức Main trong lớp Main và khai báo một danh sách học viên:
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
        students.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));
//        5: Gọi phương thức writeToFile trong hàm Main để ghi danh sách học viên trên ra file có tên là student.txt
        writeToFile("student.txt", students);
//        Gọi phương thức readDataFromFile trong hàm Main và hiển thị danh sách các học viên đang có trong file
        List<Student> studentDataFromFile = readDataFromFile("student.txt");
        for (Student student : studentDataFromFile){
            System.out.println(student);
        }
    }
//    Tạo phương thức readDataFromFile(String path) trong lớp Main để
//    lấy ra danh sách học viên đang có trong file student.txt
    public static List<Student> readDataFromFile(String path){
        List<Student> students = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return students;
    }
}
