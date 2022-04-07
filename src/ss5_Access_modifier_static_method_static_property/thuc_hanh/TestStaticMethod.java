package ss5_Access_modifier_static_method_static_property.thuc_hanh;

public class TestStaticMethod {
    public static void main(String args[]) {
        Student.change(); //calling change method

        //creating objects
        Student s1 = new Student(1, "Hoan");
        Student s2 = new Student(1, "ĐẸP Trai");
        Student s3 = new Student(1, "hoàn");

        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}
