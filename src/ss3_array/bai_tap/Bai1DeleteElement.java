package ss3_array.bai_tap;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Bai1DeleteElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {2, 3, 5, 1, 2, 6, 7, 12, 46, 34, 67};
        for (int i = 0; i < array.length; i++) {

        }
        for (int x : array) {
            System.out.println(x);
        }
        System.out.println("enter x: ");
        int x = scanner.nextInt();
        f(x, array);
    }

    public static void f(int x, int[] array) {
        int index = 0;
        boolean flag = false;
        for (int i = 0; i < array.length; i++) { // tìm vị trí xuất hiện phần tử muốn xóa
            if (x == array[i]) {
                index = i; // nếu có gắn cho index
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("index x: " + index);
            for (int i = index; i < array.length - 1; i++) {
                array[i] = array[i + 1];// index sẽ đè lên vị trí kế tiếp của nó
            }
//            array[array.length - 1] = 0;
            System.out.println("new arr"); //nếu phần tử ở i dc xóa thì phần tử cuối thụt lên = 0;
            for (int a : array) {
                System.out.println(a);

            }
        } else {
            System.out.println("x not a trong mảng");
        }
    }
}
