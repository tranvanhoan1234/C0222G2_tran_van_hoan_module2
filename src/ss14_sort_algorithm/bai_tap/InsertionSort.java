package ss14_sort_algorithm.bai_tap;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array1= {2,3,4,5,6,7};
        int[] array2= {2,3,6,7,4,5};
        System.out.println("trước sắp sếp"+ Arrays.toString(array2));

   insertionSort(array2);


        for (int a:array2) {
            System.out.println(a);
        }

    }
    public static void insertionSort(int[] array){

        int pos, x;
        for(int i = 0; i < array.length; i++){ //đoạn array[0] đã sắp xếp
            System.out.println("dịch chuyển phần tử");
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){

                array[pos] = array[pos-1]; // đổi chỗ

                pos--;

            }
            array[pos] = x;

            System.out.println("lần thứ "+x+": "+array[pos]);
        }
    }
}
