package ss5_Access_modifier_static_method_static_property.bai_tap.ClassStudent;

import ss5_Access_modifier_static_method_static_property.bai_tap.ClassStudent.Student;

public class TestStuden {
    public static void main(String[] args) {
        Student student =new Student();
       student.setName("hoàn");
       student.setClasses("c02ggg2");
        System.out.println(student.toString());
    }
}
