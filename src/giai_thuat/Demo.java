package giai_thuat;

public class Demo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3};
        System.out.println(Demo.soluTion(arr));
    }

    public static boolean soluTion(int[] arr) {
        boolean flag = false;
        if (arr.length < 2) {
            return false;
        } else {
            for (int i = 1; i < arr.length - 1; i++) {
                int fistSum = 0;
                int secondSum = 0;
                for (int j = 0; j < i; j++) {
                    fistSum += arr[j];
                }
                for (int j = (i + 1); j < arr.length; j++) {
                    secondSum += arr[j];
                }
                if (fistSum == secondSum) {
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }
}
