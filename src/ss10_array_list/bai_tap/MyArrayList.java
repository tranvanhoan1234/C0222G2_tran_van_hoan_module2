package ss10_array_list.bai_tap;


import java.util.Arrays;

public class MyArrayList<E> {


    public int size = 0;
    //sức chứa arraylist
    public static final int DEFAULT_CAPACITY = 10;
    // mảng chứa các phần tử
    public Object[] elements;

    //contructor không tham số sức chứa mặc định là 10;
    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    //contructor có tham số
    public MyArrayList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("capacity:  " + capacity);
        }
        //pt trả về số lượng pt;
    }

    public int size() {
        return this.size;
    }

    //pt clear arraylist,
    public void clean() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;

        }
    }// pt add 1 phần tư vào arraylist

    public boolean add(E element) {
        if (elements.length == size) {
            this.enusureCapecity(5);
        }
        elements[size] = element;
        size++;
        return true;
    }

    public void add(E element, int index) {
        if (index > elements.length) {
            throw new IllegalArgumentException("INDEX" + index);
        } else if (elements.length == size) {
            enusureCapecity(5);
        }
        if (elements[index] == null) {
            elements[index] = element;
        } else {
            for (int i = size + 1; i >= index; i--) {
                elements[i] = elements[size-1];

            }
            elements[index] = element;
            size++;
        }
    }

    public void enusureCapecity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else {
            throw new IllegalArgumentException("mincapecity: " + elements);
        }
    }
}