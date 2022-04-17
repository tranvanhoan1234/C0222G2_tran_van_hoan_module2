package ss10_array_list.thuc_hanh;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 100;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }public static class MyListTest {
        public static void main(String[] args) {
            MyList<Integer> listInteger = new MyList<Integer>();


            for (int i = 0; i < 100; i++) {
                listInteger.add(i);
            }

            System.out.println("element 4: "+listInteger.get(1));
            System.out.println("element 1: "+listInteger.get(2));
            System.out.println("element 2: "+listInteger.get(3));
//            listInteger.get(-1);
            //System.out.println("element -1: " + listInteger.get(-1));
            for (int i = 0; i < 100; i++) {
                System.out.println("element "+(i+1)+": "+listInteger.get(i));
            }

        }
    }
}