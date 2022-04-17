package ss10_array_list.bai_tap;

public class TestMyArrayList {

    private static class Student{
        private int id;
        private String name;

public Student(){

}

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Student(int id, String name){
        this.id=id;
        this.name=name;
    }
}

    public static void main(String[] args) {
        Student a=new Student(1,"hoàn");
        Student b=new Student(2,"đẹp");
        Student c=new Student(3,"trai");
        Student d=new Student(4,"nè");
        Student f=new Student(4,"nè");



        MyArrayList<Student>studentMyArrayList=new MyArrayList<>();
        studentMyArrayList.add(a);
        studentMyArrayList.add(b);
        studentMyArrayList.add(c);
        studentMyArrayList.add(d);
        studentMyArrayList.clean();



        for (int i = 0; i < studentMyArrayList.size(); i++) {
            Student student=(Student)studentMyArrayList.elements[i];

            System.out.println(student.getName());

            
        }
            
        }
    }
