package ss5_Access_modifier_static_method_static_property.thuc_hanh;

 class Student {
    private int rollno;
    private String name;
    private static String college = "hoàn";

    //constructor to initialize the variable
    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    //static method to change the value of static variable
    static void change() {
        college = "tiu tơ";
    }

    //method to display values
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}