package ss10_array_list.thuc_hanh;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
       MyLinkedList a=new MyLinkedList(10);
       a.addFirst(1);
       a.addFirst(2);
       a.addFirst(3);
       a.add(5,10);
       a.add(5,10);
       a.printlist();
    }
}
