package ss12_collection_framework.thuc_hanh.use_comparable_comparator;

import java.util.Comparator;

class AgeComparator implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        if(o1.getAge() > o2.getAge()){
            return 1;
        }else if(o1.getAge() == o2.getAge()){
            return 0;
        }else{
            return -1;
        }
    }
}
